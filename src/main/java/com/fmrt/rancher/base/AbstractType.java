package com.fmrt.rancher.base;

public abstract class AbstractType {
    private String id;

    public AbstractType() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}