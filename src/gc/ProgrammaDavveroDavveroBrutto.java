package gc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammaDavveroDavveroBrutto 
{
    static String msg = "CIAO STEFANO ";

    public static void main(String[] args) 
    {
        //String msg = "CIAO";//java alloca in memoria lo spazio necessario per contenere la stringa
        
        
        int sum = 0;//uguale per l'intero

        for(int i=1;i<80000000;i*=3)//uguale per la i
        {
            sum+=i;
        }
        //la i smette di esistere, java se ne accorge e libera lo spazio usato dalla i

        System.out.println("CIAO");//qui la stringa esiste solo nel momento in cui viene usata
        System.out.println(sum);
        //qui, terminato il main, msg e sum smettono di esistere, quindi java libera il loro spazio
    }

    public static void main2()
    {
      
        stampa(msg);
        //mettiamo un sacco di altre chiamate a metodo, un altro programma intero

    }

    public static void stampa(String msg)
    {
        
    
        if(LocalDate.now().getYear()==2024)
        {
            msg += "sei nell'anno corretto";
        }
        else
        {
            msg += "sei nell'anno sbagliato";
        }

        System.out.println(msg);
    }
}
