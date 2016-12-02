/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostatic;

/**
 *
 * @author otorradomiguez
 */
public class EjemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persoa per1=new Persoa("aa",23);
        //per1.incrementarPersoas(); OBSOLETO, aunque funciona
        per1.visualizar();
        Persoa per2=new Persoa("bb",30);
        per2.visualizar();
        System.out.println("Hay un total de "+Persoa.getNumPersoas()+" persoas");
    }
    
}
