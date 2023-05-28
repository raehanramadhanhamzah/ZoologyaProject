package helloapp;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Sapi extends Animal{
    // public Sapi(Button tombolHewan, Text textDeskripsi, Button tombolSuara, Image img, ImageView imgView) {
    //     super(tombolHewan, textDeskripsi, tombolSuara, img, imgView);
    // }

    @Override
    public  Text deskripsi() {
        Text textDesc = new Text("Sapi, yang juga dikenal dengan nama ilmiah Canis lupus familiaris, adalah hewan peliharaan yang paling umum dan terkenal di dunia. Mereka adalah anggota keluarga Canidae dan merupakan keturunan dari serigala. Sapi telah hidup berdampingan dengan manusia selama ribuan tahun dan telah mengalami proses domestikasi yang intensif.\nSapi adalah hewan yang bervariasi dalam ukuran, bentuk, warna, dan karakteristik fisiknya. Ada ratusan ras Sapi yang diakui secara resmi, mulai dari yang sangat kecil seperti Chihuahua hingga yang sangat besar seperti Great Dane. Setiap ras memiliki ciri khasnya sendiri dalam hal penampilan, termasuk bentuk tubuh, bulu, bentuk kepala, dan ukuran telinga.");
        return textDesc;
        
    }

    @Override
    public void suara() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'suara'");
    }

    @Override
    public ImageView showImg() {
        Image showImg = new Image("imgSapi.jpg");
        ImageView imgview = new ImageView(showImg);
        imgview.setFitWidth(150);
        imgview.setFitHeight(150);
        return imgview;
    }
    
}
