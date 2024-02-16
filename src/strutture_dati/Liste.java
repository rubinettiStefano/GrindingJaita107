package strutture_dati;

import java.util.ArrayList;
import java.util.List;

public class Liste 
{
    public static void main(String[] args) 
    {
        List<String> l = new ArrayList<String>();    

        //ArrayList e LinkedList sono COMPONENTI di List, implementano interfaccia List
        //e quindi devono OBBLIGATORIAMENTE avere i metodi con cui siamo familiari
        
        //VANTAGGI ARRAYLIST
        //Accesso tramite posizione IMMEDIATO
        //Aggiunta in CODA IMMEDIATA

        //SVANTAGGIO ARRAYLIST
        //Lento nelle operazioni di aggiunta o rimozione non in coda
        //l.add("L");
        //0    1      2         3       4
        //S    A      T         P       L

        l.add(2, "C");

        

        //0    1      2         3         4       5
        //S    A      C         T         P       L
    }   
}
