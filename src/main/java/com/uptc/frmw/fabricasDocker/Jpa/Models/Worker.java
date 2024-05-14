package com.uptc.frmw.fabricasDocker.Jpa.Models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "trabajador")
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTrabajador")
    private long idWorker;
    @Column(name = "Nombre")
    private String name;
    @Column(name = "Apellido")
    private String last_name;
    @Column(name ="Fecha_Nacimiento")
    private Date boringDate;
    @Column(name= "Direccion")
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
