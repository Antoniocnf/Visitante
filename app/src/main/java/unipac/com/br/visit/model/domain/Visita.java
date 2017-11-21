package unipac.com.br.visit.model.domain;

import java.util.Date;

/**
 * Created by Antonio Carlos on 12/09/2017.
 */

public class Visita {

    private Visitante visitante;
    private Date dataVisita;

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Date getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(Date dataVisita) {
        this.dataVisita = dataVisita;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "visitante=" + visitante +
                ", dataVisita=" + dataVisita +
                '}';
    }
}
