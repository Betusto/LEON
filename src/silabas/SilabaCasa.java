/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silabas;

import letras.*;
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
public class SilabaCasa extends javax.swing.JFrame {
    //Recalcar el tamaño de la interfaz

    private final int WINDOW_WIDTH = 909;
    private final int WINDOW_HEIGHT = 655;
    private JPanel panel;
    private int valor;
    private int restadas = 0;
    private int a = 0;
    /**
     * Creates new form Letras
     */
    public SilabaCasa() {
        initComponents();
        botonesTransparentes(); //manda a llamar al metodo botonesTransparentes
        // this.setLocationRelativeTo(null); //Para que apareza la interfaz en el centro
        // Set window size.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("LEON");
        setResizable(false); //Remueve el boton de maximizar pantalla

        // Specify what happens when close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String silabas = "ta za ti gre te le fo no pa to pe lo ga sa po au fla min go o so e di fi cio mo si lla mu ñe ca sol ji ra fa gri llo ne ro ma ri sa que es tre bi ci cle ta le ón lá piz ba li bro ni ño man za na pi ña mon yo va ran ja gui rra ce bar co jau la pia lu lar bo te chi ven che mi pan lon je ras rro tú can mar cia du raz má a gua";
        String[] silabasep = silabas.split("\\s+");
        int randomcheck = 1;
        Random rand1 = new Random();
        valor = rand1.nextInt(3);
        String silabarandom1 = silabasep[new Random().nextInt(silabasep.length)];
        String silabarandom2 = silabasep[new Random().nextInt(silabasep.length)];
        //Elementos visibles e invisibles de la palabra
        ImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa_silabas.png")));
        Silaba1Panel.setVisible(false);
        Silaba4Panel.setVisible(false);
        Guion1Label.setVisible(false);
        Guion3Label.setVisible(false);
        if (valor == 0) {
            //for (int i = 0; i < randomcheck; i++){
            //Boton 1, contiene la letra a
            Opcion1Button.setText("sa");
            Opcion1Button.setSize(180, 80);
            //jButton1.setLocation(350, 200); //para el segundo boton
            Opcion1Button.setLocation(140, 470);
            //}
            //Boton 2, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"sa".equals(silabarandom1) && !silabarandom1.equals(silabarandom2)) {
                    Opcion2Button.setText(silabarandom1);
                    Opcion2Button.setSize(180, 80);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion2Button.setLocation(370, 470);
                    randomcheck = 1;
                } else {
                    silabarandom1 = silabasep[new Random().nextInt(silabasep.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }
            //} 

            //Boton 3, letra random
            //do{
            for (int i = 0; i < randomcheck; i++) {
                if (!"sa".equals(silabarandom2) && !silabarandom2.equals(silabarandom1)) {
                    Opcion3Button.setText(silabarandom2);
                    Opcion3Button.setSize(180, 80);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion3Button.setLocation(590, 470);
                    randomcheck = 1;
                } else {
                    silabarandom2 = silabasep[new Random().nextInt(silabasep.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }
        } else if (valor == 1) {
            //Boton 1, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"sa".equals(silabarandom1) && !silabarandom1.equals(silabarandom2)) {
                    Opcion1Button.setText(silabarandom1);
                    Opcion1Button.setSize(180, 80);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion1Button.setLocation(140, 470);
                    randomcheck = 1;
                } else {
                    silabarandom1 = silabasep[new Random().nextInt(silabasep.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }

            //Boton 2, contiene la letra a
            Opcion2Button.setText("sa");
            Opcion2Button.setSize(180, 80);
            //jButton1.setLocation(350, 200); //para el segundo boton
            Opcion2Button.setLocation(370, 470);

            //Boton 3, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"sa".equals(silabarandom2) && !silabarandom2.equals(silabarandom1)) {
                    Opcion3Button.setText(silabarandom2);
                    Opcion3Button.setSize(180, 80);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion3Button.setLocation(590, 470);
                    randomcheck = 1;
                } else {
                    silabarandom2 = silabasep[new Random().nextInt(silabasep.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }

        } else if (valor == 2) {
            //Boton 1, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"sa".equals(silabarandom1) && !silabarandom1.equals(silabarandom2)) {
                    Opcion1Button.setText(silabarandom1);
                    Opcion1Button.setSize(180, 80);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion1Button.setLocation(140, 470);
                    randomcheck = 1;
                } else {
                    silabarandom1 = silabasep[new Random().nextInt(silabasep.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }

            //Boton 2, letra random
            for (int i = 0; i < randomcheck; i++) {
                if (!"sa".equals(silabarandom2) && !silabarandom2.equals(silabarandom1)) {
                    Opcion2Button.setText(silabarandom2);
                    Opcion2Button.setSize(180, 80);
                    //jButton1.setLocation(350, 200); //para el segundo boton
                    Opcion2Button.setLocation(370, 470);
                    randomcheck = 1;
                } else {
                    silabarandom2 = silabasep[new Random().nextInt(silabasep.length)];
                    randomcheck++;
                    System.out.println("Se incremento el randomcheck");
                }
            }

            //Boton 3, contiene la letra a
            Opcion3Button.setText("sa");
            Opcion3Button.setSize(180, 80);
            //jButton1.setLocation(350, 200); //para el segundo boton
            Opcion3Button.setLocation(590, 470);

        }
        playSound("ca-sa"); //1=letra a
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
        Silaba2Panel = new javax.swing.JPanel();
        Silaba2Label = new javax.swing.JLabel();
        Silaba3Panel = new javax.swing.JPanel();
        Silaba3Label = new javax.swing.JLabel();
        Silaba1Panel = new javax.swing.JPanel();
        Silaba1Label = new javax.swing.JLabel();
        Silaba4Panel = new javax.swing.JPanel();
        Silaba4Label = new javax.swing.JLabel();
        InstruccionLabel = new javax.swing.JLabel();
        ImagenLabel = new javax.swing.JLabel();
        Guion3Label = new javax.swing.JLabel();
        Guion1Label = new javax.swing.JLabel();
        Guion2Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
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
        PlayButton.setBounds(420, 40, 70, 70);

        Opcion1Button.setBackground(new java.awt.Color(102, 255, 255));
        Opcion1Button.setFont(new java.awt.Font("Smart Kid", 1, 48)); // NOI18N
        Opcion1Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        Opcion1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion1ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Opcion1Button);
        Opcion1Button.setBounds(140, 470, 180, 80);

        Opcion2Button.setBackground(new java.awt.Color(102, 255, 255));
        Opcion2Button.setFont(new java.awt.Font("Smart Kid", 1, 48)); // NOI18N
        Opcion2Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        Opcion2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion2ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Opcion2Button);
        Opcion2Button.setBounds(370, 470, 180, 80);

        Opcion3Button.setBackground(new java.awt.Color(102, 255, 255));
        Opcion3Button.setFont(new java.awt.Font("Smart Kid", 1, 48)); // NOI18N
        Opcion3Button.setToolTipText("");
        Opcion3Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        Opcion3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion3ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Opcion3Button);
        Opcion3Button.setBounds(590, 470, 180, 80);

        Silaba2Panel.setBackground(new java.awt.Color(204, 204, 204));
        Silaba2Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Silaba2Label.setFont(new java.awt.Font("Smart Kid", 0, 80)); // NOI18N
        Silaba2Label.setForeground(new java.awt.Color(0, 51, 255));
        Silaba2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Silaba2Label.setText("Ca");

        javax.swing.GroupLayout Silaba2PanelLayout = new javax.swing.GroupLayout(Silaba2Panel);
        Silaba2Panel.setLayout(Silaba2PanelLayout);
        Silaba2PanelLayout.setHorizontalGroup(
            Silaba2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Silaba2PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Silaba2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Silaba2PanelLayout.setVerticalGroup(
            Silaba2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Silaba2PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Silaba2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(Silaba2Panel);
        Silaba2Panel.setBounds(470, 240, 130, 130);

        Silaba3Panel.setBackground(new java.awt.Color(204, 204, 204));
        Silaba3Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Silaba3Label.setFont(new java.awt.Font("Smart Kid", 0, 80)); // NOI18N
        Silaba3Label.setForeground(new java.awt.Color(0, 51, 255));
        Silaba3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Silaba3PanelLayout = new javax.swing.GroupLayout(Silaba3Panel);
        Silaba3Panel.setLayout(Silaba3PanelLayout);
        Silaba3PanelLayout.setHorizontalGroup(
            Silaba3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(Silaba3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Silaba3PanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Silaba3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Silaba3PanelLayout.setVerticalGroup(
            Silaba3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(Silaba3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Silaba3PanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Silaba3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(Silaba3Panel);
        Silaba3Panel.setBounds(620, 240, 130, 130);

        Silaba1Panel.setBackground(new java.awt.Color(204, 204, 204));
        Silaba1Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Silaba1Panel.setPreferredSize(new java.awt.Dimension(180, 80));

        Silaba1Label.setBackground(new java.awt.Color(255, 255, 255));
        Silaba1Label.setFont(new java.awt.Font("Smart Kid", 0, 80)); // NOI18N
        Silaba1Label.setForeground(new java.awt.Color(0, 51, 255));
        Silaba1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Silaba1Label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout Silaba1PanelLayout = new javax.swing.GroupLayout(Silaba1Panel);
        Silaba1Panel.setLayout(Silaba1PanelLayout);
        Silaba1PanelLayout.setHorizontalGroup(
            Silaba1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(Silaba1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Silaba1PanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Silaba1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Silaba1PanelLayout.setVerticalGroup(
            Silaba1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(Silaba1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Silaba1PanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Silaba1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(Silaba1Panel);
        Silaba1Panel.setBounds(320, 240, 130, 130);

        Silaba4Panel.setBackground(new java.awt.Color(204, 204, 204));
        Silaba4Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Silaba4Label.setFont(new java.awt.Font("Smart Kid", 0, 80)); // NOI18N
        Silaba4Label.setForeground(new java.awt.Color(0, 51, 255));
        Silaba4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Silaba4PanelLayout = new javax.swing.GroupLayout(Silaba4Panel);
        Silaba4Panel.setLayout(Silaba4PanelLayout);
        Silaba4PanelLayout.setHorizontalGroup(
            Silaba4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(Silaba4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Silaba4PanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Silaba4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Silaba4PanelLayout.setVerticalGroup(
            Silaba4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(Silaba4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Silaba4PanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Silaba4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(Silaba4Panel);
        Silaba4Panel.setBounds(770, 240, 130, 130);

        InstruccionLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        InstruccionLabel.setText("Elige la sílaba que falta");
        jPanel1.add(InstruccionLabel);
        InstruccionLabel.setBounds(280, 0, 370, 40);
        jPanel1.add(ImagenLabel);
        ImagenLabel.setBounds(5, 130, 310, 310);

        Guion3Label.setFont(new java.awt.Font("Segoe UI Semilight", 1, 48)); // NOI18N
        Guion3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Guion3Label.setText("-");
        jPanel1.add(Guion3Label);
        Guion3Label.setBounds(740, 280, 40, 50);

        Guion1Label.setFont(new java.awt.Font("Segoe UI Semilight", 1, 48)); // NOI18N
        Guion1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Guion1Label.setText("-");
        jPanel1.add(Guion1Label);
        Guion1Label.setBounds(440, 280, 40, 50);

        Guion2Label.setFont(new java.awt.Font("Segoe UI Semilight", 1, 48)); // NOI18N
        Guion2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Guion2Label.setText("-");
        jPanel1.add(Guion2Label);
        Guion2Label.setBounds(590, 280, 40, 50);

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
                Aciertos.ResetPreguntas();
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
            CalculaCalificacion Preguntas = new CalculaCalificacion();
            Preguntas.CalcularPreguntas();
            System.out.println(Preguntas.getPreguntas());
            Silaba3Label.setText("sa");
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
                a=1;
                if(Aciertos.getPreguntas() == 30){
                CalificacionSilabas CalSil = new CalificacionSilabas();
                CalSil.setSize(909, 655);
                CalSil.setLocationRelativeTo(null);
                CalSil.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
                }
                else{
                SilabaCelular Celular = new SilabaCelular();
                Celular.setSize(909, 655);
                Celular.setLocationRelativeTo(null);
                Celular.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
                }               
            }
        });

//Declaramos los botones que se van a usar en el cuadro de dialogo
        ImageIcon happyface = new ImageIcon("src/imagenes/happiness.png");
        JButton[] buttons = {button};
        int repeat = 1;
        for(int i=0; i<repeat; i++){
        JOptionPane.showOptionDialog(null, "     Respuesta correcta.", "¡Bien Hecho!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, happyface, buttons, buttons[0]);
        //JOptionPane, por alguna razon su valor siempre sera -1, no importa lo que oprimas, cree una variable a=0, si se encuentra
        //en ese valor, repetirá el proceso, significando que no se ha seleccionado el boton correcto, al oprimir el boton correcto
        //el valor de a ahora es 1, por lo que deja de hacer iteraciones (repeat=0) y continua normalmente, todo con la finalidad
        //de que si se oprime el boton de exit "x" de la parte de arriba, se repita el JOptionPane.
            if( a == 0){
             repeat++;
            } else{
            repeat=0;
            }  
        }} else {
            System.out.println("prueba de nuevo");
            playSound("TryAgain");
            //Opcion2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png")));
            Opcion2Button.setEnabled(false);
            Opcion2Button.setBackground(new java.awt.Color(207, 207, 207));
            //Objeto para decrecer el numero de aciertos
            if(restadas < 1 && restadas != 2){
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Restar();
            restadas++;
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
            CalculaCalificacion Preguntas = new CalculaCalificacion();
            Preguntas.CalcularPreguntas();
            System.out.println(Preguntas.getPreguntas());
            Silaba3Label.setText("sa");
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
                a=1;
                if(Aciertos.getPreguntas() == 30){
                CalificacionSilabas CalSil = new CalificacionSilabas();
                CalSil.setSize(909, 655);
                CalSil.setLocationRelativeTo(null);
                CalSil.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
                }
                else{
                SilabaBotella Botella = new SilabaBotella();
                Botella.setSize(909, 655);
                Botella.setLocationRelativeTo(null);
                Botella.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
                }
            }
        });

//Declaramos los botones que se van a usar en el cuadro de dialogo
        ImageIcon happyface = new ImageIcon("src/imagenes/happiness.png");
        JButton[] buttons = {button};
        int repeat = 1;
        for(int i=0; i<repeat; i++){
        JOptionPane.showOptionDialog(null, "     Respuesta correcta.", "¡Bien Hecho!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, happyface, buttons, buttons[0]);
        //JOptionPane, por alguna razon su valor siempre sera -1, no importa lo que oprimas, cree una variable a=0, si se encuentra
        //en ese valor, repetirá el proceso, significando que no se ha seleccionado el boton correcto, al oprimir el boton correcto
        //el valor de a ahora es 1, por lo que deja de hacer iteraciones (repeat=0) y continua normalmente, todo con la finalidad
        //de que si se oprime el boton de exit "x" de la parte de arriba, se repita el JOptionPane.
            if( a == 0){
             repeat++;
            } else{
            repeat=0;
            }  
        }} else {
            System.out.println("prueba de nuevo");
            playSound("TryAgain");
            //Opcion2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png")));
            Opcion1Button.setEnabled(false);
            Opcion1Button.setBackground(new java.awt.Color(207, 207, 207));
            //Objeto para decrecer el numero de aciertos
            if(restadas < 1 && restadas != 2){
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Restar();
            restadas++;
            }
        }
    }//GEN-LAST:event_Opcion1ButtonActionPerformed

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        playSound("ca-sa");
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void Opcion3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion3ButtonActionPerformed
        if (valor == 2) {
         System.out.println("correcto");
            playSound("correct");
            //Objeto para incrementar el numero de aciertos
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Calcular();
            CalculaCalificacion Preguntas = new CalculaCalificacion();
            Preguntas.CalcularPreguntas();
            System.out.println(Preguntas.getPreguntas());
            Silaba3Label.setText("sa");
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
                a=1;
                if(Aciertos.getPreguntas() == 30){
                CalificacionSilabas CalSil = new CalificacionSilabas();
                CalSil.setSize(909, 655);
                CalSil.setLocationRelativeTo(null);
                CalSil.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
                }
                else{
                SilabaMochila Mochila = new SilabaMochila();
                Mochila.setSize(909, 655);
                Mochila.setLocationRelativeTo(null);
                Mochila.setVisible(true);
                JOptionPane.getRootFrame().dispose();
                dispose();
                }
            }
        });

//Declaramos los botones que se van a usar en el cuadro de dialogo
        ImageIcon happyface = new ImageIcon("src/imagenes/happiness.png");
        JButton[] buttons = {button};
        int repeat = 1;
        for(int i=0; i<repeat; i++){
        JOptionPane.showOptionDialog(null, "     Respuesta correcta.", "¡Bien Hecho!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, happyface, buttons, buttons[0]);
        //JOptionPane, por alguna razon su valor siempre sera -1, no importa lo que oprimas, cree una variable a=0, si se encuentra
        //en ese valor, repetirá el proceso, significando que no se ha seleccionado el boton correcto, al oprimir el boton correcto
        //el valor de a ahora es 1, por lo que deja de hacer iteraciones (repeat=0) y continua normalmente, todo con la finalidad
        //de que si se oprime el boton de exit "x" de la parte de arriba, se repita el JOptionPane.
            if( a == 0){
             repeat++;
            } else{
            repeat=0;
            }  
        }} else {
            System.out.println("prueba de nuevo");
            playSound("TryAgain");
            //Opcion2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png")));
            Opcion3Button.setEnabled(false);
            Opcion3Button.setBackground(new java.awt.Color(207, 207, 207));
            //Objeto para decrecer el numero de aciertos
            if(restadas < 1 && restadas != 2){
            CalculaCalificacion Aciertos = new CalculaCalificacion();
            Aciertos.Restar();
            restadas++;
            }
        }
    }//GEN-LAST:event_Opcion3ButtonActionPerformed

    public void botonesTransparentes() {
        Opcion1Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Opcion1Button.setFocusPainted(false);
        Opcion2Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Opcion2Button.setFocusPainted(false);
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
            java.util.logging.Logger.getLogger(SilabaCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SilabaCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SilabaCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SilabaCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SilabaCasa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfiguracionButton;
    private javax.swing.JLabel Guion1Label;
    private javax.swing.JLabel Guion2Label;
    private javax.swing.JLabel Guion3Label;
    private javax.swing.JLabel ImagenLabel;
    private javax.swing.JLabel InstruccionLabel;
    private javax.swing.JButton Opcion1Button;
    private javax.swing.JButton Opcion2Button;
    private javax.swing.JButton Opcion3Button;
    private javax.swing.JButton PlayButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JLabel Silaba1Label;
    private javax.swing.JPanel Silaba1Panel;
    private javax.swing.JLabel Silaba2Label;
    private javax.swing.JPanel Silaba2Panel;
    private javax.swing.JLabel Silaba3Label;
    private javax.swing.JPanel Silaba3Panel;
    private javax.swing.JLabel Silaba4Label;
    private javax.swing.JPanel Silaba4Panel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
