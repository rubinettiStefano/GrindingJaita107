package ereditarieta;

import java.util.HashMap;
import java.util.Map;

public class FibonacciCachatoV1 implements IFibo
{

    private Map<Integer,Long> chache = new HashMap<Integer,Long>();

    @Override
    public long fibo(int n) 
    {

        //1 1 2 3 5 8 13 21 34 55 89 144 233 eccc....
        if(n<2)
            return 1;

        if(chache.containsKey(n))
            return chache.get(n);

        long a = 1;
        long b=1;

        long res = 1;


        for(int i=2;i<=n;i++)
        {
            res= a+b;
            a=b;
            b=res;
        }

        chache.put(n, res);
        return res;
    }
}
