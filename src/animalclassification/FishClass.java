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
public  class FishClass extends Animal{ 
    //passes on the fish constructor to the animals
    Boolean isSaltWater;

    public FishClass(String Name, boolean isSaltWater) {
        super(Name, isSaltWater);
    }     
}
