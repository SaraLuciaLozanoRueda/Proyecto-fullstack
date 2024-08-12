package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "oficinas")
public class Oficina {
    @Id
    private String codigoOficina;

    private String ciudad;
    private String pais;
    private String region;
    private String codigoPostal;
    private String telefono;
    private String lineaDireccion1;

    public Oficina(){

    }
    
    public Oficina( String ciudad, String pais, String region, String codigoPostal,
            String telefono, String lineaDireccion1, String lineaDireccion2) {
        this.ciudad = ciudad;
        this.pais = pais;
        this.region = region;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.lineaDireccion1 = lineaDireccion1;
        this.lineaDireccion2 = lineaDireccion2;
    }
    private String lineaDireccion2;
    public String getCodigoOficina() {
        return codigoOficina;
    }
    public void setCodigoOficina(String codigoOficina) {
        this.codigoOficina = codigoOficina;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getLineaDireccion1() {
        return lineaDireccion1;
    }
    public void setLineaDireccion1(String lineaDireccion1) {
        this.lineaDireccion1 = lineaDireccion1;
    }
    public String getLineaDireccion2() {
        return lineaDireccion2;
    }
    public void setLineaDireccion2(String lineaDireccion2) {
        this.lineaDireccion2 = lineaDireccion2;
    }

}