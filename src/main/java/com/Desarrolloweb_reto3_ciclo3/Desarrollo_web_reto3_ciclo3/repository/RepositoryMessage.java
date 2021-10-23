
package com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.repository;

import com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.Entidad.Message;
import com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.interfaz.InterfaceMessage;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;





@Repository
public class RepositoryMessage {
    
    @Autowired 
    private InterfaceMessage crudMessage;
    
     public List <Message> getAll(){
        return (List<Message>) crudMessage.findAll();
    }
    
    public Optional <Message> getMessage(int id){
       return crudMessage.findById(id);
    }
    public Message save (Message messages){
        return  crudMessage.save(messages);
    }
     public void delete (Message messages){
         
         crudMessage.save(messages);
    }
    
    
}
