
package com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.interfaz;

import com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.Entidad.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public interface InterfaceMessage extends CrudRepository < Message , Integer> {
    
}
