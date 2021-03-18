/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package due.gruppo.kezzapp.repository;

import due.gruppo.kezzapp.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author lenovo
 */
public interface ChatRepository extends JpaRepository<Chat, Long>{

    Chat findByNickname(String s);

    Chat findBySessione(String sessione);
}
