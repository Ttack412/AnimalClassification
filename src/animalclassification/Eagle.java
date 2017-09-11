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
public class Eagle extends BirdClass implements IWalk, IFly, ISwim, IMakeSound{


    public Eagle( double Wingspan, String Name) {
        super(Name, Wingspan);
    }

    @Override
    public void Walk() {
        System.out.println("The Eagle is walking");
    }

    @Override
    public void Fly() {
        System.out.println("The Eagle is flying");
    }
    
    @Override
    public void Swim() {
        System.out.println("The Eagle is swimming");
    }
    
    @Override
    public void MakeSound() {
        System.out.println("I'm an Eagle and I say REEEE");
    } 
}
