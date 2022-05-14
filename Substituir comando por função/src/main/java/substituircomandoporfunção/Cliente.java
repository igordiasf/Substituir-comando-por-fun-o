package substituircomandoporfunção;

public class Cliente {
    private String nome;
    private double frequencia;

    public Cliente(String nome, double frequencia) {
        this.nome = nome;
        this.frequencia = frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

