import java.util.Scanner;

public class Main {
    public static void menu(Cliente cliente, Computador[] computadores) {
        boolean exit = false;
        promo(computadores);
        while (!exit) {
            System.out.println("1 - Adicionar computador ao carrinho");
            System.out.println("2 - Finalizar compra");
            System.out.println("3 - Cancelar compra");
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a opção desejada: ");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    //Adiciona o computador ao carrinho
                    System.out.print("Digite o número do computador que deseja adicionar ao carrinho: ");
                    int num = sc.nextInt();
                    if(num < 1 || (num) > computadores.length || computadores[num-1] == null){
                        System.out.println("Computador não encontrado!");
                        break;
                    }else{
                        adicionarComputador(num, cliente, computadores);
                    }
                    break;
                case 2:
                    //Finaliza a compra
                    System.out.println("Compra finalizada!");
                    cliente.mostraComputadores();
                    exit = true;
                    break;
                case 3:
                    //Cancela a compra
                    System.out.println("Compra cancelada!");
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
    public static void promo(Computador[] computador) {
        for (int i = 0; i < computador.length; i++) {
            if (computador[i] != null) {
                System.out.printf("Promoção %d\n", i + 1);
                computador[i].mostraPCConfigs();
            }
        }
    }
    public static void adicionarComputador(int i, Cliente cliente, Computador[] computadores) {
        if (computadores[i-1] == null || i > computadores.length) {
            System.out.println("Computador não encontrado!");
        }else{
            System.out.println("Computador adicionado ao carrinho");
            cliente.addComputador(computadores[i-1]);
        }
    }
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "123456789");
        SistemaOperacional windows64 = new SistemaOperacional("Windows", "64 bits");
        SistemaOperacional linux64 = new SistemaOperacional("Linux", "64 bits");
        HardwareBasico ssd500 = new HardwareBasico("SSD", 500);
        HardwareBasico ddr416 = new HardwareBasico("DDR4", 16);
        HardwareBasico ddr432 = new HardwareBasico("DDR4", 64);
        MemoriaUSB pendrive64 = new MemoriaUSB("Pendrive", 64);
        MemoriaUSB hd1tb = new MemoriaUSB("HD", 1024);
        Computador[] computadores = new Computador[3];
        computadores[0] = new Computador("Samsung", 1933, linux64);
        computadores[0].addHardware(ssd500);
        computadores[0].addHardware(ddr416);
        computadores[0].addMemoriaUSB(pendrive64);
        computadores[1] = new Computador("Dell", 6377, windows64);
        computadores[1].addHardware(ssd500);
        computadores[1].addHardware(ddr432);
        computadores[1].addMemoriaUSB(hd1tb);
        menu(cliente, computadores);
    }
}