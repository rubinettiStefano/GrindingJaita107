package ereditarieta;

import java.util.HashMap;
import java.util.Map;

public class FattorialeCachatoV1 implements IFactorial
{
    private Map<Integer,Long> chache = new HashMap<Integer,Long>();

    @Override
    public long factorial(int n) 
    {
        if(chache.containsKey(n))
            return chache.get(n);

        long res =1;

        for(int i=2;i<=n;i++)
            res*=i;

        chache.put(n, res);
        return res;
    }

}
