package apple.iphone;

import apple.media.IReprodutorMedia;
import apple.media.Itunes;
import apple.telephone.IAparelhoTelefonico;
import apple.telephone.Phone;
import apple.web.INavegadorInternet;
import apple.web.Safari;

public class Iphone implements IIphone{
    public final IReprodutorMedia itunes;
    public final IAparelhoTelefonico phone;
    public final INavegadorInternet browser;

    public Iphone() {
        this.itunes = new Itunes();
        this.phone = new Phone();
        this.browser = new Safari();
    }

    public void ligar() {
        System.out.println("Iphone ligando");
    }

    public void bloquear() {
        System.out.println("Iphone bloqueando");
    }

    public void desbloquear() {
        System.out.println("Iphone desbloqueando");
    }

    public void desligar() {
        System.out.println("Iphone desligando");
    }

    
}
