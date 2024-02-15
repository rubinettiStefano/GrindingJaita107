package ereditarieta;

public class MainProveInterfacce 
{
    public static void main(String[] args) 
    {
        IFibo fib = new FibonacciNormale();
        

        long startTime = System.nanoTime();
        for(int i=0;i<10000000;i++)
        {
            long r1 = fib.fibo(1000000000);
        }
        long endTime = System.nanoTime();

        System.out.println((endTime-startTime));


    }
}
