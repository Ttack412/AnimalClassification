/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalclassification;

/**
 *
 * @author ttackett
 */
public class Animal{
    //all needed properties
    String Name;
    double Wingspan;
    int BodyTemp;
    boolean isSaltWater;

    //constructor for a fish
    public Animal(String Name, boolean isSaltWater) {
        this.Name = Name;
        this.isSaltWater = isSaltWater;
    }
    
    //constructor for a bird
    public Animal(String Name, double Wingspan) {
        this.Name = Name;
        this.Wingspan = Wingspan;
    }
    
    //constructor for a mammal
    public Animal(String Name, int BodyTemp) {
        this.Name = Name;
        this.BodyTemp = BodyTemp;
    }
    
    //getters and setters for all properties
    public void setWingspan(double Wingspan) {
        this.Wingspan = Wingspan; 
    }

    public int getBodyTemp() {
        return BodyTemp;
    }

    public void setBodyTemp(int BodyTemp) {
        this.BodyTemp = BodyTemp;
    }
    
    public double getWingspan() {
        return Wingspan;
    }

    public void setName(String Name) {
       this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public boolean isIsSaltWater() {
        return isSaltWater;
    }

    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }

    //Outputs all of the properties values
    @Override
    public String toString() {
        return "Animal{" + "Name=" + Name + ", Wingspan=" + Wingspan + ", BodyTemp=" + BodyTemp + ", isSaltWater=" + isSaltWater + '}';
    }

      
}
