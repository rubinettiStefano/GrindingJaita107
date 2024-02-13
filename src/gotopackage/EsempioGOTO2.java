package gotopackage;

public class EsempioGOTO2 
{
    public static void main(String[] args) 
    {
        int a =10;

        if(a>5)
        {
            
            a+=6;
            System.out.println("A era maggiore di 5, A + 6 vale "+a);
        }
        else//startElse:
        {
             //blocco di falsità
            System.out.println("A è minore= a 5, vale infatti: "+a);
        }//endElse:

        // if(a<=5) GOTO startElse;
        // 
        // a+=6;
        // System.out.println("A era maggiore di 5, A + 6 vale "+a);
        // GOTO endElse; 
        //
        // startElse:
        // 
        //      System.out.println("A è minore= a 5, vale infatti: "+a);
        // 
        // endElse:


    }
}
