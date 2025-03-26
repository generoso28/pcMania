public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional so;
    private HardwareBasico[] hardware;
    private MemoriaUSB musb;

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("+----------------------------+--------------------------------------------------+");
        System.out.println("| Marca                      | " + this.marca);
        System.out.println("+----------------------------+--------------------------------------------------+");
        System.out.println("| Preço                      | " + this.preco);
        System.out.println("+----------------------------+--------------------------------------------------+");
        System.out.println("| Sistema Operacional        | " + this.so.getNome());
        System.out.println("+----------------------------+--------------------------------------------------+");
        System.out.println("| Tipo do Sistema Operacional| " + this.so.getTipo());
        System.out.println("+----------------------------+--------------------------------------------------+");
        if(this.hardware.length > 0) {
            System.out.println("| Hardware Básico");
            System.out.println("+----------------------------+--------------------------------------------------+");
            for (HardwareBasico h : hardware) {
                if (h != null) {
                    System.out.println("| Nome: " + h.getNome() + "              | Capacidade: " + h.getCapacidade());
                    System.out.println("+----------------------------+--------------------------------------------------+");
                }
            }
        }
        if (musb != null) {
            System.out.println("| Memória USB");
            System.out.println("+----------------------------+--------------------------------------------------+");
            System.out.println("| Nome: " + musb.getNome() + "             | Capacidade: " + musb.getCapacidade());
            System.out.println("+----------------------------+--------------------------------------------------+");
        }
    }
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }
    public Computador(String marca, float preco, SistemaOperacional so, HardwareBasico[] hardware) {
        this.so = so;
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
    }
}
