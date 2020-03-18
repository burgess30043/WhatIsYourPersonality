/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

/**
 * Create a class for the Car type Sport
 * @author Burgess
 */
public class Sport extends Car{
   
    private String type;//A varible for the type String

    /**
     * A constructor for the Sport class
     * @param cl is the car logo extends from the parent class car
     * @param type is the car type Sport
     */
    public Sport(CarLogo cl, String type) {
        super(cl);
        setType(type);
    }

    /**
     * Create a getter method to get the car type, it overrides from the parent
     * class
     * @return String, car type
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * Create a setter method to set a car type
     * @param type is the car type Sport
     * @throws IllegalArgumentException if the car logo is null or nothing 
     */
    public void setType(String type) throws IllegalArgumentException{
        if((type!=null)&&!(type.trim().equals(""))){
            this.type=type;
        }
        else{
            throw new IllegalArgumentException("The car type can not be "
                    +"nothing, please try again > ");
        }
    }
    
    /**
     * An method for the carType that instantiate the description, 
     * it overrides from the parent class 
     * @return String is the car type description
     */
    @Override
    public String carTypeDescription(){
        
        String s = "";
        s+="Sport car is a luxury vehicle!";
        
        return s;
    }
}
