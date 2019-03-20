package com.fmrt.rancher.service;

import com.fmrt.rancher.Workloads2;
import com.fmrt.rancher.base.TypeCollection;
import com.fmrt.rancher.type.Workloads;
import retrofit2.Call;
import retrofit2.http.*;

public interface WorkloadsService {

    @GET("workloads")
    Call<TypeCollection<Workloads>> list();


    @GET("workloads/{id}")
    Call<Workloads> get(@Path("id") String var1);

    @POST("workloads")
    Call<Workloads> create(@Body Workloads2 var1);
//
//    @PUT("WorkloadsService/{id}")
//    Call<Service> update(@Path("id") String var1, @Body Service var2);

    @DELETE("workloads/{id}")
    Call<Workloads> delete(@Path("id") String var1);




}
