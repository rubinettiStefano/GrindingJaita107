package ereditarieta;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona extends Entity
{
    public String nome;
    public String cognome;
    public int eta;

    public Persona(){}

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    




    public String toString()
    {
        return "Ciao sono "+nome +" "+cognome+" età: "+eta;
    }

    @Override
    public List<String> getErrors() 
    {
        List<String> res = new ArrayList<String>();

        if(id<0)
            res.add("ERRORE: id negativo");

        if(nome==null || nome.isBlank())
            res.add("ERRORE: Nome nullo o vuoto");

        if(cognome==null || cognome.isBlank())
            res.add("ERRORE: Cognome nullo o vuoto");

        if(eta<0 || eta>120)
            res.add("ERRORE: età negativa o troppo elevata");

        return res;
    }
}
