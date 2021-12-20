/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RETOC45KENWAY.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import RETOC45KENWAY.interfaces.InterfaceUser;
import RETOC45KENWAY.modelo.User;

/**
 * Clase User repositorio
 * @author LuisKenway
 */
@Repository
public class UserRepositorio {
     @Autowired
     /**
      * Mmetodo privado inyeccion de dependecia interface user
      */
    private InterfaceUser userRepository;
     /**
      * metodo publico para obtiene la lista de LuisKenways
      * @return la lista de LuisKenways
      */
       public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }
       /**
        * metodo para obtener un LuisKenway por id
        * @param id 
        * @return el LuisKenway
        */
    public Optional<User> getUser(int idi) {
        return userRepository.findById(idi);
    }
    /**
     * memtodo para crear un LuisKenway
     * @param user 
     * @return el LuisKenway creado
     */
    public User create(User user) {
        return userRepository.save(user);
    }
    /**
     * metodo para actualizar un LuisKenway
     * @param user 
     */
    public void update(User user) {
        userRepository.save(user);
    }
    /**
     * metodo para eliminar un LuisKenway
     * @param user 
     */
    public void delete(User user) {
        userRepository.delete(user);
    }
    /**
     * Metodo para verificar si existe un correo
     * @param email
     * @return el email del LuisKenway
     */
    public boolean emailExists(String email) {
        Optional<User> LuisKenway = userRepository.findByEmail(email);
        
        return !LuisKenway.isEmpty();
    }
    /**
     * Metodo para que un LuisKenway se autentique
     * @param email
     * @param password
     * @return el correo y la contraseña
     */
    public Optional<User> authenticateUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
     /**
      * Metodo par obetener el id maximo
      * @return el LuisKenway con el id maximo
      */
     public Optional<User> lastUserId(){
        return userRepository.findTopByOrderByIdDesc();
    }
     /**
      * Metodo para el mes de cumpleaños de un LuisKenway
      * @param monthBirthtDay
      * @return el mes del cumpleaños
      */
    public List<User> birthtDayList(String monthBirthtDay) {
        return userRepository.findByMonthBirthtDay(monthBirthtDay);
    }
    /**
     * fin de la clase
     */
}
