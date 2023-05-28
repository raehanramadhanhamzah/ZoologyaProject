package helloapp;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Anjing extends Animal{
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
        Text textDesc = new Text("Anjing adalah hewan peliharaan yang paling umum dan terkenal di dunia.\nMereka adalah anggota keluarga Canidae dan merupakan keturunan dari serigala.\nAnjing telah hidup berdampingan dengan manusia selama ribuan tahun dan telah mengalami proses domestikasi yang intensif.\nAnjing adalah hewan yang bervariasi dalam ukuran, bentuk, warna, dan karakteristik fisiknya.\nAda ratusan ras anjing yang diakui secara resmi, mulai dari yang sangat kecil seperti Chihuahua hingga yang sangat besar seperti Great Dane. \nSetiap ras memiliki ciri khasnya sendiri dalam hal penampilan, termasuk bentuk tubuh, bulu, bentuk kepala, dan ukuran telinga.");
        return textDesc;
        
    }

    @Override
    public void suara() {
      
    }

    @Override
    public ImageView showImg() {
        Image showImg = new Image("imgAnjing.jpg");
        ImageView imgview = new ImageView(showImg);
        imgview.setFitWidth(150);
        imgview.setFitHeight(150);
        return imgview;
    }

}
