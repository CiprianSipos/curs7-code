package ro.fasttrackit.curs7homework;

import java.sql.SQLOutput;

public class Bottle {
    private final int totalCapacity =500;
    private int availableLiquid;
    private boolean open;

public Bottle(){
    this.open=false;
}
public int getAvailableLiquid(int consumedLiquid){
    availableLiquid = totalCapacity-consumedLiquid;
    return availableLiquid;
}
public boolean hasMoreLiquid(int liquidComparationValue){
    return (availableLiquid>liquidComparationValue);
}
public int emptyCapacity(){
    return totalCapacity-availableLiquid;
}
public void openBottle(){
    this.open=true;
    System.out.println("Bottle is opened ");
    //return this.open;
}
public void closeBottle(){
    this.open=false;
    System.out.println("Bottle is closed");
    //return this.open;
}
public void drink(int drinkQuanity) {
    if (drinkQuanity<=availableLiquid && open==true) {
        availableLiquid = totalCapacity - drinkQuanity;
        System.out.println("You drank: " + drinkQuanity + "  of liquid");
        System.out.println("The bottle have " + availableLiquid + " milliliters available to be consumed");
    }else if(drinkQuanity<=availableLiquid && open!=true){
        System.out.println("Enough liquid,open the bottle");
    }else if(drinkQuanity>availableLiquid && open==true){
        System.out.println("Bottle open but not enough liquid.");
    }else {
        System.out.println("Bottle is closed and not enough liquid.");
    }
}

}
