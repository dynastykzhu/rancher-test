package com.fmrt.rancher.type;

import com.fmrt.rancher.base.AbstractType;

import java.util.List;

public class Workloads extends AbstractType {


    /**
     * annotations : {"cattle.io/timestamp":"2019-03-19T05:54:50Z"}
     * containers : [{"allowPrivilegeEscalation":false,"image":"nginx","imagePullPolicy":"Always","initContainer":false,"name":"nginx","ports":[{"containerPort":80,"dnsName":"nginx-nodeport","kind":"NodePort","name":"80tcp300011","protocol":"TCP","sourcePort":30001,"type":"/v3/project/schemas/containerPort"}],"privileged":false,"procMount":"Default","readOnly":false,"resources":{"type":"/v3/project/schemas/resourceRequirements"},"restartCount":0,"runAsNonRoot":false,"stdin":true,"stdinOnce":false,"terminationMessagePath":"/dev/termination-log","terminationMessagePolicy":"File","tty":true,"type":"/v3/project/schemas/container"}]
     * created : 2019-03-18T13:31:29Z
     * creatorId : null
     * deploymentConfig : {"maxSurge":1,"maxUnavailable":0,"minReadySeconds":0,"progressDeadlineSeconds":600,"revisionHistoryLimit":10,"strategy":"RollingUpdate"}
     * deploymentStatus : {"availableReplicas":1,"conditions":[{"lastTransitionTime":"2019-03-18T13:31:38Z","lastTransitionTimeTS":1552915898000,"lastUpdateTime":"2019-03-18T13:31:38Z","message":"Deployment has minimum availability.","reason":"MinimumReplicasAvailable","status":"True","type":"Available"},{"lastTransitionTime":"2019-03-18T13:31:29Z","lastTransitionTimeTS":1552915889000,"lastUpdateTime":"2019-03-18T13:31:38Z","lastUpdateTimeTS":1552915898000,"message":"ReplicaSet \"nginx-cf5d9f4c9\" has successfully progressed.","reason":"NewReplicaSetAvailable","status":"True","type":"Progressing"}],"observedGeneration":2,"readyReplicas":1,"replicas":1,"type":"/v3/project/schemas/deploymentStatus","unavailableReplicas":0,"updatedReplicas":1}
     * dnsConfig : null
     * dnsPolicy : ClusterFirst
     * gids : []
     * hostAliases : []
     * hostIPC : false
     * hostNetwork : false
     * hostPID : false
     * imagePullSecrets : []
     * labels : {"workload.user.cattle.io/workloadselector":"deployment-dong-test-nginx"}
     * name : nginx
     * namespaceId : dong-test
     * nodeId :
     * ownerReferences : []
     * paused : false
     * projectId : c-dkn4v:p-szwp5
     * publicEndpoints : []
     * readinessGates : []
     * restartPolicy : Always
     * scale : 1
     * schedulerName : default-scheduler
     * scheduling : null
     * selector : {"matchLabels":{"workload.user.cattle.io/workloadselector":"deployment-dong-test-nginx"},"type":"/v3/project/schemas/labelSelector"}
     * state : active
     * sysctls : []
     * terminationGracePeriodSeconds : 30
     * transitioning : no
     * transitioningMessage :
     * uuid : 2318d3ec-4982-11e9-92d5-080027bcd480
     * volumes : []
     * workloadAnnotations : {"deployment.kubernetes.io/revision":"1","field.cattle.io/creatorId":"user-bplpp"}
     * workloadLabels : {"cattle.io/creator":"norman","workload.user.cattle.io/workloadselector":"deployment-dong-test-nginx"}
     */

    private AnnotationsBean annotations;
    private String created;
    private Object creatorId;
//    private DeploymentConfigBean deploymentConfig;
    private DeploymentStatusBean deploymentStatus;
    private Object dnsConfig;
    private String dnsPolicy;
    private boolean hostIPC = false;
    private boolean hostNetwork= false;
    private boolean hostPID= false;
    private LabelsBean labels;
    private String name;
    private String namespaceId;
    private String nodeId;
    private boolean paused= false;
    private String projectId;
    private String restartPolicy;
    private int scale;
    private String schedulerName;
    private Object scheduling;
    private SelectorBean selector;
    private String state;
    private int terminationGracePeriodSeconds;
    private String transitioning;
    private String transitioningMessage;
    private String uuid;
    private WorkloadAnnotationsBean workloadAnnotations;
    private WorkloadLabelsBean workloadLabels;
    private List<ContainersBean> containers;
    private List<?> gids;
    private List<?> hostAliases;
    private List<?> imagePullSecrets;
    private List<?> ownerReferences;
    private List<?> publicEndpoints;
    private List<?> readinessGates;
    private List<?> sysctls;
    private List<VolumesBean> volumes;

    public AnnotationsBean getAnnotations() {
        return annotations;
    }

    public void setAnnotations(AnnotationsBean annotations) {
        this.annotations = annotations;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Object getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Object creatorId) {
        this.creatorId = creatorId;
    }

//    public DeploymentConfigBean getDeploymentConfig() {
//        return deploymentConfig;
//    }
//
//    public void setDeploymentConfig(DeploymentConfigBean deploymentConfig) {
//        this.deploymentConfig = deploymentConfig;
//    }

    public DeploymentStatusBean getDeploymentStatus() {
        return deploymentStatus;
    }

    public void setDeploymentStatus(DeploymentStatusBean deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    public Object getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(Object dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public boolean isHostIPC() {
        return hostIPC;
    }

    public void setHostIPC(boolean hostIPC) {
        this.hostIPC = hostIPC;
    }

    public boolean isHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public boolean isHostPID() {
        return hostPID;
    }

    public void setHostPID(boolean hostPID) {
        this.hostPID = hostPID;
    }

    public LabelsBean getLabels() {
        return labels;
    }

    public void setLabels(LabelsBean labels) {
        this.labels = labels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public Object getScheduling() {
        return scheduling;
    }

    public void setScheduling(Object scheduling) {
        this.scheduling = scheduling;
    }

    public SelectorBean getSelector() {
        return selector;
    }

    public void setSelector(SelectorBean selector) {
        this.selector = selector;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(int terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    public String getTransitioning() {
        return transitioning;
    }

    public void setTransitioning(String transitioning) {
        this.transitioning = transitioning;
    }

    public String getTransitioningMessage() {
        return transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
        this.transitioningMessage = transitioningMessage;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public WorkloadAnnotationsBean getWorkloadAnnotations() {
        return workloadAnnotations;
    }

    public void setWorkloadAnnotations(WorkloadAnnotationsBean workloadAnnotations) {
        this.workloadAnnotations = workloadAnnotations;
    }

    public WorkloadLabelsBean getWorkloadLabels() {
        return workloadLabels;
    }

    public void setWorkloadLabels(WorkloadLabelsBean workloadLabels) {
        this.workloadLabels = workloadLabels;
    }

    public List<ContainersBean> getContainers() {
        return containers;
    }

    public void setContainers(List<ContainersBean> containers) {
        this.containers = containers;
    }

    public List<?> getGids() {
        return gids;
    }

    public void setGids(List<?> gids) {
        this.gids = gids;
    }

    public List<?> getHostAliases() {
        return hostAliases;
    }

    public void setHostAliases(List<?> hostAliases) {
        this.hostAliases = hostAliases;
    }

    public List<?> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(List<?> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public List<?> getOwnerReferences() {
        return ownerReferences;
    }

    public void setOwnerReferences(List<?> ownerReferences) {
        this.ownerReferences = ownerReferences;
    }

    public List<?> getPublicEndpoints() {
        return publicEndpoints;
    }

    public void setPublicEndpoints(List<?> publicEndpoints) {
        this.publicEndpoints = publicEndpoints;
    }

    public List<?> getReadinessGates() {
        return readinessGates;
    }

    public void setReadinessGates(List<?> readinessGates) {
        this.readinessGates = readinessGates;
    }

    public List<?> getSysctls() {
        return sysctls;
    }

    public void setSysctls(List<?> sysctls) {
        this.sysctls = sysctls;
    }

    public List<VolumesBean> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VolumesBean> volumes) {
        this.volumes = volumes;
    }

    public static class AnnotationsBean {
        @com.google.gson.annotations.SerializedName("cattle.io/timestamp")
        private String _$CattleIoTimestamp144; // FIXME check this code

        public String get_$CattleIoTimestamp144() {
            return _$CattleIoTimestamp144;
        }

        public void set_$CattleIoTimestamp144(String _$CattleIoTimestamp144) {
            this._$CattleIoTimestamp144 = _$CattleIoTimestamp144;
        }
    }

    public static class DeploymentConfigBean {
        /**
         * maxSurge : 1
         * maxUnavailable : 0
         * minReadySeconds : 0
         * progressDeadlineSeconds : 600
         * revisionHistoryLimit : 10
         * strategy : RollingUpdate
         */

        private String maxSurge;
        private String maxUnavailable;
        private int minReadySeconds;
        private int progressDeadlineSeconds;
        private int revisionHistoryLimit;
        private String strategy;

        public String getMaxSurge() {
            return maxSurge;
        }

        public void setMaxSurge(String maxSurge) {
            this.maxSurge = maxSurge;
        }

        public String getMaxUnavailable() {
            return maxUnavailable;
        }

        public void setMaxUnavailable(String maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
        }

        public int getMinReadySeconds() {
            return minReadySeconds;
        }

        public void setMinReadySeconds(int minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
        }

        public int getProgressDeadlineSeconds() {
            return progressDeadlineSeconds;
        }

        public void setProgressDeadlineSeconds(int progressDeadlineSeconds) {
            this.progressDeadlineSeconds = progressDeadlineSeconds;
        }

        public int getRevisionHistoryLimit() {
            return revisionHistoryLimit;
        }

        public void setRevisionHistoryLimit(int revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
        }

        public String getStrategy() {
            return strategy;
        }

        public void setStrategy(String strategy) {
            this.strategy = strategy;
        }
    }

    public static class DeploymentStatusBean {
        /**
         * availableReplicas : 1
         * conditions : [{"lastTransitionTime":"2019-03-18T13:31:38Z","lastTransitionTimeTS":1552915898000,"lastUpdateTime":"2019-03-18T13:31:38Z","message":"Deployment has minimum availability.","reason":"MinimumReplicasAvailable","status":"True","type":"Available"},{"lastTransitionTime":"2019-03-18T13:31:29Z","lastTransitionTimeTS":1552915889000,"lastUpdateTime":"2019-03-18T13:31:38Z","lastUpdateTimeTS":1552915898000,"message":"ReplicaSet \"nginx-cf5d9f4c9\" has successfully progressed.","reason":"NewReplicaSetAvailable","status":"True","type":"Progressing"}]
         * observedGeneration : 2
         * readyReplicas : 1
         * replicas : 1
         * type : /v3/project/schemas/deploymentStatus
         * unavailableReplicas : 0
         * updatedReplicas : 1
         */

        private int availableReplicas;
        private int observedGeneration;
        private int readyReplicas;
        private int replicas;
        private String type;
        private int unavailableReplicas;
        private int updatedReplicas;
        private List<ConditionsBean> conditions;

        public int getAvailableReplicas() {
            return availableReplicas;
        }

        public void setAvailableReplicas(int availableReplicas) {
            this.availableReplicas = availableReplicas;
        }

        public int getObservedGeneration() {
            return observedGeneration;
        }

        public void setObservedGeneration(int observedGeneration) {
            this.observedGeneration = observedGeneration;
        }

        public int getReadyReplicas() {
            return readyReplicas;
        }

        public void setReadyReplicas(int readyReplicas) {
            this.readyReplicas = readyReplicas;
        }

        public int getReplicas() {
            return replicas;
        }

        public void setReplicas(int replicas) {
            this.replicas = replicas;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getUnavailableReplicas() {
            return unavailableReplicas;
        }

        public void setUnavailableReplicas(int unavailableReplicas) {
            this.unavailableReplicas = unavailableReplicas;
        }

        public int getUpdatedReplicas() {
            return updatedReplicas;
        }

        public void setUpdatedReplicas(int updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
        }

        public List<ConditionsBean> getConditions() {
            return conditions;
        }

        public void setConditions(List<ConditionsBean> conditions) {
            this.conditions = conditions;
        }

        public static class ConditionsBean {
            /**
             * lastTransitionTime : 2019-03-18T13:31:38Z
             * lastTransitionTimeTS : 1552915898000
             * lastUpdateTime : 2019-03-18T13:31:38Z
             * message : Deployment has minimum availability.
             * reason : MinimumReplicasAvailable
             * status : True
             * type : Available
             * lastUpdateTimeTS : 1552915898000
             */

            private String lastTransitionTime;
            private long lastTransitionTimeTS;
            private String lastUpdateTime;
            private String message;
            private String reason;
            private String status;
            private String type;
            private long lastUpdateTimeTS;

            public String getLastTransitionTime() {
                return lastTransitionTime;
            }

            public void setLastTransitionTime(String lastTransitionTime) {
                this.lastTransitionTime = lastTransitionTime;
            }

            public long getLastTransitionTimeTS() {
                return lastTransitionTimeTS;
            }

            public void setLastTransitionTimeTS(long lastTransitionTimeTS) {
                this.lastTransitionTimeTS = lastTransitionTimeTS;
            }

            public String getLastUpdateTime() {
                return lastUpdateTime;
            }

            public void setLastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public long getLastUpdateTimeTS() {
                return lastUpdateTimeTS;
            }

            public void setLastUpdateTimeTS(long lastUpdateTimeTS) {
                this.lastUpdateTimeTS = lastUpdateTimeTS;
            }
        }
    }

    public static class LabelsBean {
        @com.google.gson.annotations.SerializedName("workload.user.cattle.io/workloadselector")
        private String _$WorkloadUserCattleIoWorkloadselector231; // FIXME check this code

        public String get_$WorkloadUserCattleIoWorkloadselector231() {
            return _$WorkloadUserCattleIoWorkloadselector231;
        }

        public void set_$WorkloadUserCattleIoWorkloadselector231(String _$WorkloadUserCattleIoWorkloadselector231) {
            this._$WorkloadUserCattleIoWorkloadselector231 = _$WorkloadUserCattleIoWorkloadselector231;
        }
    }

    public static class SelectorBean {
        /**
         * matchLabels : {"workload.user.cattle.io/workloadselector":"deployment-dong-test-nginx"}
         * type : /v3/project/schemas/labelSelector
         */

        private MatchLabelsBean matchLabels;
        private String type;

        public MatchLabelsBean getMatchLabels() {
            return matchLabels;
        }

        public void setMatchLabels(MatchLabelsBean matchLabels) {
            this.matchLabels = matchLabels;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class MatchLabelsBean {
            @com.google.gson.annotations.SerializedName("workload.user.cattle.io/workloadselector")
            private String _$WorkloadUserCattleIoWorkloadselector156; // FIXME check this code

            public String get_$WorkloadUserCattleIoWorkloadselector156() {
                return _$WorkloadUserCattleIoWorkloadselector156;
            }

            public void set_$WorkloadUserCattleIoWorkloadselector156(String _$WorkloadUserCattleIoWorkloadselector156) {
                this._$WorkloadUserCattleIoWorkloadselector156 = _$WorkloadUserCattleIoWorkloadselector156;
            }
        }
    }

    public static class WorkloadAnnotationsBean {
        @com.google.gson.annotations.SerializedName("deployment.kubernetes.io/revision")
        private String _$DeploymentKubernetesIoRevision57; // FIXME check this code
        @com.google.gson.annotations.SerializedName("field.cattle.io/creatorId")
        private String _$FieldCattleIoCreatorId162; // FIXME check this code

        public String get_$DeploymentKubernetesIoRevision57() {
            return _$DeploymentKubernetesIoRevision57;
        }

        public void set_$DeploymentKubernetesIoRevision57(String _$DeploymentKubernetesIoRevision57) {
            this._$DeploymentKubernetesIoRevision57 = _$DeploymentKubernetesIoRevision57;
        }

        public String get_$FieldCattleIoCreatorId162() {
            return _$FieldCattleIoCreatorId162;
        }

        public void set_$FieldCattleIoCreatorId162(String _$FieldCattleIoCreatorId162) {
            this._$FieldCattleIoCreatorId162 = _$FieldCattleIoCreatorId162;
        }
    }

    public static class WorkloadLabelsBean {
        @com.google.gson.annotations.SerializedName("cattle.io/creator")
        private String _$CattleIoCreator205; // FIXME check this code
        @com.google.gson.annotations.SerializedName("workload.user.cattle.io/workloadselector")
        private String _$WorkloadUserCattleIoWorkloadselector297; // FIXME check this code

        public String get_$CattleIoCreator205() {
            return _$CattleIoCreator205;
        }

        public void set_$CattleIoCreator205(String _$CattleIoCreator205) {
            this._$CattleIoCreator205 = _$CattleIoCreator205;
        }

        public String get_$WorkloadUserCattleIoWorkloadselector297() {
            return _$WorkloadUserCattleIoWorkloadselector297;
        }

        public void set_$WorkloadUserCattleIoWorkloadselector297(String _$WorkloadUserCattleIoWorkloadselector297) {
            this._$WorkloadUserCattleIoWorkloadselector297 = _$WorkloadUserCattleIoWorkloadselector297;
        }
    }

    public static class ContainersBean {
        /**
         * allowPrivilegeEscalation : false
         * image : nginx
         * imagePullPolicy : Always
         * initContainer : false
         * name : nginx
         * ports : [{"containerPort":80,"dnsName":"nginx-nodeport","kind":"NodePort","name":"80tcp300011","protocol":"TCP","sourcePort":30001,"type":"/v3/project/schemas/containerPort"}]
         * privileged : false
         * procMount : Default
         * readOnly : false
         * resources : {"type":"/v3/project/schemas/resourceRequirements"}
         * restartCount : 0
         * runAsNonRoot : false
         * stdin : true
         * stdinOnce : false
         * terminationMessagePath : /dev/termination-log
         * terminationMessagePolicy : File
         * tty : true
         * type : /v3/project/schemas/container
         */

        private boolean allowPrivilegeEscalation=false ;
        private String image;
        private String imagePullPolicy="Always";
        private boolean initContainer=false;
        private String name;
        private boolean privileged=false;
        private String procMount="Default";
        private boolean readOnly=false;
        private ResourcesBean resources;
        private Integer restartCount=0;
        private boolean runAsNonRoot=false;
        private boolean stdin=true;
        private boolean stdinOnce=false;
        private String terminationMessagePath="/dev/termination-log";
        private String terminationMessagePolicy="File";
        private boolean tty=true;
        private String type="/v3/project/schemas/container";
        private List<PortsBean> ports;
        private List<VolumeMountsBean> volumeMounts;

        public boolean isAllowPrivilegeEscalation() {
            return allowPrivilegeEscalation;
        }

        public void setAllowPrivilegeEscalation(boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImagePullPolicy() {
            return imagePullPolicy;
        }

        public void setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
        }

        public boolean isInitContainer() {
            return initContainer;
        }

        public void setInitContainer(boolean initContainer) {
            this.initContainer = initContainer;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isPrivileged() {
            return privileged;
        }

        public void setPrivileged(boolean privileged) {
            this.privileged = privileged;
        }

        public String getProcMount() {
            return procMount;
        }

        public void setProcMount(String procMount) {
            this.procMount = procMount;
        }

        public boolean isReadOnly() {
            return readOnly;
        }

        public void setReadOnly(boolean readOnly) {
            this.readOnly = readOnly;
        }

        public ResourcesBean getResources() {
            return resources;
        }

        public void setResources(ResourcesBean resources) {
            this.resources = resources;
        }

        public int getRestartCount() {
            return restartCount;
        }

        public void setRestartCount(int restartCount) {
            this.restartCount = restartCount;
        }

        public boolean isRunAsNonRoot() {
            return runAsNonRoot;
        }

        public void setRunAsNonRoot(boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
        }

        public boolean isStdin() {
            return stdin;
        }

        public void setStdin(boolean stdin) {
            this.stdin = stdin;
        }

        public boolean isStdinOnce() {
            return stdinOnce;
        }

        public void setStdinOnce(boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
        }

        public String getTerminationMessagePath() {
            return terminationMessagePath;
        }

        public void setTerminationMessagePath(String terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
        }

        public String getTerminationMessagePolicy() {
            return terminationMessagePolicy;
        }

        public void setTerminationMessagePolicy(String terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
        }

        public List<VolumeMountsBean> getVolumeMounts() {
            return volumeMounts;
        }

        public void setVolumeMounts(List<VolumeMountsBean> volumeMounts) {
            this.volumeMounts = volumeMounts;
        }

        public boolean isTty() {
            return tty;
        }

        public void setTty(boolean tty) {
            this.tty = tty;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<PortsBean> getPorts() {
            return ports;
        }

        public void setPorts(List<PortsBean> ports) {
            this.ports = ports;
        }

        public static class ResourcesBean {
            /**
             * type : /v3/project/schemas/resourceRequirements
             */

            private String type ;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class VolumeMountsBean {
            private String mountPath;
            private String name;
            private boolean readOnly = false;
            private String type = "/v3/project/schemas/volumeMount";

            public String getMountPath() {
                return mountPath;
            }

            public void setMountPath(String mountPath) {
                this.mountPath = mountPath;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isReadOnly() {
                return readOnly;
            }

            public void setReadOnly(boolean readOnly) {
                this.readOnly = readOnly;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class PortsBean {
            /**
             * containerPort : 80
             * dnsName : nginx-nodeport
             * kind : NodePort
             * name : 80tcp300011
             * protocol : TCP
             * sourcePort : 30001
             * type : /v3/project/schemas/containerPort
             */

            private int containerPort;
            private String dnsName;
            private String kind ="NodePort";
            private String name;
            private String protocol ="TCP";
            private int sourcePort;
            private String type ="/v3/project/schemas/containerPort";


            public void initPort(String name,int containerPort,int sourcePort){
                this.containerPort = containerPort;
                this.sourcePort = sourcePort;
                this.name = containerPort +"tcp"+sourcePort;
                this.dnsName = name+"-nodeport";
            }

            public int getContainerPort() {
                return containerPort;
            }

            public void setContainerPort(int containerPort) {
                this.containerPort = containerPort;
            }

            public String getDnsName() {
                return dnsName;
            }

            public void setDnsName(String dnsName) {
                this.dnsName = dnsName;
            }

            public String getKind() {
                return kind;
            }

            public void setKind(String kind) {
                this.kind = kind;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getProtocol() {
                return protocol;
            }

            public void setProtocol(String protocol) {
                this.protocol = protocol;
            }

            public int getSourcePort() {
                return sourcePort;
            }

            public void setSourcePort(int sourcePort) {
                this.sourcePort = sourcePort;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }


    public static class VolumesBean {


        /**
         * hostPath : {"kind":"","path":"/var/run/docker.sock"}
         * name : vol1
         * type : /v3/project/schemas/volume
         */

        private HostPathBean hostPath;
        private String name;
        private String type;

        public HostPathBean getHostPath() {
            return hostPath;
        }

        public void setHostPath(HostPathBean hostPath) {
            this.hostPath = hostPath;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class HostPathBean {
            /**
             * kind :
             * path : /var/run/docker.sock
             */

            private String kind;
            private String path;

            public String getKind() {
                return kind;
            }

            public void setKind(String kind) {
                this.kind = kind;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }
        }



    }

}
