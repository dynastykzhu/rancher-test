package com.fmrt.rancher;

import com.fmrt.rancher.base.TypeCollection;
import com.fmrt.rancher.service.WorkloadsService;
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

    private Rancher rancher = null;

    @Before
    public void Before() throws Exception {
        Rancher.Config config = new Rancher.Config(new URL("https://179.20.101.164/v3/project/c-dkn4v:p-szwp5/"),
                "token-zs2tr", "d7vcl87cdwlwp82jvdmjs6gmp6nd28rvhtwgb2pqr547flpwrt7cg2");
        rancher = new Rancher(config);

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

}
