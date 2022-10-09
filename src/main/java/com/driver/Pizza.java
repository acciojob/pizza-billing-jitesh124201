package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    int bill1 = 0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            bill1+=300;
            System.out.println("Base Price Of The Pizza:"+ 300);
        }else{
            bill1+=400;
            System.out.println("Base Price Of The Pizza:"+400);
        }
        // your code goes here
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        bill1+=80;
        System.out.println("Extra Cheese Added:"+80);
        // your code goes here
    }

    public void addExtraToppings(){
        if(isVeg){
            bill1+=70;
            System.out.println("Extra Toppings Added: "+70);
        }else{
            bill1+=120;
            System.out.println("Extra Toppings Added:"+120);
        }
        // your code goes here
    }

    public void addTakeaway(){
        bill1+=20;
        System.out.println("Paperbag Added: "+20);
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        this.bill = String.valueOf(bill1);
        return this.bill;
    }
}
