package helloapp;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Ayam extends Animal{
    // Encapsulasi
    private String path; 
    private Image showImg;
    private MediaPlayer mediaplayer;
    private Media media;
    private String fileNameSuara;
    private ImageView imgview;
    private Text textDesc;
    public String getFileNameSuara() {
        return fileNameSuara;
    }

    public void setFileNameSuara(String fileNameSuara) {
        this.fileNameSuara = fileNameSuara;
    }
    @Override
    public  Text deskripsi() {
        textDesc = new Text("Ayam adalah hewan unggas yang sering dipelihara sebagai ternak. Mereka memiliki tubuh kecil hingga sedang dengan bulu yang beragam warna dan pola, tergantung pada jenisnya. Ayam biasanya memiliki paruh pendek, sayap yang kuat, dan kaki bersisik. Mereka adalah hewan oviparous yang menghasilkan telur yang sering dikonsumsi oleh manusia. Ayam juga dapat memberikan daging yang menjadi sumber protein yang penting dalam makanan manusia.");
        textDesc.setWrappingWidth(300);
        textDesc.setId("descAyam");
        return textDesc;
        
    }

    @Override
    public void suara() {
        path = "sound/suaraAyam.mp3";
        media = new Media(new File(path).toURI().toString());
        mediaplayer = new MediaPlayer(media);
        mediaplayer.play();
    }

    @Override
    public ImageView showImg() {
        showImg = new Image("imgAyam.jpg");
        imgview = new ImageView(showImg);
        imgview.setFitHeight(200);
        imgview.setFitWidth(300);
        return imgview;
    }

}
