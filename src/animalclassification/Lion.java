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
public class Lion extends MammalClass implements IWalk, ISwim, IMakeSound{

    public Lion(String Name, int BodyTemp) {
        super(Name, BodyTemp);
    }

    @Override
    public void Walk()
    {
        System.out.println("The Lion is walking");
    }
    
    @Override
    public void Swim()
    {
        System.out.println("The Lion is swimming");
    }
    
    @Override
    public void MakeSound() {
        System.out.println("I'm a Lion and I say ROAR");
    } 
}
