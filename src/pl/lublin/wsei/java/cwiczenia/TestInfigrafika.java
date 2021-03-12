package pl.lublin.wsei.java.cwiczenia;

public class TestInfigrafika {
    public static void main(String[] args) {
        String exItem = "\t\t<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Międzynarodowy Dzień Osób z Niepełnosprawnościami]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Thu, 03 Dec 2020 12:46:00 +0100]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-miedzynarodowy-dzien-osob-z-niepelnosprawnosciami,94,1.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-miedzynarodowy-dzien-osob-z-niepelnosprawnosciami,94,1.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/94/1/1/dzien_niepelnosp_2020-02.png\" type=\"image/png\" width=\"1024\" height=\"1464\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/94/1/1/dzien_niepelnosp_2020-02,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/94/1/1/dzien_niepelnosp_2020-02,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t\t\t</item>";

        infografika inf = new infografika(exItem);
    }
}
