package com.uptc.frmw.fabricasDocker.Jpa.Models;

import java.util.Date;

public class Worker {
    private long idWorker;
    private String name;
    private String last_name;
    private Date boringDate;
    private String adress;

    public Worker() {
    }

    public long getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(long idWorker) {
        this.idWorker = idWorker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBoringDate() {
        return boringDate;
    }

    public void setBoringDate(Date boringDate) {
        this.boringDate = boringDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
