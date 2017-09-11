/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalclassification;

import java.util.ArrayList;

/**
 *
 * @author ttackett
 */
public class AnimalClassification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Animal> myAnimals = new ArrayList<>();
        ArrayList<Animal> myBirds = new ArrayList<>();
        ArrayList<Animal> myMammals = new ArrayList<>();
        ArrayList<Animal> myFishes = new ArrayList<>();
        ArrayList<IFly> myFlyers = new ArrayList<>();
        ArrayList<IWalk> myWalkers = new ArrayList<>();
        ArrayList<ISwim> mySwimmers = new ArrayList<>();
        ArrayList<IMakeSound> mySoundMakers = new ArrayList<>();
        
        FlyingFish myFlyingFish = new FlyingFish("Blake", true);
        Shark myShark = new Shark("AG", true);
        Bass myBass = new Bass("John", false);
        Lion myLion = new Lion("Ethan", 102);
        Bat myBat = new Bat("Zack", 100);
        Dolphin myDolphin = new Dolphin("Timmy", 98);
        Duck myDuck = new Duck(2,"Parker");
        Eagle myEagle = new Eagle(6.5,"MrG");
        Ostrich myOstrich = new Ostrich(5,"Aiden");
        Penguin myPenguin = new Penguin(3,"Caleb");
        
        myAnimals.add(myFlyingFish);
        myAnimals.add(myShark);
        myAnimals.add(myBass);
        myAnimals.add(myLion);
        myAnimals.add(myBat);
        myAnimals.add(myDolphin);
        myAnimals.add(myDuck);
        myAnimals.add(myEagle);
        myAnimals.add(myOstrich);
        myAnimals.add(myPenguin);
        
        myBirds.add(myEagle);
        myBirds.add(myPenguin);
        myBirds.add(myOstrich);
        myBirds.add(myDuck);
        
        myMammals.add(myDolphin);
        myMammals.add(myLion);
        myMammals.add(myBat);
        
        myFishes.add(myShark);
        myFishes.add(myBass);
        myFishes.add(myFlyingFish);
        
        myFlyers.add(myEagle);
        myFlyers.add(myDuck);
        myFlyers.add(myFlyingFish);

        myWalkers.add(myPenguin);
        myWalkers.add(myEagle);
        myWalkers.add(myLion);
        myWalkers.add(myBat);
        myWalkers.add(myOstrich);
        myWalkers.add(myDuck);
        
        mySwimmers.add(myPenguin);
        mySwimmers.add(myEagle);
        mySwimmers.add(myDolphin);
        mySwimmers.add(myLion);
        mySwimmers.add(myShark);
        mySwimmers.add(myFlyingFish);
        mySwimmers.add(myBass);
        mySwimmers.add(myDuck);
        
        mySoundMakers.add(myOstrich);
        mySoundMakers.add(myPenguin);
        mySoundMakers.add(myEagle);
        mySoundMakers.add(myDolphin);
        mySoundMakers.add(myLion);
        mySoundMakers.add(myBat);
        mySoundMakers.add(myBass);
        mySoundMakers.add(myFlyingFish);
        mySoundMakers.add(myDuck);
        
        for(Animal animals: myAnimals)
        {
            System.out.println("My name is " + animals.getName());
        }
        
        System.out.println("");
        System.out.println("");
        
        for(Animal animals: myBirds)
        {
            System.out.println(animals.getName() + "s" + " wingspan is " + animals.getWingspan());
        }
        
        System.out.println("");
        System.out.println("");
        
        for(Animal animals: myMammals)
        {
            System.out.println(animals.getName() + "s" + " bodyTemp is " + animals.getBodyTemp());
        }
        
        System.out.println("");
        System.out.println("");
        
        for(Animal animals: myFishes)
        {
            if(animals.isSaltWater)
            {
                System.out.println(animals.getName() + " swims in salt water");
            }
            else
            {
                System.out.println(animals.getName() + " swims in fresh water");
            }
            
        }
        
        System.out.println("");
        System.out.println("");
        
        for(IFly flyers: myFlyers)
        {
            flyers.Fly();
        }
        
        System.out.println("");
        System.out.println("");
        
        for(IWalk walkers: myWalkers)
        {
            walkers.Walk();
        }
        
        System.out.println("");
        System.out.println("");
        
        for(ISwim swimmers: mySwimmers)
        {
            swimmers.Swim();
        }
        
        System.out.println("");
        System.out.println("");
        
        for(IMakeSound sounds: mySoundMakers)
        {
            sounds.MakeSound();
        }
    }
}
