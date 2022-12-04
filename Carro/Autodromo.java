package Carro;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("212121");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("27182178");
        z400.ligar();

        //sem encapsulamento
        //jeep.confereCambio();
        //jeep.confereCombustivel(); ///12min

        Veiculo coringa = z400;

        coringa.ligar();
    }
}
