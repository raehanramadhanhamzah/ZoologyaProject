package helloapp;
import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.application.Platform;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

class showScene{
    private Stage stage;
    ArrayList<Integer> listNoQuiz = new ArrayList<>();
    private int score;
    private Label labelScore;
    private int picknumber;
    private TextField inputNama;
    private int waktu ;
    
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    public int getPicknumber() {
    return picknumber;
    }
    
    public void setPicknumber(int picknumber) {
    this.picknumber = picknumber;
}

public showScene(Stage stage) {
    this.stage = stage;
    stage.setTitle("Zoologya");
    listNoQuiz.add(1);
    listNoQuiz.add(2);
    listNoQuiz.add(3);
    listNoQuiz.add(4);
    listNoQuiz.add(5);
    listNoQuiz.add(6);
    listNoQuiz.add(7);
    listNoQuiz.add(8);
    listNoQuiz.add(9);
    listNoQuiz.add(10);
    Collections.shuffle(listNoQuiz);
    setPicknumber(listNoQuiz.get(0));
}

    public void tampilkanHewanRandom(int pilihan){
        if(listNoQuiz.isEmpty()){
            showfinalScore();
        }else{
            setPicknumber(listNoQuiz.get(0));
            if(pilihan==1){
                    if(listNoQuiz.contains(1)){
                        
                        showQuiz1();
                    }else{
                        tampilkanHewanRandom(getPicknumber());
                    }
        
            }else if(pilihan==2){
                if(listNoQuiz.contains(2)){
                    
                    showQuiz2();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else if(pilihan==3){
                if(listNoQuiz.contains(3)){
                    
                    showQuiz3();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else if(pilihan==4){
                if(listNoQuiz.contains(4)){
                    
                    showQuiz4();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else if(pilihan==5){
                if(listNoQuiz.contains(5)){
                    
                    showQuiz5();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else if(pilihan==6){
                if(listNoQuiz.contains(6)){
                    
                    showQuiz6();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else if(pilihan==7){
                if(listNoQuiz.contains(7)){
                    
                    showQuiz7();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else if(pilihan==8){
                if(listNoQuiz.contains(8)){
                    
                    showQuiz8();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else if(pilihan==9){
                if(listNoQuiz.contains(9)){
                    
                    showQuiz9();
                }else{
                    tampilkanHewanRandom(getPicknumber());
                }
            }else if(pilihan==10){
                if(listNoQuiz.contains(10)){
                    
                    showQuiz10();
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
        Button buttonMasuk = new Button("Masuk");
        buttonMasuk.setId("tombolMasuk");
        inputNama = new TextField();
        inputNama.setId("inputNama");
        
        buttonMasuk.setOnAction(action -> {
            if(inputNama.getText().isEmpty()){
                l3.setText("Masukan Nama Terlebih Dahulu");
                l3.setTextFill(Color.rgb(210, 40, 40));
            }else if(inputNama.getText().length() > 10){
                l3.setText("Maksimal 10 huruf");
                l3.setTextFill(Color.rgb(210, 40, 40));
            }else{
                showMenuScene();
            }
        });
        
        VBox vbox = new VBox(l1,l2, imgview,l3,inputNama,buttonMasuk);
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
        imgViewSapi.setTranslateX(-30);
        sapiButton.setGraphic(imgViewSapi);
        
        ImageView imgViewAyam = objAyam.imageView(ayamImage);
        imgViewAyam.setFitWidth(55);
        imgViewAyam.setFitHeight(55);
        imgViewAyam.setTranslateX(-25);
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
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setSpacing(20);
        hbox.setTranslateY(170);
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
        imgViewMonyet.setTranslateX(-10);
        monyetButton.setGraphic(imgViewMonyet);
        
        ImageView imgViewKambing = objKambing.imageView(kambingImage);
        imgViewKambing.setFitWidth(55);
        imgViewKambing.setFitHeight(55);
        imgViewKambing.setTranslateX(-3);
        kambingButton.setGraphic(imgViewKambing);

        ImageView imgViewBabi = objBabi.imageView(BabiImage);
        imgViewBabi.setFitWidth(55);
        imgViewBabi.setFitHeight(55);
        imgViewBabi.setTranslateX(-25);
        babiButton.setGraphic(imgViewBabi);

        Button buttonHome = new Button("Kembali");
        buttonHome.setId("tombolBack2");
        buttonHome.setOnAction(action -> {
            showScene show = new showScene(stage);
            show.showAnimalList();
        });

        VBox vbox = new VBox(l1,singaButton, monyetButton,kambingButton, babiButton);
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox();
        hbox.setSpacing(30);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setTranslateY(170);
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
        vbox.setAlignment(Pos.TOP_CENTER);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(95);
        hbox.getChildren().addAll(buttonBack,suaraBabi);
        VBox root = new VBox(vbox,hbox);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showQuiz1(){
        listNoQuiz.remove(0);
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
        
        Label l1 = new Label("Apa Nama Hewan Pada \nGambar Tersebut ?");
        l1.setId("soalQuiz");
        ImageView imgQuiz1 = objAnjing.showImgQuiz();
        imgQuiz1.setId("imgQuiz");
        imgQuiz1.setFitHeight(200);
        imgQuiz1.setFitWidth(300);
    
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");
    
        Button option1 = new Button("Anjing");
        Button option2 = new Button("Kucing");
        option1.setId("optionQuiz");
        option2.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            score +=1;
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );

        Label timerLabel = new Label();
        timerLabel.setId("timerLabel");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz");
        nextButtonQuiz.setOnAction(action ->{
            timerThread.interrupt();
            tampilkanHewanRandom(getPicknumber());
        } );
        VBox vbox = new VBox(labelScore,imgQuiz1,l1,timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(180);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(160);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showQuiz2(){
        listNoQuiz.remove(0);
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
        
        Label l1 = new Label("Nama Hewan Pada Gambar Adalah ?");
        l1.setId("soalQuiz");
        ImageView imgQuiz2 = objKucing.showImgQuiz();
        imgQuiz2.setId("imgQuiz");
        imgQuiz2.setFitHeight(200);
        imgQuiz2.setFitWidth(300);
    
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");
        
        
        Button option1 = new Button("Kambing");
        Button option2 = new Button("Kucing");
        option1.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            score +=1;
            labelScore.setText("Score : "+ score+"/10");
        } );

        Label timerLabel = new Label();
        timerLabel.setId("timerLabel");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        
        Button nextButtonQuiz = objKucing.TombolHewan("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz");
        nextButtonQuiz.setOnAction(action ->{
            timerThread.interrupt();
            tampilkanHewanRandom(getPicknumber());
        } );
        VBox vbox = new VBox(labelScore,imgQuiz2,l1,timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(200);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(180);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showQuiz3(){
        listNoQuiz.remove(0);
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
        
        Label l1 = new Label("Apa Nama Hewan Diatas ?");
        l1.setId("soalQuiz");
        ImageView imgQuiz3 = objAyam.showImgQuiz();
        imgQuiz3.setId("imgQuiz");
        imgQuiz3.setFitHeight(200);
        imgQuiz3.setFitWidth(300);
    
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");
        
        
        Button option1 = new Button("Ayam");
        Button option2 = new Button("Sapi");
        option1.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            score +=1;
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );

        Label timerLabel = new Label();
        timerLabel.setId("timerLabel");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        
            Button nextButtonQuiz = new Button("Selanjutnya");
            nextButtonQuiz.setId("nextButtonQuiz");
            nextButtonQuiz.setOnAction(action ->{
                timerThread.interrupt();
                tampilkanHewanRandom(getPicknumber());
            } );
        VBox vbox = new VBox(labelScore,imgQuiz3,l1,timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(200);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(180);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }
    public void showQuiz4(){
        listNoQuiz.remove(0);
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
        
        Label l1 = new Label("Tebak Nama Hewan Pada Gambar \ndi Atas ?");
        l1.setId("soalQuiz");
        l1.setAlignment(Pos.CENTER);
        ImageView imgQuiz4 = objBabi.showImgQuiz();
        imgQuiz4.setId("imgQuiz");
        imgQuiz4.setFitHeight(200);
        imgQuiz4.setFitWidth(300);
    
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");

        Button option1 = new Button("Babi");
        Button option2 = new Button("Angsa");
        option1.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            score +=1;
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );

        Label timerLabel = new Label();
        timerLabel.setId("timerLabel");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz");
        nextButtonQuiz.setOnAction(action ->{
            timerThread.interrupt();
            tampilkanHewanRandom(getPicknumber());
        } );
        VBox vbox = new VBox(labelScore,imgQuiz4,l1, timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(170);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(150);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }

    public void showQuiz5(){
        listNoQuiz.remove(0);
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
        
        Label l1 = new Label("Tebak Nama Hewan Pada Gambar \ndi Atas ?");
        l1.setId("soalQuiz");
        l1.setAlignment(Pos.CENTER);
        ImageView imgQuiz5 = objKambing.showImgQuiz();
        imgQuiz5.setId("imgQuiz");
        imgQuiz5.setFitHeight(200);
        imgQuiz5.setFitWidth(300);
    
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");
        
        Button option1 = new Button("Babi");
        Button option2 = new Button("Kambing");
        option1.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            score +=1;
            labelScore.setText("Score : "+ score+"/10");
        } );

        Label timerLabel = new Label();
        timerLabel.setId("timerLabel");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz");
        nextButtonQuiz.setOnAction(action ->{
            timerThread.interrupt();
            tampilkanHewanRandom(getPicknumber());
        } );
    
        VBox vbox = new VBox(labelScore,imgQuiz5,l1, timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(170);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(160);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }

    public void showQuiz6(){
        listNoQuiz.remove(0);
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
        
        Label l1 = new Label("Nama Hewan Apa Pada Gambar ?");
        l1.setId("soalQuiz");
        ImageView imgQuiz6 = objMonyet.showImgQuiz();
        imgQuiz6.setId("imgQuiz");
        imgQuiz6.setFitHeight(200);
        imgQuiz6.setFitWidth(300);
    
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");
        
        
        Button option1 = new Button("Monyet");
        Button option2 = new Button("Kerbau");
        option1.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            score +=1;
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );

        Label timerLabel = new Label();
        timerLabel.setId("timerLabel");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz");
        nextButtonQuiz.setOnAction(action ->{
            timerThread.interrupt();
            tampilkanHewanRandom(getPicknumber());
        } );
        
        VBox vbox = new VBox(labelScore,imgQuiz6,l1,timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(200);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(180);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }

    public void showQuiz7(){
        listNoQuiz.remove(0);
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
        
        Label l1 = new Label("Apa Nama Hewan Pada \nFoto Diatas ?");
        l1.setId("soalQuiz");
        ImageView imgQuiz7 = objSapi.showImgQuiz();
        imgQuiz7.setId("imgQuiz");
        imgQuiz7.setFitHeight(200);
        imgQuiz7.setFitWidth(300);
    
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");
        
        
        Button option1 = new Button("Sapi");
        Button option2 = new Button("Zebra");
        option1.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            score +=1;
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );

        Label timerLabel = new Label();
        timerLabel.setId("timerLabel");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz");
        nextButtonQuiz.setOnAction(action ->{
            timerThread.interrupt();
            tampilkanHewanRandom(getPicknumber());
        } );
        
        VBox vbox = new VBox(labelScore,imgQuiz7,l1,timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setTranslateY(picknumber);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(180);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(160);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }

    public void showQuiz8(){
        listNoQuiz.remove(0);
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
        
        Label l1 = new Label("Dari Ciri-Ciri Diatas, \nHewan Apakah Yang Dimaksud ?");
        l1.setId("soalQuiz");
        ImageView imgQuiz8 = objSinga.showImgQuiz();
        imgQuiz8.setId("imgQuiz");
        imgQuiz8.setFitHeight(200);
        imgQuiz8.setFitWidth(300);
    
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");
        
        
        Button option1 = new Button("Singa");
        Button option2 = new Button("Harimau");
        option1.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            score +=1;
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz");
        option2.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );
        
        Label timerLabel = new Label();
        timerLabel.setId("timerLabel");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz");
        nextButtonQuiz.setOnAction(action ->{
            timerThread.interrupt();
            tampilkanHewanRandom(getPicknumber());
        } );

        VBox vbox = new VBox(labelScore,imgQuiz8,l1,timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setTranslateY(170);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.setTranslateY(150);
        hbox.getChildren().addAll(option1,option2);
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
    
        stage.show();
    }

    public void showQuiz9(){
        listNoQuiz.remove(0);
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true,
    true)
        );
        Background bg = new Background(bgIMG);
        
        Sapi objSapi = new Sapi();
        
        Label l1 = new Label("Suara Hewan Apakah Ini ?");
        l1.setId("soalQuiz9");
        Button suaraSapi = objSapi.TombolSuara("TOMBOL SUARA");
        suaraSapi.setId("tombolSuaraSapiQuiz");
        suaraSapi.setOnAction(action ->{
            objSapi.suaraQuiz();
        } );
        
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");
        
        Button option1 = new Button("Kambing");
        Button option2 = new Button("Sapi");
        option1.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz9");
        option2.setOnAction(action ->{
            score +=1;
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );
        
        Label timerLabel = new Label();
        timerLabel.setId("timerLabel9");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz");
        nextButtonQuiz.setOnAction(action ->{
            timerThread.interrupt();
            tampilkanHewanRandom(getPicknumber());
        } );
        VBox vbox = new VBox(labelScore,suaraSapi,l1,timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setId("vboxQuiz9");
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.getChildren().addAll(option1,option2);
        hbox.setId("hboxQuiz9");
        VBox root = new VBox(vbox,hbox,vbox2);
        root.setBackground(bg);
        Scene scene2 = new Scene(root, 360, 650);
        scene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        stage.setScene(scene2);
        
        stage.show();
    }
    public void showQuiz10(){
        listNoQuiz.remove(0);
        Image img = new Image("backgroundAPP.jpg");
        BackgroundImage bgIMG = new BackgroundImage(
            img,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true,
    true)
        );
        Background bg = new Background(bgIMG);
        
        Singa objSinga = new Singa();
        
        Label l1 = new Label("Suara Hewan Apakah Ini ?");
        l1.setId("soalQuiz10");
        Button suaraSinga = objSinga.TombolSuara("TOMBOL SUARA");
        suaraSinga.setId("tombolSuaraSingaQuiz");
        suaraSinga.setOnAction(action ->{
            objSinga.suaraQuiz();
        } );
        
        labelScore = new Label("Score : "+score+"/10");
        labelScore.setId("labelScore");
        
        
        Button option1 = new Button("Kucing");
        Button option2 = new Button("Singa");
        option1.setId("optionQuiz");
        option1.setOnAction(action ->{
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );
        option2.setId("optionQuiz");
        option2.setOnAction(action ->{
            score +=1;
            option1.setDisable(true);
            option2.setDisable(true);
            labelScore.setText("Score : "+ score+"/10");
        } );
        
        Label timerLabel = new Label();
        timerLabel.setId("timerLabel10");
        Thread timerThread = new Thread(() -> {
            try {
                setWaktu(10);
                while (waktu > 0) {
                    Platform.runLater(() -> timerLabel.setText("Waktu tersisa: " + waktu));
                    Thread.sleep(1000);
                    waktu--;
                }
                Platform.runLater(() -> timerLabel.setText("Waktu Habis!"));
                option1.setDisable(true);
                option2.setDisable(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        timerThread.start();
        Button nextButtonQuiz = new Button("Selanjutnya");
        nextButtonQuiz.setId("nextButtonQuiz");
        nextButtonQuiz.setOnAction(action ->{
            timerThread.interrupt();
            tampilkanHewanRandom(getPicknumber());
        } );
        VBox vbox = new VBox(labelScore,suaraSinga,l1,timerLabel);
        VBox vbox2 = new VBox(nextButtonQuiz);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        vbox2.setId("vboxQuiz10");
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(30);
        hbox.getChildren().addAll(option1,option2);
        hbox.setId("hboxQuiz10");
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
            
            
            Label l1 = new Label("HASIL SCORE \n" +inputNama.getText().toUpperCase());
            Label l2 = new Label(score+"/10");
            Label l3 = new Label();
            l1.setId("textHasilScore");
            l1.setTextAlignment(TextAlignment.CENTER);
            l2.setId("angkaScore");
            l3.setId("komentarScore");
            if(score>7){
                l3.setText("Bagus Sekali");
            }else if (score<5){
                l3.setText("Belajar Lagi Yaa");
            }else{
                l3.setText("Cukup Bagus");
            }
            Button homeButtonQuiz = new Button("Beranda");
            homeButtonQuiz.setId("homeButtonQuiz");
            homeButtonQuiz.setOnAction(action ->{
                listNoQuiz.add(1);
                listNoQuiz.add(2);
                listNoQuiz.add(3);
                listNoQuiz.add(4);
                listNoQuiz.add(5);
                listNoQuiz.add(6);
                listNoQuiz.add(7);
                listNoQuiz.add(8);
                listNoQuiz.add(9);
                listNoQuiz.add(10);
                Collections.shuffle(listNoQuiz);
                setScore(0);
                showHomeScene();
            } );
            
            
            VBox vbox = new VBox(l1,l2,l3,homeButtonQuiz);
            vbox.setAlignment(Pos.CENTER);
            vbox.setSpacing(12);
            
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
