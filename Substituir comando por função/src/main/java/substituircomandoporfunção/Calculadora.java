package substituircomandoporfunção;

public class Calculadora {

    private Cliente cliente;
    private double uso;

    public double getUso() {
        return uso;
    }

    public void setUso(double uso) {
        this.uso = uso;
    }

    public Calculadora(Cliente cliente, double uso) {
        this.cliente = cliente;
        this.uso = uso;
    }

    public double calcular(){
      return this.cliente.getFrequencia()*this.uso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}


