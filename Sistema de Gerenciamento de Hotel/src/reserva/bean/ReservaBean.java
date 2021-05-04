/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.bean;

import cliente.bean.ClienteBean;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import quarto.bean.QuartoBean;

/**
 *
 * @author carlos
 */
@Entity
@Table(name = "reserva")
public class ReservaBean implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    private Integer codigo;
    @Temporal(TemporalType.DATE)
    private Calendar dataDeInicio;
    @Temporal(TemporalType.DATE)
    private Calendar dataDeFim;
    @ManyToOne
    private QuartoBean quarto;
    @ManyToOne
    private ClienteBean cliente;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Calendar getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Calendar dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Calendar getDataDeFim() {
        return dataDeFim;
    }

    public void setDataDeFim(Calendar dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    public QuartoBean getQuarto() {
        return quarto;
    }

    public void setQuarto(QuartoBean quarto) {
        this.quarto = quarto;
    }

    public ClienteBean getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBean cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.codigo);
        hash = 97 * hash + Objects.hashCode(this.dataDeInicio);
        hash = 97 * hash + Objects.hashCode(this.dataDeFim);
        hash = 97 * hash + Objects.hashCode(this.quarto);
        hash = 97 * hash + Objects.hashCode(this.cliente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ReservaBean other = (ReservaBean) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.dataDeInicio, other.dataDeInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataDeFim, other.dataDeFim)) {
            return false;
        }
        if (!Objects.equals(this.quarto, other.quarto)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }
    
    
}
