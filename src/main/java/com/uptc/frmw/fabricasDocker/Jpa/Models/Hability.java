package com.uptc.frmw.fabricasDocker.Jpa.Models;

public class Hability {
    private long idHability;
    private String name;

    public Hability() {
    }

    public long getIdHability() {
        return idHability;
    }

    public void setIdHability(long idHability) {
        this.idHability = idHability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hability{" +
                "idHability=" + idHability +
                ", name='" + name + '\'' +
                '}';
    }
}
