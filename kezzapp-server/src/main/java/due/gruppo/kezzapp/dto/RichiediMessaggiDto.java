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
public class RichiediMessaggiDto {
    
    private String sessione;

    public RichiediMessaggiDto() {
    }

    public RichiediMessaggiDto(String sessione) {
        this.sessione = sessione;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }

    @Override
    public String toString() {
        return "RichiediMessaggiDto{" + "sessione=" + sessione + '}';
    }
    
    
    
}
