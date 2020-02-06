package com.uisrael.civ.modelo.entidades;

import java.io.Serializable;

public class CompanyActivity implements Serializable{
    private int companyactitivyid;

    public CompanyActivity() {
    }

    public CompanyActivity(int companyactitivyid) {
        this.companyactitivyid = companyactitivyid;
    }

    public int getCompanyactitivyid() {
        return companyactitivyid;
    }

    public void setCompanyactitivyid(int companyactitivyid) {
        this.companyactitivyid = companyactitivyid;
    }

    @Override
    public String toString() {
        return "CompanyActivity{" + "companyactitivyid=" + companyactitivyid + '}';
    }
}
