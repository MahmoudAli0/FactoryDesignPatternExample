/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpatternexample;

/**
 *
 * @author user
 */
public class FactoryDesignPattern {
   public static final int BEEF_ID=1;
    public static final int CHICKEN_ID=2;
     public static final int FLAFEL_ID=3;
    public static SandwichClass createSandwich(int sandwichId){
      switch(sandwichId){
      
          case BEEF_ID:
              return new BeefSandwich();
             
            case CHICKEN_ID :
                return new ChickenBurger();
               
            case FLAFEL_ID :
                return new FlafelSandwich();
            
           default:
               return null;
               
      }
    }
}
