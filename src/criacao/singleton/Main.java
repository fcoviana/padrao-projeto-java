package criacao.singleton;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        var janela = Janela.getInstance();
        var janela2 = Janela.getInstance();
        var janela3 = Janela.getInstance();

        System.out.println(janela);
        System.out.println(janela2);
        System.out.println(janela3);


        var logger1 = Logger.getInstance();
        logger1.logMessage("Criando usuário");
        logger1.logMessage("Criando endereco do usuário");

        System.out.println(logger1.getLogHistory());

        var logger2 = Logger.getInstance();
        logger2.logMessage("Criando produto");
        logger2.logMessage("Criando relatorio");

        System.out.println(logger2.getLogHistory());

        System.out.println("Objetos são iguai? " + (Objects.equals(logger1, logger2) ? "Sim" : "Não"));
    }
}