package ereditarieta;

import java.util.List;

public abstract class Entity 
{
    protected int id;

    public abstract List<String> getErrors();
   
    
    
    public boolean isValid()
    {
        return getErrors().size()==0;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }
}
