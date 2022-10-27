package com.example.web_ordinario_u2.model.productos;

import com.example.web_ordinario_u2.model.Repository;
import com.example.web_ordinario_u2.model.categorias.BeanCategorias;
import com.example.web_ordinario_u2.model.tipos_prenda.BeanTipos;
import com.example.web_ordinario_u2.utils.Conn;
import com.example.web_ordinario_u2.utils.Response;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoProductos implements Repository<BeanProductos> {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;

    Conn client =  new Conn();

    @Override
    public List<BeanProductos> findAll() {
        List<BeanProductos> productos =  new ArrayList<>();
        BeanProductos producto =  null;
        BeanCategorias categoria = null;
        BeanTipos tipo =  null;
        try{
            connection = (Connection) client.getConnection();
            String query = "select * from SelectAll";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                producto = new BeanProductos();
                categoria =  new BeanCategorias();
                tipo = new BeanTipos();

                producto.setId_prod(rs.getLong("id_prod"));
                categoria.setNombre_cat(rs.getString("nombre_cat"));
                tipo.setNombre_tipo(rs.getString("nombre_tipo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setTalla(rs.getString("talla"));
                producto.setMarca(rs.getString("marca"));
                producto.setTipo_tela(rs.getString("tipo_tela"));
                producto.setStock(rs.getInt("stock"));
                producto.setFecha_registro(rs.getString("fecha_registro"));
                producto.setEstado(rs.getInt("estado"));
                producto.setTipo(tipo);
                producto.setCategoria(categoria);
                productos.add(producto);

            }
        }catch (SQLException e){
            Logger.getLogger(DaoProductos.class.getName()).log(
                    Level.SEVERE, "Error -> findAll" + e.getMessage());


        }finally {
            client.close(connection, ps, rs);
        }
        return productos;
    }

    @Override
    public BeanProductos findOne(Long id_prod) {
        BeanProductos producto =  null;
        BeanTipos tipo =  null;
        BeanCategorias categoria = null;
        try{
            connection = (Connection) client.getConnection();
            String query = "select productos.id_prod, categorias.nombre_cat as categoria, tipos_prenda.nombre_tipo as tipo, \n" +
                    "productos.precio, productos.talla, productos.marca, productos.tipo_tela, productos.stock, productos.fecha_registro, productos.estado\n" +
                    "from productos join tipos_prenda on productos.tipo = tipos_prenda.id_tipo\n" +
                    "join categorias on productos.categoria = categorias.id_cat where id_prod=?;";
            ps = connection.prepareStatement(query);
            ps.setLong(1, id_prod);
            rs = ps.executeQuery();
            while (rs.next()){
                producto = new BeanProductos();
                categoria =  new BeanCategorias();
                tipo = new BeanTipos();

                producto.setId_prod(rs.getLong("id_prod"));
                categoria.setNombre_cat(rs.getString("nombre_cat"));
                tipo.setNombre_tipo(rs.getString("nombre_tipo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setTalla(rs.getString("talla"));
                producto.setMarca(rs.getString("marca"));
                producto.setTipo_tela(rs.getString("tipo_tela"));
                producto.setStock(rs.getInt("stock"));
                producto.setFecha_registro(rs.getString("fecha_registro"));
                producto.setEstado(rs.getInt("estado"));
                producto.setTipo(tipo);
                producto.setCategoria(categoria);

            }
        }catch (SQLException e){
            Logger.getLogger(DaoProductos.class.getName()).log(
                    Level.SEVERE, "Error -> findOne" + e.getMessage());


        }finally {
            client.close(connection, ps, rs);
        }
        return producto;
    }

    @Override
    public Response<BeanProductos> save(BeanProductos object) {
        try{
            connection = client.getConnection();
            String query = "insert into productos(tipo, categoria, precio, talla, marca, tipo_tela, stock, fecha_registro, estado) \n" +
                    "values(?,?,?,?,?,?,?,?,?);";
            ps= connection.prepareStatement(query);

            ps.setLong(1, object.getTipo().getId_tipo());
            ps.setLong(2, object.getCategoria().getId_cat());
            ps.setDouble(3, object.getPrecio());
            ps.setString(4, object.getTalla());
            ps.setString(5, object.getMarca());
            ps.setString(6, object.getTipo_tela());
            ps.setInt(7, object.getStock());
            ps.setString(8, object.getFecha_registro());
            ps.setInt(9, object.getEstado());

            if (ps.executeUpdate()==1){
                return new Response<BeanProductos>(200, "Registro exitoso", object, false);
            }else{
                return new Response<>(200, "Registro no exitoso", object, true);
            }


        }catch (SQLException e){
            Logger.getLogger(DaoProductos.class.getName()).log(Level.SEVERE,"Error -> save: "+ e.getMessage());

        }
        finally {
            client.close(connection,ps,rs);
        }
        return new Response<>(400, "Error con el servidor", null, true);
    }

    @Override
    public Response<BeanProductos> update(BeanProductos object, int id_prod) {
        return null;
    }


}
