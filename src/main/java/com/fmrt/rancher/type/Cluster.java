package com.fmrt.rancher.type;

import com.fmrt.rancher.base.AbstractType;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;
@Data
public class Cluster extends AbstractType {


    /**
     * actionLinks : {"exportYaml":"https://192.168.56.100/v3/clusters/c-p8fcb?action=exportYaml","generateKubeconfig":"https://192.168.56.100/v3/clusters/c-p8fcb?action=generateKubeconfig","importYaml":"https://192.168.56.100/v3/clusters/c-p8fcb?action=importYaml"}
     * agentImage : rancher/rancher-agent:v2.1.7
     * allocatable : {"cpu":"1","memory":"1779896Ki","pods":"110"}
     * annotations : {"authz.management.cattle.io/creator-role-bindings":"{\"created\":[\"cluster-owner\"],\"required\":[\"cluster-owner\"]}","lifecycle.cattle.io/create.cluster-agent-controller-cleanup":"true","lifecycle.cattle.io/create.cluster-provisioner-controller":"true","lifecycle.cattle.io/create.cluster-scoped-gc":"true","lifecycle.cattle.io/create.mgmt-cluster-rbac-remove":"true"}
     * apiEndpoint : https://10.0.3.15:6443
     * appliedEnableNetworkPolicy : false
     * appliedPodSecurityPolicyTemplateId :
     * appliedSpec : {"defaultClusterRoleForProjectMembers":null,"defaultPodSecurityPolicyTemplateId":null,"description":"","desiredAgentImage":"","displayName":"kkkk","dockerRootDir":"/var/lib/docker","enableNetworkPolicy":false,"internal":false,"rancherKubernetesEngineConfig":{"addonJobTimeout":30,"authentication":{"strategy":"x509","type":"/v3/schemas/authnConfig"},"authorization":{"type":"/v3/schemas/authzConfig"},"bastionHost":{"sshAgentAuth":false,"type":"/v3/schemas/bastionHost"},"cloudProvider":{"type":"/v3/schemas/cloudProvider"},"ignoreDockerVersion":true,"ingress":{"provider":"nginx","type":"/v3/schemas/ingressConfig"},"kubernetesVersion":"v1.13.4-rancher1-1","monitoring":{"provider":"metrics-server","type":"/v3/schemas/monitoringConfig"},"network":{"options":{"flannel_backend_type":"vxlan"},"plugin":"canal","type":"/v3/schemas/networkConfig"},"nodes":[{"address":"10.0.3.15","hostnameOverride":"localhost","nodeId":"c-p8fcb:m-421aa90e079f","port":"22","role":["etcd","controlplane","worker"],"sshAgentAuth":false,"type":"/v3/schemas/rkeConfigNode","user":"root"}],"services":{"etcd":{"creation":"12h","extraArgs":{"election-timeout":"5000","heartbeat-interval":"500"},"retention":"72h","snapshot":true,"type":"/v3/schemas/etcdService"},"kubeApi":{"podSecurityPolicy":false,"serviceNodePortRange":"30000-32767","type":"/v3/schemas/kubeAPIService"},"kubeController":{"type":"/v3/schemas/kubeControllerService"},"kubelet":{"failSwapOn":false,"type":"/v3/schemas/kubeletService"},"kubeproxy":{"type":"/v3/schemas/kubeproxyService"},"scheduler":{"type":"/v3/schemas/schedulerService"},"type":"/v3/schemas/rkeConfigServices"},"sshAgentAuth":false,"type":"/v3/schemas/rancherKubernetesEngineConfig"},"type":"/v3/schemas/clusterSpec"}
     * baseType : cluster
     * caCert : LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSUN3akNDQWFxZ0F3SUJBZ0lCQURBTkJna3Foa2lHOXcwQkFRc0ZBREFTTVJBd0RnWURWUVFERXdkcmRXSmwKTFdOaE1CNFhEVEU1TURNeU1ERXpNREl6TmxvWERUSTVNRE14TnpFek1ESXpObG93RWpFUU1BNEdBMVVFQXhNSAphM1ZpWlMxallUQ0NBU0l3RFFZSktvWklodmNOQVFFQkJRQURnZ0VQQURDQ0FRb0NnZ0VCQU5jNjFEWFBhVzVYCmUyelpUNkR6d3JDbGM0ejFlMVI4VnFURXlKeU8rOTFadnNhajMvS3M1Q2dLQm1XcDBpQXBaWnZpOXlXMDJ5NXEKVVpnZ3ByZEVrUjVyRjBtWDg0VHJpZGprZU41cS91a2NKcUhwQTFNQlBTY0FCUlNWeHU5SHg5M3lXNDhhUjY0eApRZTNGVUp5dmt1UmRlSUFDQWxqemEwcEdjVGt3blFDU1dUZjVwZVduZlBaaXk5MDcwalAzOHMrWlV4TDVCalhmClBkd1U5QjQ2dmhFdkEvRjZ1RU0zTERqVEJIOWhlSXlFcFkrRnFuS2haRjRqMnlOZmhwSEgrTytNbDZLVkJvV1AKOGpXeEZ3bVZ6YW1KN2l1NHdkcXJYSFhoNERxYkxCbkRGRFBoOFJpN1FGMi9ueE9XNGVIV0xia1dnMXY2OEFmOQpIZ0RvQUZDZjZCY0NBd0VBQWFNak1DRXdEZ1lEVlIwUEFRSC9CQVFEQWdLa01BOEdBMVVkRXdFQi93UUZNQU1CCkFmOHdEUVlKS29aSWh2Y05BUUVMQlFBRGdnRUJBRkxmY2RjNFQwZXNwN2FUclFJMEZ2Z1lJWkZLbUkwZmRmeEkKZkJzU3VzZGluelpza0ovczRPclZhblAwUUNXQndZVVZnTmR5Q3RrTE9Ca0R4KzVQUWEvRFdYZkphaUxjc2VlaQozVVFTOHNCQ0F2ZE5JNXZSTGxtbXZOSW9GWE9IVDR6RFU3aTlLU2QyV3BSQk1Ba3ptSnFKdTduYnpmaGVrOVVKCldRNlhpN3RqMzdMQ0I3aG1oRlNlK2lDZmgzT2Z2ODB3QlNCVFoxOHVuQkRJNmFtd0txRGRHOUlXZWR4eWh3ODAKTjMyUlZzRW1tNVNhZkplakRoSmhKc2tMdmdxcGVwckJqaW9xaWEwOWFvSXN6dE9TcXZmUXpxMHVtQTJZZU5DSQprQzBIdDJZeWZsMUZNOFg2Zjl2bkhJdEpCcTMxY3gvT0tMUnc2WjJZR0M1WDN3dmVmQ1k9Ci0tLS0tRU5EIENFUlRJRklDQVRFLS0tLS0K
     * capacity : {"cpu":"1","memory":"1882296Ki","pods":"110"}
     * componentStatuses : [{"conditions":[{"message":"ok","status":"True","type":"Healthy"}],"name":"controller-manager","type":"/v3/schemas/clusterComponentStatus"},{"conditions":[{"message":"{\"health\": \"true\"}","status":"True","type":"Healthy"}],"name":"etcd-0","type":"/v3/schemas/clusterComponentStatus"},{"conditions":[{"message":"ok","status":"True","type":"Healthy"}],"name":"scheduler","type":"/v3/schemas/clusterComponentStatus"}]
     * conditions : [{"lastUpdateTime":"2019-03-20T12:59:08Z","status":"True","type":"BackingNamespaceCreated"},{"lastUpdateTime":"2019-03-20T12:59:08Z","status":"True","type":"DefaultProjectCreated"},{"lastUpdateTime":"2019-03-20T12:59:08Z","status":"True","type":"SystemProjectCreated"},{"lastUpdateTime":"2019-03-20T12:59:08Z","status":"True","type":"InitialRolesPopulated"},{"lastUpdateTime":"2019-03-20T12:59:09Z","status":"True","type":"Pending"},{"lastUpdateTime":"2019-03-20T13:10:57Z","status":"True","type":"Provisioned"},{"lastUpdateTime":"2019-03-20T13:11:14Z","status":"True","type":"Waiting"},{"lastUpdateTime":"2019-03-20T12:59:09Z","status":"True","type":"NoDiskPressure"},{"lastUpdateTime":"2019-03-20T12:59:09Z","status":"True","type":"NoMemoryPressure"},{"lastUpdateTime":"2019-03-20T12:59:09Z","status":"True","type":"CreatorMadeOwner"},{"lastUpdateTime":"2019-03-20T13:11:02Z","status":"True","type":"GlobalAdminsSynced"},{"lastUpdateTime":"2019-03-20T13:11:10Z","status":"True","type":"Updated"},{"lastUpdateTime":"2019-03-20T13:11:10Z","status":"True","type":"ServiceAccountMigrated"},{"lastUpdateTime":"2019-03-20T13:11:10Z","status":"True","type":"SystemAccountCreated"},{"lastUpdateTime":"2019-03-20T13:11:11Z","status":"True","type":"AgentDeployed"},{"lastUpdateTime":"2019-03-20T15:45:07Z","status":"False","type":"Ready"}]
     * created : 2019-03-20T12:59:08Z
     * createdTS : 1553086748000
     * creatorId : user-n5b9m
     * defaultClusterRoleForProjectMembers : null
     * defaultPodSecurityPolicyTemplateId : null
     * description :
     * desiredAgentImage :
     * dockerRootDir : /var/lib/docker
     * driver : rancherKubernetesEngine
     * enableNetworkPolicy : false
     * internal : false
     * labels : {"cattle.io/creator":"norman"}
     * limits : {"cpu":"10m","memory":"190Mi","pods":"0"}
     * links : {"clusterAlerts":"https://192.168.56.100/v3/clusters/c-p8fcb/clusteralerts","clusterEvents":"https://192.168.56.100/v3/clusters/c-p8fcb/clusterevents","clusterLoggings":"https://192.168.56.100/v3/clusters/c-p8fcb/clusterloggings","clusterRegistrationTokens":"https://192.168.56.100/v3/clusters/c-p8fcb/clusterregistrationtokens","clusterRoleTemplateBindings":"https://192.168.56.100/v3/clusters/c-p8fcb/clusterroletemplatebindings","namespaces":"https://192.168.56.100/v3/clusters/c-p8fcb/namespaces","nodePools":"https://192.168.56.100/v3/clusters/c-p8fcb/nodepools","nodes":"https://192.168.56.100/v3/clusters/c-p8fcb/nodes","notifiers":"https://192.168.56.100/v3/clusters/c-p8fcb/notifiers","persistentVolumes":"https://192.168.56.100/v3/clusters/c-p8fcb/persistentvolumes","projects":"https://192.168.56.100/v3/clusters/c-p8fcb/projects","remove":"https://192.168.56.100/v3/clusters/c-p8fcb","self":"https://192.168.56.100/v3/clusters/c-p8fcb","shell":"wss://192.168.56.100/v3/clusters/c-p8fcb?shell=true","storageClasses":"https://192.168.56.100/v3/clusters/c-p8fcb/storageclasses","subscribe":"https://192.168.56.100/v3/clusters/c-p8fcb/subscribe","update":"https://192.168.56.100/v3/clusters/c-p8fcb"}
     * name : kkkk
     * rancherKubernetesEngineConfig : {"addonJobTimeout":30,"authentication":{"strategy":"x509","type":"/v3/schemas/authnConfig"},"authorization":{"type":"/v3/schemas/authzConfig"},"bastionHost":{"sshAgentAuth":false,"type":"/v3/schemas/bastionHost"},"cloudProvider":{"type":"/v3/schemas/cloudProvider"},"ignoreDockerVersion":true,"ingress":{"provider":"nginx","type":"/v3/schemas/ingressConfig"},"kubernetesVersion":"v1.13.4-rancher1-1","monitoring":{"provider":"metrics-server","type":"/v3/schemas/monitoringConfig"},"network":{"options":{"flannel_backend_type":"vxlan"},"plugin":"canal","type":"/v3/schemas/networkConfig"},"services":{"etcd":{"creation":"12h","extraArgs":{"election-timeout":"5000","heartbeat-interval":"500"},"retention":"72h","snapshot":true,"type":"/v3/schemas/etcdService"},"kubeApi":{"podSecurityPolicy":false,"serviceNodePortRange":"30000-32767","type":"/v3/schemas/kubeAPIService"},"kubeController":{"type":"/v3/schemas/kubeControllerService"},"kubelet":{"failSwapOn":false,"type":"/v3/schemas/kubeletService"},"kubeproxy":{"type":"/v3/schemas/kubeproxyService"},"scheduler":{"type":"/v3/schemas/schedulerService"},"type":"/v3/schemas/rkeConfigServices"},"sshAgentAuth":false,"type":"/v3/schemas/rancherKubernetesEngineConfig"}
     * requested : {"cpu":"540m","memory":"140Mi","pods":"8"}
     * state : unavailable
     * transitioning : yes
     * transitioningMessage :
     * type : cluster
     * uuid : f334becf-4b0f-11e9-b17d-0242ac110002
     * version : {"buildDate":"2019-02-28T13:30:26Z","compiler":"gc","gitCommit":"c27b913fddd1a6c480c229191a087698aa92f0b1","gitTreeState":"clean","gitVersion":"v1.13.4","goVersion":"go1.11.5","major":"1","minor":"13","platform":"linux/amd64","type":"/v3/schemas/info"}
     */

    private ActionLinksBean actionLinks;
    private String agentImage;
    private AllocatableBean allocatable;
    private AnnotationsBean annotations;
    private String apiEndpoint;
    private boolean appliedEnableNetworkPolicy;
    private String appliedPodSecurityPolicyTemplateId;
    private AppliedSpecBean appliedSpec;
    private String baseType;
    private String caCert;
    private CapacityBean capacity;
    private String created;
    private long createdTS;
    private String creatorId;
    private Object defaultClusterRoleForProjectMembers;
    private Object defaultPodSecurityPolicyTemplateId;
    private String description;
    private String desiredAgentImage;
    private String dockerRootDir;
    private String driver;
    private boolean enableNetworkPolicy;
    private boolean internal;
    private LabelsBean labels;
    private LimitsBean limits;
    private LinksBean links;
    private String name;
    private RancherKubernetesEngineConfigBeanX rancherKubernetesEngineConfig;
    private RequestedBean requested;
    private String state;
    private String transitioning;
    private String transitioningMessage;
    private String type;
    private String uuid;
    private VersionBean version;
    private List<ComponentStatusesBean> componentStatuses;
    private List<ConditionsBeanX> conditions;



    public static class ActionLinksBean {
        /**
         * exportYaml : https://192.168.56.100/v3/clusters/c-p8fcb?action=exportYaml
         * generateKubeconfig : https://192.168.56.100/v3/clusters/c-p8fcb?action=generateKubeconfig
         * importYaml : https://192.168.56.100/v3/clusters/c-p8fcb?action=importYaml
         */

        private String exportYaml;
        private String generateKubeconfig;
        private String importYaml;

        public String getExportYaml() {
            return exportYaml;
        }

        public void setExportYaml(String exportYaml) {
            this.exportYaml = exportYaml;
        }

        public String getGenerateKubeconfig() {
            return generateKubeconfig;
        }

        public void setGenerateKubeconfig(String generateKubeconfig) {
            this.generateKubeconfig = generateKubeconfig;
        }

        public String getImportYaml() {
            return importYaml;
        }

        public void setImportYaml(String importYaml) {
            this.importYaml = importYaml;
        }
    }

    public static class AllocatableBean {
        /**
         * cpu : 1
         * memory : 1779896Ki
         * pods : 110
         */

        private String cpu;
        private String memory;
        private String pods;

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public String getPods() {
            return pods;
        }

        public void setPods(String pods) {
            this.pods = pods;
        }
    }

    public static class AnnotationsBean {
        @SerializedName("authz.management.cattle.io/creator-role-bindings")
        private String _$AuthzManagementCattleIoCreatorrolebindings111; // FIXME check this code
        @SerializedName("lifecycle.cattle.io/create.cluster-agent-controller-cleanup")
        private String _$LifecycleCattleIoCreateClusteragentcontrollercleanup306; // FIXME check this code
        @SerializedName("lifecycle.cattle.io/create.cluster-provisioner-controller")
        private String _$LifecycleCattleIoCreateClusterprovisionercontroller83; // FIXME check this code
        @SerializedName("lifecycle.cattle.io/create.cluster-scoped-gc")
        private String _$LifecycleCattleIoCreateClusterscopedgc164; // FIXME check this code
        @SerializedName("lifecycle.cattle.io/create.mgmt-cluster-rbac-remove")
        private String _$LifecycleCattleIoCreateMgmtclusterrbacremove279; // FIXME check this code

        public String get_$AuthzManagementCattleIoCreatorrolebindings111() {
            return _$AuthzManagementCattleIoCreatorrolebindings111;
        }

        public void set_$AuthzManagementCattleIoCreatorrolebindings111(String _$AuthzManagementCattleIoCreatorrolebindings111) {
            this._$AuthzManagementCattleIoCreatorrolebindings111 = _$AuthzManagementCattleIoCreatorrolebindings111;
        }

        public String get_$LifecycleCattleIoCreateClusteragentcontrollercleanup306() {
            return _$LifecycleCattleIoCreateClusteragentcontrollercleanup306;
        }

        public void set_$LifecycleCattleIoCreateClusteragentcontrollercleanup306(String _$LifecycleCattleIoCreateClusteragentcontrollercleanup306) {
            this._$LifecycleCattleIoCreateClusteragentcontrollercleanup306 = _$LifecycleCattleIoCreateClusteragentcontrollercleanup306;
        }

        public String get_$LifecycleCattleIoCreateClusterprovisionercontroller83() {
            return _$LifecycleCattleIoCreateClusterprovisionercontroller83;
        }

        public void set_$LifecycleCattleIoCreateClusterprovisionercontroller83(String _$LifecycleCattleIoCreateClusterprovisionercontroller83) {
            this._$LifecycleCattleIoCreateClusterprovisionercontroller83 = _$LifecycleCattleIoCreateClusterprovisionercontroller83;
        }

        public String get_$LifecycleCattleIoCreateClusterscopedgc164() {
            return _$LifecycleCattleIoCreateClusterscopedgc164;
        }

        public void set_$LifecycleCattleIoCreateClusterscopedgc164(String _$LifecycleCattleIoCreateClusterscopedgc164) {
            this._$LifecycleCattleIoCreateClusterscopedgc164 = _$LifecycleCattleIoCreateClusterscopedgc164;
        }

        public String get_$LifecycleCattleIoCreateMgmtclusterrbacremove279() {
            return _$LifecycleCattleIoCreateMgmtclusterrbacremove279;
        }

        public void set_$LifecycleCattleIoCreateMgmtclusterrbacremove279(String _$LifecycleCattleIoCreateMgmtclusterrbacremove279) {
            this._$LifecycleCattleIoCreateMgmtclusterrbacremove279 = _$LifecycleCattleIoCreateMgmtclusterrbacremove279;
        }
    }

    public static class AppliedSpecBean {
        /**
         * defaultClusterRoleForProjectMembers : null
         * defaultPodSecurityPolicyTemplateId : null
         * description :
         * desiredAgentImage :
         * displayName : kkkk
         * dockerRootDir : /var/lib/docker
         * enableNetworkPolicy : false
         * internal : false
         * rancherKubernetesEngineConfig : {"addonJobTimeout":30,"authentication":{"strategy":"x509","type":"/v3/schemas/authnConfig"},"authorization":{"type":"/v3/schemas/authzConfig"},"bastionHost":{"sshAgentAuth":false,"type":"/v3/schemas/bastionHost"},"cloudProvider":{"type":"/v3/schemas/cloudProvider"},"ignoreDockerVersion":true,"ingress":{"provider":"nginx","type":"/v3/schemas/ingressConfig"},"kubernetesVersion":"v1.13.4-rancher1-1","monitoring":{"provider":"metrics-server","type":"/v3/schemas/monitoringConfig"},"network":{"options":{"flannel_backend_type":"vxlan"},"plugin":"canal","type":"/v3/schemas/networkConfig"},"nodes":[{"address":"10.0.3.15","hostnameOverride":"localhost","nodeId":"c-p8fcb:m-421aa90e079f","port":"22","role":["etcd","controlplane","worker"],"sshAgentAuth":false,"type":"/v3/schemas/rkeConfigNode","user":"root"}],"services":{"etcd":{"creation":"12h","extraArgs":{"election-timeout":"5000","heartbeat-interval":"500"},"retention":"72h","snapshot":true,"type":"/v3/schemas/etcdService"},"kubeApi":{"podSecurityPolicy":false,"serviceNodePortRange":"30000-32767","type":"/v3/schemas/kubeAPIService"},"kubeController":{"type":"/v3/schemas/kubeControllerService"},"kubelet":{"failSwapOn":false,"type":"/v3/schemas/kubeletService"},"kubeproxy":{"type":"/v3/schemas/kubeproxyService"},"scheduler":{"type":"/v3/schemas/schedulerService"},"type":"/v3/schemas/rkeConfigServices"},"sshAgentAuth":false,"type":"/v3/schemas/rancherKubernetesEngineConfig"}
         * type : /v3/schemas/clusterSpec
         */

        private Object defaultClusterRoleForProjectMembers;
        private Object defaultPodSecurityPolicyTemplateId;
        private String description;
        private String desiredAgentImage;
        private String displayName;
        private String dockerRootDir;
        private boolean enableNetworkPolicy;
        private boolean internal;
        private RancherKubernetesEngineConfigBean rancherKubernetesEngineConfig;
        private String type;

        public Object getDefaultClusterRoleForProjectMembers() {
            return defaultClusterRoleForProjectMembers;
        }

        public void setDefaultClusterRoleForProjectMembers(Object defaultClusterRoleForProjectMembers) {
            this.defaultClusterRoleForProjectMembers = defaultClusterRoleForProjectMembers;
        }

        public Object getDefaultPodSecurityPolicyTemplateId() {
            return defaultPodSecurityPolicyTemplateId;
        }

        public void setDefaultPodSecurityPolicyTemplateId(Object defaultPodSecurityPolicyTemplateId) {
            this.defaultPodSecurityPolicyTemplateId = defaultPodSecurityPolicyTemplateId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDesiredAgentImage() {
            return desiredAgentImage;
        }

        public void setDesiredAgentImage(String desiredAgentImage) {
            this.desiredAgentImage = desiredAgentImage;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getDockerRootDir() {
            return dockerRootDir;
        }

        public void setDockerRootDir(String dockerRootDir) {
            this.dockerRootDir = dockerRootDir;
        }

        public boolean isEnableNetworkPolicy() {
            return enableNetworkPolicy;
        }

        public void setEnableNetworkPolicy(boolean enableNetworkPolicy) {
            this.enableNetworkPolicy = enableNetworkPolicy;
        }

        public boolean isInternal() {
            return internal;
        }

        public void setInternal(boolean internal) {
            this.internal = internal;
        }

        public RancherKubernetesEngineConfigBean getRancherKubernetesEngineConfig() {
            return rancherKubernetesEngineConfig;
        }

        public void setRancherKubernetesEngineConfig(RancherKubernetesEngineConfigBean rancherKubernetesEngineConfig) {
            this.rancherKubernetesEngineConfig = rancherKubernetesEngineConfig;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class RancherKubernetesEngineConfigBean {
            /**
             * addonJobTimeout : 30
             * authentication : {"strategy":"x509","type":"/v3/schemas/authnConfig"}
             * authorization : {"type":"/v3/schemas/authzConfig"}
             * bastionHost : {"sshAgentAuth":false,"type":"/v3/schemas/bastionHost"}
             * cloudProvider : {"type":"/v3/schemas/cloudProvider"}
             * ignoreDockerVersion : true
             * ingress : {"provider":"nginx","type":"/v3/schemas/ingressConfig"}
             * kubernetesVersion : v1.13.4-rancher1-1
             * monitoring : {"provider":"metrics-server","type":"/v3/schemas/monitoringConfig"}
             * network : {"options":{"flannel_backend_type":"vxlan"},"plugin":"canal","type":"/v3/schemas/networkConfig"}
             * nodes : [{"address":"10.0.3.15","hostnameOverride":"localhost","nodeId":"c-p8fcb:m-421aa90e079f","port":"22","role":["etcd","controlplane","worker"],"sshAgentAuth":false,"type":"/v3/schemas/rkeConfigNode","user":"root"}]
             * services : {"etcd":{"creation":"12h","extraArgs":{"election-timeout":"5000","heartbeat-interval":"500"},"retention":"72h","snapshot":true,"type":"/v3/schemas/etcdService"},"kubeApi":{"podSecurityPolicy":false,"serviceNodePortRange":"30000-32767","type":"/v3/schemas/kubeAPIService"},"kubeController":{"type":"/v3/schemas/kubeControllerService"},"kubelet":{"failSwapOn":false,"type":"/v3/schemas/kubeletService"},"kubeproxy":{"type":"/v3/schemas/kubeproxyService"},"scheduler":{"type":"/v3/schemas/schedulerService"},"type":"/v3/schemas/rkeConfigServices"}
             * sshAgentAuth : false
             * type : /v3/schemas/rancherKubernetesEngineConfig
             */

            private int addonJobTimeout;
            private AuthenticationBean authentication;
            private AuthorizationBean authorization;
            private BastionHostBean bastionHost;
            private CloudProviderBean cloudProvider;
            private boolean ignoreDockerVersion;
            private IngressBean ingress;
            private String kubernetesVersion;
            private MonitoringBean monitoring;
            private NetworkBean network;
            private ServicesBean services;
            private boolean sshAgentAuth;
            private String type;
            private List<NodesBean> nodes;

            public int getAddonJobTimeout() {
                return addonJobTimeout;
            }

            public void setAddonJobTimeout(int addonJobTimeout) {
                this.addonJobTimeout = addonJobTimeout;
            }

            public AuthenticationBean getAuthentication() {
                return authentication;
            }

            public void setAuthentication(AuthenticationBean authentication) {
                this.authentication = authentication;
            }

            public AuthorizationBean getAuthorization() {
                return authorization;
            }

            public void setAuthorization(AuthorizationBean authorization) {
                this.authorization = authorization;
            }

            public BastionHostBean getBastionHost() {
                return bastionHost;
            }

            public void setBastionHost(BastionHostBean bastionHost) {
                this.bastionHost = bastionHost;
            }

            public CloudProviderBean getCloudProvider() {
                return cloudProvider;
            }

            public void setCloudProvider(CloudProviderBean cloudProvider) {
                this.cloudProvider = cloudProvider;
            }

            public boolean isIgnoreDockerVersion() {
                return ignoreDockerVersion;
            }

            public void setIgnoreDockerVersion(boolean ignoreDockerVersion) {
                this.ignoreDockerVersion = ignoreDockerVersion;
            }

            public IngressBean getIngress() {
                return ingress;
            }

            public void setIngress(IngressBean ingress) {
                this.ingress = ingress;
            }

            public String getKubernetesVersion() {
                return kubernetesVersion;
            }

            public void setKubernetesVersion(String kubernetesVersion) {
                this.kubernetesVersion = kubernetesVersion;
            }

            public MonitoringBean getMonitoring() {
                return monitoring;
            }

            public void setMonitoring(MonitoringBean monitoring) {
                this.monitoring = monitoring;
            }

            public NetworkBean getNetwork() {
                return network;
            }

            public void setNetwork(NetworkBean network) {
                this.network = network;
            }

            public ServicesBean getServices() {
                return services;
            }

            public void setServices(ServicesBean services) {
                this.services = services;
            }

            public boolean isSshAgentAuth() {
                return sshAgentAuth;
            }

            public void setSshAgentAuth(boolean sshAgentAuth) {
                this.sshAgentAuth = sshAgentAuth;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<NodesBean> getNodes() {
                return nodes;
            }

            public void setNodes(List<NodesBean> nodes) {
                this.nodes = nodes;
            }

            public static class AuthenticationBean {
                /**
                 * strategy : x509
                 * type : /v3/schemas/authnConfig
                 */

                private String strategy;
                private String type;

                public String getStrategy() {
                    return strategy;
                }

                public void setStrategy(String strategy) {
                    this.strategy = strategy;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class AuthorizationBean {
                /**
                 * type : /v3/schemas/authzConfig
                 */

                private String type;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class BastionHostBean {
                /**
                 * sshAgentAuth : false
                 * type : /v3/schemas/bastionHost
                 */

                private boolean sshAgentAuth;
                private String type;

                public boolean isSshAgentAuth() {
                    return sshAgentAuth;
                }

                public void setSshAgentAuth(boolean sshAgentAuth) {
                    this.sshAgentAuth = sshAgentAuth;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class CloudProviderBean {
                /**
                 * type : /v3/schemas/cloudProvider
                 */

                private String type;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class IngressBean {
                /**
                 * provider : nginx
                 * type : /v3/schemas/ingressConfig
                 */

                private String provider;
                private String type;

                public String getProvider() {
                    return provider;
                }

                public void setProvider(String provider) {
                    this.provider = provider;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class MonitoringBean {
                /**
                 * provider : metrics-server
                 * type : /v3/schemas/monitoringConfig
                 */

                private String provider;
                private String type;

                public String getProvider() {
                    return provider;
                }

                public void setProvider(String provider) {
                    this.provider = provider;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class NetworkBean {
                /**
                 * options : {"flannel_backend_type":"vxlan"}
                 * plugin : canal
                 * type : /v3/schemas/networkConfig
                 */

                private OptionsBean options;
                private String plugin;
                private String type;

                public OptionsBean getOptions() {
                    return options;
                }

                public void setOptions(OptionsBean options) {
                    this.options = options;
                }

                public String getPlugin() {
                    return plugin;
                }

                public void setPlugin(String plugin) {
                    this.plugin = plugin;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public static class OptionsBean {
                    /**
                     * flannel_backend_type : vxlan
                     */

                    private String flannel_backend_type;

                    public String getFlannel_backend_type() {
                        return flannel_backend_type;
                    }

                    public void setFlannel_backend_type(String flannel_backend_type) {
                        this.flannel_backend_type = flannel_backend_type;
                    }
                }
            }

            public static class ServicesBean {
                /**
                 * etcd : {"creation":"12h","extraArgs":{"election-timeout":"5000","heartbeat-interval":"500"},"retention":"72h","snapshot":true,"type":"/v3/schemas/etcdService"}
                 * kubeApi : {"podSecurityPolicy":false,"serviceNodePortRange":"30000-32767","type":"/v3/schemas/kubeAPIService"}
                 * kubeController : {"type":"/v3/schemas/kubeControllerService"}
                 * kubelet : {"failSwapOn":false,"type":"/v3/schemas/kubeletService"}
                 * kubeproxy : {"type":"/v3/schemas/kubeproxyService"}
                 * scheduler : {"type":"/v3/schemas/schedulerService"}
                 * type : /v3/schemas/rkeConfigServices
                 */

                private EtcdBean etcd;
                private KubeApiBean kubeApi;
                private KubeControllerBean kubeController;
                private KubeletBean kubelet;
                private KubeproxyBean kubeproxy;
                private SchedulerBean scheduler;
                private String type;

                public EtcdBean getEtcd() {
                    return etcd;
                }

                public void setEtcd(EtcdBean etcd) {
                    this.etcd = etcd;
                }

                public KubeApiBean getKubeApi() {
                    return kubeApi;
                }

                public void setKubeApi(KubeApiBean kubeApi) {
                    this.kubeApi = kubeApi;
                }

                public KubeControllerBean getKubeController() {
                    return kubeController;
                }

                public void setKubeController(KubeControllerBean kubeController) {
                    this.kubeController = kubeController;
                }

                public KubeletBean getKubelet() {
                    return kubelet;
                }

                public void setKubelet(KubeletBean kubelet) {
                    this.kubelet = kubelet;
                }

                public KubeproxyBean getKubeproxy() {
                    return kubeproxy;
                }

                public void setKubeproxy(KubeproxyBean kubeproxy) {
                    this.kubeproxy = kubeproxy;
                }

                public SchedulerBean getScheduler() {
                    return scheduler;
                }

                public void setScheduler(SchedulerBean scheduler) {
                    this.scheduler = scheduler;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public static class EtcdBean {
                    /**
                     * creation : 12h
                     * extraArgs : {"election-timeout":"5000","heartbeat-interval":"500"}
                     * retention : 72h
                     * snapshot : true
                     * type : /v3/schemas/etcdService
                     */

                    private String creation;
                    private ExtraArgsBean extraArgs;
                    private String retention;
                    private boolean snapshot;
                    private String type;

                    public String getCreation() {
                        return creation;
                    }

                    public void setCreation(String creation) {
                        this.creation = creation;
                    }

                    public ExtraArgsBean getExtraArgs() {
                        return extraArgs;
                    }

                    public void setExtraArgs(ExtraArgsBean extraArgs) {
                        this.extraArgs = extraArgs;
                    }

                    public String getRetention() {
                        return retention;
                    }

                    public void setRetention(String retention) {
                        this.retention = retention;
                    }

                    public boolean isSnapshot() {
                        return snapshot;
                    }

                    public void setSnapshot(boolean snapshot) {
                        this.snapshot = snapshot;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public static class ExtraArgsBean {
                        /**
                         * election-timeout : 5000
                         * heartbeat-interval : 500
                         */

                        @SerializedName("election-timeout")
                        private String electiontimeout;
                        @SerializedName("heartbeat-interval")
                        private String heartbeatinterval;

                        public String getElectiontimeout() {
                            return electiontimeout;
                        }

                        public void setElectiontimeout(String electiontimeout) {
                            this.electiontimeout = electiontimeout;
                        }

                        public String getHeartbeatinterval() {
                            return heartbeatinterval;
                        }

                        public void setHeartbeatinterval(String heartbeatinterval) {
                            this.heartbeatinterval = heartbeatinterval;
                        }
                    }
                }

                public static class KubeApiBean {
                    /**
                     * podSecurityPolicy : false
                     * serviceNodePortRange : 30000-32767
                     * type : /v3/schemas/kubeAPIService
                     */

                    private boolean podSecurityPolicy;
                    private String serviceNodePortRange;
                    private String type;

                    public boolean isPodSecurityPolicy() {
                        return podSecurityPolicy;
                    }

                    public void setPodSecurityPolicy(boolean podSecurityPolicy) {
                        this.podSecurityPolicy = podSecurityPolicy;
                    }

                    public String getServiceNodePortRange() {
                        return serviceNodePortRange;
                    }

                    public void setServiceNodePortRange(String serviceNodePortRange) {
                        this.serviceNodePortRange = serviceNodePortRange;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }
                }

                public static class KubeControllerBean {
                    /**
                     * type : /v3/schemas/kubeControllerService
                     */

                    private String type;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }
                }

                public static class KubeletBean {
                    /**
                     * failSwapOn : false
                     * type : /v3/schemas/kubeletService
                     */

                    private boolean failSwapOn;
                    private String type;

                    public boolean isFailSwapOn() {
                        return failSwapOn;
                    }

                    public void setFailSwapOn(boolean failSwapOn) {
                        this.failSwapOn = failSwapOn;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }
                }

                public static class KubeproxyBean {
                    /**
                     * type : /v3/schemas/kubeproxyService
                     */

                    private String type;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }
                }

                public static class SchedulerBean {
                    /**
                     * type : /v3/schemas/schedulerService
                     */

                    private String type;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }
                }
            }

            public static class NodesBean {
                /**
                 * address : 10.0.3.15
                 * hostnameOverride : localhost
                 * nodeId : c-p8fcb:m-421aa90e079f
                 * port : 22
                 * role : ["etcd","controlplane","worker"]
                 * sshAgentAuth : false
                 * type : /v3/schemas/rkeConfigNode
                 * user : root
                 */

                private String address;
                private String hostnameOverride;
                private String nodeId;
                private String port;
                private boolean sshAgentAuth;
                private String type;
                private String user;
                private List<String> role;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getHostnameOverride() {
                    return hostnameOverride;
                }

                public void setHostnameOverride(String hostnameOverride) {
                    this.hostnameOverride = hostnameOverride;
                }

                public String getNodeId() {
                    return nodeId;
                }

                public void setNodeId(String nodeId) {
                    this.nodeId = nodeId;
                }

                public String getPort() {
                    return port;
                }

                public void setPort(String port) {
                    this.port = port;
                }

                public boolean isSshAgentAuth() {
                    return sshAgentAuth;
                }

                public void setSshAgentAuth(boolean sshAgentAuth) {
                    this.sshAgentAuth = sshAgentAuth;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUser() {
                    return user;
                }

                public void setUser(String user) {
                    this.user = user;
                }

                public List<String> getRole() {
                    return role;
                }

                public void setRole(List<String> role) {
                    this.role = role;
                }
            }
        }
    }

    public static class CapacityBean {
        /**
         * cpu : 1
         * memory : 1882296Ki
         * pods : 110
         */

        private String cpu;
        private String memory;
        private String pods;

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public String getPods() {
            return pods;
        }

        public void setPods(String pods) {
            this.pods = pods;
        }
    }

    public static class LabelsBean {
        @SerializedName("cattle.io/creator")
        private String _$CattleIoCreator22; // FIXME check this code

        public String get_$CattleIoCreator22() {
            return _$CattleIoCreator22;
        }

        public void set_$CattleIoCreator22(String _$CattleIoCreator22) {
            this._$CattleIoCreator22 = _$CattleIoCreator22;
        }
    }

    public static class LimitsBean {
        /**
         * cpu : 10m
         * memory : 190Mi
         * pods : 0
         */

        private String cpu;
        private String memory;
        private String pods;

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public String getPods() {
            return pods;
        }

        public void setPods(String pods) {
            this.pods = pods;
        }
    }

    public static class LinksBean {
        /**
         * clusterAlerts : https://192.168.56.100/v3/clusters/c-p8fcb/clusteralerts
         * clusterEvents : https://192.168.56.100/v3/clusters/c-p8fcb/clusterevents
         * clusterLoggings : https://192.168.56.100/v3/clusters/c-p8fcb/clusterloggings
         * clusterRegistrationTokens : https://192.168.56.100/v3/clusters/c-p8fcb/clusterregistrationtokens
         * clusterRoleTemplateBindings : https://192.168.56.100/v3/clusters/c-p8fcb/clusterroletemplatebindings
         * namespaces : https://192.168.56.100/v3/clusters/c-p8fcb/namespaces
         * nodePools : https://192.168.56.100/v3/clusters/c-p8fcb/nodepools
         * nodes : https://192.168.56.100/v3/clusters/c-p8fcb/nodes
         * notifiers : https://192.168.56.100/v3/clusters/c-p8fcb/notifiers
         * persistentVolumes : https://192.168.56.100/v3/clusters/c-p8fcb/persistentvolumes
         * projects : https://192.168.56.100/v3/clusters/c-p8fcb/projects
         * remove : https://192.168.56.100/v3/clusters/c-p8fcb
         * self : https://192.168.56.100/v3/clusters/c-p8fcb
         * shell : wss://192.168.56.100/v3/clusters/c-p8fcb?shell=true
         * storageClasses : https://192.168.56.100/v3/clusters/c-p8fcb/storageclasses
         * subscribe : https://192.168.56.100/v3/clusters/c-p8fcb/subscribe
         * update : https://192.168.56.100/v3/clusters/c-p8fcb
         */

        private String clusterAlerts;
        private String clusterEvents;
        private String clusterLoggings;
        private String clusterRegistrationTokens;
        private String clusterRoleTemplateBindings;
        private String namespaces;
        private String nodePools;
        private String nodes;
        private String notifiers;
        private String persistentVolumes;
        private String projects;
        private String remove;
        private String self;
        private String shell;
        private String storageClasses;
        private String subscribe;
        private String update;

        public String getClusterAlerts() {
            return clusterAlerts;
        }

        public void setClusterAlerts(String clusterAlerts) {
            this.clusterAlerts = clusterAlerts;
        }

        public String getClusterEvents() {
            return clusterEvents;
        }

        public void setClusterEvents(String clusterEvents) {
            this.clusterEvents = clusterEvents;
        }

        public String getClusterLoggings() {
            return clusterLoggings;
        }

        public void setClusterLoggings(String clusterLoggings) {
            this.clusterLoggings = clusterLoggings;
        }

        public String getClusterRegistrationTokens() {
            return clusterRegistrationTokens;
        }

        public void setClusterRegistrationTokens(String clusterRegistrationTokens) {
            this.clusterRegistrationTokens = clusterRegistrationTokens;
        }

        public String getClusterRoleTemplateBindings() {
            return clusterRoleTemplateBindings;
        }

        public void setClusterRoleTemplateBindings(String clusterRoleTemplateBindings) {
            this.clusterRoleTemplateBindings = clusterRoleTemplateBindings;
        }

        public String getNamespaces() {
            return namespaces;
        }

        public void setNamespaces(String namespaces) {
            this.namespaces = namespaces;
        }

        public String getNodePools() {
            return nodePools;
        }

        public void setNodePools(String nodePools) {
            this.nodePools = nodePools;
        }

        public String getNodes() {
            return nodes;
        }

        public void setNodes(String nodes) {
            this.nodes = nodes;
        }

        public String getNotifiers() {
            return notifiers;
        }

        public void setNotifiers(String notifiers) {
            this.notifiers = notifiers;
        }

        public String getPersistentVolumes() {
            return persistentVolumes;
        }

        public void setPersistentVolumes(String persistentVolumes) {
            this.persistentVolumes = persistentVolumes;
        }

        public String getProjects() {
            return projects;
        }

        public void setProjects(String projects) {
            this.projects = projects;
        }

        public String getRemove() {
            return remove;
        }

        public void setRemove(String remove) {
            this.remove = remove;
        }

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getShell() {
            return shell;
        }

        public void setShell(String shell) {
            this.shell = shell;
        }

        public String getStorageClasses() {
            return storageClasses;
        }

        public void setStorageClasses(String storageClasses) {
            this.storageClasses = storageClasses;
        }

        public String getSubscribe() {
            return subscribe;
        }

        public void setSubscribe(String subscribe) {
            this.subscribe = subscribe;
        }

        public String getUpdate() {
            return update;
        }

        public void setUpdate(String update) {
            this.update = update;
        }
    }

    public static class RancherKubernetesEngineConfigBeanX {
        /**
         * addonJobTimeout : 30
         * authentication : {"strategy":"x509","type":"/v3/schemas/authnConfig"}
         * authorization : {"type":"/v3/schemas/authzConfig"}
         * bastionHost : {"sshAgentAuth":false,"type":"/v3/schemas/bastionHost"}
         * cloudProvider : {"type":"/v3/schemas/cloudProvider"}
         * ignoreDockerVersion : true
         * ingress : {"provider":"nginx","type":"/v3/schemas/ingressConfig"}
         * kubernetesVersion : v1.13.4-rancher1-1
         * monitoring : {"provider":"metrics-server","type":"/v3/schemas/monitoringConfig"}
         * network : {"options":{"flannel_backend_type":"vxlan"},"plugin":"canal","type":"/v3/schemas/networkConfig"}
         * services : {"etcd":{"creation":"12h","extraArgs":{"election-timeout":"5000","heartbeat-interval":"500"},"retention":"72h","snapshot":true,"type":"/v3/schemas/etcdService"},"kubeApi":{"podSecurityPolicy":false,"serviceNodePortRange":"30000-32767","type":"/v3/schemas/kubeAPIService"},"kubeController":{"type":"/v3/schemas/kubeControllerService"},"kubelet":{"failSwapOn":false,"type":"/v3/schemas/kubeletService"},"kubeproxy":{"type":"/v3/schemas/kubeproxyService"},"scheduler":{"type":"/v3/schemas/schedulerService"},"type":"/v3/schemas/rkeConfigServices"}
         * sshAgentAuth : false
         * type : /v3/schemas/rancherKubernetesEngineConfig
         */

        private int addonJobTimeout;
        private AuthenticationBeanX authentication;
        private AuthorizationBeanX authorization;
        private BastionHostBeanX bastionHost;
        private CloudProviderBeanX cloudProvider;
        private boolean ignoreDockerVersion;
        private IngressBeanX ingress;
        private String kubernetesVersion;
        private MonitoringBeanX monitoring;
        private NetworkBeanX network;
        private ServicesBeanX services;
        private boolean sshAgentAuth;
        private String type;

        public int getAddonJobTimeout() {
            return addonJobTimeout;
        }

        public void setAddonJobTimeout(int addonJobTimeout) {
            this.addonJobTimeout = addonJobTimeout;
        }

        public AuthenticationBeanX getAuthentication() {
            return authentication;
        }

        public void setAuthentication(AuthenticationBeanX authentication) {
            this.authentication = authentication;
        }

        public AuthorizationBeanX getAuthorization() {
            return authorization;
        }

        public void setAuthorization(AuthorizationBeanX authorization) {
            this.authorization = authorization;
        }

        public BastionHostBeanX getBastionHost() {
            return bastionHost;
        }

        public void setBastionHost(BastionHostBeanX bastionHost) {
            this.bastionHost = bastionHost;
        }

        public CloudProviderBeanX getCloudProvider() {
            return cloudProvider;
        }

        public void setCloudProvider(CloudProviderBeanX cloudProvider) {
            this.cloudProvider = cloudProvider;
        }

        public boolean isIgnoreDockerVersion() {
            return ignoreDockerVersion;
        }

        public void setIgnoreDockerVersion(boolean ignoreDockerVersion) {
            this.ignoreDockerVersion = ignoreDockerVersion;
        }

        public IngressBeanX getIngress() {
            return ingress;
        }

        public void setIngress(IngressBeanX ingress) {
            this.ingress = ingress;
        }

        public String getKubernetesVersion() {
            return kubernetesVersion;
        }

        public void setKubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
        }

        public MonitoringBeanX getMonitoring() {
            return monitoring;
        }

        public void setMonitoring(MonitoringBeanX monitoring) {
            this.monitoring = monitoring;
        }

        public NetworkBeanX getNetwork() {
            return network;
        }

        public void setNetwork(NetworkBeanX network) {
            this.network = network;
        }

        public ServicesBeanX getServices() {
            return services;
        }

        public void setServices(ServicesBeanX services) {
            this.services = services;
        }

        public boolean isSshAgentAuth() {
            return sshAgentAuth;
        }

        public void setSshAgentAuth(boolean sshAgentAuth) {
            this.sshAgentAuth = sshAgentAuth;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class AuthenticationBeanX {
            /**
             * strategy : x509
             * type : /v3/schemas/authnConfig
             */

            private String strategy;
            private String type;

            public String getStrategy() {
                return strategy;
            }

            public void setStrategy(String strategy) {
                this.strategy = strategy;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class AuthorizationBeanX {
            /**
             * type : /v3/schemas/authzConfig
             */

            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class BastionHostBeanX {
            /**
             * sshAgentAuth : false
             * type : /v3/schemas/bastionHost
             */

            private boolean sshAgentAuth;
            private String type;

            public boolean isSshAgentAuth() {
                return sshAgentAuth;
            }

            public void setSshAgentAuth(boolean sshAgentAuth) {
                this.sshAgentAuth = sshAgentAuth;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class CloudProviderBeanX {
            /**
             * type : /v3/schemas/cloudProvider
             */

            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class IngressBeanX {
            /**
             * provider : nginx
             * type : /v3/schemas/ingressConfig
             */

            private String provider;
            private String type;

            public String getProvider() {
                return provider;
            }

            public void setProvider(String provider) {
                this.provider = provider;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class MonitoringBeanX {
            /**
             * provider : metrics-server
             * type : /v3/schemas/monitoringConfig
             */

            private String provider;
            private String type;

            public String getProvider() {
                return provider;
            }

            public void setProvider(String provider) {
                this.provider = provider;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class NetworkBeanX {
            /**
             * options : {"flannel_backend_type":"vxlan"}
             * plugin : canal
             * type : /v3/schemas/networkConfig
             */

            private OptionsBeanX options;
            private String plugin;
            private String type;

            public OptionsBeanX getOptions() {
                return options;
            }

            public void setOptions(OptionsBeanX options) {
                this.options = options;
            }

            public String getPlugin() {
                return plugin;
            }

            public void setPlugin(String plugin) {
                this.plugin = plugin;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public static class OptionsBeanX {
                /**
                 * flannel_backend_type : vxlan
                 */

                private String flannel_backend_type;

                public String getFlannel_backend_type() {
                    return flannel_backend_type;
                }

                public void setFlannel_backend_type(String flannel_backend_type) {
                    this.flannel_backend_type = flannel_backend_type;
                }
            }
        }

        public static class ServicesBeanX {
            /**
             * etcd : {"creation":"12h","extraArgs":{"election-timeout":"5000","heartbeat-interval":"500"},"retention":"72h","snapshot":true,"type":"/v3/schemas/etcdService"}
             * kubeApi : {"podSecurityPolicy":false,"serviceNodePortRange":"30000-32767","type":"/v3/schemas/kubeAPIService"}
             * kubeController : {"type":"/v3/schemas/kubeControllerService"}
             * kubelet : {"failSwapOn":false,"type":"/v3/schemas/kubeletService"}
             * kubeproxy : {"type":"/v3/schemas/kubeproxyService"}
             * scheduler : {"type":"/v3/schemas/schedulerService"}
             * type : /v3/schemas/rkeConfigServices
             */

            private EtcdBeanX etcd;
            private KubeApiBeanX kubeApi;
            private KubeControllerBeanX kubeController;
            private KubeletBeanX kubelet;
            private KubeproxyBeanX kubeproxy;
            private SchedulerBeanX scheduler;
            private String type;

            public EtcdBeanX getEtcd() {
                return etcd;
            }

            public void setEtcd(EtcdBeanX etcd) {
                this.etcd = etcd;
            }

            public KubeApiBeanX getKubeApi() {
                return kubeApi;
            }

            public void setKubeApi(KubeApiBeanX kubeApi) {
                this.kubeApi = kubeApi;
            }

            public KubeControllerBeanX getKubeController() {
                return kubeController;
            }

            public void setKubeController(KubeControllerBeanX kubeController) {
                this.kubeController = kubeController;
            }

            public KubeletBeanX getKubelet() {
                return kubelet;
            }

            public void setKubelet(KubeletBeanX kubelet) {
                this.kubelet = kubelet;
            }

            public KubeproxyBeanX getKubeproxy() {
                return kubeproxy;
            }

            public void setKubeproxy(KubeproxyBeanX kubeproxy) {
                this.kubeproxy = kubeproxy;
            }

            public SchedulerBeanX getScheduler() {
                return scheduler;
            }

            public void setScheduler(SchedulerBeanX scheduler) {
                this.scheduler = scheduler;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public static class EtcdBeanX {
                /**
                 * creation : 12h
                 * extraArgs : {"election-timeout":"5000","heartbeat-interval":"500"}
                 * retention : 72h
                 * snapshot : true
                 * type : /v3/schemas/etcdService
                 */

                private String creation;
                private ExtraArgsBeanX extraArgs;
                private String retention;
                private boolean snapshot;
                private String type;

                public String getCreation() {
                    return creation;
                }

                public void setCreation(String creation) {
                    this.creation = creation;
                }

                public ExtraArgsBeanX getExtraArgs() {
                    return extraArgs;
                }

                public void setExtraArgs(ExtraArgsBeanX extraArgs) {
                    this.extraArgs = extraArgs;
                }

                public String getRetention() {
                    return retention;
                }

                public void setRetention(String retention) {
                    this.retention = retention;
                }

                public boolean isSnapshot() {
                    return snapshot;
                }

                public void setSnapshot(boolean snapshot) {
                    this.snapshot = snapshot;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public static class ExtraArgsBeanX {
                    /**
                     * election-timeout : 5000
                     * heartbeat-interval : 500
                     */

                    @SerializedName("election-timeout")
                    private String electiontimeout;
                    @SerializedName("heartbeat-interval")
                    private String heartbeatinterval;

                    public String getElectiontimeout() {
                        return electiontimeout;
                    }

                    public void setElectiontimeout(String electiontimeout) {
                        this.electiontimeout = electiontimeout;
                    }

                    public String getHeartbeatinterval() {
                        return heartbeatinterval;
                    }

                    public void setHeartbeatinterval(String heartbeatinterval) {
                        this.heartbeatinterval = heartbeatinterval;
                    }
                }
            }

            public static class KubeApiBeanX {
                /**
                 * podSecurityPolicy : false
                 * serviceNodePortRange : 30000-32767
                 * type : /v3/schemas/kubeAPIService
                 */

                private boolean podSecurityPolicy;
                private String serviceNodePortRange;
                private String type;

                public boolean isPodSecurityPolicy() {
                    return podSecurityPolicy;
                }

                public void setPodSecurityPolicy(boolean podSecurityPolicy) {
                    this.podSecurityPolicy = podSecurityPolicy;
                }

                public String getServiceNodePortRange() {
                    return serviceNodePortRange;
                }

                public void setServiceNodePortRange(String serviceNodePortRange) {
                    this.serviceNodePortRange = serviceNodePortRange;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class KubeControllerBeanX {
                /**
                 * type : /v3/schemas/kubeControllerService
                 */

                private String type;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class KubeletBeanX {
                /**
                 * failSwapOn : false
                 * type : /v3/schemas/kubeletService
                 */

                private boolean failSwapOn;
                private String type;

                public boolean isFailSwapOn() {
                    return failSwapOn;
                }

                public void setFailSwapOn(boolean failSwapOn) {
                    this.failSwapOn = failSwapOn;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class KubeproxyBeanX {
                /**
                 * type : /v3/schemas/kubeproxyService
                 */

                private String type;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class SchedulerBeanX {
                /**
                 * type : /v3/schemas/schedulerService
                 */

                private String type;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }
        }
    }

    public static class RequestedBean {
        /**
         * cpu : 540m
         * memory : 140Mi
         * pods : 8
         */

        private String cpu;
        private String memory;
        private String pods;

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public String getPods() {
            return pods;
        }

        public void setPods(String pods) {
            this.pods = pods;
        }
    }

    public static class VersionBean {
        /**
         * buildDate : 2019-02-28T13:30:26Z
         * compiler : gc
         * gitCommit : c27b913fddd1a6c480c229191a087698aa92f0b1
         * gitTreeState : clean
         * gitVersion : v1.13.4
         * goVersion : go1.11.5
         * major : 1
         * minor : 13
         * platform : linux/amd64
         * type : /v3/schemas/info
         */

        private String buildDate;
        private String compiler;
        private String gitCommit;
        private String gitTreeState;
        private String gitVersion;
        private String goVersion;
        private String major;
        private String minor;
        private String platform;
        private String type;

        public String getBuildDate() {
            return buildDate;
        }

        public void setBuildDate(String buildDate) {
            this.buildDate = buildDate;
        }

        public String getCompiler() {
            return compiler;
        }

        public void setCompiler(String compiler) {
            this.compiler = compiler;
        }

        public String getGitCommit() {
            return gitCommit;
        }

        public void setGitCommit(String gitCommit) {
            this.gitCommit = gitCommit;
        }

        public String getGitTreeState() {
            return gitTreeState;
        }

        public void setGitTreeState(String gitTreeState) {
            this.gitTreeState = gitTreeState;
        }

        public String getGitVersion() {
            return gitVersion;
        }

        public void setGitVersion(String gitVersion) {
            this.gitVersion = gitVersion;
        }

        public String getGoVersion() {
            return goVersion;
        }

        public void setGoVersion(String goVersion) {
            this.goVersion = goVersion;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public String getMinor() {
            return minor;
        }

        public void setMinor(String minor) {
            this.minor = minor;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class ComponentStatusesBean {
        /**
         * conditions : [{"message":"ok","status":"True","type":"Healthy"}]
         * name : controller-manager
         * type : /v3/schemas/clusterComponentStatus
         */

        private String name;
        private String type;
        private List<ConditionsBean> conditions;

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

        public List<ConditionsBean> getConditions() {
            return conditions;
        }

        public void setConditions(List<ConditionsBean> conditions) {
            this.conditions = conditions;
        }

        public static class ConditionsBean {
            /**
             * message : ok
             * status : True
             * type : Healthy
             */

            private String message;
            private String status;
            private String type;

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
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
        }
    }

    public static class ConditionsBeanX {
        /**
         * lastUpdateTime : 2019-03-20T12:59:08Z
         * status : True
         * type : BackingNamespaceCreated
         */

        private String lastUpdateTime;
        private String status;
        private String type;

        public String getLastUpdateTime() {
            return lastUpdateTime;
        }

        public void setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
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
    }
}
