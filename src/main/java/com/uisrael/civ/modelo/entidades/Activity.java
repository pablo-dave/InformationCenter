package com.uisrael.civ.modelo.entidades;

import java.io.Serializable;

public class Activity implements Serializable{
    private int activityid;
    private String activityname;
    private String description;

    public Activity() {
    }

    public Activity(int activityid, String activityname, String description) {
        this.activityid = activityid;
        this.activityname = activityname;
        this.description = description;
    }

    public int getActivityid() {
        return activityid;
    }

    public void setActivityid(int activityid) {
        this.activityid = activityid;
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Activity{" + "activityid=" + activityid + ", activityname=" + activityname + ", description=" + description + '}';
    }
}

