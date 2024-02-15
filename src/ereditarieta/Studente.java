package ereditarieta;

public class Studente extends Persona
{

    public int media;

    public Studente(){}

    //new Studente("Luca","Del Gatto",30,9);
    public Studente(String nome, String cognome, int eta, int media) 
    {
        super(nome, cognome, eta);
        this.media = media;
    }



    @Override
    public String toString()
    {
        return super.toString()+" e ho di media "+media;
    }
}
