package AdditionalClasses;

import java.util.ArrayList;
import java.util.List;

public class EmailService {
    private String remetente;
    private List<String> destinatarios;
    private String assunto;
    private String mensagem;

    // Construtor sem parâmetros
    public EmailService() {
        this.destinatarios = new ArrayList<>();
    }

    // Construtor com parâmetros
    public EmailService(String remetente, List<String> destinatarios, String assunto, String mensagem) {
        this.remetente = remetente;
        this.destinatarios = destinatarios;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public void addDestinatario(String destinatario) {
        this.destinatarios.add(destinatario);
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    // Método para enviar o e-mail (simulação)
    public void enviarEmail() {
        if (remetente == null || remetente.isEmpty()) {
            System.out.println("Erro: Remetente não informado.");
            return;
        }

        if (destinatarios.isEmpty()) {
            System.out.println("Erro: Nenhum destinatário informado.");
            return;
        }

        if (assunto == null || assunto.isEmpty()) {
            System.out.println("Erro: Assunto não informado.");
            return;
        }

        if (mensagem == null || mensagem.isEmpty()) {
            System.out.println("Erro: Mensagem não informada.");
            return;
        }

        // Simulação do envio de e-mail
        System.out.println("Enviando e-mail...");
        System.out.println("De: " + remetente);
        System.out.println("Para: " + destinatarios);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("E-mail enviado com sucesso!");
    }

    // Método toString para exibir detalhes do e-mail
    @Override
    public String toString() {
        return "EmailService{" +
                "remetente='" + remetente + '\'' +
                ", destinatarios=" + destinatarios +
                ", assunto='" + assunto + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}