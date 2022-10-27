package com.example.web_ordinario_u2.controller.productos;

import com.example.web_ordinario_u2.model.categorias.BeanCategorias;
import com.example.web_ordinario_u2.model.productos.BeanProductos;
import com.example.web_ordinario_u2.model.productos.DaoProductos;
import com.example.web_ordinario_u2.utils.Response;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/api/productos")
public class ProductosServices {

    Map<String, Object> response = new HashMap<>();

    @GET
    @Path("/")
    @Produces(value = {"application/json"})
    public List<BeanProductos> getAll() {
        return new DaoProductos().findAll();
    }

    @GET
    @Path("/{id_prod}")
    @Produces(MediaType.APPLICATION_JSON)
    public BeanProductos getOne(@PathParam("id_prod") Long id_prod) {
        System.out.println(id_prod);
        return new DaoProductos().findOne(id_prod);
    }

    @POST
    @Path("/")
    @Produces(value = {"application/json"})
    public Map<String, Object> save(BeanProductos productos){
        Response<BeanProductos> result = new DaoProductos().save(productos);
        response.put("result", result);
        return response;
    }

    @PUT
    @Path("/")
    @Consumes(value = {})


}
