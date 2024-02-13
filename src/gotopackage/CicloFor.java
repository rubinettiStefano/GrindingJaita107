package gotopackage;

public class CicloFor 
{
    public static void main(String[] args) 
    {
        // int i=0;     inizializzazione della variabile di scorrimento/contatore
        // //CONDIZIONE DI RIPETIZIONE  
        // while(i<4)
        // {
        //     //CORPO DEL CICLO
        //     System.out.println("ciao");
        //     i++;        aggiornamento (della variabile di scorrimento/contatore)
        // }

        // while(true)
        // {
        //     System.out.println("ciao");
        // }
        
        ;

        for
        (
            String s = "";//inizializzazione della variabile di scorrimento/contatore
            !s.equals("ccc"); //condizione di ripetizione
            s+="c"//aggiornamento (della variabile di scorrimento/contatore)
        )
        {
            //CORPO DEL CICLO
            System.out.println("ciao");
        }

        //inizializzazione della variabile di scorrimento/contatore
        //ESEGUITA 1 volta sola, prima della prima esecuzione del ciclo

        //CONDIZIONE DI RIPETIZIONE
        //uguale al while

        //AGGIORNAMENTO
        //cambio del valore della variabile di scorrimento, eseguita
        //dopo la fine di ogni giro del ciclo
    }
}
