package ereditarieta;

import java.util.ArrayList;
import java.util.List;

// un Impiegato È ANCHE una Persona
public class Impiegato extends Persona
{
    public int stipendio;

    public Impiegato(){}

    

    public Impiegato(String nome, String cognome, int eta, int stipendio) {
        super(nome, cognome, eta);
        this.stipendio = stipendio;
    }

    @Override
    public List<String> getErrors() 
    {   
        List<String> res = super.getErrors();
        if(stipendio<0 || stipendio>270000)
            res.add("ERRORE: stipendio negativo o troppo elevato");

        return res;
    }

    @Override
    public String toString()
    {
        return super.toString()+" e guadagno "+stipendio;
    }
}
