package helloapp;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


class  showScene{
    private Stage stage;
    public showScene(Stage stage) {
        this.stage = stage;
    }
    public void showScene1() {
        
        Image img = new Image("kalkulator.png");
        ImageView imgview = new ImageView(img);
        imgview.setFitWidth(150);
        imgview.setFitHeight(150);
        
        imgview.setId("Logo");
        
        Label l1 = new Label("Zoologya");
        l1.setFont(null);
        l1.setId("namaApp");
        
        Label l2 = new Label("Halo, Nama Kamu Siapa?");
        l2.setId("labelMasuk");
        Button buttonLogin = new Button("Masuk");
        buttonLogin.setId("tombolMasuk");
        TextField inputNama = new TextField();
        inputNama.setId("inputNama");
        
        buttonLogin.setOnAction(action -> {
            showScene2();
        });
        
        VBox vbox1 = new VBox(l1,imgview,l2,inputNama,buttonLogin);
        vbox1.setId("latarScene1");
       
        vbox1.setAlignment(Pos.TOP_CENTER);
        stage.setTitle("Kalkulator Sederhana");
        Scene scene1 = new Scene(vbox1, 360, 570, null);
        
        scene1.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene1);
    
        stage.show();
    }

    
    public void showScene2() {
        Label l1 = new Label("Pilihan menu");
        l1.setId("pilihanMenu");
        
        Button buttonHome = new Button();
        buttonHome.setId("tombolHome");
        Image imgButtonHome = new Image("buttonHome2.png");
        ImageView gambarButtonHome = new ImageView(imgButtonHome);
        gambarButtonHome.setFitWidth(30);
        gambarButtonHome.setFitHeight(30);
        buttonHome.setGraphic(gambarButtonHome);
        buttonHome.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showScene1();
        });
        
        Button buttonKH = new Button("Kenali Hewan");
        buttonKH.setId("tombolKenali");
        Image imgZoo = new Image("gambarZoo.png");
        ImageView gambarZoo = new ImageView(imgZoo);
        gambarZoo.setFitWidth(55);
        gambarZoo.setFitHeight(55);
        gambarZoo.setTranslateX(-30);
        buttonKH.setGraphic(gambarZoo);
        
        
        Button buttonMG = new Button("Bermain Minigames");
        buttonMG.setId("tombolMinigames");
        Image imgJoystick = new Image("iconJoystick.png");
        ImageView gambarJotstick = new ImageView(imgJoystick);
        gambarJotstick.setFitWidth(55);
        gambarJotstick.setFitHeight(55);
        gambarJotstick.setTranslateX(-20);
        buttonMG.setGraphic(gambarJotstick);
       
        VBox vbox1 = new VBox(l1,buttonKH,buttonMG,buttonHome);
        vbox1.setId("latarScene2");
        vbox1.setAlignment(Pos.TOP_CENTER);
        Scene scene2 = new Scene(vbox1, 360, 570, null);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
        
    }

    
    public void showScene3() {
        
        
        Button buttonKH = new Button("Kenali Hewan");
        buttonKH.setId("tombolKenali");
        Image imgZoo = new Image("gambarZoo.png");
        ImageView gambarZoo = new ImageView(imgZoo);
        gambarZoo.setFitWidth(55);
        gambarZoo.setFitHeight(55);
        gambarZoo.setTranslateX(-30);
        buttonKH.setGraphic(gambarZoo);
        
        
        Button buttonMG = new Button("Bermain Minigames");
        buttonMG.setId("tombolMinigames");
        Image imgJoystick = new Image("iconJoystick.png");
        ImageView gambarJotstick = new ImageView(imgJoystick);
        gambarJotstick.setFitWidth(55);
        gambarJotstick.setFitHeight(55);
        gambarJotstick.setTranslateX(-20);
        buttonMG.setGraphic(gambarJotstick);
       
        VBox vbox1 = new VBox(l1,buttonKH,buttonMG,buttonChicken);
        vbox1.setId("latarScene2");
        vbox1.setAlignment(Pos.TOP_CENTER);
        Scene scene2 = new Scene(vbox1, 360, 570, null);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
}

public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        showScene homeScene = new showScene(primaryStage);
        
        homeScene.showScene1();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
}
