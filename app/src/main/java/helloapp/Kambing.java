package helloapp;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Kambing extends Animal{
    // Encapsulasi
    private String path; 
    private Image showImg;
    private MediaPlayer mediaplayer;
    private Media media;
    private String fileNameSuara;
    private ImageView imgview;
    public String getFileNameSuara() {
        return fileNameSuara;
    }

    public void setFileNameSuara(String fileNameSuara) {
        this.fileNameSuara = fileNameSuara;
    }
    @Override
    public  Text deskripsi() {
        Text textDesc = new Text("Kambing adalah hewan mamalia yang termasuk dalam keluarga Bovidae dan genus Capra. Kambing memiliki tubuh yang relatif kecil hingga sedang dengan struktur tubuh yang proporsional.Kambing memiliki kepala yang proporsional dengan tubuhnya.Bulu kambing bervariasi dalam panjang, tekstur, dan warna tergantung pada rasnya. Kambing adalah hewan yang cerdas, aktif, dan penyesuaian yang baik. Kambing adalah hewan herbivora yang memakan berbagai jenis tumbuhan. Kambing dapat hidup di berbagai jenis lingkungan");
        textDesc.setWrappingWidth(300);
        textDesc.setId("descKambing");
        return textDesc;
        
    }

    @Override
    public void suara() {
        path = "sound/suaraKambing.mp3";
         media = new Media(new File(path).toURI().toString());
         mediaplayer = new MediaPlayer(media);
        mediaplayer.play();
    }

    @Override
    public ImageView showImg() {
        showImg = new Image("imgKambing.jpg");
        imgview = new ImageView(showImg);
        imgview.setFitHeight(200);
        imgview.setFitWidth(300);
        return imgview;
    }

    @Override
    public ImageView showImgQuiz() {
        showImg = new Image("Kmbing.jpg");
        imgview = new ImageView(showImg);
        imgview.setFitHeight(200);
        imgview.setFitWidth(300);
        return imgview;
    }

}

