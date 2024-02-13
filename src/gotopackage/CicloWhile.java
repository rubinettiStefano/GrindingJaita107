package gotopackage;

public class CicloWhile 
{
    public static void main(String[] args) 
    {
        int i=1289;
        
           //CONDIZIONE DI RIPETIZIONE  
        while(i<4)
        {
            //CORPO DEL CICLO
            i++;
            System.out.println("ciao");
        }

        //Il while continua ad eseguire il corpo del ciclo fino a quando
        //la condizione di ripetizione è VERA
        System.out.println(i);


        //int i
        //if(i>=4) G =0;OTO fineCiclo;
        //inizioCiclo:
        //      i++;
        //      System.out.println("ciao");
        //if(i<4) GOTO inizioCiclo;
        //fineCiclo;
        //continua resto programma
    }
}
