/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package due.gruppo.kezzapp.dto;

import due.gruppo.kezzapp.model.Chat;
import due.gruppo.kezzapp.model.Messaggio;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class RegistrazioneDto {

    private String sessione;
    private List<Messaggio> messaggi;
    private List<Chat> contatti;

    public RegistrazioneDto() {
    }

    public RegistrazioneDto(String sessione, List<Messaggio> messaggi, List<Chat> contatti) {
        this.sessione = sessione;
        this.messaggi = messaggi;
        this.contatti = contatti;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    public List<Messaggio> getMessaggi() {
        return messaggi;
    }

    public void setMessaggi(List<Messaggio> messaggi) {
        this.messaggi = messaggi;
    }

    public List<Chat> getContatti() {
        return contatti;
    }

    public void setContatti(List<Chat> contatti) {
        this.contatti = contatti;
    }

    @Override
    public String toString() {
        return "RegistrazioneDto{" + "sessione=" + sessione + ", messaggi=" + messaggi + ", contatti=" + contatti + '}';
    }

}
