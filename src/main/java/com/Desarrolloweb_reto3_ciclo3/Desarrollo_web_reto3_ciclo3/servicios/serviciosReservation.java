package com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.servicios;


import com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.Entidad.Reservation;
import com.Desarrolloweb_reto3_ciclo3.Desarrolloweb_reto3_ciclo3.repository.RepositoryReservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosReservation {
    
    @Autowired
    RepositoryReservation metodosCrud ;
    
    public List <Reservation> getAll( ){
        return metodosCrud.getAll();
    }
    
    public Optional <Reservation > getReservation(int reservationId){
       return metodosCrud. getReservation (reservationId);
    }
    
    public Reservation save (Reservation  reservations ){
        
      if( reservations.getIdReservation ()== null)
      { 
          return metodosCrud.save(reservations);
      }
      else {
            Optional<Reservation> evt=metodosCrud.getReservation(reservations.getIdReservation());
            if( evt.isEmpty())
            {
              return metodosCrud.save(reservations );
            }
             else
            {
            return reservations;
            }
      
      
         }
    

     }
    public Reservation update(Reservation reservation){
        if(reservation.getIdReservation()!=null){
            Optional<Reservation> e= metodosCrud.getReservation(reservation.getIdReservation());
            if(!e.isEmpty()){

                if(reservation.getStartDate()!=null){
                    e.get().setStartDate(reservation.getStartDate());
                }
                if(reservation.getDevolutionDate()!=null){
                    e.get().setDevolutionDate(reservation.getDevolutionDate());
                }
                if(reservation.getStatus()!=null){
                    e.get().setStatus(reservation.getStatus());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return reservation;
            }
        }else{
            return reservation;
        }
    }

    public boolean deleteReservation(int reservationId) {
        Boolean aBoolean = getReservation(reservationId).map(reservation -> {
            metodosCrud.delete(reservation);
            return true;
        }).orElse(false);
        return aBoolean;
    }
 }