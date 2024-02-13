package contesto;

public class ScopeConOggetto 
{
    public static void main(String[] args) 
    {
        Persona p1 = new Persona();//p locale al metodo main
        Persona p2 = new Persona();

        
        // Math m = new Math();
        // m.random();
        Math.random();
        //variabile con il nome PARIPARIPARI alla classe
        //è una variabile che ci permette di accedere alla classe stessa
        //ne esiste una IN COMUNE in tutto il programma
        //fa parte AUTOMATICAMENTE del contesto di ogni CLASSE
        //a patto che sia IMPORTABILE

        p1.nome ="s";
        p1.cognome ="r";

        p2.nome ="c";
        p2.cognome ="b";
        // p.eta = 10; non fa parte del contesto

        //public               tutto progetto
        //protected            package + sottotipi dovunque essi siano
        //package/default      package della classe in cui membro è stato dichiarato
        //private              classe in cui membro è stato dichiarato

        //QUANTE VARIABILI FANNO PARTE DEL CONTESTO A QUESTA RIGA ->8
        //args
        //p1 e p2
        //p1.nome e p1.cognome
        //p2.nome e p2.cognome
        //Persona.maxAge


    }
}
