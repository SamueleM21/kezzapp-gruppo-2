/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package due.gruppo.kezzapp.serviceImpl;

import due.gruppo.kezzapp.dto.InviaMessaggioDto;
import due.gruppo.kezzapp.dto.RegistrazioneDto;
import due.gruppo.kezzapp.dto.RichiediMessaggiDto;
import due.gruppo.kezzapp.dto.RichiediRegistrazioneDto;
import due.gruppo.kezzapp.repository.ChatRepository;
import due.gruppo.kezzapp.repository.MessaggioRepository;
import due.gruppo.kezzapp.service.KezappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class KezapServiceImpl implements KezappService {

    @Autowired
    MessaggioRepository messaggiorepository;
    @Autowired
    ChatRepository chatRepository;

    @Override
    public RegistrazioneDto registrazione(RichiediRegistrazioneDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrazioneDto inviaUno(InviaMessaggioDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrazioneDto inviaDto(InviaMessaggioDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrazioneDto aggiorna(RichiediMessaggiDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
