package giovanni.dao;


import giovanni.entities.Evento;
import giovanni.exception.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private final EntityManager em;

   public EventoDAO(EntityManager em){
       this.em= em;
   }
public void save(Evento evento){
       // AVVIO LA TRANSAZIONE
    EntityTransaction transazione= em.getTransaction();

       // LA INIZIALIZZO
    transazione.begin();

    // L'EVENTO NON E' PERSISTENTE E NON E' ANCORA INSERITO NEL DB QUINDI LO DEVO AGGIUNGERE AL PERSISTENCE CONTEXT
    em.persist(evento);

    // SE NON FACCIO IL COMMIT L'EVENTO NON VIENE PUSHATO NEL DV QUINDI SERVE UN COMMIT
    transazione.commit();

    // PER SICUREZZA POSSIAMO INSERIRE UN CONTROLLO VISIVO TRAMITE SOUT
    System.out.println("L'evento: " + evento.getTitolo() + " è stato committato nel db ");

}
public Evento getById (long eventId) {
       Evento selectedEvent = em.find(Evento.class, eventId  );
       if (selectedEvent == null) throw new NotFoundException(eventId);
       return selectedEvent;
    }

    public Evento deleteById (long eventId) {

        Evento eventoDaCancellare = this.getById(eventId);

        EntityTransaction transizione = em.getTransaction();

        transizione.begin();

        em.remove(eventoDaCancellare);

        transizione.commit();

        System.out.println("L'evento chiamato: " + eventoDaCancellare.getTitolo() + " è stato cancellato dal db");


        return eventoDaCancellare;
    }
    }
