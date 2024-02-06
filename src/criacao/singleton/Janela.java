package criacao.singleton;

import java.util.Date;

public class Janela {
    private String nome;
    private Janela() {
        nome = "Janela 1" + new Date().getTime();
    }

    public static Janela getInstance() {
        return new Janela();
    }

    @Override
    public String toString() {
        return "Janela{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
