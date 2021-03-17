/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package due.gruppo.kezzapp.service;

import due.gruppo.kezzapp.dto.InviaMessaggioDto;
import due.gruppo.kezzapp.dto.RegistrazioneDto;
import due.gruppo.kezzapp.dto.RichiediMessaggiDto;
import due.gruppo.kezzapp.dto.RichiediRegistrazioneDto;

/**
 *
 * @author lenovo
 */
public interface KezappService {

    RegistrazioneDto registrazione(RichiediRegistrazioneDto dto);

    RegistrazioneDto inviaUno(InviaMessaggioDto dto);

    RegistrazioneDto inviaDto(InviaMessaggioDto dto);

    RegistrazioneDto aggiorna(RichiediMessaggiDto dto);

}
