/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package due.gruppo.kezzapp.dto;

/**
 *
 * @author lenovo
 */
public class InviaMessaggioDto {

    private String messaggio;
    private String destinatario;
    private String sessione;

    public InviaMessaggioDto() {
    }

    public InviaMessaggioDto(String messaggio, String destinatario, String sessione) {
        this.messaggio = messaggio;
        this.destinatario = destinatario;
        this.sessione = sessione;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    @Override
    public String toString() {
        return "InviaMessaggioDto{" + "messaggio=" + messaggio + ", destinatario=" + destinatario + ", sessione=" + sessione + '}';
    }

}
