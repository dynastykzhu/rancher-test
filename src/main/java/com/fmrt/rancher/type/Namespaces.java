package com.fmrt.rancher.type;

import com.fmrt.rancher.base.AbstractType;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Namespaces  extends AbstractType {


    /**
     * accountName : default
     * accountUid : d6fa90ee-4b11-11e9-9f07-0800275a0d0d
     * annotations : {}
     * baseType : namespacedSecret
     * caCrt : -----BEGIN CERTIFICATE-----
     * created : 2019-03-20T13:12:40Z
     * createdTS : 1553087560000
     * creatorId : null
     * links : {"remove":"https://192.168.56.100/v3/project/c-p8fcb:p-jw24t/namespacedServiceAccountTokens/dong-test:default-token-p4kzj","self":"https://192.168.56.100/v3/project/c-p8fcb:p-jw24t/namespacedServiceAccountTokens/dong-test:default-token-p4kzj","update":"https://192.168.56.100/v3/project/c-p8fcb:p-jw24t/namespacedServiceAccountTokens/dong-test:default-token-p4kzj","yaml":"https://192.168.56.100/v3/project/c-p8fcb:p-jw24t/namespacedServiceAccountTokens/dong-test:default-token-p4kzj/yaml"}
     * name : default-token-p4kzj
     * namespaceId : dong-test
     * projectId : c-p8fcb:p-jw24t
     * type : namespacedServiceAccountToken
     * uuid : d7038a14-4b11-11e9-9f07-0800275a0d0d
     */

    private String accountName;
    private String accountUid;
    private String baseType;
    private String caCrt;
    private String created;
    private long createdTS;
    private Object creatorId;
    private LinksBean links;
    private String name;
    private String namespaceId;
    private String projectId;
    private String type;
    private String uuid;

    @Data
    public static class LinksBean {

        private String remove;
        private String self;
        private String update;
        private String yaml;

    }
}
