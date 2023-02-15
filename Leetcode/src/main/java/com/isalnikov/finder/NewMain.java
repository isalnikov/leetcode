package com.isalnikov.finder;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Igor Salnikov <isalnikov1@gmail.com>
 * https://my-calend.ru/sovmestimost-po-date-rozhdeniya/31.03.1996/16.12.1982
 */
public class NewMain {

    public static void main(String[] args) throws IOException {
        LocalDate he = LocalDate.of(1982, 12, 16);
        LocalDate she = LocalDate.of(1982, 12, 16).plusYears(10);
        LocalDate now = LocalDate.now().minusYears(18);
        LocalDate today = LocalDate.now();
        System.out.println(he);
        System.out.println(now);
       DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd.MM.yyyy");

        while (she.isBefore(now)) {
            she = she.plusDays(1);
            
           // System.out.println(she.format(formatter));
            //document.getElementsByClassName('sovmestimost-po-date-rozhdeniya-amount-number')[0]
            String s = "https://my-calend.ru/sovmestimost-po-date-rozhdeniya/"+she.format(formatter)+"/16.12.1982";
            Document doc = Jsoup.connect(s).get(); //document.ge
            String val = doc.select("div.sovmestimost-po-date-rozhdeniya-amount-number").text().replaceAll("%", "").split(" ")[0];
            String val1 = doc.select("div.sovmestimost-po-date-rozhdeniya-amount-number").text().replaceAll("%", "").split(" ")[1];
            if(Integer.parseInt(val)>95 && Integer.parseInt(val1)>92)
               System.out.println(doc.select("div.sovmestimost-po-date-rozhdeniya-amount-number").text() + " " + she  + " " + (today.getYear() - she.getYear()) +" yo") ;

        }
        System.out.println("!!!");

    }

}
