package com.itismeucci.melone;

import java.util.ArrayList;
import java.util.List;

public final class root 
{
    private int annoDiInizio;
    private List<aula> aula=new ArrayList<>();
    private String classe;
    private int numeroFinestre;
    private String specializzazione;
    private List<studenti> studenti=new ArrayList<>();
    

    public int getAnnoDiInizio() {
        return this.annoDiInizio;
    }

    public void setAnnoDiInizio(int annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }

    public List<aula> getAula() {
        return this.aula;
    }

    public void setAula(List<aula> aula) {
        this.aula = aula;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNumeroFinestre() {
        return this.numeroFinestre;
    }

    public void setNumeroFinestre(int numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }

    public String getSpecializzazione() {
        return this.specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public List<studenti> getStudenti() {
        return this.studenti;
    }

    public void setStudenti(List<studenti> studenti) {
        this.studenti = studenti;
    }

}
