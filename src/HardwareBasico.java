public class HardwareBasico {
    private String nome;
    private int capacidade;

    public int getCapacidade() {
        return capacidade;
    }

    public String getNome() {
        return nome;
    }
    public HardwareBasico(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }
}
