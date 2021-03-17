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
public class RichiediRegistrazioneDto {

    String nickname;

    public RichiediRegistrazioneDto() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public RichiediRegistrazioneDto(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "RichiediRegistrazioneDto{" + "nickname=" + nickname + '}';
    }

}
