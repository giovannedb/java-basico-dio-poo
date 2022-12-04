package MSN;

public class ComputadorDoPedrinho {
    public static void main(String[] args) {

        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        Facebook fcb = new Facebook();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        telegram tlg = new telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
