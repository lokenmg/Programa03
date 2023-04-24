/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa03;

/**
 *
 * @author Rodrigo Mencías
 */
public class Programa03 {

    public static void main(String[] args) {
        ClaseConcreta cc=new ClaseConcreta();
        cc.imprimir();
        
        IClaseInterface eje=null;
        eje=new IClaseConcretaUno();
        eje.imprimir();
        
        eje=new IClaseConcretaDos();
        eje.imprimir();
        
        //Clase anonima
        eje= new IClaseInterface() {
            @Override
            public void imprimir() {
                System.out.println("Otro ...");
            }
        };
        eje.imprimir();
    }
}
