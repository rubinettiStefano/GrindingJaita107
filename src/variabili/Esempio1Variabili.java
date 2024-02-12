package variabili;

public class Esempio1Variabili 
{
    public static void main(String[] args) 
    {
        
        Persona p1 = new Persona("Stefano", "Rubinetti");

        Persona p2 = new Persona("Stefano", "Rubinetti");

        Persona p3 = p1;

        Persona p4 = p2;

        p1.nome = "Esteban";

        p2.cognome = "Rubinheti";

        Persona[] v = new Persona[]{p2,p4};

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        v[1].nome = "Stefaninho";
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
