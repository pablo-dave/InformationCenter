package com.uisrael.civ.modelo.entidades;

import java.io.Serializable;

public class ActivityType implements Serializable{
    private int activitytypeid;
    private String activitytypename;
    private int activitytypestatus;

    public ActivityType() {
    }

    public ActivityType(int activitytypeid, String activitytypename, int activitytypestatus) {
        this.activitytypeid = activitytypeid;
        this.activitytypename = activitytypename;
        this.activitytypestatus = activitytypestatus;
    }

    public int getActivitytypeid() {
        return activitytypeid;
    }

    public void setActivitytypeid(int activitytypeid) {
        this.activitytypeid = activitytypeid;
    }

    public String getActivitytypename() {
        return activitytypename;
    }

    public void setActivitytypename(String activitytypename) {
        this.activitytypename = activitytypename;
    }

    public int getActivitytypestatus() {
        return activitytypestatus;
    }

    public void setActivitytypestatus(int activitytypestatus) {
        this.activitytypestatus = activitytypestatus;
    }

    @Override
    public String toString() {
        return "ActivityType{" + "activitytypeid=" + activitytypeid + ", activitytypename=" + activitytypename + ", activitytypestatus=" + activitytypestatus + '}';
    }
}
