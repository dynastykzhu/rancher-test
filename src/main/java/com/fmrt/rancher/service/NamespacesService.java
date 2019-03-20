package com.fmrt.rancher.service;

import com.fmrt.rancher.base.TypeCollection;
import com.fmrt.rancher.type.Namespaces;
import retrofit2.Call;
import retrofit2.http.*;

public interface NamespacesService {

    @GET("namespacedsecrets")
    Call<TypeCollection<Namespaces>> list();


    @GET("namespaces/{id}")
    Call<Namespaces> get(@Path("id") String var1);

    @POST("namespaces")
    Call<Namespaces> create(@Body Namespaces var1);


    @DELETE("namespaces/{id}")
    Call<Namespaces> delete(@Path("id") String var1);



}
