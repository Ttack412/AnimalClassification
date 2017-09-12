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
public class FlyingFish extends FishClass implements IFly, ISwim, IMakeSound{
    //fish constructor
    public FlyingFish(String Name, boolean isSaltWater) {
        super(Name, isSaltWater);
    }
    
    //methods from the interfaces
    @Override
    public void Fly() {
        System.out.println("The FlyingFish is flying");
    }
    
    @Override
    public void Swim() {
        System.out.println("The FlyingFish is swimming");
    }

    @Override
    public void MakeSound() {
        System.out.println("I'm a FlyingFish and I say Splash");
    }   
}
