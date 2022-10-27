package com.example.web_ordinario_u2.model.productos;

import com.example.web_ordinario_u2.model.categorias.BeanCategorias;
import com.example.web_ordinario_u2.model.tipos_prenda.BeanTipos;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class BeanProductos {
    Long id_prod;
    BeanTipos tipo;
    BeanCategorias categoria;
    Double precio;
    String talla;
    String marca;
    String tipo_tela;
    Integer stock;
    String fecha_registro;
    Integer estado;

    public BeanProductos() {
    }

    public BeanProductos(Long id_prod, BeanTipos tipo, BeanCategorias categoria, Double precio, String talla, String marca, String tipo_tela, Integer stock, String fecha_registro, Integer estado) {
        this.id_prod = id_prod;
        this.tipo = tipo;
        this.categoria = categoria;
        this.precio = precio;
        this.talla = talla;
        this.marca = marca;
        this.tipo_tela = tipo_tela;
        this.stock = stock;
        this.fecha_registro = fecha_registro;
        this.estado = estado;
    }

    public Long getId_prod() {
        return id_prod;
    }

    public void setId_prod(Long id_prod) {
        this.id_prod = id_prod;
    }

    public BeanTipos getTipo() {
        return tipo;
    }

    public void setTipo(BeanTipos tipo) {
        this.tipo = tipo;
    }

    public BeanCategorias getCategoria() {
        return categoria;
    }

    public void setCategoria(BeanCategorias categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo_tela() {
        return tipo_tela;
    }

    public void setTipo_tela(String tipo_tela) {
        this.tipo_tela = tipo_tela;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
