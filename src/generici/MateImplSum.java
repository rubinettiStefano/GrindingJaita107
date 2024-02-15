package generici;

public class MateImplSum implements Mate<Integer>
{
    @Override
    public Integer calc(Integer x1, Integer x2) {
        return x1+x2;
    }
}
