
package com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.repository;

import com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.Entidad.Ortopedic;
import com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.interfaz.InterfaceOrtopedic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;





@Repository
public class RepositoryOrtopedic {
    
    @Autowired 
    private InterfaceOrtopedic crud ;
    
    public List <Ortopedic> getAll(){
        return (List<Ortopedic>) crud.findAll();
    }
    
    public Optional <Ortopedic> getOrtopedic(int id){
       return crud.findById(id);
    }
    public Ortopedic save (Ortopedic ortopedic){
        return crud.save(ortopedic);
    }
   public void delete(Ortopedic ortopedic){
         crud.save(ortopedic);
    }
    
}
