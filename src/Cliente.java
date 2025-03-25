public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
    }
    public float calculaTotalCompra() {
        float totalGasto = 0;
        for (Computador c : computadores) {
            if (c != null) {
                totalGasto += c.getPreco();
            }
        }
        return totalGasto;
    }

    public void addComputador(Computador computador) {
        for (int i=0; i < this.computadores.length; i++) {
            if (this.computadores[i] == null) {
                this.computadores[i] = computador;
                break;
            }
        }
    }
    public void mostraComputadores() {
        System.out.println("+----------------------------+--------------------------------------------------+");
        System.out.println("| Nome                       | " + this.nome);
        System.out.println("+----------------------------+--------------------------------------------------+");
        System.out.println("| CPF                        | " + this.cpf);
        System.out.println("+----------------------------+--------------------------------------------------+");
        System.out.println("| Computadores");
        System.out.println("+----------------------------+--------------------------------------------------+");
        for (Computador c : computadores) {
            if (c != null) {
                c.mostraPCConfigs();
            }
        }
        System.out.println("+----------------------------+--------------------------------------------------+");
        System.out.println("| Total Gasto                | " + this.calculaTotalCompra());
        System.out.println("+----------------------------+--------------------------------------------------+");
    }
}
