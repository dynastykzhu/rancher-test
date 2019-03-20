package com.fmrt.rancher.base;

import java.util.List;

public class TypeCollection<T> {
    private List<T> data;

    public TypeCollection() {
    }

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
