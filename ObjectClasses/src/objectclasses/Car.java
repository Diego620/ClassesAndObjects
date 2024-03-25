/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectclasses;

/**
 *
 * @author DiegoCupido
 */
public class Car {
    protected String brand,model;
  
    Car(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }  
    String getModel()
    {
        return model;
    }
    
    public void setModel(String newModel)
    {
        this.model = newModel;
    }
    String getBrand()
    {
        return brand;
    }
    
    public void setBrand(String newBrand)
    {
        this.model = newBrand;
    }
    public void displayDetails()
    {
        System.out.println("Brand: "+ brand + " Model: " + model);
    }
}
