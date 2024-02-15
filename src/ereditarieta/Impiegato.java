package ereditarieta;

// un Impiegato È ANCHE una Persona
public class Impiegato extends Persona
{
    public int stipendio;

    @Override
    public String toString()
    {
        return "Ciao sono "+nome +" "+cognome+" e guadagno "+stipendio;
    }
}
