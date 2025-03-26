import java.util.Scanner;

public class Main {
    //Metodo para mostrar os computadores disponíveis na promoção
    public static void promo(Computador[] computador) {
        for (int i = 0; i < computador.length; i++) {
            if (computador[i] != null) {
                System.out.printf("\nPromoção %d\n", i + 1);
                computador[i].mostraPCConfigs();
            }
        }
    }
    //Metodo para adicionar computadores ao carrinho
    public static void menu(Cliente cliente, Computador[] computadores) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        promo(computadores);
        while (!exit) {
            System.out.print("Digite o número do computador que deseja adicionar ao carrinho: ");
            int num = sc.nextInt();
            //Se o número digitado for 0, o cliente verá os computadores que estão no carrinho e finalizará a compra
            if(num == 0){
                cliente.mostraComputadores();
                exit = true;
            }else if (num < 1 || num > computadores.length || computadores[num-1] == null) {
                //Se o número digitado for inválido ou o computador não existir, o cliente verá a mensagem abaixo
                System.out.println("Computador não encontrado!");
            }else{
                //Adiciona o computador ao carrinho
                System.out.println("Computador adicionado ao carrinho");
                cliente.addComputador(computadores[num-1]);
            }
        }
    }

    public static void main(String[] args) {
        //Criação de objetos
        //Criação de um cliente
        Cliente cliente = new Cliente("João", "123456789");
        //Criação de sistemas operacionais
        SistemaOperacional windows864 = new SistemaOperacional("Windows 8", "64 bits");
        SistemaOperacional linuxUbuntu64 = new SistemaOperacional("Linux Ubuntu", "32 bits");
        SistemaOperacional windows1064 = new SistemaOperacional("Windows 10", "64 bits");
        //Criação de hardwares básicos
        HardwareBasico[] hardwareComputador1 = {
                new HardwareBasico("Pentium Core i3", 2200),
                new HardwareBasico("Memória RAM", 8),
                new HardwareBasico("HD", 500)
        };
        HardwareBasico[] hardwareComputador2 = {
                new HardwareBasico("Pentium Core i5", 3370),
                new HardwareBasico("Memória RAM", 16),
                new HardwareBasico("HD", 1024)
        };
        HardwareBasico[] hardwareComputador3 = {
                new HardwareBasico("Pentium Core i7", 4500),
                new HardwareBasico("Memória RAM", 32),
                new HardwareBasico("HD", 2048)
        };
        //Criação de memórias USB
        MemoriaUSB pendrive16 = new MemoriaUSB("Pendrive", 16);
        MemoriaUSB pendrive32 = new MemoriaUSB("Pendrive", 32);
        MemoriaUSB hd_externo1tb = new MemoriaUSB("HD", 1024);
        //Criação de computadores
        Computador[] computadores = new Computador[3];
        computadores[0] = new Computador("Apple", 699, linuxUbuntu64, hardwareComputador1);
        computadores[0].addMemoriaUSB(pendrive16);
        computadores[1] = new Computador("Samsung", 1933, windows864, hardwareComputador2);
        computadores[1].addMemoriaUSB(pendrive32);
        computadores[2] = new Computador("Dell", 6377, windows1064, hardwareComputador3);
        computadores[2].addMemoriaUSB(hd_externo1tb);
        //Chamada do metodo menu
        menu(cliente, computadores);
    }
}