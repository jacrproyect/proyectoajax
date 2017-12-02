/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author VAIO
 */
public class UsuarioMO {
    
    private int idusuario;
    private String usuario;
    private String password;
    private Date fechreg;
    private String estado;
    private int id_empleado;

    public UsuarioMO() {
    }

    public UsuarioMO(int idusuario, String usuario, String password, Date fechreg, String estado, int id_empleado) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;
        this.fechreg = fechreg;
        this.estado = estado;
        this.id_empleado = id_empleado;
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

    
    
    
    
    
}
