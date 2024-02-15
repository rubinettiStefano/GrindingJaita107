package ereditarieta;

public class Persona 
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
}
