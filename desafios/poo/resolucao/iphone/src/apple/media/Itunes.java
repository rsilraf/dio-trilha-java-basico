package apple.media;


public class Itunes implements IReprodutorMedia{
    private EstadoMedia estado;
    private Media mediaSelecionada;

    public void tocar(){
        this.estado = EstadoMedia.TOCANDO;
        System.out.println("Itunes tocando media");
    }

    public void pausar(){
        this.estado = EstadoMedia.EM_PAUSA;
        System.out.println("Itunes pausando media");
    }

    public void selecionarMedia() {
        System.out.println("Selecionando media");
        this.mediaSelecionada = new Media();
    }
}
