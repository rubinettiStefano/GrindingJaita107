package ereditarieta;

public class Studente extends Persona
{
    public int media;

    @Override
    public String toString()
    {
        return "Ciao sono "+nome +" "+cognome+" e ho di media "+media;
    }
}
