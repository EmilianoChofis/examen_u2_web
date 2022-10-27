package com.example.web_ordinario_u2.model.tipos_prenda;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BeanTipos {
    Long id_tipo;
    String nombre_tipo;

    public BeanTipos() {
    }

    public BeanTipos(Long id_tipo, String nombre_tipo) {
        this.id_tipo = id_tipo;
        this.nombre_tipo = nombre_tipo;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
}
