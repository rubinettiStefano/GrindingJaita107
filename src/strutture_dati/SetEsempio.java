package strutture_dati;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetEsempio 
{
    public static void main(String[] args) 
    {
        Set<String> s = new HashSet<String>();    


        s.add("ciao");
        s.add("ciaO");
        s.add("bye");
        //Insieme di elementi dello stesso tipo, di lunghezza variabile
        //NON ORDINATO
        //NO DUPLICATI

        // System.out.println(s.size());


        Tazza t1 = new Tazza();
        t1.id = 1;
        t1.materiale = "vetro";
        t1.rovesciata = true;

        Tazza t2 = new Tazza();
        t2.id = 1;
        t2.materiale = "vetro";
        t2.rovesciata = true;

        // System.out.println(t1.hashCode());
        // System.out.println(t2.hashCode());
        // System.out.println(t1.equals(t2));//equals -> a.hashCode()==b.hashCode()


        Set<Tazza> tazze = new HashSet<Tazza>();
        tazze.add(t1);
        tazze.add(t2);

        System.out.println(tazze);
        List<Tazza> tazzeL = new ArrayList<Tazza>(tazze);




    }



}
