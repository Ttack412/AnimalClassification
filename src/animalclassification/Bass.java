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
public class Bass extends FishClass implements ISwim, IMakeSound{
    
    //fish constructor
    public Bass(String Name, boolean isSaltWater) {
        super(Name, isSaltWater);
    }
    
    //methods from the interfaces
    @Override
    public void Swim() {
        System.out.println("The Bass is swimming");
    }
    
    @Override
    public void MakeSound() {
        System.out.println("I'm a Bass and I say Splashy Splash");
    }     
}
