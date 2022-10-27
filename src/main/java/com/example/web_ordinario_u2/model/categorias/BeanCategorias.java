package com.example.web_ordinario_u2.model.categorias;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BeanCategorias {
    Long id_cat;
    String nombre_cat;

    public BeanCategorias() {
    }

    public BeanCategorias(Long id_cat, String nombre_cat) {
        this.id_cat = id_cat;
        this.nombre_cat = nombre_cat;
    }

    public Long getId_cat() {
        return id_cat;
    }

    public void setId_cat(Long id_cat) {
        this.id_cat = id_cat;
    }

    public String getNombre_cat() {
        return nombre_cat;
    }

    public void setNombre_cat(String nombre_cat) {
        this.nombre_cat = nombre_cat;
    }
}
