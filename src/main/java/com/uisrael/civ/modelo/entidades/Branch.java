package com.uisrael.civ.modelo.entidades;

import java.io.Serializable;

public class Branch implements Serializable {
    private int branchid;
    private String branchName;
    private String addressStreetPrincipal;
    private String addressStreetSecondary;
    private String addressGpsX;
    private String addressGpsY;
    private int branchState;

    public Branch() {
    }

    public Branch(int branchid, String branchName, String addressStreetPrincipal, String addressStreetSecondary, String addressGpsX, String addressGpsY, int branchState) {
        this.branchid = branchid;
        this.branchName = branchName;
        this.addressStreetPrincipal = addressStreetPrincipal;
        this.addressStreetSecondary = addressStreetSecondary;
        this.addressGpsX = addressGpsX;
        this.addressGpsY = addressGpsY;
        this.branchState = branchState;
    }

    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddressStreetPrincipal() {
        return addressStreetPrincipal;
    }

    public void setAddressStreetPrincipal(String addressStreetPrincipal) {
        this.addressStreetPrincipal = addressStreetPrincipal;
    }

    public String getAddressStreetSecondary() {
        return addressStreetSecondary;
    }

    public void setAddressStreetSecondary(String addressStreetSecondary) {
        this.addressStreetSecondary = addressStreetSecondary;
    }

    public String getAddressGpsX() {
        return addressGpsX;
    }

    public void setAddressGpsX(String addressGpsX) {
        this.addressGpsX = addressGpsX;
    }

    public String getAddressGpsY() {
        return addressGpsY;
    }

    public void setAddressGpsY(String addressGpsY) {
        this.addressGpsY = addressGpsY;
    }

    public int getBranchState() {
        return branchState;
    }

    public void setBranchState(int branchState) {
        this.branchState = branchState;
    }

    @Override
    public String toString() {
        return "Branch{" + "branchid=" + branchid + ", branchName=" + branchName + ", addressStreetPrincipal=" + addressStreetPrincipal + ", addressStreetSecondary=" + addressStreetSecondary + ", addressGpsX=" + addressGpsX + ", addressGpsY=" + addressGpsY + ", branchState=" + branchState + '}';
    }
}
