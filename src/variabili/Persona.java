package variabili;

public class Persona
{
    public String nome,cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return " [nome=" + nome + ", cognome=" + cognome + "]";
    }

    
}
