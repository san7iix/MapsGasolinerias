package com.example.formulario.modelos;

public class Estacion {
    private int id;
    private String nombre;
    private String empresa;
    private String departamento;
    private String municipio;
    private String longitud;
    private String latitud;

    public Estacion(String nombre, String empresa, String departamento, String municipio, String longitud, String latitud) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.departamento = departamento;
        this.municipio = municipio;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public Estacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }
}
