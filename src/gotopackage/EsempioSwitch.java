package gotopackage;

public class EsempioSwitch 
{
    public static void main(String[] args) 
    {
        //switch : costrutto che esegue un determinato blocco di codice in base al valore di una variabile

        String lingua = "ita";
       
        switch (lingua) 
        {
            case "ita":
                System.out.println("CIAO");   
            break;
            case "eng":
                System.out.println("HELLO");   
            break;
            case "de":
                System.out.println("HALLO");   
            break;
            default:
                System.out.println("LANGUAGE NOT SUPPORTED YET");   
            break;
        }

        System.out.println("Programma terminato");
    }
}
