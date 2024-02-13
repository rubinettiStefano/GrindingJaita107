import contesto.Persona;

public class ScopeConOggettoAltroPackage 
{
    public static void main(String[] args) 
    {
        Persona p = new Persona();//p locale al metodo main
        
        p.nome ="s";
        //p.cognome ="c";//non fa parte del contesto perchè utilizzatore è in package diverso
        // p.eta = 10; non fa parte del contesto

        //public               tutto progetto
        //protected            package + sottotipi dovunque essi siano
        //package/default      package della classe in cui membro è stato dichiarato
        //private              classe in cui membro è stato dichiarato
    }
}
