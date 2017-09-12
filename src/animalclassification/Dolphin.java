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
public class Dolphin extends MammalClass implements ISwim, IMakeSound{

    //mammal constructor
    public Dolphin(String Name, int BodyTemp) {
        super(Name, BodyTemp);
    }

    //methods from the interfaces
    @Override
    public void Swim() {
        System.out.println("The Dolphin is swimming");
    }
    
    @Override
    public void MakeSound() {
        System.out.println("I'm a Dolphin and I say Squeak");
    } 
}
