package com.jpk.main;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject newStockGrabber, int newStartTime, String newStock, double newPrice){
        this.stockGrabber = newStockGrabber;
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;
    }


    @Override
    public void run() {
        for(int i=1; i<20; i++){
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.getMessage();
            }

            double ranNum = (Math.random() * (.06)) - .03;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format((price + ranNum)));

            if(stock == "IBM") ((StockGrabber)stockGrabber).setIbmPrice(price);
            if(stock == "AAPL") ((StockGrabber)stockGrabber).setAapPrice(price);
            if(stock == "GOOG") ((StockGrabber)stockGrabber).setGoogPrce(price);

            System.out.println(stock + ": " + df.format((price + ranNum)) + " " + df.format(ranNum));
            System.out.println();
        }


    }
}
