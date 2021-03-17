import { Component } from '@angular/core';
import { Chat } from './chat';
import { Messaggio } from './messaggio';

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

  registrazione(){

  }

  inviaATutti(){

  }

  inviaSingolo(c: Chat){
    
  }

  aggiorna(){
    
  }
}
