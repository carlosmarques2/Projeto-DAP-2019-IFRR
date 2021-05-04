/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Calendar;

/**
 *
 * @author carlos
 */
public abstract class FormatUtil {
            
    public static String formataDataDeNascimento(Calendar data){
        String dataFormatada = "";
        dataFormatada += data.get(Calendar.DAY_OF_MONTH);
        dataFormatada += "/" + (data.get(Calendar.MONTH)+1);
        dataFormatada += "/" + data.get(Calendar.YEAR);
        return dataFormatada;
    }
    
    public static String formataDataDeCadastro(Calendar data){
        String dataFormatada = "";
        dataFormatada += data.get(Calendar.DAY_OF_MONTH);
        dataFormatada += "/" + (data.get(Calendar.MONTH)+1);
        dataFormatada += "/" + data.get(Calendar.YEAR);
        dataFormatada += " - " + data.get(Calendar.HOUR_OF_DAY);
        dataFormatada += ":" + data.get(Calendar.MINUTE);
        return dataFormatada;
    }
    
    public static String formataCpf(String cpf){
        String cpfFormatado = "";

        cpfFormatado = cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11);
        
        return cpfFormatado;
    }
    
    public static String formataTelefone(String telefone){
        return ("(" + telefone.substring(0,2) + ")" + telefone.substring(2,7) + "-" + telefone.substring(7,11));
    }
    
    public static String caixaAlta(String letra){
        return letra.toUpperCase();
    }
}
