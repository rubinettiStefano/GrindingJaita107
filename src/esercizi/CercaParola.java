package esercizi;

import java.util.ArrayList;
import java.util.List;

public class CercaParola 
{
    public static void main(String[] args) {
        
        //ricevete una matrice di CARATTERI 5x5
       
        //obiettivo1-> stampare TROVATO se in orizzontale, in qualche riga
        //è presente la parola CANE
        //altrimenti stampare NON TROVATO

        //obiettivo1-> stampare TROVATO se in orizzontale o VERTICALE
        //è presente la parola CANE
        //altrimenti stampare NON TROVATO
        char[][] matrice = Generatore.generaMatriceRigaConCane();

        List<String> elenco = new ArrayList<String>();


        for(int j=0;j<5;j++)
        {
            String s = "";
            for(int i=0;i<5;i++)
            {
                s+=matrice[i][j];         //matrice[0][0]   //matrice[1][0]
            }

            elenco.add(s);
        }
        boolean found = false;
        for(String s : elenco)
        {
            if( s.contains("cane"))
                found=true;
        }

        System.out.println(found ? "TROVATO" : "NON TROVATO");
    }
}
