package com.fmrt.rancher.service;

import com.fmrt.rancher.base.TypeCollection;
import com.fmrt.rancher.type.Cluster;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ClusterService {

    @GET(" ")
    Call<TypeCollection<Cluster>> list();
}
