package helloapp;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


abstract public class Animal {
    
    private Button tombolHewan ;
    private Button tombolSuara ;
    private Text textDeskripsi;
    private Image img;
    private ImageView imageView;
    
    public Animal() {
    }
    
    public Button TombolHewan(String namaButton) {
        tombolHewan = new Button(namaButton);
        return tombolHewan;
    }
    public Button TombolSuara(String namaButton) {
        tombolSuara= new Button(namaButton);
        return tombolSuara;
    }
    public Image image(String image) {
        img = new Image(image);
        return img ;
    }
    public ImageView imageView(Image imgView) {
        imageView = new ImageView(imgView);
        return imageView;
    }
    public Text text(String text) {
        textDeskripsi = new Text(text);
        return textDeskripsi;
    }
    
    abstract public Text deskripsi();
    abstract public void suara();
    abstract public ImageView showImg();
}
