/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author VAIO
 */
public class PedidoMO {
    /*
    
    INSERT INTO noveltystoremovil.pedido (`FechaPedido`, `FechaEnvio`, `MedioEnvio`,
            `Departamento`, `Provincia`, `Distrito`, `Direcccion`, `CodigoPostal`, 
            `Peso`, `cliente_persona_idPersona`) */
    
    /*`Producto_idProducto`, `Pedido_idPedido`, `PrecioUnit`, `Cantidad`, `Descuento`, `Estado_idEstado`)*/
    
    private String idPedido;
    private Date FechaPedido;
    private Date FechaEnvio;
    private String MedioEnvio;
    private String departamentopedido;
    private String provinciapedido;
    private String distritopedido;
    private String direccionpedido;
    private String codigopostal;

    /*cliente*/
    private int idpersona;
    private String nombre_persona;
    private String apellido_persona;
    private String dni;
    private int telefono;
    private String departamento;
    private String provincia;
    private String distrito;
    private String direccion;
    private String correo;
    private String ruc;
    private String razon_social;
    private String estado;
    /*detallepedido*/
    /*`Producto_idProducto`, `Pedido_idPedido`, `PrecioUnit`, `Cantidad`, `Descuento`, `Estado_idEstado`)*/
    private String idproducto;
    private String idpedido;
    private double Preciounit;
    private int Cantidad;
    private double descuento;
    private String estado_pedido;
        /*producto*/
    private String nombre_poducto;
    private String color;
    private int stock;
    private double precio_compra;
    private double precio_venta;
    private int idCategoria;
    private String NombreCategoria;
    private int SubCategoria;
    private String NombreSubcategoria;
    private int IdMarca;
    private String NombreMarca;

    public PedidoMO(String idPedido, Date FechaPedido, Date FechaEnvio, String MedioEnvio, String departamentopedido, String provinciapedido, String distritopedido, String direccionpedido, String codigopostal, int idpersona, String nombre_persona, String apellido_persona, String dni, int telefono, String departamento, String provincia, String distrito, String direccion, String correo, String ruc, String razon_social, String estado, String idproducto, String idpedido, double Preciounit, int Cantidad, double descuento, String estado_pedido, String nombre_poducto, String color, int stock, double precio_compra, double precio_venta, int idCategoria, String NombreCategoria, int SubCategoria, String NombreSubcategoria, int IdMarca, String NombreMarca) {
        this.idPedido = idPedido;
        this.FechaPedido = FechaPedido;
        this.FechaEnvio = FechaEnvio;
        this.MedioEnvio = MedioEnvio;
        this.departamentopedido = departamentopedido;
        this.provinciapedido = provinciapedido;
        this.distritopedido = distritopedido;
        this.direccionpedido = direccionpedido;
        this.codigopostal = codigopostal;
        this.idpersona = idpersona;
        this.nombre_persona = nombre_persona;
        this.apellido_persona = apellido_persona;
        this.dni = dni;
        this.telefono = telefono;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.direccion = direccion;
        this.correo = correo;
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.estado = estado;
        this.idproducto = idproducto;
        this.idpedido = idpedido;
        this.Preciounit = Preciounit;
        this.Cantidad = Cantidad;
        this.descuento = descuento;
        this.estado_pedido = estado_pedido;
        this.nombre_poducto = nombre_poducto;
        this.color = color;
        this.stock = stock;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.idCategoria = idCategoria;
        this.NombreCategoria = NombreCategoria;
        this.SubCategoria = SubCategoria;
        this.NombreSubcategoria = NombreSubcategoria;
        this.IdMarca = IdMarca;
        this.NombreMarca = NombreMarca;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(Date FechaPedido) {
        this.FechaPedido = FechaPedido;
    }

    public Date getFechaEnvio() {
        return FechaEnvio;
    }

    public void setFechaEnvio(Date FechaEnvio) {
        this.FechaEnvio = FechaEnvio;
    }

    public String getMedioEnvio() {
        return MedioEnvio;
    }

    public void setMedioEnvio(String MedioEnvio) {
        this.MedioEnvio = MedioEnvio;
    }

    public String getDepartamentopedido() {
        return departamentopedido;
    }

    public void setDepartamentopedido(String departamentopedido) {
        this.departamentopedido = departamentopedido;
    }

    public String getProvinciapedido() {
        return provinciapedido;
    }

    public void setProvinciapedido(String provinciapedido) {
        this.provinciapedido = provinciapedido;
    }

    public String getDistritopedido() {
        return distritopedido;
    }

    public void setDistritopedido(String distritopedido) {
        this.distritopedido = distritopedido;
    }

    public String getDireccionpedido() {
        return direccionpedido;
    }

    public void setDireccionpedido(String direccionpedido) {
        this.direccionpedido = direccionpedido;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getApellido_persona() {
        return apellido_persona;
    }

    public void setApellido_persona(String apellido_persona) {
        this.apellido_persona = apellido_persona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(String idpedido) {
        this.idpedido = idpedido;
    }

    public double getPreciounit() {
        return Preciounit;
    }

    public void setPreciounit(double Preciounit) {
        this.Preciounit = Preciounit;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public String getNombre_poducto() {
        return nombre_poducto;
    }

    public void setNombre_poducto(String nombre_poducto) {
        this.nombre_poducto = nombre_poducto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }

    public int getSubCategoria() {
        return SubCategoria;
    }

    public void setSubCategoria(int SubCategoria) {
        this.SubCategoria = SubCategoria;
    }

    public String getNombreSubcategoria() {
        return NombreSubcategoria;
    }

    public void setNombreSubcategoria(String NombreSubcategoria) {
        this.NombreSubcategoria = NombreSubcategoria;
    }

    public int getIdMarca() {
        return IdMarca;
    }

    public void setIdMarca(int IdMarca) {
        this.IdMarca = IdMarca;
    }

    public String getNombreMarca() {
        return NombreMarca;
    }

    public void setNombreMarca(String NombreMarca) {
        this.NombreMarca = NombreMarca;
    }

    
    

  
    
   
    
    
    
    
}
