package com.fmrt.rancher;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fmrt.rancher.client.BasicAuthInterceptor;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.net.URL;

public class Rancher {
    private final Retrofit retrofit;

    public Rancher(Rancher.Config config) {
        Builder builder = (new Builder()).addInterceptor(BasicAuthInterceptor.auth(config.getAccessKey(), config.getSecretKey())).addInterceptor((chain) -> {
            Request request = chain.request().newBuilder().addHeader("Accept", "application/json").build();
            return chain.proceed(request);
        });
        this.retrofit = (new retrofit2.Retrofit.Builder()).baseUrl(config.getUrl().toString()).client(builder.build()).addConverterFactory(JacksonConverterFactory.create(this.configureObjectMapper())).build();
    }

    private ObjectMapper configureObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(Include.NON_NULL);
        return objectMapper;
    }

    public <T> T type(Class<T> service) {
        return this.retrofit.create(service);
    }

    public static class Config {
        private URL url;
        private String accessKey;
        private String secretKey;

        public Config(URL url, String accessKey, String secretKey) {
            this.url = url;
            this.accessKey = accessKey;
            this.secretKey = secretKey;
        }

        public URL getUrl() {
            return this.url;
        }

        public void setUrl(URL url) {
            this.url = url;
        }

        public String getAccessKey() {
            return this.accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return this.secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }
    }
}
