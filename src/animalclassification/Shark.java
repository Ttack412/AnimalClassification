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
public class Shark extends FishClass implements ISwim, IMakeSound{
    
    public Shark(String Name, boolean isSaltWater) {
        super(Name, isSaltWater);
        this.Name = Name;
    }

    @Override
    public void Swim() {
        System.out.println("The Shark is swimming");
    }
    
    @Override
    public void MakeSound() {
        System.out.println("I'm a Shark and I say RAWR");
    } 
}
