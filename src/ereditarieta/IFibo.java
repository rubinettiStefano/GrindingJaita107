package ereditarieta;

public interface IFibo 
{
    final static int MAX = 23;

    long fibo(int n);

    default long fibonacciDi10()
    {
        return fibo(10);
    }
}
