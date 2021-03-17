/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package due.gruppo.kezzapp.repository;

import due.gruppo.kezzapp.model.Messaggio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * @author lenovo
 */
public interface MessaggioRepository extends JpaRepository<Messaggio, Long>{

    List<Messaggio> findByAliasDestinatarioOrAliasDestinatarioIsNull(String nickname);
}
