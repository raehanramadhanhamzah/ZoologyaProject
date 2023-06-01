package helloapp;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Kucing extends Animal{
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
        Text textDesc = new Text("Kucing adalah hewan peliharaan yang populer di seluruh dunia. Mereka memiliki tubuh kecil hingga sedang, dengan bulu yang beragam warna dan pola. Kucing dikenal dengan keanggunan dan kelembutan mereka. Mereka adalah hewan karnivora yang secara alami memakan daging. Kucing memiliki indera pendengaran yang sangat tajam dan kemampuan melompat yang luar biasa. Mereka adalah hewan yang mandiri namun juga bisa menjadi teman setia bagi pemiliknya.");
        textDesc.setWrappingWidth(300);
        textDesc.setId("descKucing");
        return textDesc;
        
    }

    @Override
    public void suara() {
        path = "sound/suaraKucing.mp3";
         media = new Media(new File(path).toURI().toString());
         mediaplayer = new MediaPlayer(media);
        mediaplayer.play();
    }

    @Override
    public ImageView showImg() {
        showImg = new Image("imgKucing.jpg");
        imgview = new ImageView(showImg);
        imgview.setFitHeight(200);
        imgview.setFitWidth(300);
        return imgview;
    }

}
