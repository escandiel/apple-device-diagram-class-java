public class Iphone implements ReprodutorMusical, Telefone, NavegadorInternet, AppleDevice {

    @Override
    public void ligar() {
        System.out.println("Ligando o iPhone");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o iPhone");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música no iPhone");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + " no iPhone");
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador no iPhone");
    }
}
