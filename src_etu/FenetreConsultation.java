import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.*;




public class FenetreConsultation extends Application {
    
       @Override
    public void init() {}

    
    
    @Override
    public void start(Stage stage) {
        BorderPane border = new BorderPane();
        BorderPane bordertop = new BorderPane();
//top
        Text titre = new Text("Consultation/Modification d'une fiche joueur");
        titre.setFont(Font.font("Arial", FontWeight.BOLD, 32));

        bordertop.setCenter(titre);

// centre 
       GridPane grid = new GridPane();
            grid.setHgap(10); // Espace entre colonnes
            grid.setVgap(10); // Espace entre lignes
            grid.setPadding(new Insets(20)); // Marge intérieure

            
            TextField tPseudo = new TextField("Pseudo :");

            grid.add(labelPseudo, 0, 0);  // Colonne 0, Ligne 0
            grid.add(tfPseudo, 1, 0); 
        
        
        
        
        
        
        
        border.setTop(bordertop);
        border.setCenter(grid);
        
        
        
        
        
        
        Scene scene = new Scene(border);
        stage.setScene(scene);
        stage.setTitle("Fenêtre Joueur");
        stage.show();
    }

    
    
    
     
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
