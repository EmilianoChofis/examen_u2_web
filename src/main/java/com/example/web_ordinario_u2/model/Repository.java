package com.example.web_ordinario_u2.model;

import com.example.web_ordinario_u2.model.productos.BeanProductos;
import com.example.web_ordinario_u2.utils.Response;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findOne(Long id_prod);

    Response<T> save (T object);
    Response<T> update (T object, int id_prod);

}
