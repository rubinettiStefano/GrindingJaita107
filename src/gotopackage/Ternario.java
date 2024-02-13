package gotopackage;

public class Ternario 
{
    public static void main(String[] args) 
    {
        int a =10;
        

        //      condizione      valore TRUE         valoreFALSE
        int b = (a>15)      ?       5            :   20;


        String msg = "CIAO SONO STEFANO è ho un conto in banca in "+ (a>0 ? "positivo" : "negativo");

        //String msg = "CIAO SONO STEFANO è ho un conto in banca in ";
        //if(a>0)
        //  msg+="positivo";
        //else
        //  msg+="negativo";

        //percentuale di sconto in base a eta 
        //sotto gli 11 anni non paghi                100
        //tra 11 e 18 anni sconto 40 %             40
        //tra 19 e 64 anni no sconto               0
        //65+ sconto 70%                           70

        int eta = 28;

        int sconto =    eta<11      ?       100     :
                        eta<19      ?       40      :
                        eta<64      ?       0       :
                                            70      ;


    }
}
