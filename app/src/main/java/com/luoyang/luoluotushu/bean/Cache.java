package com.luoyang.luoluotushu.bean;

import java.lang.ref.WeakReference;

/**
 * package: com.luoyang.luoluotushu.bean
 * created by luoyang
 * QQ:1845313665
 * on 2018/11/1
 */
public class Cache {
    private long size;
    private WeakReference<char[]> data;

    public WeakReference<char[]> getData() {
        return data;
    }

    public void setData(WeakReference<char[]> data) {
        this.data = data;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
