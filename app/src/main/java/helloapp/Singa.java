package helloapp;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class Singa extends Animal{
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
        textDesc = new Text("Singa adalah pesies hewan dari keluarga felidae atau keluarga kucing. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalam penangkaran memungkinkan lebih dari 20 tahun. Ciri khas singa yaitu bulu tebal di sekitar tengkuknya berwarna hitam. Panjang singa betina sekitar 170 cm. Panjang ekor betina kira-kira 90 cm sedangkan singa jantan memiliki panjang sekitar 190 cm. Panjang ekor 80–90 cm, serta memiliki bulu tebal berwarna oranye ke kuning-kuningan");
        textDesc.setWrappingWidth(300);
        textDesc.setId("descSinga");
        return textDesc;
    }

    @Override
    public void suara() {
        path = "sound/suaraSinga.mp3";
        media = new Media(new File(path).toURI().toString());
        mediaplayer = new MediaPlayer(media);
        mediaplayer.play();
    }

    @Override
    public ImageView showImg() {
        showImg = new Image("imgSinga.png");
        imgview = new ImageView(showImg);
        return imgview;
    }

    @Override
    public ImageView showImgQuiz() {
        showImg = new Image("lion.jpg");
        imgview = new ImageView(showImg);
        
        return imgview;
    }

    @Override
    public void suaraQuiz() {
        path = "sound/suaraSingaQuiz.mp3";
        media = new Media(new File(path).toURI().toString());
        mediaplayer = new MediaPlayer(media);
        mediaplayer.play();
    }

}
