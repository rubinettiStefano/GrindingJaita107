package ereditarieta;

public class MainCasting 
{
    public static void main(String[] args) 
    {
        Persona p = new Persona();
        //una zona della memoria è stata allocata e riempita con un oggetto
        //di tipo Persona
        p.nome = "Stefano";
        p.cognome = "Rubinetti";
        p.eta = 28;
        
        //Ho come tipo FORMALE Persona, perchè la variabile p è di tipo Persona
        //Ho come tipo CONCRETO Persona, perchè ho chiamato costruttore new Persona()


        //Io posso dire a JAVA di convertire quella zona di memoria NON in una persona
        //ma in un Object

        //Ho come tipo FORMALE Object, perchè la variabile o è di tipo Object
        //Ho come tipo CONCRETO Persona, perchè ho chiamato costruttore new Persona()
        //Object o = p;

        //CASTING
        //CAMBIO DI TIPO FORMALE

        //CASTING di primitivi (non è un casting) è una CONVERSIONE
        double a = 12.3;
        int b = (int) a;//12

        //tra double e int
        //tra numero (byte) e char
     
        //UPCASTING -> Passare a un SUPERTIPO, sicura e (volendo) implicita
        Object o = p;
        //DOWNCASTING -> Passare a un SOTTOTIPO, pericolosa (ESPLICITA
        Persona per = (Persona) o;
        
        //UPCASTING -> Guadagnamo in GENERALITÀ ma perdiamo in POTENZA
        //DOWNCASTING -> Guadagnamo in POTENZA ma perdiamo in GENERALITÀ
        
    }
}
