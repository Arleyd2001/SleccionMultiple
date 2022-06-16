/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication13;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javafxapplication13.Ciencias.preguntasbase;
import static javafxapplication13.Ciencias.renglones;


/**
 *
 * @author Arley
 */
public class JavaFXApplication13 extends Application {
    
    @Override
  
    public void start(Stage stage) throws Exception {
    
        
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          for(int i = 0;i< renglones.length;i++){
        String renglon = renglones[i];
        preguntasbase[i]= renglon.split("\t");
       }
        
      // Al ejecutarse la clase main, se ejecutara este fragmento de codigo con el objetivo de 
      //redirigirnos a la interfaz grafica, la cual contiene el menu de inicio con las respectivas tematicas de las preguntas 
              Inicio vl = new Inicio (); 
       vl.setVisible(true);
       
        launch(args);
        
        
        
        
     
    }
    
}
