/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;






/**
 *
 * @author VAIO
 */
public class EmpleadoMO{



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
    private double sueldo;
    private int idrol;
    private String nombre_rol;
    private String acceso;
    private int idusuario;
    private String usuario;
    private String password;
    private Date fechreg ;
    private String estado;
    private int id_empleado;

    
    

    public EmpleadoMO() {
    }

    public EmpleadoMO(String nombre_persona, String apellido_persona, String dni, int telefono, String departamento, String provincia, String distrito, String direccion, String correo, double sueldo, int idrol, String usuario, String password, Date fechreg, String estado) {
        this.nombre_persona = nombre_persona;
        this.apellido_persona = apellido_persona;
        this.dni = dni;
        this.telefono = telefono;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.direccion = direccion;
        this.correo = correo;
        this.sueldo = sueldo;
        this.idrol = idrol;
        this.usuario = usuario;
        this.password = password;
        this.fechreg = fechreg;
        this.estado = estado;
    }
    
    public EmpleadoMO(int idpersona, String nombre_persona, String apellido_persona, String dni, int telefono, String departamento, String provincia, String distrito, String direccion, String correo, double sueldo, int idrol, String usuario, String password, String estado) {
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
        this.sueldo = sueldo;
        this.idrol = idrol;
        this.usuario = usuario;
        this.password = password;
        this.estado = estado;
    }

    public EmpleadoMO(int idpersona, String nombre_persona, String apellido_persona, String dni, int telefono, String departamento, String provincia, String distrito, String direccion, String correo, double sueldo, int idrol, String nombre_rol, String usuario, String password, String estado) {
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
        this.sueldo = sueldo;
        this.idrol = idrol;
        this.nombre_rol = nombre_rol;
        this.usuario = usuario;
        this.password = password;
        this.estado = estado;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechreg() {
        return fechreg;
    }

    public void setFechreg(Date fechreg) {
        this.fechreg = fechreg;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    

    
    
   
}
