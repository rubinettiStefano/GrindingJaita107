package ereditarieta;

public class FibonacciNormale  implements IFibo
{

    @Override
    public long fibo(int n) 
    {

        //1 1 2 3 5 8 13 21 34 55 89 144 233 eccc....
        if(n<2)
            return 1;

        long a = 1;
        long b=1;

        long res = 1;


        for(int i=2;i<=n;i++)
        {
            res= a+b;
            a=b;
            b=res;
        }

        return res;
    }

}
