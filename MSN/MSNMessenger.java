package MSN;

public class MSNMessenger extends ServicoMensagemInstantea {
    /*
    public void enviarMensagem(){
        System.out.println("Enviando mensagem");
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem();
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
    */
    @Override
    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo MSN messenger");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN messenger");
    }
}
