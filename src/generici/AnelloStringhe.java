package generici;

import java.util.ArrayList;
import java.util.List;

public class AnelloStringhe 
{
    private List<String> content = new ArrayList<String>();

    private int currentPosition = -1;

    public String getCurrent()
    {
        return content.get(currentPosition);
    }

    public String next()
    {
        currentPosition++;
        if(currentPosition>=content.size())
            currentPosition=0;

        return getCurrent();
    }

    public String previous()
    {
        currentPosition--;
        if(currentPosition<0)
            currentPosition=content.size()-1;

        return getCurrent();
    }

    public void add(String s)
    {
        content.add(s);
    }


}
