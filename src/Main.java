

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato();
        mostrarNome(contato1.nomeContato);
    }

    public static void mostrarNome(String nomeContato){
        System.out.println("Olá! Meu nome é: "+nomeContato);
    }

    static class Contato{
        String nomeContato = "enzo";
    }

}
