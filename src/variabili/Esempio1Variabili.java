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

        p2.cognome = "Ruby";

        Persona[] v = new Persona[]{p2,p4};

        System.out.println("22  "+p1);//Esteban Rubinetti
        System.out.println("23  "+p2);//Stefano Ruby
        System.out.println("24  "+p3);//Esteban Rubinetti
        System.out.println("25  "+p4);//Stefano Ruby

        v[1].nome = "Stefaninho";
        
        System.out.println("29  "+p1);//Esteban Rubinetti
        System.out.println("30  "+p2);//Stefaninho Ruby
        System.out.println("31  "+p3);//Esteban Rubinetti
        System.out.println("32  "+p4);//Stefaninho Ruby
    }
}
