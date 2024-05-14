package com.uptc.frmw.fabricasDocker.Jpa.Models;

public class Habilidades {
    private long idHabilidades;
    private String habilidades;

    public Habilidades() {
    }

    public long getIdHabilidades() {
        return idHabilidades;
    }

    public void setIdHabilidades(long idHabilidades) {
        this.idHabilidades = idHabilidades;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Habilidades{" +
                "idHabilidades=" + idHabilidades +
                ", habilidades='" + habilidades + '\'' +
                '}';
    }
}
