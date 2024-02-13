package contesto;

public class ScopeBase 
{
    public static void main(String[] args) 
    {
        //i PARAMETRI SONO VARIABILI LOCALI AL METODO

        int a = 5;//questa variabile esiste tra la graffa alla riga 6 e quella che chiude il metodo main
        //a viene detta VARIABILE LOCALE AL METODO MAIN
        
        // if(a>2)
        //     int c =10;

        while(a>0)
        {
            int b = a; 
            //b esiste da dove è stata dichiarata fino alla chiusura del suo blocco di codice
            //quindi fino alla graffa che chiude il while
            //variabile locale al CICLO (al while)
            System.out.println("ciao diminuisco a di uno e aumento b di due");
            //COSA FA PARTE DEL CONTESTO A QUESTA RIGA
            //a E b
            a--;
            b+=2;
        } 
        //COSA FA PARTE DEL CONTESTO A QUESTA RIGA
        //solo a

    }
}
