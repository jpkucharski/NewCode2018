package com.jpk.main;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;





public class Main {

    public static void main (String[] args) throws IOException {


        final String SYM = "KO";
        try {

//            URL url = new URL("http://download.finance.yahoo.com/d/quotes.csv?s=AAPL+GOOG+MSFT&f=snbaopl1");
//            URL url = new URL("https://finance.yahoo.com/quote/CL=F?p=CL=F");
            URL url = new URL("https://www.google.com/finance/getprices?q=LHA&x=ETR&i=60&p=1d&f=d,c,h,l,o,v");
            URLConnection urlConnection = url.openConnection();
            InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line = bufferedReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }




        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
