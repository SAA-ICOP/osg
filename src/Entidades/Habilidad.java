/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ema_s
 */
@Entity
@Table(name = "habilidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habilidad.findAll", query = "SELECT h FROM Habilidad h WHERE h.fechabaja IS NULL"),
    @NamedQuery(name = "Habilidad.findByIdhabilidad", query = "SELECT h FROM Habilidad h WHERE h.idhabilidad = :idhabilidad"),
    @NamedQuery(name = "Habilidad.findByHabilidad", query = "SELECT h FROM Habilidad h WHERE h.habilidad = :habilidad"),
    @NamedQuery(name = "Habilidad.findByFechaalta", query = "SELECT h FROM Habilidad h WHERE h.fechaalta = :fechaalta"),
    @NamedQuery(name = "Habilidad.findByFechabaja", query = "SELECT h FROM Habilidad h WHERE h.fechabaja = :fechabaja")})
public class Habilidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDHABILIDAD")
    private Integer idhabilidad;
    @Column(name = "HABILIDAD")
    private String habilidad;
    @Column(name = "FECHAALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaalta;
    @Column(name = "FECHABAJA")
    @Temporal(TemporalType.DATE)
    private Date fechabaja;
    @JoinTable(name = "rol_habilidad", joinColumns = {
        @JoinColumn(name = "habilidad_IDHABILIDAD", referencedColumnName = "IDHABILIDAD")}, inverseJoinColumns = {
        @JoinColumn(name = "rol_IDROL", referencedColumnName = "IDROL")})
    @ManyToMany
    private Collection<Rol> rolCollection;

    public Habilidad() {
    }

    public Habilidad(Integer idhabilidad) {
        this.idhabilidad = idhabilidad;
    }

    public Integer getIdhabilidad() {
        return idhabilidad;
    }

    public void setIdhabilidad(Integer idhabilidad) {
        this.idhabilidad = idhabilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    @XmlTransient
    public Collection<Rol> getRolCollection() {
        return rolCollection;
    }

    public void setRolCollection(Collection<Rol> rolCollection) {
        this.rolCollection = rolCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhabilidad != null ? idhabilidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habilidad)) {
            return false;
        }
        Habilidad other = (Habilidad) object;
        if ((this.idhabilidad == null && other.idhabilidad != null) || (this.idhabilidad != null && !this.idhabilidad.equals(other.idhabilidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Habilidad[ idhabilidad=" + idhabilidad + " ]";
    }
    
}
