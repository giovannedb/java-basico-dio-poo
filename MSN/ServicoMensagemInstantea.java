package MSN;

public abstract class ServicoMensagemInstantea {
    /*
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando Mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    //Metodos privados, visiveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando se está conecta a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }
    */
    // abstração
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
}
