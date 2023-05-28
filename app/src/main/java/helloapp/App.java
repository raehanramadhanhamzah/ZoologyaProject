package helloapp;



import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

class  showScene{
    private Stage stage;
    public showScene(Stage stage) {
        this.stage = stage;
        stage.setTitle("Zoologya");
    }
    public void showHomeScene() {
        
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);

        Image imgLogo = new Image("logoApp.jpg");
        ImageView imgview = new ImageView(imgLogo);
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
            showMenuScene();
        });
        
        VBox vbox = new VBox(l1,imgview,l2,inputNama,buttonLogin);
        vbox.setId("latarScene1");
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setBackground(bg);
        
        Scene scene1 = new Scene(vbox, 360, 650);
        
        scene1.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene1);
    
        stage.show();
    }

    
    public void showMenuScene() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        

        Label l1 = new Label("Pilihan menu");
        l1.setId("pilihanMenu");
        
        Button buttonKH = new Button("Kenali Hewan");
        buttonKH.setId("tombolKenali");
        Image imgZoo = new Image("gambarZoo.png");
        ImageView gambarZoo = new ImageView(imgZoo);
        gambarZoo.setFitWidth(55);
        gambarZoo.setFitHeight(55);
        gambarZoo.setTranslateX(-30);
        buttonKH.setGraphic(gambarZoo);
        buttonKH.setOnAction(action -> {
            showAnimalList();
        });
        
        Button buttonMG = new Button("Bermain Minigames");
        buttonMG.setId("tombolMinigames");
        Image imgJoystick = new Image("iconJoystick.png");
        ImageView gambarJotstick = new ImageView(imgJoystick);
        gambarJotstick.setFitWidth(55);
        gambarJotstick.setFitHeight(55);
        gambarJotstick.setTranslateX(-20);
        buttonMG.setGraphic(gambarJotstick);
        
        Button buttonHome = new Button();
        buttonHome.setId("tombolHome2");
        Image imgButtonHome = new Image("buttonHome2.png");
        ImageView gambarButtonHome = new ImageView(imgButtonHome);
        gambarButtonHome.setFitWidth(30);
        gambarButtonHome.setFitHeight(30);
        buttonHome.setGraphic(gambarButtonHome);
        buttonHome.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showHomeScene();
        });

        VBox vbox = new VBox(l1,buttonKH,buttonMG,buttonHome);
        vbox.setId("latarScene2");
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setBackground(bg);
        Scene scene2 = new Scene(vbox, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
        
    }

    
    public void showAnimalList() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);

        Label l1 = new Label("Nama-Nama Hewan");
        l1.setId("namaHewan");
        
        //POLIMORFISME
        Animal objAnjing = new Anjing();
        Animal objKucing = new Kucing();
        Animal objAyam = new Ayam();
        Animal objSapi = new Sapi();
        
        Button anjingButton = objAnjing.TombolHewan("Anjing");
        anjingButton.setId("buttonAnjing");
        anjingButton.setOnAction(action ->{
            showSceneAnjing();
        } );
        Button kucingButton = objKucing.TombolHewan("Kucing");
        kucingButton.setId("buttonKucing");
        Button sapiButton = objSapi.TombolHewan("Sapi");
        sapiButton.setId("buttonSapi");
        Button ayamButton = objAyam.TombolHewan("Ayam");
        ayamButton.setId("buttonAyam");
        
        Image anjingImage = objAnjing.image("Anjing.png");
        Image kucingImage = objKucing.image("Kucing.png");
        Image sapiImage = objSapi.image("Sapi.png");
        Image ayamImage = objAyam.image("Ayam.png");

        ImageView imgViewAnjing = objAnjing.imageView(anjingImage);
        imgViewAnjing.setFitWidth(55);
        imgViewAnjing.setFitHeight(55);
        imgViewAnjing.setTranslateX(-20);
        anjingButton.setGraphic(imgViewAnjing);
        
        ImageView imgViewKucing = objKucing.imageView(kucingImage);
        imgViewKucing.setFitWidth(55);
        imgViewKucing.setFitHeight(55);
        imgViewKucing.setTranslateX(-20);
        kucingButton.setGraphic(imgViewKucing);
        
        ImageView imgViewSapi = objSapi.imageView(sapiImage);
        imgViewSapi.setFitWidth(55);
        imgViewSapi.setFitHeight(55);
        imgViewSapi.setTranslateX(-20);
        sapiButton.setGraphic(imgViewSapi);
        
        ImageView imgViewAyam = objAyam.imageView(ayamImage);
        imgViewAyam.setFitWidth(55);
        imgViewAyam.setFitHeight(55);
        imgViewAyam.setTranslateX(-20);
        ayamButton.setGraphic(imgViewAyam);

        Button buttonHome = new Button();
        buttonHome.setId("tombolHome3");
        Image imgButtonHome = new Image("buttonHome2.png");
        ImageView gambarButtonHome = new ImageView(imgButtonHome);
        gambarButtonHome.setFitWidth(30);
        gambarButtonHome.setFitHeight(30);
        buttonHome.setGraphic(gambarButtonHome);
        buttonHome.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showHomeScene();
        });

        VBox vbox = new VBox(l1,anjingButton,sapiButton,kucingButton,ayamButton,buttonHome);
        vbox.setId("latarScene3");
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setBackground(bg);
        Scene scene2 = new Scene(vbox, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }

    public void showSceneAnjing() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Label l1 = new Label("ANJING");
        l1.setId("judulAnjing");
        Image showImage = new Image("imgAnjing.jpg");
        ImageView imgview = new ImageView(showImage);
        // imgview.setFitWidth(200);
        // imgview.setFitHeight(200);
        imgview.setId("showAnjingImage");
        
        Anjing objAnjing = new Anjing();
        Text desc = objAnjing.deskripsi();
        desc.setTextAlignment(TextAlignment.JUSTIFY);
        desc.setWrappingWidth(300);
        desc.setId("descAnjing");
        
        Button suaraAnjing = objAnjing.TombolSuara("Suara Anjing");
        suaraAnjing.setId("tombolSuaraAnjing");
        suaraAnjing.setOnAction(action ->{
            String path = "C:/Zoologya/app/src/main/resources/suaraAnjing.mp3";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaplayer = new MediaPlayer(media);
            mediaplayer.play();
        } );
        Button buttonHome = new Button();
        buttonHome.setId("tombolHomeAnjing");
        Image imgButtonHome = new Image("buttonHome2.png");
        ImageView gambarButtonHome = new ImageView(imgButtonHome);
        gambarButtonHome.setFitWidth(30);
        gambarButtonHome.setFitHeight(30);
        buttonHome.setGraphic(gambarButtonHome);
        buttonHome.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showHomeScene();
        });
        VBox vbox = new VBox(l1,imgview,desc,suaraAnjing);
        vbox.setId("latarSceneAnjing");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(60);
        hbox.setTranslateY(80);
        hbox.getChildren().addAll(buttonHome,suaraAnjing);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
}

public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        showScene homeScene = new showScene(primaryStage);
        
        homeScene.showHomeScene();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
}
