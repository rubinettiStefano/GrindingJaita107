package strutture_dati;

import java.util.Arrays;
import java.util.List;

public class Vettori 
{
    public static void main(String[] args) 
    {
        String[] sVet = new String[3];
        
        //In questo momento ho creato un vettore IN GRADO di contenere 3 STRING
        //al momento il vettore contiene il valore di default del tipo degli elementi

        //sVet[0] = null;
        //sVet[1] = null;
        //sVet[2] = null;

        int[] iVet = new int[3];

        //iVet[0] = 0;
        //iVet[1] = 0;
        //iVet[2] = 0;

        boolean[] bVet = new boolean[3];

        //bVet[0] = false; 
        //bVet[1] = false;
        //bVet[2] = false;

        String[] spVet = new String[]{"Ciao","Hello","Halo"};

        //spVet[0] = "Ciao"; 
        //spVet[1] = "Hello";
        //spVet[2] = "Halo";

        //lis.size();
        int lung = spVet.length;

        //DOMINANTE

        //A DOMINA SU B
        //A ha solo vantaggi rispetto a B
        //Non c'è nessun motivo per preferire B ad A

        //Vantaggi array
        //1) sono più PERFORMANTI
        //2) possono contenere primitivi


        List<String> lista = Arrays.asList(spVet);
    }
}
