package gotopackage;

public class EsempioSwitch 
{
    public static void main(String[] args) 
    {
        //switch : costrutto che esegue un determinato blocco di codice in base al valore di una variabile

       // String lingua = "ita";
       int num = 2;
        switch (num) 
        {
            case 1:
                System.out.println("CIAO");   
            break;
            case 2:
                System.out.println("HELLO");   
            break;
            case 3:
                System.out.println("HALLO");   
            break;
            default:
                System.out.println("LANGUAGE NOT SUPPORTED YET");   
            break;
        }

        System.out.println("Programma terminato");
    }
}
