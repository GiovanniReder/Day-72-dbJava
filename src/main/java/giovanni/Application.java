package giovanni;

import giovanni.dao.EventoDAO;
import giovanni.entities.Evento;
import giovanni.entities.tipoEventoType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO evdao= new EventoDAO(em);
        Evento evento1= new Evento("presentazione apple", 2024 ,"presentiamo il nuovo mac", tipoEventoType.PUBBLICO, 5000);
        Evento evento2= new Evento("presentazione nokia", 2025 ,"presentiamo il nuovo 3310", tipoEventoType.PUBBLICO, 3310);
        Evento evento3= new Evento("presentazione nintendo", 2026 ,"presentiamo il nuovo Super Mario", tipoEventoType.PRIVATO, 10000);
        Evento evento4= new Evento("presentazione sony", 2027 ,"presentiamo la nuova playstation", tipoEventoType.PRIVATO, 3000);

      //  evdao.save(evento1);
       // evdao.save(evento2);
      //  evdao.save(evento3);
        System.out.println("fin qui tutto ok");
     //  evdao.save(evento4);

        System.out.println( evdao.getById(1));
        System.out.println( evdao.deleteById(4) );

        em.close();
        emf.close();
    }
}
