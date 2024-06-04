package giovanni.entities;

import jakarta.persistence.*;

@Entity  // RENDE LA CLASSE MAPPABILE COME TABELLA DEL DATABASE
@Table(name="gestioneeventi") // SETTA IL NOME NEL DATABASE
public class Evento {

    @Id
    @GeneratedValue
    private long id;

    @Column(name="titolo")
    private String titolo;

    @Column(name="dataEvento")
    private Integer dataEvento;

    @Column(name="descrizione")
    private String descrizione;

    @Column(name="tipoEvento")
    @Enumerated(EnumType.STRING)
   private tipoEventoType tipoEvento;

    @Column(name="numeroMassimoPartecipanti")
   private Integer numeroMassimoPartecipanti;

public Evento(){};

    public Evento(String titolo, Integer dataEvento, String descrizione, tipoEventoType tipoEvento, Integer numeroMassimoPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public long getId() {
        return id;
    }


    public Integer getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Integer dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public tipoEventoType getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(tipoEventoType tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}
