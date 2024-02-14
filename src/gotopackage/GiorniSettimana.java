package gotopackage;

public enum GiorniSettimana 
{
    LUNEDÌ(9,18),
    MARTEDÌ(9,18),
    MERCOLEDÌ(9,18),
    GIOVEDÌ(9,18),
    VENERDÌ(9,18),
    SABATO(9,13),
    DOMENICA(0,0);


    private final int orarioApertura;
    private final int orarioChiusura;


    GiorniSettimana(int orarioApertura,int orarioChiusura)
    {
        this.orarioApertura = orarioApertura;
        this.orarioChiusura = orarioChiusura;
    }


    public int getOrarioApertura() {
        return orarioApertura;
    }
    public int getOrarioChiusura() {
        return orarioChiusura;
    }

    
}
