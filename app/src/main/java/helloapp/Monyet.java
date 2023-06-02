package helloapp;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Monyet extends Animal{
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
        textDesc = new Text("Monyet adalah hewan mamalia yang tergolong ke dalam keluarga Primata.Monyet memiliki tubuh yang cenderung ramping dengan lengan dan kaki yang panjang. Monyet memiliki kepala bulat dengan tengkorak yang relatif besar. Mereka memiliki mata yang cekung, sering kali dengan warna yang cerah.Bulu monyet dapat bervariasi dalam warna dan tekstur tergantung pada spesiesnya. Monyet adalah hewan yang aktif dan bergerak, mereka menggunakan ekor mereka sebagai alat keseimbangan saat melompat.");
        textDesc.setWrappingWidth(300);
        textDesc.setId("descMonyet");
        return textDesc;
        
    }

    @Override
    public void suara() {
        path = "sound/suaraMonyet.mp3";
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    @Override
    public ImageView showImg() {
        showImg = new Image("imgMonyet.jpg");
        imgView = new ImageView(showImg);
        imgView.setFitHeight(200);
        imgView.setFitWidth(300);
        return imgView;
    }

    @Override
    public ImageView showImgQuiz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showImgQuiz'");
    }

}
