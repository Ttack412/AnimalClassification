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
public class Penguin extends BirdClass implements IWalk, ISwim, IMakeSound{
    
    //bird constructor
    public Penguin(double Wingspan, String Name) {
        super(Name,Wingspan);
    }
    
    //methods from the interfaces
    @Override
    public void Walk() {
        System.out.println("The Penguin is walking");
    }

    @Override
    public void Swim() {
        System.out.println("The Penguin is swimming");
    }
    
    @Override
    public void MakeSound() {
        System.out.println("I'm a Penguin and I say PECK PECK");
    } 
}
