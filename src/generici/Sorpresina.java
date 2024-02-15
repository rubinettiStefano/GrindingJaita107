package generici;

import java.util.ArrayList;
import java.util.List;

public class Sorpresina
{
    public static void main(String[] args) 
    {
        Integer s = 21;
        
        List<Integer> l = lista10Volte(s);

        System.out.println(l);
    }

    private static <X> List<X> lista10Volte(X x)
    {
        List<X> res = new ArrayList<X>();

        for(int i=0;i<10;i++)
            res.add(x);

        return res;
    } 
}
