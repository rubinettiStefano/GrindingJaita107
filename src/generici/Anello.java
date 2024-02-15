package generici;

import java.util.ArrayList;
import java.util.List;


public class Anello <Boh>
{
    private List<Boh> content = new ArrayList<Boh>();

    private int currentPosition = -1;

    public Boh getCurrent()
    {
        return content.get(currentPosition);
    }

    public Boh next()
    {
        currentPosition++;
        if(currentPosition>=content.size())
            currentPosition=0;

        return getCurrent();
    }

    public Boh previous()
    {
        currentPosition--;
        if(currentPosition<0)
            currentPosition=content.size()-1;

        return getCurrent();
    }

    public void add(Boh s)
    {
        content.add(s);
    }
}
