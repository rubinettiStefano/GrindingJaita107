package variabili;

public class EsempioBoxati 
{
    public static void main(String[] args) 
    {
        //Integer a =10;//qui viene creato un Integer che boxa 10
        //a+=5; //ok, cambio il valore interno da 10 a 15
        //NO!, sarebbe bello, logico, facile da capire e utilizzare, MA NOOOOOOOOOO!!!
        //Il primo Integer viene DISTRUTTO, ne viene creato uno nuovo che boxa 15 e viene assegnato ad a
        // metodino(a);
        // System.out.println(a);
        // Integer b = 5;
        // b+=5;

        String nome = "Stefano";

        String cognome = "Ste";
        System.out.println(nome==(cognome+"fano"));
        System.out.println(nome.equals(cognome+"fano"));
    }

    private static void metodino(Integer par)
    {
        par+=16;
        //par = new Integer(par+16);
    }
}
