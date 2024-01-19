package apple;

import apple.iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Apresentando o novo Iphone");
        System.out.println("");

        Iphone iphone = new Iphone();
        iphone.ligar();
        iphone.bloquear();
        iphone.desbloquear();
        
        System.out.println("");
        System.out.println("Reprodutor de Media =====");
        iphone.itunes.selecionarMedia();
        iphone.itunes.tocar();
        iphone.itunes.pausar();

        System.out.println("");
        System.out.println("Telefone =====");
        iphone.phone.ligar();
        iphone.phone.atender();
        iphone.phone.iniciarCorreioVoz();
        
        System.out.println("");
        System.out.println("Navagador =====");
        iphone.browser.exibirPagina();
        iphone.browser.atualizarPagina();
        iphone.browser.adicionarNovaAba();
        
        System.out.println("");
        iphone.desligar();
    }
}
