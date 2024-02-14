package gotopackage;

import java.util.ArrayList;
import java.util.List;

import contesto.Persona;

public class BreakEContinue 
{
    public static void main(String[] args) 
    {
        

        for(int i = 0;i<10;i++)
        {
            if(i%2!=0)//numero dispari
                continue;

            //System.out.println(i);
        }

        List<Persona> persone = new ArrayList<Persona>();

        Persona p1 = new Persona();
        p1.nome = "Stefano";

        Persona p2 = new Persona();
        p2.nome = "Niko";

        Persona p3 = new Persona();
        p3.nome = "Mario";

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);

        Persona res = null;

        for(int i=0;i<persone.size() && res==null;i++)
        {
            if(persone.get(i).nome.equals("Niko"))
            {
                res = persone.get(i);
                // break;
            }

            System.out.println(i);
        }

        System.out.println(res.nome);
    }

    public static Persona searchNiko(List<Persona> persone)
    {
        for(int i=0;i<persone.size();i++)
        {
            if(persone.get(i).nome.equals("Niko"))
                return persone.get(i);

            System.out.println(i);
        }
        return null;
    }
}
