/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RETOC45KENWAY.interfaces;


import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import RETOC45KENWAY.modelo.Chocolate;

/**
 *
 * @author LuisKenway
 */
public interface InterfaceChocolate extends MongoRepository<Chocolate, String> {
    public List<Chocolate> findByPriceLessThanEqual(double precio);
    
    //Reto 5
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Chocolate> findByDescriptionLike(String description);
}
