/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectclasses;


/**
 *
 * @author DiegoCupido
 */
public class ObjectClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car car1 = new Car("Lambo", "Italy");
        car1.displayDetails();
        
        ElectricCar eCar1 = new ElectricCar("Tesla", "American", 15); 
        eCar1.displayDetails();
        
         /*int[] numbers = {10,20,30,40,50};
         int sum = 0;
    
        for (int i = 0; i < numbers.length; i++)
        {
            sum = numbers[i] + sum;
        }   
        System.out.println(sum);
        */
    }
    
    
  
   
   
}
