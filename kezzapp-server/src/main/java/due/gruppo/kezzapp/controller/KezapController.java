package due.gruppo.kezzapp.controller;

import due.gruppo.kezzapp.dto.InviaMessaggioDto;
import due.gruppo.kezzapp.dto.RegistrazioneDto;
import due.gruppo.kezzapp.dto.RichiediMessaggiDto;
import due.gruppo.kezzapp.dto.RichiediRegistrazioneDto;
import due.gruppo.kezzapp.service.KezappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class KezapController {

    @Autowired
    KezappService kezappService;

    @RequestMapping("/registrazione")
    @ResponseBody
    public RegistrazioneDto registrazione(@RequestBody RichiediRegistrazioneDto dto){
        return kezappService.registrazione(dto);
    }


    @RequestMapping("/invia-uno")
    @ResponseBody
    public RegistrazioneDto inviaUno(@RequestBody InviaMessaggioDto dto){
        return kezappService.inviaUno(dto);
    }

    @RequestMapping("/invia-a-tutti")
    @ResponseBody
    public RegistrazioneDto inviaAtutti(@RequestBody InviaMessaggioDto dto){
        return kezappService.inviaDto(dto);
    }

    @RequestMapping("/aggiorna")
    @ResponseBody
    public RegistrazioneDto aggiorna(@RequestBody RichiediMessaggiDto dto){
        return kezappService.aggiorna(dto);
    }
}
