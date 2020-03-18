/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

/**
 * Car class for create every car.
 * @author Burgess
 */
public abstract class Car {
    
    private String carLogo;//car logo for the car

    /**
     * Creates a default constructor for Car class
     * @param cl is the Car logo
     */
    public Car(CarLogo cl) {
        setCarLogo(cl);
    }
    
    /**
     * Create a getter method to get the car logo
     * @return carLogo
     */
    public String getCarLogo() {
        return carLogo;
    }

    /**
     * Create a setter method to set a car logo
     * @param cl is the car logo
     * @throws IllegalArgumentException if the car logo is null or nothing
     */
    public void setCarLogo(CarLogo cl) throws IllegalArgumentException{
        if((cl.getLogo()!=null)&&!(cl.getLogo().trim().equals(""))){
            this.carLogo=cl.getLogo();
        }
        else{
            throw new IllegalArgumentException("The logo can not be nothing, "
                            +"please try again > ");
        }
    }
    
    /**
     * An abstract method for the carType description that the child class need
     *  to be followed.
     * @return String for the car description about the reason why the car is 
     *          the best for the user
     */    
    public abstract String carTypeDescription();
    
    /**
     * An abstract method for the carType that the child class need
     *  to be followed to get the type.
     * @return String for the car type
     */  
    public abstract String getType();
    
    
}
    
    
    
    

