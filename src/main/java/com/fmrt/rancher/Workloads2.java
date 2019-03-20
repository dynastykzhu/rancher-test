package com.fmrt.rancher;

import com.fmrt.rancher.base.AbstractType;
import com.fmrt.rancher.type.Workloads;
import lombok.Data;

import java.util.List;

@Data
public class Workloads2 extends AbstractType {

    private List<Workloads.ContainersBean> containers;
    private Workloads.LabelsBean labels;


    private Object cronJobConfig;
    private Object daemonSetConfig;
    private Object deploymentConfig;
    private Object dnsConfig;
    private List<Object> gids;
    private List<Object> hostAliases;
    private boolean hostIPC =false;
    private boolean hostNetwork=false;
    private boolean hostPID=false;
    private List<Object> imagePullSecrets;
    private Object jobConfig;
    private String name;
    private String namespaceId;
    private String nodeId;
    private boolean paused = false;
    private String projectId;
    private List<Object> readinessGates;
    private Object replicaSetConfig;
    private Object replicationControllerConfig;
    private Object scheduling;
    private Object selector;
    private Object statefulSetConfig;
    private List<Object> sysctls;
    private List<Workloads.VolumesBean> volumes;

}
