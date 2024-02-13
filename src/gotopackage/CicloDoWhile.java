package gotopackage;

public class CicloDoWhile 
{
    public static void main(String[] args) 
    {
        int i=0;
        
           //CONDIZIONE DI RIPETIZIONE  
        do
        {
            //CORPO DEL CICLO
            i++;
            System.out.println("ciao");
        } while(i<4);

        //Il while continua ad eseguire il corpo del ciclo fino a quando
        //la condizione di ripetizione è VERA
        System.out.println(i);    

        //int i =0;
        //
        //inizioCiclo:
        //      i++;
        //      System.out.println("ciao");
        //if(i<4) GOTO inizioCiclo;

        //continua resto programma
    }
}
