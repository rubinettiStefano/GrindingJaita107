package strutture_dati;

import java.util.Set;

public class Tazza 
{

    private final static Set<String> VALID_MATERIALS= Set.of("ceramica","plastica","vetro");

    public Integer id;
    public String materiale;
    public boolean rovesciata;
   
    public boolean isValid()
    {
        if(id<0)
            return false;

        if(!VALID_MATERIALS.contains(materiale))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "Tazza [id=" + id + ", materiale=" + materiale + ", rovesciata=" + rovesciata + "]";
    }


    @Override
    public int hashCode()
    {
        return id;
    }

    @Override
    public boolean equals(Object o)
    {
        if(!(o instanceof Tazza))
            return false;

        Tazza other = (Tazza) o;

        return hashCode()==other.hashCode();
    }

    
}
