package criacao.singleton;

import java.util.Date;
import java.util.Objects;

public class Janela {
    private String nome;
    protected static Janela instance;
    private Janela() {
        nome = "Janela " + new Date().getTime();
    }

    public static Janela getInstance() {
        return Objects.isNull(instance) ? instance = new Janela() : instance;
    }

    @Override
    public String toString() {
        return "Janela{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
