/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RETOC45KENWAY.interfaces;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import RETOC45KENWAY.modelo.User;

/**
 *
 * @author LuisKenway
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {
    
    Optional<User> findByEmail(String email);
    
    Optional<User> findByEmailAndPassword(String email,String password);
    
       //Reto 5
    List<User> findByMonthBirthtDay(String monthBirthtDay);
    
     //Para seleccionar el LuisKenway con el id maximo
    Optional<User> findTopByOrderByIdDesc();
}
