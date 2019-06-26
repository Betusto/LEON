/******************************************
 *      FIME UANL SEMESTRE AGOSTO-DICIEMBRE 2018
 *      MATERIA: INTERACCIÓN HUMANO COMPUTADORA Y LAB.
 *      Docente: Dra. Aida Lucina González Lara, Grupo: 204
 *                  Proyecto Final
 *                      LEON
 *      Lectura Enfocada y Orientada a Niños
 *      Equipo 5
 *      Integrantes:	
 *      1.- Verónica Cruz Hernández             1547458
 *	2.- Josué Roberto Ramos Miranda         1624230
 *      3.- Roberto Antonio Rodríguez Zavala    1670235
 *      4.- Alberto Villarreal Canales          1746057
******************************************/
package leon;

import interfaces.MainMenu;
import interfaces.FabricaDePalabras;
import interfaces.JuegoDelMemorama;
import interfaces.ZonaAuditiva;
import javax.swing.JFrame;
//import javax.swing.UIManager;

/**
 *
 * @author Alberto Villarreal
 */
public class LEON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //try{
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        //}catch(Exception ee){
        //    System.out.println(ee);
        //}
        //JFrame f4 = new ZonaAuditiva();
        //f4.setSize(909, 655);
        //f4.setLocationRelativeTo(null);	
        
        JFrame f1 = new MainMenu();
        f1. setSize(909, 655);
        f1.setLocationRelativeTo(null);	

        //JFrame f2 = new FabricaDePalabras();
        //f2.setSize(909, 655);
        //f2.setLocationRelativeTo(null);	
        
        //JFrame f3 = new JuegoDelMemorama();
        //f3.setSize(909, 655);
        //f3.setLocationRelativeTo(null);	
        
       // JFrame f5 = new PracticaConElTeclado();
        //f5.setSize(909, 655);
        //f5.setLocationRelativeTo(null);
        
        
        f1.setVisible(true);
    }
    
}
