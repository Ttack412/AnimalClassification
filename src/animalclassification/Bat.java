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
public class Bat extends MammalClass implements IFly, IWalk, ISwim, IMakeSound{

    //mammal constructor
    public Bat(String Name, int BodyTemp) {
        super(Name, BodyTemp);
    }
    
    //methods from the interfaces
    @Override
    public void Fly() {
        System.out.println("The Bat is flying");
    }

    @Override
    public void Walk() {
        System.out.println("The Bat is walking");
    }

    @Override
    public void Swim() {
        System.out.println("The Bat is swimming");
    }
    
    @Override
    public void MakeSound() {
        System.out.println("I'm a Bat and I say Screech");
    } 
}
