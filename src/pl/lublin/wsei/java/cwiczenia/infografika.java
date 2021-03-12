package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class infografika {
    String tytul;
    String adresStrony;
    String adresGrafiki;
    String adresMiniaturki;
    String wysokosc;
    String szerokosc;



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

        pat = Pattern.compile("<media:content url=\"(.*)\"");
        m = pat.matcher(tekst);
        if(m.find()){
            adresGrafiki = m.group(1);
        }else{
            adresGrafiki = "";
        }

        pat = Pattern.compile("<description><!\\[CDATA\\[<div><img src=\"(.*)\" a");
        m = pat.matcher(tekst);
        if(m.find()){
            adresMiniaturki = m.group(1);
        }else{
            adresMiniaturki = "";
        }

        pat = Pattern.compile("alt=\"\" width=\"(.*)\" h");
        m = pat.matcher(tekst);
        if(m.find()){
            szerokosc = m.group(1);
        }else{
            szerokosc = "";
        }

        pat = Pattern.compile("height=\"(.*)\"\\/>");
        m = pat.matcher(tekst);
        if(m.find()){
            wysokosc = m.group(1);
        }else{
            wysokosc = "";
        }

        System.out.print("tytul: " + tytul+"\n adres grafiki: "+adresGrafiki + "\n adres strony: "+adresStrony+"\n adres miniaturki: "+ adresMiniaturki + "\n rozmiar: "+wysokosc+"x"+szerokosc);
    }
}
