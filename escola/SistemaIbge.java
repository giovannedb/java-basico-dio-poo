package escola;

public class SistemaIbge {
    public static void main(String[] args) {
        //for ( a cada estado brasileiro : é igual aos meus valores do enum)
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        ///Imprimindo somente 1 resultado do ENUM
        EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANEIRO;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
    }
}
