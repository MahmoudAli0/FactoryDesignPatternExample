/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpatternexample;

/**
 *
 * @author  Mahmoud ali
 */
public class SandwichClass {
    private String SandwichName;
    private int NumberOfCalories;

    public String getSandwichName() {
        return SandwichName;
    }

    public void setSandwichName(String SandwichName) {
        this.SandwichName = SandwichName;
    }

    public int getNumberOfCalories() {
        return NumberOfCalories;
    }

    public void setNumberOfCalories(int NumberOfCalories) {
        this.NumberOfCalories = NumberOfCalories;
    }
    
    
    public void PrepareSandwich(){
        System.out.println(SandwichName +" is prepareing with number of calories = "+NumberOfCalories);
        System.out.println("////////////////////////////////////////////////////////////////////////");
        
    }

    
}
