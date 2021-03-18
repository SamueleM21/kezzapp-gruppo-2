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
import due.gruppo.kezzapp.model.Chat;
import due.gruppo.kezzapp.model.Messaggio;
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
    MessaggioRepository messaggioRepository;
    @Autowired
    ChatRepository chatRepository;

    @Override
    public RegistrazioneDto registrazione(RichiediRegistrazioneDto dto) {
        RegistrazioneDto dtoR = new RegistrazioneDto();
        if (chatRepository.findByNickname(dto.getNickname())!= null) {
            dtoR.setSessione(null);
            return dtoR;
        } else {
            Chat chat = new Chat();
            chat.setNickname(dto.getNickname());
            chat = chatRepository.save(chat);
            chat.setSessione(String.valueOf(chat.getId()));
            chatRepository.save(chat);
            dtoR.setSessione(chat.getSessione());
            dtoR.setContatti(chatRepository.findAll());
            dtoR.setMessaggi(messaggioRepository.findByAliasDestinatarioOrAliasDestinatarioIsNull(chat.getNickname()));
            return dtoR;
        }
    }

    @Override
    public RegistrazioneDto inviaUno(InviaMessaggioDto dto) {
        Chat chat = chatRepository.findBySessione(dto.getSessione());
        RegistrazioneDto dtoR = new RegistrazioneDto();
        if(chat == null) {
            return dtoR;
        } else {
            Messaggio messaggio = new Messaggio(dto.getMessaggio(), dto.getDestinatario(), chat.getNickname());
            messaggioRepository.save(messaggio);
            dtoR.setSessione(chat.getSessione());
            dtoR.setContatti(chatRepository.findAll());
            dtoR.setMessaggi(messaggioRepository.findByAliasDestinatarioOrAliasDestinatarioIsNull(chat.getNickname()));
            return dtoR;
        }
    }

    @Override
    public RegistrazioneDto inviaDto(InviaMessaggioDto dto) {
        Chat chat = chatRepository.findBySessione(dto.getSessione());
        RegistrazioneDto dtoR = new RegistrazioneDto();
        if(chat == null) {
            return dtoR;
        } else {
            Messaggio messaggio = new Messaggio(dto.getMessaggio(), null, chat.getNickname());
            messaggioRepository.save(messaggio);
            dtoR.setSessione(chat.getSessione());
            dtoR.setContatti(chatRepository.findAll());
            dtoR.setMessaggi(messaggioRepository.findByAliasDestinatarioOrAliasDestinatarioIsNull(chat.getNickname()));
            return dtoR;
        }
    }

    @Override
    public RegistrazioneDto aggiorna(RichiediMessaggiDto dto) {
        Chat chat = chatRepository.findBySessione(dto.getSessione());
        RegistrazioneDto dtoR = new RegistrazioneDto();
        dtoR.setContatti(chatRepository.findAll());
        dtoR.setMessaggi(messaggioRepository.findByAliasDestinatarioOrAliasDestinatarioIsNull(chat.getNickname()));
        return dtoR;
    }
}
