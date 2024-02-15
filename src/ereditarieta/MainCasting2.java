package ereditarieta;

public class MainCasting2 
{
    public static void main(String[] args) 
    {
        Persona p = new Persona();
        p.nome = "Stefano";    
        p.cognome = "Rubinetti";  
        p.eta = 28;
        
        

        Impiegato i = new Impiegato();
        i.nome = "Mario";
        i.cognome = "Rossi";
        i.eta = 35;
        i.stipendio = 1800;

        Studente s = new Studente();
        s.nome = "Luca";
        s.cognome = "Del Gatto";
        s.eta = 30;
        s.media = 9;

        System.out.println(p);
        

        //3 oggetti, uno di tipo Persona, uno di tipo Impiegato, uno di tipo Studente


        Persona imp  = i;
        Persona stud = s;


        System.out.println(imp);
        System.out.println(stud);









        // metodinoStampa(p);
        // metodinoStampa(i);

        // metodinoStampaImp(i);
        // metodinoStampaImp((Impiegato)p);
    }

    public static void metodinoStampa(Persona p )
    {
        System.out.println("Ciao sono "+p.nome +" "+p.cognome);
    }

    public static void metodinoStampaImp(Impiegato i )
    {
        System.out.println("Ciao sono "+i.nome +" "+i.cognome);
    }
}
