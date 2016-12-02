/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostatic;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Persoa {
    private static int numPersoas;
    private String nome;
    private int edad;

    public Persoa() {
    }

    public Persoa(String nome, int edad) {
        this.nome = nome;
        this.edad = edad;
    }

    public static int getNumPersoas() {
        return numPersoas;
    }
    
    public static void incrementarPersoas(){
        numPersoas++;
    }

    public String getNome() {
        return nome;
    }

    public int getEdad() {
        return edad;
    }
    
    public void visualizar(){
        JOptionPane.showMessageDialog(null,"edad:"+edad+" nome:"+nome+" numero de Persoas:"+numPersoas);
    }
    
}
