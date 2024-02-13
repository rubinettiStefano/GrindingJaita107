package variabili;

public class PersonaOld
{
    public String nome,cognome;
    public Integer age;

    public PersonaOld(){}
    public PersonaOld(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return " [nome=" + nome + ", cognome=" + cognome + "]";
    }

    
}
