/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpatternexample;

/**
 *
 * @author Mahmoud ali
 */
public class FactoryDesignPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SandwichClass s1= FactoryDesignPattern.createSandwich(FactoryDesignPattern.BEEF_ID);
        s1.PrepareSandwich();
        SandwichClass s2= FactoryDesignPattern.createSandwich(FactoryDesignPattern.CHICKEN_ID);
        s2.PrepareSandwich();
        SandwichClass s3= FactoryDesignPattern.createSandwich(FactoryDesignPattern.FLAFEL_ID);
        s3.PrepareSandwich();
        
    }
    
}
