package MSN;

public class telegram extends ServicoMensagemInstantea{
    /*
    public void enviarMensagem(){
        System.out.println("Enviando mensagem Pelo telegram");
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem Pelo telegram");
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
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
