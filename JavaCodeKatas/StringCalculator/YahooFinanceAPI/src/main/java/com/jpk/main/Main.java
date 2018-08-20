package com.jpk.main;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.quotes.fx.FxQuote;
import yahoofinance.quotes.fx.FxSymbols;

import java.io.IOException;
import java.math.BigDecimal;

public class Main {


    public static void main (String[] args) throws IOException, InterruptedException {
        Stock stock = YahooFinance.get("KO");

        BigDecimal price = stock.getQuote().getPrice();
        BigDecimal change = stock.getQuote().getChangeInPercent();
        BigDecimal peg = stock.getStats().getPeg();
        BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();



        while(true){
            System.out.println(stock + " / " + stock.getName());
            Thread.sleep(1000);
        }


    }

}
