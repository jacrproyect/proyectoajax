/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.util.Date;

/**
 *
 * @author VAIO
 */
public class ProductoMO {
    
    private String idproducto;
    private String nombre;
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
    private int IdProveedor;
    private String RazonSocial;
    private String Direccion;
    private String SitioWeb;
    private String correo;
    private String telefono;
    private String Observaciones;
    private Date FechaReg;
    private String Contacto;
    private String RUC;
    private byte[] foto;
    private File ruta;
    
    public ProductoMO() {
    }

    public ProductoMO(String nombre, String color, int stock, double precio_compra, double precio_venta, int idCategoria, int SubCategoria, int IdMarca, int IdProveedor, byte[] foto, File ruta) {
        this.nombre = nombre;
        this.color = color;
        this.stock = stock;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.idCategoria = idCategoria;
        this.SubCategoria = SubCategoria;
        this.IdMarca = IdMarca;
        this.IdProveedor = IdProveedor;
        this.foto = foto;
        this.ruta = ruta;
    }

    
    
    
    public ProductoMO(String nombre, String color, int stock, double precio_compra, double precio_venta, int idCategoria, int SubCategoria, int IdMarca, int IdProveedor, byte[] foto) {
        this.nombre = nombre;
        this.color = color;
        this.stock = stock;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.idCategoria = idCategoria;
        this.SubCategoria = SubCategoria;
        this.IdMarca = IdMarca;
        this.IdProveedor = IdProveedor;
        this.foto = foto;
    }

    public ProductoMO(String idproducto, String nombre, String color, int stock, double precio_compra, double precio_venta, int idCategoria, String NombreCategoria, int SubCategoria, String NombreSubcategoria, int IdMarca, String NombreMarca, int IdProveedor, String RazonSocial, String Direccion, String SitioWeb, String correo, String telefono, String Observaciones, Date FechaReg, String Contacto, String RUC, byte[] foto, File ruta) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.color = color;
        this.stock = stock;
        this.precio_compra = precio_compra;
        this.precio_venta= precio_venta;
        this.idCategoria = idCategoria;
        this.NombreCategoria = NombreCategoria;
        this.SubCategoria = SubCategoria;
        this.NombreSubcategoria = NombreSubcategoria;
        this.IdMarca = IdMarca;
        this.NombreMarca = NombreMarca;
        this.IdProveedor = IdProveedor;
        this.RazonSocial = RazonSocial;
        this.Direccion = Direccion;
        this.SitioWeb = SitioWeb;
        this.correo = correo;
        this.telefono = telefono;
        this.Observaciones = Observaciones;
        this.FechaReg = FechaReg;
        this.Contacto = Contacto;
        this.RUC = RUC;
        this.foto = foto;
        this.ruta = ruta;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    
    


    public File getRuta() {
        return ruta;
    }

    public void setRuta(File ruta) {
        this.ruta = ruta;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getSitioWeb() {
        return SitioWeb;
    }

    public void setSitioWeb(String SitioWeb) {
        this.SitioWeb = SitioWeb;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Date getFechaReg() {
        return FechaReg;
    }

    public void setFechaReg(Date FechaReg) {
        this.FechaReg = FechaReg;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    
    
    
}
