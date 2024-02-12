package variabili;

public class EsempioVariabili2 
{
    public static void main(String[] args) 
    {
        Persona variabileMain = new Persona("Stefano", "Rubinetti");
        //int a =10;
        //metodinoParPrim(a);//qui il parametro viene sostituito dal valore
        //metodinoParPrim(10);
        //System.out.println(a);
        metodinoParOgg2(variabileMain);
        System.out.println(variabileMain);
    }

    //I parametri PRIMITIVI vengono passati tramite VALORE
    public static void metodinoParPrim(int p)//int
    {
        p=20;
    }
    
    //I parametri OGGETTO vengono passati come COPIA DEL RIFERIMENTO
    //p è una variabile che punta allo stesso oggetto di quella passata come parametro
    //Persona p = variabileMain;
    public static void metodinoParOgg(Persona p)
    {
        p.nome="Esteban";
    }

    //Persona p = variabileMain;
    public static void metodinoParOgg2(Persona p)
    {
        p=new Persona("Esteban", "Rubinetti");
    }
}
