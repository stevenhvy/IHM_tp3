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


/* ajoute element un au dessus de l'autre , hbox metra des élement a coter  */

public class FenetreAnalyste extends Application {

    @Override
    public void init(){

    }

    @Override
    public void start(Stage stage){
        BorderPane border = new BorderPane();
        BorderPane borderTop = new BorderPane();

        Text titre = new Text("Allo 45 Module Analysite");
        titre.setFont(Font.font (" Arial " , FontWeight.BOLD,32) );
        borderTop.setBackground(new Background(new BackgroundFill(Color.STEELBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        
        
        Button deconexion = new Button("deconnexin");
        borderTop.setRight(deconexion);
        borderTop.setLeft(titre);

        VBox v = new VBox();
        Text text = new Text("Analyse sondage sur les habitude alimentaire ");
        ComboBox comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
            "Pie" ,
            "Pie" );
        
        
        PieChart chart = new PieChart () ;
        chart.setTitle(" Que lisez - vous au petit d é jeuner ? " ) ;
        chart.getData().setAll(
        new PieChart.Data(" Le journal " , 21) ,
        new PieChart.Data ( " Un livre " , 3) ,
        new PieChart.Data ( " Le courier " , 7) ,
        new PieChart.Data ( " La boîte de céréales " , 75) ) ;
        chart.setLegendSide(Side.LEFT); // pour mettre la l é gende à gauche
        
        
        HBox box = new HBox();
        Button precedent = new Button("précedent");
        Button suivant = new Button("Suivant");
        box.getChildren().addAll(precedent, suivant);
        v.getChildren().addAll(text, comboBox, chart, box);

        ImageView imgPrec = new ImageView(new Image("file:graphics/left.png"));
        imgPrec.setFitWidth(24);
        imgPrec.setFitHeight(24);

        precedent.setContentDisplay(ContentDisplay.LEFT);


        Button precedent = new Button("Question précédente", imgPrec);



        TilePane tilePane = new TilePane();
        
        
        Image image = new Image("file:graphics/chart_1.png"); 
        ImageView imageView = new ImageView(image);
        Image image2 = new Image("file:graphics/chart_2.png"); 
        ImageView imageView2 = new ImageView(image2);
         ImageView imageView3 = new ImageView("file:graphics/chart_3.png");
         ImageView imageView4 = new ImageView("file:graphics/chart_4.png");
          ImageView imageView5 = new ImageView("file:graphics/chart_5.png");
            ImageView imageView6 = new ImageView("file:graphics/chart_6.png");
             ImageView imageView7 = new ImageView("file:graphics/chart_7.png");
              ImageView imageView8 = new ImageView("file:graphics/chart_8.png");


        tilePane.getChildren().add(imageView);
         tilePane.getChildren().add(imageView2);
         tilePane.getChildren().add(imageView3);
         tilePane.getChildren().add(imageView4);
         tilePane.getChildren().add(imageView5);
         tilePane.getChildren().add(imageView6);
          tilePane.getChildren().add(imageView7);
           tilePane.getChildren().add(imageView8);
        
      


        VBox vboxRight = new VBox(5); 
        ImageView userIcon = new ImageView(new Image("file:graphics/user.png"));
        userIcon.setFitWidth(40);
        userIcon.setFitHeight(40);
        Button deconnexion = new Button("Déconnexion");

        vboxRight.getChildren().addAll(userIcon, deconnexion);
        borderTop.setRight(vboxRight);
        
        



        border.setRight(tilePane);
        border.setCenter(v);
        
        border.setTop(borderTop); /*pour ajouter les modif dans bordertop */
        
        /*par coeur  permet d'afficher la page  */
        
        Scene scene = new Scene(border);
        stage.setScene(scene);
        stage.setTitle("Fenetre analyste");
        stage.show();

    }





    public static void main (String [] args){
        Application.launch(args);
    }
    
}
