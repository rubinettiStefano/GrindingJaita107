package generici;

import java.util.ArrayList;
import java.util.List;

public class MainProvaSettimana 
{
    public static void main(String[] args) 
    {
        Anello<String> giorniSettimana = new Anello<String>();
        giorniSettimana.add("lun"); 
        giorniSettimana.add("mar");
        giorniSettimana.add("mer");
        giorniSettimana.add("gio");
        giorniSettimana.add("ven");
        giorniSettimana.add("sab");
        giorniSettimana.add("dom");   

        Anello<Integer> giorniSettimanaNumerici = new Anello<Integer>();
        giorniSettimanaNumerici.add(1); 
        giorniSettimanaNumerici.add(2);
        giorniSettimanaNumerici.add(3);
        giorniSettimanaNumerici.add(4);
        giorniSettimanaNumerici.add(5);
        giorniSettimanaNumerici.add(6);      
        giorniSettimanaNumerici.add(7);


        for(int i=0;i<10;i++)
            System.out.println(giorniSettimana.next());

    }

}
