public class Main {
    public static void main(String[] args) {
        // Criar um objeto Iphone
        Iphone iphone = new Iphone();

        // Chamar os métodos diretamente do objeto iphone
        iphone.ligar();
        iphone.reproduzirMusica();
        iphone.fazerChamada("123456789");
        iphone.abrirNavegador();
        iphone.desligar();
    }
}
