/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javafxapplication13;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Arley
 */
public class Ciencias extends javax.swing.JFrame {
    
    // se define la variable texto base y se le añade la pregunta mas la primera opcion que es la respuesta, el resto seran distractores
    // una forma mas facil de entender estamos convirtiendo un texto unidimencional en vidimencional, el mayor ejemplo de esto es 
    // verlo como un excel, em el cual el indicador de que son diverentes casiilas es \t y \n indica que es otro renglon 

    static String textobase = "¿Cuál de las siguientes acciones puede causar un daño al sistema locomotor?\tCargar cosas pesadas sobre la espalda\tMantener la espalda recta cuando estamos sentados\tRealizar un calentamiento antes de hacer deporte\tCaminar con la cabeza erguida"
            + "\n"
            + "¿Cual es el simbolo del Hierro?\tFe\tHe\tNa\tK"
            + "\n"
            + "¿Cual de estos animales es considerado el mas rapido del mundo?\tGuepardo\tTiburón Mako\tHalcón peregrino \tColibrí "
            + "\n"
            + "Segun la forma de alimentarse de los cerdos son :\tOmnivoros\tCarnivoros\tHervivoros \tCarroñeros ";
    // con la finalidad de que el programa entienda  que \n  indica que es otro renglon se utiliza el split y tambien 
    // se indica que el numero de renglones va a ser igual a el numero do \n que se encuentra en textobase
    static String[] renglones = textobase.split("\n");
    static int cantpreguntas = renglones.length;
    // para terminar de generar la tabla de excel se  hace referencia a que tiene 5 casillas, la pregunta + la respuesta correcta
   // 3 distractorers = 5 
    // la cantidad de preguntas va a ser igual a la cantidad de renglones ya que solo hay una pregunta por renglon 
    static String[][] preguntasbase = new String[cantpreguntas][5];

    String[] preguntaescogida;
   // se crea una variable de tipo string y arraylist con el objetivo de crear una lista con las opciones de respuesta
    // y luego hubicarlo en los respectivos botones 
    ArrayList<String> opciones = new ArrayList<>();
    // se inicializa un contador que mas adelante servira de referencia para saber en que pregunta esta hubicado
    int n_pregunta; 
    String respuesta;
    String pregunta;
    
    
// este metodo se utiliza para asignarle a una variable tipo string aterirormente incializada la pregunta para hubicarla en un 
    //label. la respuesta se asigna tambien a una variable y por decirlo asi lo barajamos con una opcion predeterminada llamada 
    //shuffle para hacerlo aleatorio, debido a que se noto que la respuesta no salia del boton 1 y 4 se utilizo un for para solucionar esto 
    public void escogerpregunta(int n) {
        preguntaescogida = preguntasbase[n];
        pregunta = preguntaescogida[0];
        respuesta = preguntaescogida[1];
        opciones.clear();
        for (int i = 1; i < preguntaescogida.length; i++) {
            opciones.add(preguntaescogida[i]);
        }
       for(int i =0;i<4;i++){
        Collections.shuffle(opciones);
       }

    }
    // se utiliza la arraylist anterior mente inicializada  y barajada para asignarle las respuestas a cada uno de los botones

    public void mostrarpregunta() {
        jLabel1.setText(pregunta);
        jButton1.setText(opciones.get(0));
        jButton2.setText(opciones.get(1));
        jButton3.setText(opciones.get(2));
        jButton4.setText(opciones.get(3));
    }
    
    //tenemos un verificador que hace que salte un mensaje afirmando si su respuesta fue correcta o incorrecta
    
   void escogerrespuesta(int n) {
        if (opciones.get(n).equals(respuesta)) {
            JOptionPane.showMessageDialog(
                    this,
                    "Su respuesta es correcta",
                    "Muy bien ",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Su respuesta es incorrecta, la respuesta es: " + respuesta,
                    "Que mal ",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        jugar();
    }
  // se utiliza el contador anteriormente inicializado para cuando  el contador sea igual a la cantidad de pregutnas indique que el juego
   // ha finalizado 
    public void jugar() {
        if (n_pregunta == cantpreguntas) {
            JOptionPane.showMessageDialog(
                    this,
                    "Juego Terminado",
                    "Muy bien :)",
                    JOptionPane.PLAIN_MESSAGE
            );
            System.exit(0);
        }
        escogerpregunta(n_pregunta);
        mostrarpregunta();
        n_pregunta++;
    }
    
     // se utiliza el setLocationRelativeTo null para que el frame se hubique en el centro,
    //es decir que la pantalla se genere en el centro no en una esquina como viene por defecto 
    // se utiliza setResizable para que el usuario no pueda modificar el tamaño de la pantalla, por esta razon se hizo un frame de    
    //900,600 con el  objetivo de que cualquier pantalla lo pueda proyectar 
    public Ciencias() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose(); 
        jugar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(33, 33, 33)
                .addComponent(jButton4)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escogerrespuesta(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        escogerrespuesta(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        escogerrespuesta(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       escogerrespuesta(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ciencias().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
