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
public class Ostrich extends BirdClass implements IWalk, IMakeSound{
    
    public Ostrich(double Wingspan, String Name) {
        super(Name,Wingspan);
    }
    
    @Override
    public void Walk()
    {
        System.out.println("The Ostrich is walking");
    }
    
    @Override
    public void MakeSound() {
        System.out.println("I'm an Ostrich and I say CAWWW");
    } 
    
}
