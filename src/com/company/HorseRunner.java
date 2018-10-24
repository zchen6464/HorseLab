package com.company;

public class HorseRunner {

    public static void main(String[] args) {
	// write your code here
        Horse horse1 = new Mustang("secretariat",12000);
        Horse horse2 = new Mustang("Dusty Trail", 22000);
        Horse horse3 = new Mustang("Silver", 12000);
        Horse[] horses = new Horse[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Dusty Tail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty Tail is in space: " + barn.findHorseSpace("Dusty Trail"));
    }
}
