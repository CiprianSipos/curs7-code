package ro.fasttrackit.curs7;

public class Main {
    public static void main(String[] args){
    Clock myClock = new Clock(18,54);

        System.out.println(myClock.readTime());
        System.out.println(myClock.getHour());
        System.out.println(myClock.getMinutes());
        System.out.println(myClock.getMinutes()+1);
        System.out.println(myClock.getMinutes());


        Clock seocondClock =  new Clock(10);
        System.out.println(seocondClock.readTime());

        Clock brokenClock = new Clock(99,99);
        System.out.println(brokenClock.readTime());

        brokenClock.setHour(98);
        brokenClock.setMinutes(98);
        System.out.println(brokenClock.readTime());

        brokenClock.setMinutes(-9999);
        System.out.println(brokenClock.readTime());

        seocondClock.addMinutes(10);
        System.out.println(seocondClock.readTime());
        seocondClock.addMinutes(60);
        System.out.println(seocondClock.readTime());
        seocondClock.addMinutes(-60);
        System.out.println(seocondClock.readTime());
        seocondClock.addMinutes(50);
        System.out.println(seocondClock.readTime());
    }
}
