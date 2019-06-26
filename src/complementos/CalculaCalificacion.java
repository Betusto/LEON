/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import java.util.ArrayList;

/**
 *
 * @author Alberto Villarreal
 */

public class CalculaCalificacion {
    static int aciertos;
    public int calificacion;
    static int preguntas;
    public static ArrayList<String> ar = new ArrayList<String>();
    public static String LetrasSinCorch;
    
    public void Calcular(){
        aciertos++;
    }
    
    public void Restar(){
        aciertos--;
    }
    
    public void Reset(){
        aciertos = 0;
    }
    
    public void Formula(){
        calificacion = (aciertos * 100)/30;
    }
    
    public void LetrasEquivocadas(String Letter){
        ar.add(Letter);
    }
    
    public int getCalificacion(){
        return calificacion;
    }
    
    public int getValue(){
        return aciertos;
    }
    
    public String getAr(){
     LetrasSinCorch = ar.toString()
    .replace(",", "")
    .replace("[", "")  //remove the right bracket
    .replace("]", "")  //remove the left bracket
    .trim();           //remove trailing spaces from partially initialized arrays
     return LetrasSinCorch;
    }
    
    public ArrayList<String> getArCompleto(){
     return ar;
    }
    
    public void CalcularPreguntas(){
        preguntas++;
    }
    
    public int getPreguntas(){
        return preguntas;
    }
    
    public void ResetPreguntas(){
        preguntas = 0;
    }
    
   // public void PuntoFinal(){
   //     ar.add(".");
   // }
    
    //public String getArFinal(){
    //         LetrasSinCorch = ar.toString()
    //        .replace(",", "")
    //        .replace("[", "")  //remove the right bracket
    //        .replace("]", "")  //remove the left bracket
    //        .trim();           //remove trailing spaces from partially initialized arrays
    //        return LetrasSinCorch;
    //}

    
    public void ResetLetras(){
        ar = new ArrayList<String>();
    }
}
