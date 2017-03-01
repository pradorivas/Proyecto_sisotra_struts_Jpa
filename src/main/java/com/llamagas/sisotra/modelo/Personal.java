/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "empleado")
@NamedQueries({
    @NamedQuery(name = "Empleado.getTodos",
            query = "SELECT new com.llamagas.sisotra.modelo.Personal"
                    + "(p.idnomina, p.nombre)"
                    + " FROM Personal p")
})
public class Personal implements Serializable{
    
    @Id
    @Column(name="idNOMINA", length = 5)
    private String idnomina;
    
    private String idcargo;
    private String idarea;
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_naco", updatable = false)
    private Date fecha_nac;
    private String direccion;
    private String dni;
    private String supervisor;
    
    @OneToMany(mappedBy = "personal")
        private List<OrdenTrabajo> ordenesTrabajo;
    
    public List<OrdenTrabajo> getOrdenesTrabajo() {
        return ordenesTrabajo;
    }

    public void setOrdenesTrabajo(List<OrdenTrabajo> ordenesTrabajo) {
        this.ordenesTrabajo = ordenesTrabajo;
    }

    public Personal() {
    }

    public Personal(String idnomina, String nombre) {
        this.idnomina = idnomina;
        this.nombre = nombre;
    }

    public Personal(String idnomina, String idcargo, String idarea, String nombre, String apellido, Date fecha_nac, String direccion, String dni, String supervisor) {
        this.idnomina = idnomina;
        this.idcargo = idcargo;
        this.idarea = idarea;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.dni = dni;
        this.supervisor = supervisor;
    }

    public String getIdnomina() {
        return idnomina;
    }

    public void setIdnomina(String idnomina) {
        this.idnomina = idnomina;
    }

    public String getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(String idcargo) {
        this.idcargo = idcargo;
    }

    public String getIdarea() {
        return idarea;
    }

    public void setIdarea(String idarea) {
        this.idarea = idarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    
    
    
}
