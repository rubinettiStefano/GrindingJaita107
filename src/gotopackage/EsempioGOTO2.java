package gotopackage;

public class EsempioGOTO2 
{
    public static void main(String[] args) 
    {
        int a =10;

        if(a>5)
        {
            //blocco di verità dell'IF
            a+=6;
            System.out.println("A era maggiore di 5, A + 6 vale "+a);
        }
        else
        {
             //blocco di falsità
            System.out.println("A è minore= a 5, vale infatti: "+a);
        }


        // if(a<=5) GOTO riga 28;
        // 
        // a+=6;
        // System.out.println("A era maggiore di 5, A + 6 vale "+a);
        // GOTO riga 29; FINE IF
        //
        // System.out.println("A è minore= a 5, vale infatti: "+a); BLOCCO ELSE
        //FINE ELSE


    }
}
