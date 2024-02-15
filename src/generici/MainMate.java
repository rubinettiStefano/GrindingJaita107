package generici;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainMate 
{
    public static void main(String[] args) 
    {
        //Mate<Integer> m = new MateImplSum();

        // Mate<Integer> m = new Mate<Integer>() //qui stiamo chiamando il costruttore di una classe anonima che implementa interfaccia
        //                     {
        //                         @Override
        //                         public Integer calc(Integer x1, Integer x2) 
        //                         {
        //                             return x1+x2;
        //                         }
        //                     };
                        
        Mate<Integer> m = /* public Integer calc */(/*Integer*/x1,/*Integer*/x2) -> 
                            {
                                return x1+x2;
                            };//corpo

        Mate<Integer> m1 = (x1,x2) -> x1+x2;

        List<Integer> l = Arrays.asList(new Integer[]{2,6,19,24,31,8,15,89});

        Predicate<Integer> p = n -> n>=18;

        //System.out.println(m.calc(10,20));
        List<Integer> filtrata = l.stream().filter(p).toList();
        List<Integer> filtrata2 = l.stream().filter(n -> n>=18).toList();
        //let filtrJs = l.filter(n => n>20);
    }

    public static List<Integer> filtra(List<Integer>l,Predicate<Integer>p)
    {
        List<Integer> res = new ArrayList<Integer>();
        for(Integer i:l)
            if(p.test(i))
                res.add(i);

        return res;
    }


}
