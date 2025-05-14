import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;



public class FenetreAnalyste extends Application {

    @Override
    public void init(){

    }

    @Override
    public void start(Stage stage){
        BorderPane border = new BorderPane();
        BorderPane borderTop = new BorderPane();

        Label titre = new Label("Allo 45");
        Button deconexion = new Button("deconnexin");
        borderTop.setRight(deconexion);
        borderTop.setLeft(titre);
        
        
        
        border.setTop(borderTop); /*pour ajouter les modif dans bordertop */
        Scene scene = new Scene(border);
        stage.setScene(scene);
        stage.setTitle("Fenetre analyste");
        stage.show();

    }





    public static void main (String [] args){
        Application.launch(args);
    }
    
}
