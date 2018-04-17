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


        Runnable getIBM = new GetTheStock(stockGrabber,2,"IBM", 197.00);
        Runnable getAPPL = new GetTheStock(stockGrabber,2,"APPL", 677.60);
        Runnable getGOOG = new GetTheStock(stockGrabber,2,"GOOG", 676.40);

        new Thread(getIBM).start();
        new Thread(getAPPL).start();
        new Thread(getGOOG).start();


    }



}
