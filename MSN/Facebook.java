package MSN;

public class Facebook extends ServicoMensagemInstantea{
    /* 
    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo facebook");
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo facebook");
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
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }

}
