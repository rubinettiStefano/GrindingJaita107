package ereditarieta;

import java.util.List;

public abstract class Entity 
{
    public int id;

    public abstract List<String> getErrors();
   
    
    public boolean isValid()
    {
        return getErrors().size()==0;
    }
}
