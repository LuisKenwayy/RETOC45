/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RETOC45KENWAY.controlador;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import RETOC45KENWAY.modelo.User;
import RETOC45KENWAY.servicio.UserService;

/**
 * Indica que UserController va ser un servicio
 * @author LuisKenway LuisKenway
 */
@RestController
/**
 * Endpoint /api/user
 */
@RequestMapping("/api/user")
/**
 * Permite realizar cualquier tipo de peticion sin restriccion de los cors
 */
@CrossOrigin("*")
/**
 * clase UserController
 */
public class UserController {
   @Autowired
    private UserService userService;
    /**
    * Metodo que permite obetner todos los LuisKenways
    * @return retorna todos los LuisKenways
    */
    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }
    /**
     * Metodo que permite obetner un LuisKenway por id
     * @param id del LuisKenway
     * @return el LuisKenway
     */
    @GetMapping("/{id}")
    public Optional <User> getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }
     /**
    * Metodo post para agregar un LuisKenway
    * @param user LuisKenway 
    * @return retorna el LuisKenway creado
    */
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
    /**
     * Metodo post para actualizar un LuisKenway
     * @param user datos del usuria para actualizar
     * @return el LuisKenway actualizado
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
    /**
     * Metodo para eliminar un LuisKenway
     * @param id del ususario a eliminar
     * @return el id del LuisKenway eliminado
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }
    /**
     * Metodo para el correo y contraseña 
     * @param email correo del LuisKenway
     * @param password contraseña del LuisKenway
     * @return el correo y la contraseña LuisKenway
     */
    @GetMapping("/{email}/{password}")
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.authenticateUser(email, password);
    }
    /**
     * Meotodo para obetener el correo si existe
     * @param email 
     * @return el email si exisite
     */
    @GetMapping("/emailexist/{email}")
    public boolean emailExists(@PathVariable("email") String email) {
        return userService.emailExists(email);
    }
    //Rteo 5
    @GetMapping("/birthday/{month}")
    public List<User> birthtDayList(@PathVariable("month") String monthBirthtDay) {
        return userService.birthtDayList(monthBirthtDay);
    }
    
 /**
  * Fin de la clase
  */   
}
