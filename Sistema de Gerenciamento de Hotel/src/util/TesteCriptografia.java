package util;


import javax.swing.JOptionPane;
import util.Criptografia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TADS
 */
public class TesteCriptografia {
    public static void main(String[] args) {
        System.out.println(Criptografia.md5("senha123"));
    }
}
