package gotopackage;

public class SwitchConEnum 
{
    public static void main(String[] args) 
    {
        GiorniSettimana giorno = GiorniSettimana.MARTEDÌ;  
        


        switch (giorno) 
        {
            case LUNEDÌ:
                System.out.println("BUONA SETTIMANA");    
            break;
            case VENERDÌ:
                System.out.println("BUON WEEKEND");    
            break;
        
            default:
                System.out.println("ciao");
            break;
        }
    }
}
