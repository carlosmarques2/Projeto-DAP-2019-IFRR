/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.bean;

import java.util.Calendar;
import java.util.Objects;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import pessoa.bean.PessoaBean;

/**
 *
 * @author carlos
 */
@Entity
@DiscriminatorValue(value = "Cliente")
public class ClienteBean extends PessoaBean {
    private Float gasto;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataDeCadastro;

    public Float getGasto() {
        return gasto;
    }

    public void setGasto(Float gasto) {
        this.gasto = gasto;
    }

    public Calendar getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Calendar dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.gasto);
        hash = 89 * hash + Objects.hashCode(this.dataDeCadastro);
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
        final ClienteBean other = (ClienteBean) obj;
        if (!Objects.equals(this.gasto, other.gasto)) {
            return false;
        }
        if (!Objects.equals(this.dataDeCadastro, other.dataDeCadastro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClienteBean{"+"nome="+super.getNome()+", email="+super.getEmail()+ ", gasto=" + gasto + ", dataDeCadastro=" + dataDeCadastro + '}';
    }
    
}
