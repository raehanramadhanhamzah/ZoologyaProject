package helloapp;

import java.io.File;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Sapi extends Animal{
    private String path; 
    private MediaPlayer mediaplayer;
    private Media media;
    // Encapsulasi
    private String fileNameSuara;
    public String getFileNameSuara() {
        return fileNameSuara;
    }

    public void setFileNameSuara(String fileNameSuara) {
        this.fileNameSuara = fileNameSuara;
    }
    @Override
    public  Text deskripsi() {
        Text textDesc = new Text("Sapi adalah hewan ternak penting dengan tubuh besar, bulu cokelat atau hitam, dan tanduk pada kepala. Mereka adalah herbivora yang memakan tumbuhan dan memberikan manfaat berupa daging, susu, dan kulit. Selain itu, sapi juga memiliki nilai budaya dan digunakan dalam pertanian dan transportasi tradisional. Perawatan yang baik sangat penting untuk menjaga kesehatan dan produktivitas sapi, termasuk pemenuhan nutrisi yang tepat, perawatan kesehatan yang rutin, dan lingkungan yang aman dan nyaman");
        textDesc.setWrappingWidth(300);
        textDesc.setId("descSapi");
        return textDesc;
        
    }

    @Override
    public void suara() {
        String path = "C:/Zoologya/app/src/main/resources/suaraSapi.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaplayer = new MediaPlayer(media);
        mediaplayer.play();
    }

    @Override
    public ImageView showImg() {
        Image showImg = new Image("imgSapi.jpg");
        ImageView imgview = new ImageView(showImg);
        imgview.setFitHeight(200);
        imgview.setFitWidth(300);
        return imgview;
    }

}
