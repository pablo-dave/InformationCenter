package com.uisrael.civ.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Company implements Serializable{
	@Id
	private int companyid;
	private String companyname;
        private String companydirection;

    public Company() {
    }

    public Company(int companyid, String companyname, String companydirection) {
        this.companyid = companyid;
        this.companyname = companyname;
        this.companydirection = companydirection;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCompanydirection() {
        return companydirection;
    }

    public void setCompanydirection(String companydirection) {
        this.companydirection = companydirection;
    }

    @Override
    public String toString() {
        return "Company{" + "companyid=" + companyid + ", companyname=" + companyname + ", companydirection=" + companydirection + '}';
    }        
}