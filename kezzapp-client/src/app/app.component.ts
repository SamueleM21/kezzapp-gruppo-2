import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Chat } from './chat';
import { InviaMessaggioDto } from './inviaMessaggioDto';
import { Messaggio } from './messaggio';
import { RegistrazioneDto } from './registrazioneDto';
import { RichiediMessaggiDto } from './richiediMessaggiDto';
import { RichiediRegistrazioneDto } from './richiediRegistrazioneDto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'kezzapp-client';

  nickname: string;
  messaggio: string;
  messaggi: Array<Messaggio>;
  contatti: Array<Chat>;
  sessione: string;

  regNickVisible: boolean = true;

  constructor(private http: HttpClient) { }


  registrazione() {
    const dto: RichiediRegistrazioneDto = new RichiediRegistrazioneDto();
    dto.nickname = this.nickname;
    const oss: Observable<RegistrazioneDto> = this.http
      .post<RegistrazioneDto>('http://localhost:8080/registrazione', dto);
    oss.subscribe(v => {
      this.contatti = v.contatti;
      this.messaggi = v.messaggi;
      this.sessione = v.sessione;
    });
    this.regNickVisible = false;
  }

  inviaATutti() {
    const dto: InviaMessaggioDto = new InviaMessaggioDto();
    dto.sessione = this.sessione;
    dto.destinatario = null;
    dto.messaggio = this.messaggio;
    const oss: Observable<RegistrazioneDto> = this.http
      .post<RegistrazioneDto>('http://localhost:8080/invia-a-tutti', dto);
    oss.subscribe(v => {
      this.contatti = v.contatti;
      this.messaggi = v.messaggi;
      this.sessione = v.sessione;
    });
  }

  inviaSingolo(c: Chat) {
    const dto: InviaMessaggioDto = new InviaMessaggioDto();
    dto.sessione = this.sessione;
    dto.destinatario = c.nickname;
    dto.messaggio = this.messaggio;
    const oss: Observable<RegistrazioneDto> = this.http
      .post<RegistrazioneDto>('http://localhost:8080/invia-uno', dto);
    oss.subscribe(v => {
      this.contatti = v.contatti;
      this.messaggi = v.messaggi;
      this.sessione = v.sessione;
    });
  }

  aggiorna() {
    const dto: RichiediMessaggiDto = new RichiediMessaggiDto();
    dto.sessione = this.sessione;
    const oss: Observable<RegistrazioneDto> = this.http
      .post<RegistrazioneDto>('http://localhost:8080/aggiorna', dto);
    oss.subscribe(v => {
      this.contatti = v.contatti;
      this.messaggi = v.messaggi;
      this.sessione = v.sessione;
    });

  }
}
