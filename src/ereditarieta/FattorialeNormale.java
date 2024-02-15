package ereditarieta;

public class FattorialeNormale implements IFactorial
{

    @Override
    public long factorial(int n) 
    {
        //n sono tutti i numeri da 1 a N moltiplicati tra di loro
        //factoria(4)     1*2*3*4 -> 24

        long res =1;

        for(int i=2;i<=n;i++)
            res*=i;

        return res;
    }

}
