/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alberto Villarreal
 */
public class Carta {
    int posicion = 0;
    int valor = 0;
    boolean revelado = false;
    ImageIcon img;
    JButton btn;
    
    public Carta(int valor, String nombre, int posicion){
        this.valor = valor;
        this.posicion = posicion;
        try{
        img = new ImageIcon(this.getClass().getResource(nombre));
        }catch(Exception e){
        System.out.println(e);
        }
    }
}
