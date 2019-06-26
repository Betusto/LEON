/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

import complementos.CalculaCalificacion;
import interfaces.MainMenu;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * ************************
 * /**
 *
 * @author Alberto Villarreal
 */
public class LetraD extends javax.swing.JFrame {
    //Recalcar el tamaño de la interfaz

    private final int WINDOW_WIDTH = 909;
    private final int WINDOW_HEIGHT = 655;
    private JPanel panel;
    private int valor;
    private int restadas = 0;

    /**
     * Creates new form Letras
     */
    public LetraD() {
        initComponents();
        botonesTransparentes(); //manda a llamar al metodo botonesTransparentes
        // this.setLocationRelativeTo(null); //Para que apareza la interfaz en el centro
        // Set window size.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("LEON");
        setResizable(false); //Remueve el boton de maximizar pantalla

        // Specify what happens when close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String abc = "a b c ch d e f g h i j k l ll m n ñ o p q r rr s t u v w x y z";
        String[] letters = abc.split("\\s+");
        String letra = "";
        int n = 1;
        int randomcheck = 1;
        Random rand1 = new Random();
        valor = rand1.nextInt(3);
        //System.out.println("Esa fue la letra "+letters[i]);
        String letrarandom1 = letters[new Random().nextInt(letters.length)];
        String letrarandom2 = letters[new Random().nextInt(letters.length)];
        if (valor == 0) {
            //for (int i = 0; i < randomcheck; i++){
            //Boton 1, contiene la letra a
            Opcion1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d.png")));
            Opcion1Button.setSize(180, 180);
            //jButton1.setLocation(350, 200); //para el segundo boton
            Opcion1Button.setLocation(100, 180);
            //}
            //Boton 2, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"d".equals(letrarandom1) && !letrarandom1.equals(letrarandom2)) {
                    Opcion2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + letrarandom1 + ".png")));
                    Opcion2Button.setSize(180, 180);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion2Button.setLocation(370, 390);
                    randomcheck = 1;
                } else {
                    letrarandom1 = letters[new Random().nextInt(letters.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }
            //} 

            //Boton 3, letra random
            //do{
            for (int i = 0; i < randomcheck; i++) {
                if (!"d".equals(letrarandom2) && !letrarandom2.equals(letrarandom1)) {
                    Opcion3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + letrarandom2 + ".png")));
                    Opcion3Button.setSize(180, 180);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion3Button.setLocation(630, 180);
                    randomcheck = 1;
                } else {
                    letrarandom2 = letters[new Random().nextInt(letters.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }
        } else if (valor == 1) {
            //Boton 1, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"d".equals(letrarandom1) && !letrarandom1.equals(letrarandom2)) {
                    Opcion1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + letrarandom1 + ".png")));
                    Opcion1Button.setSize(180, 180);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion1Button.setLocation(100, 180);
                    randomcheck = 1;
                } else {
                    letrarandom1 = letters[new Random().nextInt(letters.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }

            //Boton 2, contiene la letra a
            Opcion2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d.png")));
            Opcion2Button.setSize(180, 180);
            //jButton1.setLocation(350, 200); //para el segundo boton
            Opcion2Button.setLocation(370, 390);

            //Boton 3, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"d".equals(letrarandom2) && !letrarandom2.equals(letrarandom1)) {
                    Opcion3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + letrarandom2 + ".png")));
                    Opcion3Button.setSize(180, 180);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion3Button.setLocation(630, 180);
                    randomcheck = 1;
                } else {
                    letrarandom2 = letters[new Random().nextInt(letters.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }

        } else if (valor == 2) {
            //Boton 1, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"d".equals(letrarandom1) && !letrarandom1.equals(letrarandom2)) {
                    Opcion1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + letrarandom1 + ".png")));
                    Opcion1Button.setSize(180, 180);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion1Button.setLocation(100, 180);
                    randomcheck = 1;
                } else {
                    letrarandom1 = letters[new Random().nextInt(letters.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }

            //Boton 2, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"d".equals(letrarandom2) && !letrarandom2.equals(letrarandom1)) {
                    Opcion2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + letrarandom2 + ".png")));
                    Opcion2Button.setSize(180, 180);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion2Button.setLocation(370, 390);
                    randomcheck = 1;
                } else {
                    letrarandom2 = letters[new Random().nextInt(letters.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }

            //Boton 3, contiene la letra a
            Opcion3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/d.png")));
            Opcion3Button.setSize(180, 180);
            //jButton1.setLocation(350, 200); //para el segundo boton
            Opcion3Button.setLocation(630, 180);

        }
        playSound("d"); //1=letra a
//}
//}
//
//for (int i = 0; i < letters.length; i++){
//        
//    }
//if(letters[i]) = ""){
//}
//for (String s : new ArrayList<String>(list))     
//{
        //  list.add("u");
//}

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ConfiguracionButton = new javax.swing.JButton();
        SalirButton = new javax.swing.JButton();
        PlayButton = new javax.swing.JButton();
        Opcion1Button = new javax.swing.JButton();
        Opcion2Button = new javax.swing.JButton();
        Opcion3Button = new javax.swing.JButton();
        InstruccionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        ConfiguracionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion_6.png"))); // NOI18N
        ConfiguracionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConfiguracionButton);
        ConfiguracionButton.setBounds(0, 560, 60, 70);

        SalirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SalirButton);
        SalirButton.setBounds(830, 560, 80, 70);

        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play-bdutton2.png"))); // NOI18N
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PlayButton);
        PlayButton.setBounds(420, 90, 70, 70);

        Opcion1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion1ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Opcion1Button);
        Opcion1Button.setBounds(100, 180, 180, 180);

        Opcion2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion2ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Opcion2Button);
        Opcion2Button.setBounds(370, 390, 180, 180);

        Opcion3Button.setToolTipText("");
        Opcion3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion3ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Opcion3Button);
        Opcion3Button.setBounds(630, 180, 180, 180);

        InstruccionLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        InstruccionLabel.setText("Elige la letra");
        jPanel1.add(InstruccionLabel);
        InstruccionLabel.setBounds(360, 40, 230, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfiguracionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfiguracionButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed

//Atributos de los botones del JOptionPane        
        JButton button = new JButton();
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobado.png")));
//button.setBackground(Color.BLACK);
//button.setForeground(Color.WHITE);

        JButton button2 = new JButton();
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setFocusPainted(false);
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png")));
//button2.setBackground(Color.BLACK);
//button2.setForeground(Color.WHITE);

//Metodo para cuando se oprima el boton de confirmacion de salir
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CalculaCalificacion Aciertos = new CalculaCalificacion(); //Objeto para regresar el valor de aciertos a 0
                Aciertos.Reset();
                CalculaCalificacion Letras = new CalculaCalificacion(); //Objeto para regresar el valor de letras a ninguno
                Letras.ResetLetras();
                MainMenu Menu = new MainMenu();
                Menu.setSize(909, 655);
                Menu.setLocationRelativeTo(null);
                Menu.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
            }
        });

//Metodo para cancelar el boton de querer salir
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.getRootFrame().dispose();
            }
        });
//Declaramos los botones que se van a usar en el cuadro de dialogo
        JButton[] buttons = {button, button2};
        JOptionPane.showOptionDialog(null, "    ¿Quieres regresar al menú principal?", "Volver", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, null, buttons, buttons[0]);
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void Opcion2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion2ButtonActionPerformed
        if (valor == 1) {
            System.out.println("correcto");
            playSound("correct");
            //Objeto para incrementar el numero de aciertos
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Calcular();
            //Atributos de los botones del JOptionPane        
        JButton button = new JButton();
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobado.png")));
//button.setBackground(Color.BLACK);
//button.setForeground(Color.WHITE);


//Metodo para cuando se oprima el boton de confirmacion de salir
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                LetraE E = new LetraE();
                E.setSize(909, 655);
                E.setLocationRelativeTo(null);
                E.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
            }
        });

//Declaramos los botones que se van a usar en el cuadro de dialogo
        ImageIcon happyface = new ImageIcon("src/imagenes/happiness.png");
        JButton[] buttons = {button};
        JOptionPane.showOptionDialog(null, "     Respuesta correcta.", "¡Bien Hecho!", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, happyface, buttons, buttons[0]);
        } else {
            System.out.println("prueba de nuevo");
            playSound("TryAgain");
            //Opcion2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png")));
            Opcion2Button.setEnabled(false);
            //Objeto para decrecer el numero de aciertos
            if(restadas < 1 && restadas != 2){
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Restar();
            restadas++;
            //Objeto para añadir la letra equivocada al arreglo
            CalculaCalificacion Letras = new CalculaCalificacion();
            Letras.LetrasEquivocadas("D "); 
            System.out.println(Letras.getAr());
            }
        }
    }//GEN-LAST:event_Opcion2ButtonActionPerformed

    private void Opcion1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion1ButtonActionPerformed
        if (valor == 0) {
            System.out.println("correcto");
            playSound("correct");
            //Objeto para incrementar el numero de aciertos
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Calcular();
            //Atributos de los botones del JOptionPane        
        JButton button = new JButton();
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobado.png")));
//button.setBackground(Color.BLACK);
//button.setForeground(Color.WHITE);


//Metodo para cuando se oprima el boton de confirmacion de salir
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                LetraE E = new LetraE();
                E.setSize(909, 655);
                E.setLocationRelativeTo(null);
                E.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
            }
        });

//Declaramos los botones que se van a usar en el cuadro de dialogo
        ImageIcon happyface = new ImageIcon("src/imagenes/happiness.png");
        JButton[] buttons = {button};
        JOptionPane.showOptionDialog(null, "     Respuesta correcta.", "¡Bien Hecho!", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, happyface, buttons, buttons[0]);
        } else {
            System.out.println("prueba de nuevo");
            playSound("TryAgain");
            //Opcion2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png")));
            Opcion1Button.setEnabled(false);
            //Objeto para decrecer el numero de aciertos
            if(restadas < 1 && restadas != 2){
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Restar();
            restadas++;
            //Objeto para añadir la letra equivocada al arreglo
            CalculaCalificacion Letras = new CalculaCalificacion();
            Letras.LetrasEquivocadas("D "); 
            System.out.println(Letras.getAr());
            }
        }
    }//GEN-LAST:event_Opcion1ButtonActionPerformed

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        playSound("d");
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void Opcion3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion3ButtonActionPerformed
        if (valor == 2) {
         System.out.println("correcto");
            playSound("correct");
            //Objeto para incrementar el numero de aciertos
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Calcular();
            //Atributos de los botones del JOptionPane        
        JButton button = new JButton();
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aprobado.png")));
//button.setBackground(Color.BLACK);
//button.setForeground(Color.WHITE);


//Metodo para cuando se oprima el boton de confirmacion de salir
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                LetraE E = new LetraE();
                E.setSize(909, 655);
                E.setLocationRelativeTo(null);
                E.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
            }
        });

//Declaramos los botones que se van a usar en el cuadro de dialogo
        ImageIcon happyface = new ImageIcon("src/imagenes/happiness.png");
        JButton[] buttons = {button};
        JOptionPane.showOptionDialog(null, "     Respuesta correcta.", "¡Bien Hecho!", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, happyface, buttons, buttons[0]);
        } else {
            System.out.println("prueba de nuevo");
            playSound("TryAgain");
            //Opcion2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png")));
            Opcion3Button.setEnabled(false);
            //Objeto para decrecer el numero de aciertos
            if(restadas < 1 && restadas != 2){
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Restar();
            restadas++;
            //Objeto para añadir la letra equivocada al arreglo
            CalculaCalificacion Letras = new CalculaCalificacion();
            Letras.LetrasEquivocadas("D "); 
            System.out.println(Letras.getAr());
            }
        }
    }//GEN-LAST:event_Opcion3ButtonActionPerformed

    public void botonesTransparentes() {
        Opcion1Button.setOpaque(false);
        Opcion1Button.setContentAreaFilled(false);
        Opcion1Button.setBorderPainted(false);
        Opcion1Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Opcion1Button.setFocusPainted(false);
        Opcion2Button.setOpaque(false);
        Opcion2Button.setContentAreaFilled(false);
        Opcion2Button.setBorderPainted(false);
        Opcion2Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Opcion2Button.setFocusPainted(false);
        Opcion3Button.setOpaque(false);
        Opcion3Button.setContentAreaFilled(false);
        Opcion3Button.setBorderPainted(false);
        Opcion3Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Opcion3Button.setFocusPainted(false);
        ConfiguracionButton.setOpaque(false);
        ConfiguracionButton.setContentAreaFilled(false);
        ConfiguracionButton.setBorderPainted(false);
        ConfiguracionButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ConfiguracionButton.setFocusPainted(false);
        SalirButton.setOpaque(false);
        SalirButton.setContentAreaFilled(false);
        SalirButton.setBorderPainted(false);
        SalirButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SalirButton.setFocusPainted(false);
        PlayButton.setOpaque(false);
        PlayButton.setContentAreaFilled(false);
        PlayButton.setBorderPainted(false);
        PlayButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        PlayButton.setFocusPainted(false);
    }

    private void playSound(String File) { // Play a wav file specified by fileName
        try {
            String path = "src/sonidos/" + File + ".wav";
            File file = new File(path);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LetraD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LetraD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LetraD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LetraD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetraD().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfiguracionButton;
    private javax.swing.JLabel InstruccionLabel;
    private javax.swing.JButton Opcion1Button;
    private javax.swing.JButton Opcion2Button;
    private javax.swing.JButton Opcion3Button;
    private javax.swing.JButton PlayButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
