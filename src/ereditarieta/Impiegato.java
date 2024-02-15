package ereditarieta;

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
    public String toString()
    {
        return super.toString()+" e guadagno "+stipendio;
    }
}
