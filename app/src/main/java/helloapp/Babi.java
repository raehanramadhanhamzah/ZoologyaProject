package helloapp;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Babi extends Animal{
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
        textDesc = new Text("Babi adalah hewan mamalia yang termasuk dalam keluarga Suidae dan genus Sus. Babi juga memiliki tubuh yang besar dengan bentuk yang bulat dan berotot. Babi memiliki kepala yang besar dengan ciri khas seperti moncong yang panjang dan hidung yang mencolok.Kulit babi ditutupi oleh rambut pendek dan kasar yang seringkali berwarna cokelat, hitam, atau belang-belang.Babi adalah hewan omnivora yang berarti mereka dapat memakan berbagai jenis makanan.Babi dapat hidup di berbagai habitat.");
        textDesc.setWrappingWidth(300);
        textDesc.setId("descBabi");
        return textDesc;
        
    }

    @Override
    public void suara() {
        path = "sound/suaraBabi.mp3";
        media = new Media(new File(path).toURI().toString());
        mediaplayer = new MediaPlayer(media);
        mediaplayer.play();
    }

    @Override
    public ImageView showImg() {
        showImg = new Image("imgBabi.jpg");
        imgview = new ImageView(showImg);
        imgview.setFitHeight(200);
        imgview.setFitWidth(300);
        return imgview;
    }

    @Override
    public ImageView showImgQuiz() {
        showImg = new Image("Bab.jpg");
        imgview = new ImageView(showImg);
        imgview.setFitHeight(200);
        imgview.setFitWidth(300);
        return imgview;
    }

    @Override
    public void suaraQuiz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'suaraQuiz'");
    }
    

}
