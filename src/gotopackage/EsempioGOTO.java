package gotopackage;

public class EsempioGOTO 
{
    public static void main(String[] args) 
    {
        int a =10;
        //(condizione)                 condizione==booleano

        boolean b = a>5;
        if(a>5)
        {
            //blocco di verità dell'IF
            a+=6;
            System.out.println("A era maggiore di 5, A + 6 vale "+a);
        }

        // if(a<=5) GOTO riga 22;
        // 
        // a+=6;
        // System.out.println("A era maggiore di 5, A + 6 vale "+a);
        // 
        
    }
}
