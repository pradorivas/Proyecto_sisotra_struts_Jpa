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
@Table(name = "unidades")
@NamedQueries({
    @NamedQuery(name = "Unidades.getTodos",
            query = "SELECT new com.llamagas.sisotra.modelo.Unidad"
                    + "(u.idplaca, u.marca)"
                    + " FROM Unidad u")
})
public class Unidad implements Serializable{
    
    //@GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    @Column(name="idPLACA", length = 5)
    private String idplaca;
    
    private String marca;
    private String modelo;
    @Temporal(TemporalType.DATE)
    @Column(name = "año", updatable = false)
    private Date fec;
    private String color;
    private String encargado;
    
    @OneToMany(mappedBy = "unidad")
    private List<OrdenTrabajo> ordenesTrabajo;

    public List<OrdenTrabajo> getOrdenesTrabajo() {
        return ordenesTrabajo;
    }

    public void setOrdenesTrabajo(List<OrdenTrabajo> ordenesTrabajo) {
        this.ordenesTrabajo = ordenesTrabajo;
    }

    public Unidad() {
    }

    public Unidad(String idplaca, String marca) {
        this.idplaca = idplaca;
        this.marca = marca;
    }
    

    public Unidad(String idplaca, String marca, String modelo, Date fec, String color, String encargado) {
        this.idplaca = idplaca;
        this.marca = marca;
        this.modelo = modelo;
        this.fec = fec;
        this.color = color;
        this.encargado = encargado;
    }

    public String getIdplaca() {
        return idplaca;
    }

    public void setIdplaca(String idplaca) {
        this.idplaca = idplaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    
}
