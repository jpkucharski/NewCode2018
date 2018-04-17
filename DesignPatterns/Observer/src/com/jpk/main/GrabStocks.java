package com.jpk.main;

public class GrabStocks {

    public static void main(String[] arcs){

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAapPrice(677.60);
        stockGrabber.setGoogPrce(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAapPrice(677.60);
        stockGrabber.setGoogPrce(676.40);


        stockGrabber.unregister(observer1);

    }



}
