import { Chat } from "./chat";
import { Messaggio } from "./messaggio";

export class RegistrazioneDto{
    sessione: string;
    contatti: Array<Chat>;
    messaggi: Array<Messaggio>;
}