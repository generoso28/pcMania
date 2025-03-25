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
        System.out.println("| Hardware Básico");
        System.out.println("+----------------------------+--------------------------------------------------+");
        for (HardwareBasico h : hardware) {
            if (h != null) {
                System.out.println("| Nome: " + h.getNome() + "              | Capacidade: " + h.getCapacidade());
                System.out.println("+----------------------------+--------------------------------------------------+");
            }
        }
        System.out.println("| Memória USB");
        System.out.println("+----------------------------+--------------------------------------------------+");
        System.out.println("| Nome: " + musb.getNome() + "             | Capacidade: " + musb.getCapacidade());
        System.out.println("+----------------------------+--------------------------------------------------+");

    }
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }
    public void addHardware(HardwareBasico hardware) {
        for (int i=0; i < this.hardware.length; i++) {
            if (this.hardware[i] == null) {
                this.hardware[i] = hardware;
                break;
            }
        }
    }
    public Computador(String marca, float preco, SistemaOperacional so) {
        this.so = so;
        this.marca = marca;
        this.preco = preco;
        this.hardware = new HardwareBasico[10];
    }
}
