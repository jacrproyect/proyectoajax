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
public class ProveedorMO {
    
    private String idproveedor;
    private String razonsocial;
    private String direccion;
    private String sitioweb;
    private String telefono;
    private String Observaciones;
    private Date Fechareg;
    private String correo;
    private String contacto;

    public ProveedorMO() {
    }

    public ProveedorMO(String idproveedor, String razonsocial, String direccion, String sitioweb, String telefono, String Observaciones, Date Fechareg, String correo, String contacto) {
        this.idproveedor = idproveedor;
        this.razonsocial = razonsocial;
        this.direccion = direccion;
        this.sitioweb = sitioweb;
        this.telefono = telefono;
        this.Observaciones = Observaciones;
        this.Fechareg = Fechareg;
        this.correo = correo;
        this.contacto = contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

    public String getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(String idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSitioweb() {
        return sitioweb;
    }

    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
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

    public Date getFechareg() {
        return Fechareg;
    }

    public void setFechareg(Date Fechareg) {
        this.Fechareg = Fechareg;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    
}
