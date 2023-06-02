package helloapp;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Sapi extends Animal{
    // Encapsulasi
    private String path; 
    private Media media;
    private String fileNameSuara;
    private Text textDesc;
    private MediaPlayer mediaPlayer;
    private Image showImg;
    private ImageView imgView;
    public String getFileNameSuara() {
        return fileNameSuara;
    }

    public void setFileNameSuara(String fileNameSuara) {
        this.fileNameSuara = fileNameSuara;
    }
    @Override
    public  Text deskripsi() {
        textDesc = new Text("Sapi adalah hewan ternak penting dengan tubuh besar, bulu cokelat atau hitam, dan tanduk pada kepala. Mereka adalah herbivora yang memakan tumbuhan dan memberikan manfaat berupa daging, susu, dan kulit. Selain itu, sapi juga memiliki nilai budaya dan digunakan dalam pertanian dan transportasi tradisional. Perawatan yang baik sangat penting untuk menjaga kesehatan dan produktivitas sapi, termasuk pemenuhan nutrisi yang tepat, perawatan kesehatan yang rutin, dan lingkungan yang aman dan nyaman");
        textDesc.setWrappingWidth(300);
        textDesc.setId("descSapi");
        return textDesc;
        
    }

    @Override
    public void suara() {
        path = "sound/suaraSapi.mp3";
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    @Override
    public ImageView showImg() {
        showImg = new Image("imgSapi.jpg");
        imgView = new ImageView(showImg);
        imgView.setFitHeight(200);
        imgView.setFitWidth(300);
        return imgView;
    }

    @Override
    public ImageView showImgQuiz() {
        showImg = new Image("Sepi.jpg");
        imgView = new ImageView(showImg);
        imgView.setFitHeight(200);
        imgView.setFitWidth(300);
        return imgView;
    }

}
