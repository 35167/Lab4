package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class infografika {
    String tytul;
    String adresStrony;
    public infografika(String tekst){

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);
        if(m.find()){
            tytul = m.group(1);
        }else{
            tytul = "";
        }

        pat = Pattern.compile("<link>(.*)<\\/link>");
        m = pat.matcher(tekst);
        if(m.find()){
            adresStrony = m.group(1);
        }else{
            adresStrony = "";
        }

    }
}
