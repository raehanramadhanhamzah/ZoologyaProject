package helloapp;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Anjing extends Animal{
    // Encapsulasi
    private String path; 
    private MediaPlayer mediaplayer;
    private Media media;
    private String fileNameSuara;
    private Image showImg;
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
        textDesc = new Text("Anjing adalah hewan peliharaan yang paling umum dan terkenal di dunia.\nMereka adalah anggota keluarga Canidae dan merupakan keturunan dari serigala.\nAnjing telah hidup berdampingan dengan manusia selama ribuan tahun dan telah mengalami proses domestikasi yang intensif.\nAnjing adalah hewan yang bervariasi dalam ukuran, bentuk, warna, dan karakteristik fisiknya.\nAda ratusan ras anjing yang diakui secara resmi, mulai dari yang sangat kecil seperti Chihuahua hingga yang sangat besar seperti Great Dane.");
        textDesc.setWrappingWidth(300);
        textDesc.setId("descAnjing");
        return textDesc;
    }

    @Override
    public void suara() {
        path = "sound/suaraAnjing.mp3";
        media = new Media(new File(path).toURI().toString());
        mediaplayer = new MediaPlayer(media);
        mediaplayer.play();
    }

    @Override
    public ImageView showImg() {
        showImg = new Image("imgAnjing.jpg");
        imgview = new ImageView(showImg);
        
        return imgview;
    }

    @Override
    public ImageView showImgQuiz() {
        showImg = new Image("imgAnjing.jpg");
        imgview = new ImageView(showImg);
        
        return imgview;
    }

    @Override
    public void suaraQuiz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'suaraQuiz'");
    }

}