package com.fmrt.rancher;

import com.fmrt.rancher.base.TypeCollection;
import com.fmrt.rancher.service.ClusterService;
import com.fmrt.rancher.service.NamespacesService;
import com.fmrt.rancher.service.WorkloadsService;
import com.fmrt.rancher.type.Cluster;
import com.fmrt.rancher.type.Namespaces;
import com.fmrt.rancher.type.Workloads;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Response;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class RancherApplicationTests {

    final static String HOST_IP = "https://192.168.56.100";
    final static String ACCESS_KEY = "token-bs5xf";
    final static String SECRET_KEY = "q2g4wfgb4rg5mbdpfjl74vv56rm5hbbcbnf6vj2b5f5vsd8xrnjbsg";



    private Rancher rancher = null;

    Rancher.Config workloadsConfig = null;
    Rancher.Config namespacesConfig = null;
    Rancher.Config clusterConfig = null;

    @Before
    public void Before() throws Exception {
        //company
//        Rancher.Config config = new Rancher.Config(new URL("https://179.20.101.164/v3/project/c-dkn4v:p-szwp5/"),
//                "token-zs2tr", "d7vcl87cdwlwp82jvdmjs6gmp6nd28rvhtwgb2pqr547flpwrt7cg2");
        //home
        workloadsConfig = new Rancher.Config(new URL(HOST_IP + "/v3/project/c-p8fcb:p-jw24t/"), ACCESS_KEY, SECRET_KEY);

        namespacesConfig = new Rancher.Config(new URL(HOST_IP + "/v3/cluster/c-p8fcb/"), ACCESS_KEY, SECRET_KEY);

        clusterConfig = new Rancher.Config(new URL(HOST_IP + "/v3/cluster/"), ACCESS_KEY, SECRET_KEY);

        rancher = new Rancher(workloadsConfig);

    }

    @Test
    public void listTest() throws IOException {
        WorkloadsService workloadsService = rancher.type(WorkloadsService.class);
        Response<TypeCollection<Workloads>> execute = workloadsService.list().execute();
        System.out.println(execute);
        List<Workloads> data = execute.body().getData();
        System.out.println(data.get(0).getId());
        System.out.println(data.size());
    }

    @Test
    public void getTest() throws IOException {
        WorkloadsService workloadsService = rancher.type(WorkloadsService.class);
        Response<Workloads> execute = workloadsService.get("deployment:dong-test:nginx").execute();
        System.out.println(execute);
        Workloads data = execute.body();
        System.out.println(data);
    }

    @Test
    public void delTest() throws IOException {
        WorkloadsService workloadsService = rancher.type(WorkloadsService.class);
        Response<Workloads> execute = workloadsService.delete("deployment:dong-test:a22222").execute();
        System.out.println(execute);
//        execute.body();
//        System.out.println(data);
    }

    @Test
    public void createTest() throws IOException {
        String name = "d21";
        String imageName = "nginx";
        int containerPort = 80;
        int sourcePort = 31212;

//        String hostPath = "/var/run/docker.sock";
//        String mountPath = "/var/run/docker.sock";
//        String volueName = "vo111";

        WorkloadsService workloadsService = rancher.type(WorkloadsService.class);
        Workloads2 workload = new Workloads2();
        workload.setName(name);
        workload.setNamespaceId("dong-test");

        Workloads.ContainersBean containersBean = new Workloads.ContainersBean();
        containersBean.setImage(imageName);
        containersBean.setName(name);
        //   Workloads.ContainersBean.ResourcesBean resourcesBean = new Workloads.ContainersBean.ResourcesBean();
        //    resourcesBean.setType("/v3/project/schemas/resourceRequirements");
//        containersBean.setResources(resourcesBean);


//        Workloads.ContainersBean.PortsBean portsBean = new Workloads.ContainersBean.PortsBean();
//        portsBean.initPort(name, containerPort, sourcePort);
//        List<Workloads.ContainersBean.PortsBean> portNewList = new ArrayList<>();
//        portNewList.add(portsBean);
//        containersBean.setPorts(portNewList);

//        Workloads.ContainersBean.VolumeMountsBean volumeMounts = new Workloads.ContainersBean.VolumeMountsBean();
//        volumeMounts.setMountPath(mountPath);
//        List<Workloads.ContainersBean.VolumeMountsBean> volumeMountsList = new ArrayList<>();
//        volumeMountsList.add(volumeMounts);
//        containersBean.setVolumeMounts(volumeMountsList);


        List<Workloads.ContainersBean> containerNewList = new ArrayList<>();
        containerNewList.add(containersBean);
        workload.setContainers(containerNewList);


//        Volumes volumes = new Volumes();
//        volumes.setName("v02222");
//        HostPath hostPath = new HostPath();
//        hostPath.setPath("D:\\\\vol");
//        volumes.setHostPath(hostPath);
//        List<Volumes> volumesList = new ArrayList<>();
//        volumesList.add(volumes);
//        workload.setVolumes(volumesList);

        Response<Workloads> execute = workloadsService.create(workload).execute();


    }


    @Test
    public void listNamespacesTest() throws IOException {
        Rancher rancher = new Rancher(workloadsConfig);

        NamespacesService namespacesService = rancher.type(NamespacesService.class);
        Response<TypeCollection<Namespaces>> execute = namespacesService.list().execute();
        System.out.println(execute);
        List<Namespaces> data = execute.body().getData();
        for (Namespaces datum : data) {
            datum.setCaCrt("");
            System.out.println(datum);
        }
        System.out.println(data.size());
    }

    @Test
    public void getNamespacesTest() throws IOException {

        Rancher rancher = new Rancher(namespacesConfig);
        NamespacesService namespacesService = rancher.type(NamespacesService.class);
        Response<Namespaces> execute = namespacesService.get("dong-test").execute();
        System.out.println(execute);
        Namespaces data = execute.body();
        System.out.println(data);

    }
    @Test
    public void delNamespacesTest() throws IOException {

        Rancher rancher = new Rancher(namespacesConfig);
        NamespacesService namespacesService = rancher.type(NamespacesService.class);
        Response<Namespaces> execute = namespacesService.delete("dong-test").execute();
        System.out.println(execute);
        Namespaces data = execute.body();
        System.out.println(data);

    }
    @Test
    public void createNamespacesTest() throws IOException {

        Rancher rancher = new Rancher(clusterConfig);
        NamespacesService namespacesService = rancher.type(NamespacesService.class);
        Namespaces namespaces = new Namespaces();
        namespaces.setName("dongngngn");
        namespaces.setProjectId("c-p8fcb:p-jw24t");
        Response<Namespaces> execute = namespacesService.create(namespaces).execute();
        System.out.println(execute);
        Namespaces data = execute.body();
        System.out.println(data);

    }


    @Test
    public void listClusterTest() throws IOException {
        Rancher rancher = new Rancher(clusterConfig);

        ClusterService clusterService = rancher.type(ClusterService.class);
        Response<TypeCollection<Cluster>> execute = clusterService.list().execute();
        System.out.println(execute);
        List<Cluster> data = execute.body().getData();
        for (Cluster datum : data) {
            System.out.println(datum);
        }
        System.out.println(data.size());
    }


}
