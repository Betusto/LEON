/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Alberto Villarreal
 */
public class JuegoDelMemorama extends javax.swing.JFrame implements ActionListener {
        //Recalcar el tamaño de la interfaz
	private final int WINDOW_WIDTH = 909;
	private final int WINDOW_HEIGHT = 655;
        //Incicializacion
        JButton arreglo [] = new JButton[12];
        Carta cartas [] = new Carta[12];
        Carta temporal = new Carta(0,"/imagenes/interrogacion.png",0); //llama a la clase Carta.java
        int par = 0;
        public Clip clip;
        
    public JuegoDelMemorama() {
        initComponents();
                //botonesTransparentes(); //manda a llamar al metodo botonesTransparentes
                this.setLocationRelativeTo(null); //Para que apareza la interfaz en el centro
		// Set window size.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
                setTitle("LEON");
                setResizable(false); //Remueve el boton de maximizar pantalla

		
		// Specify what happens when close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                playSound("Memorama");
                IniciarTablero();
                botonesTransparentes();
    }
    public final void IniciarTablero(){                
                //Iniciar Tablero, acomodar botones
                int contador = 0;
                for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 3; j++){
                        JButton btn = new JButton("", new ImageIcon(this.getClass().getResource("/imagenes/interrogacion.png")));
                        //coloca las posiciones de los botones y sus dimensiones
                        switch(contador){
                            case 0:
                                btn.setBounds(70, 60, 180, 180);
                                break;
                            case 1:
                                btn.setBounds(260, 60, 180, 180);
                                break;
                            case 2:
                                btn.setBounds(450, 60, 180, 180);
                                break;
                            case 3:
                                btn.setBounds(640, 60, 180, 180);
                                break;
                            case 4:
                                btn.setBounds(70, 250, 180, 180);
                                break;
                            case 5:
                                btn.setBounds(260, 250, 180, 180);
                                break;
                            case 6:
                                btn.setBounds(450, 250, 180, 180);
                                break;                                
                            case 7:
                                btn.setBounds(640, 250, 180, 180);
                                break;
                            case 8:
                                btn.setBounds(70, 440, 180, 180);
                                break;
                            case 9:
                                btn.setBounds(260, 440, 180, 180);
                                break;
                            case 10:
                                btn.setBounds(450, 440, 180, 180);
                                break;
                            case 11:
                                btn.setBounds(640, 440, 180, 180);
                                break;                                
                        }
                        btn.setName(contador+"");
                        btn.addActionListener(this); //ActionListener pendiente de si lo oprimen
                        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        btn.setFocusPainted(false);
                        arreglo[contador] = btn;
                        contador++;
                        jPanel1.add(btn);
                    }
            }
            revolver();
            jPanel1.add(Fondo);
    }
    //metodo para revolver las cartas aleatoriamente
    public void revolver(){
        int c=0;
        int randomcheck=1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listdos = new ArrayList<Integer>();
        int[] list1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        //list.add(0); list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6); list.add(7); list.add(8); list.add(9);
        //list.add(10); list.add(11); list.add(12); list.add(13); list.add(14); list.add(15); list.add(16); list.add(17); list.add(18);
        //list.add(19); list.add(20); list.add(21); list.add(22); list.add(23); list.add(24); list.add(25); list.add(26); list.add(27);
        //list.add(28); list.add(29);
        int[] list2 = {};
        boolean result;
        for (int i = 1; i <= 6; i++){
             for (int j = 0; j < randomcheck; j++) {  
            Random rand1 = new Random();
            int n = rand1.nextInt(30);
            System.out.println(Arrays.asList(list.contains(n)));
            result=list.contains(n); //revisa si la imagen random ya se ha declarado antes
            if(result == true){
            randomcheck++;
            System.out.println("Se incremento el randomcheck");
            }else if(result == false){
            Carta carta1 = new Carta(i,"/imagenes/memorama/"+n+".png",c);
            System.out.println("Encontro la imagen"+n);
            Carta carta2 = new Carta(i,"/imagenes/memorama/"+n+".png",c+1);
            cartas[c] = carta1;
            c++;
            cartas[c] = carta2;
            c++;
            System.out.println(list);
            randomcheck=1;
            list.add(n);
            }
        }
        }
        int llenar = 0;
        Carta cartaTemporal [] = new Carta[12];
        for(int i= 0; i< cartaTemporal.length; i++){
            cartaTemporal[i] = new Carta(0,"/imagenes/interrogacion.png",-1); //relleno de arreglo
        }        
        while(llenar<=11){
            int aleatorio = ((int) (Math.random()*12));
            if(buscarNum(aleatorio, cartaTemporal)){
            cartaTemporal[llenar] = cartas[aleatorio];
            //System.out.println(cartas[aleatorio]);
            cartaTemporal[llenar].btn =  arreglo[llenar]; //enlazar el arreglo de 16 cartas con el boton
            llenar++;
            }
        }
        cartas = cartaTemporal;
    }
    
    public boolean buscarNum(int num, Carta c[]){
        int con = 0; //contador
        for(Carta c1 : c){ //forma reducida de recorrer un arreglo
            if(num == c1.posicion){
                con++;
            }
        }
        return(con<1);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        stopSound();
        for(int i = 0; i < arreglo.length; i++){
            if(cartas[i].btn == e.getSource() && cartas[i].revelado == false){
                cartas[i].btn.setIcon(cartas[i].img);
                if (par == 0){
                    cartas[i].revelado = true;
                    temporal = cartas[i];
                    par = 1;
                } else{
                    par = 0;
                    if(cartas[i].valor == temporal.valor){
                    cartas[i].revelado = true;
                    boolean bandera = true;
                    for(Carta elemento : cartas){
                        if(elemento.revelado == false){
                            bandera=false;
                            break;
                        }
                    }
                    if(bandera){
                        System.out.println("Felicidades Ganaste");
                    }
                    }
                    else{
                    try{
                        cartas[i].btn.update(cartas[i].btn.getGraphics());
                        Thread.sleep(500); //deja ver por medio segundo la carta equivocada
                        tapar(i);
                    }catch(Exception ex){
                        System.out.println(ex);
                    
                    }
                    
                    }
                }
            }
        }
    }
        public void tapar(int a){
        cartas[a].btn.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/interrogacion.png")));
        cartas[Integer.valueOf(temporal.btn.getName())].revelado = false;
        cartas[Integer.valueOf(temporal.btn.getName())].btn.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/interrogacion.png")));
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
        RegresarButton = new javax.swing.JButton();
        EmpezarPrincipioButton = new javax.swing.JButton();
        TituloLabel = new javax.swing.JLabel();
        PlayButton2 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        ConfiguracionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion_6.png"))); // NOI18N
        ConfiguracionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguracionButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConfiguracionButton);
        ConfiguracionButton.setBounds(0, 560, 60, 70);

        RegresarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar_2.png"))); // NOI18N
        RegresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarButton);
        RegresarButton.setBounds(830, 560, 80, 70);

        EmpezarPrincipioButton.setBackground(new java.awt.Color(102, 255, 255));
        EmpezarPrincipioButton.setFont(new java.awt.Font("Smart Kid", 1, 24)); // NOI18N
        EmpezarPrincipioButton.setText("Reiniciar");
        EmpezarPrincipioButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        EmpezarPrincipioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpezarPrincipioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(EmpezarPrincipioButton);
        EmpezarPrincipioButton.setBounds(783, 0, 120, 50);

        TituloLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        TituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        TituloLabel.setText("Haz parejas de cartas");
        jPanel1.add(TituloLabel);
        TituloLabel.setBounds(300, 10, 250, 41);

        PlayButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play-button.png"))); // NOI18N
        PlayButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(PlayButton2);
        PlayButton2.setBounds(550, 10, 40, 40);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoMesa.jpg"))); // NOI18N
        jPanel1.add(Fondo);
        Fondo.setBounds(0, 0, 910, 630);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConfiguracionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguracionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfiguracionButtonActionPerformed

    private void RegresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarButtonActionPerformed
        //boton para volver al menu principal, se declara tamaño y al centro
        stopSound();
        MainMenu Menu = new MainMenu();
        Menu.setSize(909, 655);
        Menu.setLocationRelativeTo(null);
        Menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_RegresarButtonActionPerformed

    private void EmpezarPrincipioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpezarPrincipioButtonActionPerformed
        //boton para reiniciar
        stopSound();
        JuegoDelMemorama Memorama = new JuegoDelMemorama();
        Memorama.setSize(909, 655);
        Memorama.setLocationRelativeTo(null);
        Memorama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmpezarPrincipioButtonActionPerformed

    private void PlayButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButton2ActionPerformed
        stopSound();
    }//GEN-LAST:event_PlayButton2ActionPerformed

    
    public void botonesTransparentes(){
        EmpezarPrincipioButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        EmpezarPrincipioButton.setFocusPainted(false);
        PlayButton2.setOpaque(false);
        PlayButton2.setContentAreaFilled(false);
        PlayButton2.setBorderPainted(false);
        PlayButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        PlayButton2.setFocusPainted(false);
        RegresarButton.setOpaque(false);
        RegresarButton.setContentAreaFilled(false);
        RegresarButton.setBorderPainted(false);
        RegresarButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        RegresarButton.setFocusPainted(false);
        ConfiguracionButton.setOpaque(false);
        ConfiguracionButton.setContentAreaFilled(false);
        ConfiguracionButton.setBorderPainted(false);
        ConfiguracionButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ConfiguracionButton.setFocusPainted(false);
    }
     private void playSound(String File) { // Play a wav file specified by fileName
        try {
             String path = "src/sonidos/" + File + ".wav";
             File file = new File(path);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
        }
    }
    //metodo para detener el sonido
    private void stopSound() { // Play a wav file specified by fileName
        try {
            clip.stop();
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
            java.util.logging.Logger.getLogger(JuegoDelMemorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoDelMemorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoDelMemorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoDelMemorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoDelMemorama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfiguracionButton;
    private javax.swing.JButton EmpezarPrincipioButton;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton PlayButton2;
    private javax.swing.JButton RegresarButton;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
