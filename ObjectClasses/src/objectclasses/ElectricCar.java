/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectclasses;

/**
 *
 * @author DiegoCupido
 */
public class ElectricCar extends Car {
    protected int batteryCapacity;
     int getBatteryCapacity()
    {
        return batteryCapacity;
    }
     public void setBatteryCapacity(String newBatteryCapacity)
    {
        this.model = newBatteryCapacity;
    }
     
    ElectricCar(String model, String brand,int batteryCapacity )
    {
        super(model, brand);
        this.batteryCapacity = batteryCapacity;
    }
    
    @Override
    
     public void displayDetails()
    {
        System.out.println(" Brand: "+ brand + " Model:" + model + " Battery Capicity: " + batteryCapacity + "kWh");
    }
}
