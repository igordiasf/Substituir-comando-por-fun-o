package refatorado;

public class Cliente {
    private String nome;
    private double frequencia;
    private double uso;

    public Cliente(String nome, double frequencia, double uso) {
        this.nome = nome;
        this.frequencia = frequencia;
        this.uso = uso;
    }

    public double calcular(){
        return this.frequencia*this.uso;
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

