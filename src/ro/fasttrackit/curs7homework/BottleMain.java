package ro.fasttrackit.curs7homework;

public class BottleMain {
    public static void main(String[] args){
        Bottle b1 = new Bottle();
        System.out.println(b1.getAvailableLiquid(150));

        System.out.println(b1.hasMoreLiquid(150));
        System.out.println(b1.emptyCapacity());
        b1.closeBottle();
        b1.openBottle();
        b1.drink(200);


    }
}
