package Carro;

public class Carro extends Veiculo{


    //sem encapsulamento
    // public void ligar(){
    //    System.out.println("Carro ligado!!");
    //}
    //public void confereCombustivel(){
    //    System.out.println("conferindo tanque");
    //}
    //public void confereCambio(){
    //    System.out.println("conferindo cambio em P");
    //}

    //herança - usando a herança agora dentro da classe veiculo com Extend
  /*  private String chassi;
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    */
    // COM ENCAPSULAMENTO
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado!!");
    }
    private void confereCombustivel(){
        System.out.println("conferindo tanque");
    }
    private void confereCambio(){
        System.out.println("conferindo cambio em P");
    }
}
