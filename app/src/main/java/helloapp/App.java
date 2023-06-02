package helloapp;
import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

class  showScene{
    private Stage stage;
    private int tambahScore;
    private Label score;
    private String ubahStr;
    private int picknumber;
    private String ubahString = "0";
    ArrayList<Integer> listAngka = new ArrayList<>();
    private TextField inputNama;
    public String getUbahStr() {
        return ubahStr;
    }
    public void setUbahStr(String ubahStr) {
        this.ubahStr = ubahStr;
    }

    public showScene(Stage stage) {
        this.stage = stage;
        stage.setTitle("Zoologya");
        listAngka.add(1);
        listAngka.add(2);
        listAngka.add(3);
        Collections.shuffle(listAngka);
        setPicknumber(listAngka.get(0));

        System.out.println(listAngka.get(0));
        System.out.println(listAngka.get(1));
        System.out.println(listAngka.get(2));
    }
    public int getPicknumber() {
    return picknumber;
    }

    public void setPicknumber(int picknumber) {
    this.picknumber = picknumber;
    }
    // public void cekList(){
    //         if(listAngka.isEmpty) 
    //     }  


    public void tampilkanHewanRandom(int pilihan){
        if(listAngka.isEmpty()){
            showfinalScore();
        }else{

            setPicknumber(listAngka.get(0));
            if(pilihan==1){
                    if(listAngka.contains(1)){
                        
                        showQuiz1();
                    }else{
                        tampilkanHewanRandom(getPicknumber());
                    }
        
            }else if(pilihan==2){
                if(listAngka.contains(2)){
                    
                    showQuiz2();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else if(pilihan==3){
                if(listAngka.contains(3)){
                    
                    showQuiz3();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else{
                tampilkanHewanRandom(getPicknumber());
            }
        }
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
        l1.setId("namaApp");

        Label l2 = new Label("3Rens");
        l2.setId("namaGroup");
        
        Label l3 = new Label("Masukkan Nama Anda ");
        l3.setId("labelMasuk");
        Button buttonLogin = new Button("Masuk");
        buttonLogin.setId("tombolMasuk");
        inputNama = new TextField();
        inputNama.setId("inputNama");
        
        buttonLogin.setOnAction(action -> {
            showMenuScene();
        });
        
        VBox vbox = new VBox(l1,l2, imgview,l3,inputNama,buttonLogin);
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
        buttonMG.setOnAction(action -> {
            tampilkanHewanRandom(getPicknumber());
        });
        
        Button buttonHome = new Button("Kembali");
        buttonHome.setId("tombolBack");
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
        kucingButton.setOnAction(action -> {
            showSceneKucing();
        });
        
        Button ayamButton = objAyam.TombolHewan("Ayam");
        ayamButton.setId("buttonAyam");
        ayamButton.setOnAction(action -> {
            showSceneAyam();
        });
        Button sapiButton = objSapi.TombolHewan("Sapi");
        sapiButton.setId("buttonSapi");
        sapiButton.setOnAction(action -> {
            showSceneSapi();
        });
    

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

        

        Button buttonHome = new Button("Kembali");
        buttonHome.setId("tombolBack2");
        buttonHome.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showMenuScene();
        });
        Button buttonNext = new Button("Next");
        buttonNext.setId("tombolNext");
        buttonNext.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList2();
        });

        VBox vbox = new VBox(l1,anjingButton,sapiButton,kucingButton,ayamButton);
        vbox.setId("latarScene3");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setSpacing(20);
        hbox.setTranslateY(160);
        hbox.getChildren().addAll(buttonHome,buttonNext);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showAnimalList2(){
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
        
        Animal objSinga = new Singa();
        Animal objMonyet = new Monyet();
        Animal objKambing = new Kambing();
        Animal objBabi = new Babi();
        
        Button singaButton = objSinga.TombolHewan("Singa");
        singaButton.setId("buttonSinga");
        singaButton.setOnAction(action -> {
            showSceneSinga();
        });

        Button monyetButton = objMonyet.TombolHewan("Monyet");
        monyetButton.setId("buttonMonyet");
        monyetButton.setOnAction(action -> {
            showSceneMonyet();
        });
        Button kambingButton = objKambing.TombolHewan("Kambing");
        kambingButton.setId("buttonKambing");
        kambingButton.setOnAction(action -> {
            showSceneKambing();
        });
        Button babiButton = objBabi.TombolHewan("Babi");
        babiButton.setId("buttonBabi");
        babiButton.setOnAction(action -> {
            showSceneBabi();
        });

        Image singaImage = objSinga.image("Singa.png");
        Image monyetImage = objMonyet.image("Monyet.jpg");
        Image kambingImage = objKambing.image("Kambing.png");
        Image BabiImage = objBabi.image("babi.png");


        ImageView imgViewSinga = objSinga.imageView(singaImage);
        imgViewSinga.setFitWidth(55);
        imgViewSinga.setFitHeight(55);
        imgViewSinga.setTranslateX(-20);
        singaButton.setGraphic(imgViewSinga);

        ImageView imgViewMonyet = objMonyet.imageView(monyetImage);
        imgViewMonyet.setFitWidth(55);
        imgViewMonyet.setFitHeight(55);
        imgViewMonyet.setTranslateX(-20);
        monyetButton.setGraphic(imgViewMonyet);
        
        ImageView imgViewKambing = objKambing.imageView(kambingImage);
        imgViewKambing.setFitWidth(55);
        imgViewKambing.setFitHeight(55);
        imgViewKambing.setTranslateX(-20);
        kambingButton.setGraphic(imgViewKambing);

        ImageView imgViewBabi = objBabi.imageView(BabiImage);
        imgViewBabi.setFitWidth(55);
        imgViewBabi.setFitHeight(55);
        imgViewBabi.setTranslateX(-20);
        babiButton.setGraphic(imgViewBabi);

        Button buttonHome = new Button("Kembali");
        buttonHome.setId("tombolBack2");
        buttonHome.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });

        VBox vbox = new VBox(l1,singaButton, monyetButton,kambingButton, babiButton);
        vbox.setId("latarScene3");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox();
        hbox.setSpacing(30);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setTranslateY(160);
        hbox.getChildren().addAll(buttonHome);
        vbox.setBackground(bg);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
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
        
        Anjing objAnjing = new Anjing();
        
        Label l1 = new Label("ANJING");
        l1.setId("judulAnjing");
        ImageView gambarAnjing = objAnjing.showImg();
        gambarAnjing.setId("showAnjingImage");
        
        
        Text desc = objAnjing.deskripsi();
        desc.setTextAlignment(TextAlignment.JUSTIFY);
        
        Button suaraAnjing = objAnjing.TombolSuara("Suara Anjing");
        suaraAnjing.setId("tombolSuaraAnjing");
        suaraAnjing.setOnAction(action ->{
            objAnjing.suara();
        } );
        Button buttonBack = new Button("Kembali");
        buttonBack.setId("tombolBackAnjing");
        buttonBack.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });
        VBox vbox = new VBox(l1,gambarAnjing,desc,suaraAnjing);
        vbox.setId("latarSceneAnjing");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(80);
        hbox.getChildren().addAll(buttonBack,suaraAnjing);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showSceneSapi() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Sapi objSapi = new Sapi();
        
        Label l1 = new Label("SAPI");
        l1.setId("judulSapi");
        ImageView gambarSapi = objSapi.showImg();
        gambarSapi.setId("showSapiImage");
        
        
        Text desc = objSapi.deskripsi();
        desc.setTextAlignment(TextAlignment.JUSTIFY);
        
        Button suaraSapi = objSapi.TombolSuara("Suara Sapi");
        suaraSapi.setId("tombolSuaraSapi");
        suaraSapi.setOnAction(action ->{
            objSapi.suara();
        } );
        Button buttonBack = new Button("Kembali");
        buttonBack.setId("tombolBackSapi");
        
        buttonBack.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });
        VBox vbox = new VBox(l1,gambarSapi,desc,suaraSapi);
        vbox.setId("latarSceneSapi");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(115);
        hbox.getChildren().addAll(buttonBack,suaraSapi);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showSceneKucing() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Kucing objKucing = new Kucing();
        
        Label l1 = new Label("KUCING");
        l1.setId("judulKucing");
        ImageView gambarKucing = objKucing.showImg();
        gambarKucing.setId("showKucingImage");
        
        
        Text desc = objKucing.deskripsi();
        desc.setTextAlignment(TextAlignment.JUSTIFY);
        
        Button suaraKucing = objKucing.TombolSuara("Suara Kucing");
        suaraKucing.setId("tombolSuaraKucing");
        suaraKucing.setOnAction(action ->{
            objKucing.suara();
        } );
        Button buttonBack = new Button("Kembali");
        buttonBack.setId("tombolBackKucing");
        
        buttonBack.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });
        VBox vbox = new VBox(l1,gambarKucing,desc,suaraKucing);
        vbox.setId("latarSceneKucing");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(110);
        hbox.getChildren().addAll(buttonBack,suaraKucing);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showSceneAyam() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Ayam objAyam = new Ayam();
        
        Label l1 = new Label("Ayam");
        l1.setId("judulAyam");
        ImageView gambarAyam = objAyam.showImg();
        gambarAyam.setId("showAyamImage");
        
        
        Text desc = objAyam.deskripsi();
        desc.setTextAlignment(TextAlignment.JUSTIFY);
        
        Button suaraAyam = objAyam.TombolSuara("Suara Ayam");
        suaraAyam.setId("tombolSuaraAyam");
        suaraAyam.setOnAction(action ->{
            objAyam.suara();
        } );
        Button buttonBack = new Button("Kembali");
        buttonBack.setId("tombolBackAyam");
        
        buttonBack.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });
        VBox vbox = new VBox(l1,gambarAyam,desc,suaraAyam);
        vbox.setId("latarSceneAyam");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(120);
        hbox.getChildren().addAll(buttonBack,suaraAyam);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showSceneSinga() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Singa objSinga = new Singa();
        
        Label l1 = new Label("SINGA");
        l1.setId("judulSinga");
        ImageView gambarSinga = objSinga.showImg();
        gambarSinga.setId("showSingaImage");
        
        
        Text desc = objSinga.deskripsi();
        desc.setTextAlignment(TextAlignment.JUSTIFY);
        
        Button suaraSinga = objSinga.TombolSuara("Suara Singa");
        suaraSinga.setId("tombolSuaraSinga");
        suaraSinga.setOnAction(action ->{
            objSinga.suara();
        } );
        Button buttonBack = new Button("Kembali");
        buttonBack.setId("tombolBackSinga");
        
        buttonBack.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });
        VBox vbox = new VBox(l1,gambarSinga,desc,suaraSinga);
        vbox.setId("latarSceneSinga");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(115);
        hbox.getChildren().addAll(buttonBack,suaraSinga);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }

    public void showSceneMonyet() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Monyet objMonyet = new Monyet();
        
        Label l1 = new Label("Monyet");
        l1.setId("judulMonyet");
        ImageView gambarMonyet = objMonyet.showImg();
        gambarMonyet.setId("showMonyetImage");
        
        
        Text desc = objMonyet.deskripsi();
        desc.setTextAlignment(TextAlignment.JUSTIFY);
        
        Button suaraMonyet = objMonyet.TombolSuara("Suara Monyet");
        suaraMonyet.setId("tombolSuaraMonyet");
        suaraMonyet.setOnAction(action ->{
            objMonyet.suara();
        } );
        Button buttonBack = new Button("Kembali");
        buttonBack.setId("tombolBackMonyet");
        
        buttonBack.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });
        VBox vbox = new VBox(l1,gambarMonyet,desc,suaraMonyet);
        vbox.setId("latarSceneMonyet");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(115);
        hbox.getChildren().addAll(buttonBack,suaraMonyet);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }

    public void showSceneKambing() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Kambing objKambing = new Kambing();
        Label l1 = new Label("Kambing");
        l1.setId("judulKambing");
        ImageView gambarKambing = objKambing.showImg();
        gambarKambing.setId("showKambingImage");
        
        
        Text desc = objKambing.deskripsi();
        desc.setTextAlignment(TextAlignment.JUSTIFY);
        
        Button suaraKambing = objKambing.TombolSuara("Suara Kambing");
        suaraKambing.setId("tombolSuaraKambing");
        suaraKambing.setOnAction(action ->{
            objKambing.suara();
        } );
        Button buttonBack = new Button("Kembali");
        buttonBack.setId("tombolBackKambing");
        
        buttonBack.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });
        VBox vbox = new VBox(l1,gambarKambing,desc,suaraKambing);
        vbox.setId("latarSceneKambing");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(80);
        hbox.getChildren().addAll(buttonBack,suaraKambing);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
        stage.show();
    }

    public void showSceneBabi() {
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Babi objBabi = new Babi();
        
        Label l1 = new Label("Babi");
        l1.setId("judulBabi");
        ImageView gambarBabi = objBabi.showImg();
        gambarBabi.setId("showBabiImage");
        
        
        Text desc = objBabi.deskripsi();
        desc.setTextAlignment(TextAlignment.JUSTIFY);
        
        Button suaraBabi = objBabi.TombolSuara("Suara Babi");
        suaraBabi.setId("tombolSuaraBabi");
        suaraBabi.setOnAction(action ->{
            objBabi.suara();
        } );
        Button buttonBack = new Button("Kembali");
        buttonBack.setId("tombolBackBabi");
        
        buttonBack.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });
        VBox vbox = new VBox(l1,gambarBabi,desc,suaraBabi);
        vbox.setId("latarSceneBabi");
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(120);
        hbox.getChildren().addAll(buttonBack,suaraBabi);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showQuiz1(){
        listAngka.remove(0);
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Anjing objAnjing = new Anjing();
        
        Label l1 = new Label("NAMA HEWAN APA PADA GAMBAR ?");
        l1.setId("judulQuiz1");
        ImageView imgQuiz1 = objAnjing.showImgQuiz();
        imgQuiz1.setId("imgQuiz1");
        imgQuiz1.setFitHeight(200);
        imgQuiz1.setFitWidth(300);
    
        score = new Label("Score : "+ubahString+"/5");
        score.setId("score");
        Label ketJawaban = new Label("");
        ketJawaban.setId("ketJawaban");
        
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz1");
        nextButtonQuiz.setOnAction(action ->{
            tampilkanHewanRandom(getPicknumber());
        } );
    
        Button option1 = new Button("Anjing");
        Button option2 = new Button("Kucing");
        option1.setId("option1Quiz1");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            tambahScore +=1;
            ubahString = Integer.toString(tambahScore);
            ketJawaban.setText("BENAR");
            score.setText("Score : "+ ubahString+"/5");
        } );
        option2.setId("option2Quiz2");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            ubahString = Integer.toString(tambahScore);
            ketJawaban.setText("SALAH");
            score.setText("Score : "+ ubahString+"/5");
        } );
        
        VBox vbox = new VBox(score,l1,imgQuiz1,ketJawaban);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setId("latarSceneAyam");
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(130);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(100);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showQuiz2(){
        listAngka.remove(0);
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Kucing objKucing = new Kucing();
        
        Label l1 = new Label("NAMA HEWAN APA PADA GAMBAR ?");
        l1.setId("judulQuiz2");
        ImageView imgQuiz2 = objKucing.showImgQuiz();
        imgQuiz2.setId("imgQuiz1");
        imgQuiz2.setFitHeight(200);
        imgQuiz2.setFitWidth(300);
    
        score = new Label("Score : "+ubahString+"/5");
        score.setId("score");
        Label ketJawaban = new Label("");
        ketJawaban.setId("ketJawaban");
        
        Button nextButtonQuiz = objKucing.TombolHewan("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz2");
        nextButtonQuiz.setOnAction(action ->{
            tampilkanHewanRandom(getPicknumber());
        } );
    
        Button option1 = new Button("Kambing");
        Button option2 = new Button("Kucing");
        option1.setId("option2Quiz2");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            ubahString = Integer.toString(tambahScore);
            ketJawaban.setText("SALAH");
            score.setText("Score : "+ ubahString+"/5");
        } );
        option2.setId("option2Quiz2");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            tambahScore +=1;
            ubahString = Integer.toString(tambahScore);
            ketJawaban.setText("BENAR");
            score.setText("Score : "+ ubahString+"/5");
        } );
        
        VBox vbox = new VBox(score,l1,imgQuiz2,ketJawaban);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setId("latarSceneKucing");
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(130);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(100);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showQuiz3(){
        listAngka.remove(0);
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        Ayam objAyam = new Ayam();
        
        Label l1 = new Label("NAMA HEWAN APA PADA GAMBAR ?");
        l1.setId("judulQuiz3");
        ImageView imgQuiz3 = objAyam.showImgQuiz();
        imgQuiz3.setId("imgQuiz3");
        imgQuiz3.setFitHeight(200);
        imgQuiz3.setFitWidth(300);
    
        score = new Label("Score : "+ubahString+"/5");
        score.setId("score");
        Label ketJawaban = new Label("");
        ketJawaban.setId("ketJawaban");
        
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQui3");
        nextButtonQuiz.setOnAction(action ->{
            tampilkanHewanRandom(getPicknumber());
        } );
    
        Button option1 = new Button("Ayam");
        Button option2 = new Button("Sapi");
        option1.setId("option1Quiz3");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            tambahScore +=1;
            ubahString = Integer.toString(tambahScore);
            ketJawaban.setText("BENAR");
            score.setText("Score : "+ ubahString+"/5");
        } );
        option2.setId("option2Quiz3");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            ubahString = Integer.toString(tambahScore);
            ketJawaban.setText("SALAH");
            score.setText("Score : "+ ubahString+"/5");
        } );
        
        VBox vbox = new VBox(score,l1,imgQuiz3,ketJawaban);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setId("latarSceneAyam");
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(130);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(100);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showfinalScore(){
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, true)
        );
        Background bg = new Background(bgIMG);
        
        
        Label l1 = new Label("HASIL SCORE " +inputNama.getText());
        Label l2 = new Label(ubahString);
        l1.setId("resultScore");
        // ImageView imgQuiz3 = objAyam.showImgQuiz();
        // imgQuiz3.setId("imgQuiz3");
        // imgQuiz3.setFitHeight(200);
        // imgQuiz3.setFitWidth(300);
    
        
        
        VBox vbox = new VBox(l1,l2);
        vbox.setId("latarSceneFinalScore");
        vbox.setAlignment(Pos.TOP_CENTER);
        // HBox hbox = new HBox(10);
        // hbox.setAlignment(Pos.CENTER);
        // hbox.setSpacing(30);
        // hbox.setTranslateY(100);
        // hbox.getChildren().addAll(option1,option2);
        // VBox root = new VBox(vbox,hbox,vbox2);
        vbox.setBackground(bg);
        Scene scene2 = new Scene(vbox, 360, 650);
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