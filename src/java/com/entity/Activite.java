/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author omar
 */
@Entity
@Table(name = "activite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activite.findAll", query = "SELECT a FROM Activite a"),
    @NamedQuery(name = "Activite.findByCode", query = "SELECT a FROM Activite a WHERE a.code = :code"),
    @NamedQuery(name = "Activite.findByIntitule", query = "SELECT a FROM Activite a WHERE a.intitule = :intitule"),
    @NamedQuery(name = "Activite.findByDc", query = "SELECT a FROM Activite a WHERE a.dc = :dc"),
    @NamedQuery(name = "Activite.findByDu", query = "SELECT a FROM Activite a WHERE a.du = :du"),
    @NamedQuery(name = "Activite.findByDd", query = "SELECT a FROM Activite a WHERE a.dd = :dd")})
public class Activite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "code")
    private String code;
    @Size(max = 50)
    @Column(name = "intitule")
    private String intitule;
    @Column(name = "dc")
    @Temporal(TemporalType.DATE)
    private Date dc;
    @Column(name = "du")
    @Temporal(TemporalType.DATE)
    private Date du;
    @Column(name = "dd")
    @Temporal(TemporalType.DATE)
    private Date dd;

    public Activite() {
    }

    public Activite(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Date getDc() {
        return dc;
    }

    public void setDc(Date dc) {
        this.dc = dc;
    }

    public Date getDu() {
        return du;
    }

    public void setDu(Date du) {
        this.du = du;
    }

    public Date getDd() {
        return dd;
    }

    public void setDd(Date dd) {
        this.dd = dd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activite)) {
            return false;
        }
        Activite other = (Activite) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return intitule;
    }
    
}
