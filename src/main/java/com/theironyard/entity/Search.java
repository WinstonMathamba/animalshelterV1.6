package com.theironyard.entity;

/**
 * Created by katherine_celeste on 10/4/16.
 */
public class Search {
    Long typeId;
    String name;

    public Search() {
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}