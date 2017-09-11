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
    String Name;
    double Wingspan;
    int BodyTemp;
    boolean isSaltWater;

    public Animal(String Name, boolean isSaltWater) {
        this.Name = Name;
        this.isSaltWater = isSaltWater;
    }
    
    public Animal(String Name, double Wingspan) {
        this.Name = Name;
        this.Wingspan = Wingspan;
    }
    
    public Animal(String Name, int BodyTemp) {
        this.Name = Name;
        this.BodyTemp = BodyTemp;
    }

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

    @Override
    public String toString() {
        return "Animal{" + "Name=" + Name + ", Wingspan=" + Wingspan + ", BodyTemp=" + BodyTemp + ", isSaltWater=" + isSaltWater + '}';
    }

      
}
