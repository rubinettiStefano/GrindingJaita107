package strutture_dati;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mappe 
{
    public static void main(String[] args) 
    {
        Map<String,String> codFiscToNominativo = new HashMap<String,String>();
        
        codFiscToNominativo.put("SR219", "Stefano Rubinetti");
        codFiscToNominativo.put("AM203", "Alma Magnani");
        codFiscToNominativo.put("CB281", "Chiara Belfiore");
        codFiscToNominativo.put("SR219", "Esteban Rubinetti");
        
        //possiamo estrarre dalla mappa 3 cose
        //SET DELLE KEY
        //LISTA DEI VALORI
        //SET DI ENTRY
        
        //SET DELLE KEY
        for(String key : codFiscToNominativo.keySet())
        {
            String valoreAssociatoAllaKey = codFiscToNominativo.get(key);


        }


        for(String v : codFiscToNominativo.values())
        {
            
        }

        //dammi la chiave per il valore "Chiara Belfiore"

        for(Entry<String,String> coppia : codFiscToNominativo.entrySet())
        {
            String key = coppia.getKey();
            String value = coppia.getValue();   

            // if(value.equals("Chiara Belfiore"))
            //     return key;
        }

      //System.out.println(codFiscToNominativo.get("SR219"));

        Map<Integer,Object> idToOggetto = new HashMap<Integer,Object>();



       Map<String,String> dizionarioItaToEng = new HashMap<String,String>();

       dizionarioItaToEng.put("ciao", "hello");
       dizionarioItaToEng.put("arrivederci", "bye");

    //    System.out.println(dizionarioItaToEng.get("paperino"));
















    }
}
