package escola;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        //Pessoa marcos = new Pessoa();
        Pessoa marcos = new Pessoa("123", "Marcos");

        marcos.setEndereco("Rua das marias");

        System.out.println("A rua dele é: " + marcos.getEndereco() + " " + marcos.getCpf() + " " + marcos.getNome());
    }
}
