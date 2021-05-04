/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario.bean;

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
@DiscriminatorValue(value = "Funcionario")
public class FuncionarioBean extends PessoaBean {
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataDeCadastro;
    private Float salario;
    
    public Calendar getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Calendar dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.dataDeCadastro);
        hash = 79 * hash + Objects.hashCode(this.salario);
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
        final FuncionarioBean other = (FuncionarioBean) obj;
        if (!Objects.equals(this.dataDeCadastro, other.dataDeCadastro)) {
            return false;
        }
        if (!Objects.equals(this.salario, other.salario)) {
            return false;
        }
        return true;
    }
    
    
}
