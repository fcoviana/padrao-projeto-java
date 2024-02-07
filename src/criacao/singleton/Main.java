package criacao.singleton;

public class Main {
    public static void main(String[] args) {
        var janela = Janela.getInstance();
        var janela2 = Janela.getInstance();
        var janela3 = Janela.getInstance();

        System.out.println(janela);
        System.out.println(janela2);
        System.out.println(janela3);
    }
}