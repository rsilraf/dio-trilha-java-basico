package apple.telephone;

public class Phone implements IAparelhoTelefonico{

    private boolean emChamada;

    public void ligar() {
        System.out.println("Fazendo ligação");
        this.emChamada = true;
    }

    public void atender() {
        System.out.println("Atendendo chamada");
        this.emChamada = true;
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        this.emChamada = false;
    }
    
}
