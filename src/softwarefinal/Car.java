/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

/**
 * Car class for create every car.
 * @author burgess
 */
public abstract class Car {
    
    private String carLogo;//car logo for the car

    /**
     * 
     * @param cl 
     */
    public Car(CarLogo cl) {
        setCarLogo(cl);
    }

    public String getCarLogo() {
        return carLogo;
    }

    public void setCarLogo(CarLogo cl) throws IllegalArgumentException{
        if((cl.getLogo()!=null)&&!(cl.getLogo().trim().equals(""))){
            this.carLogo=cl.getLogo();
        }
        else{
            throw new IllegalArgumentException("The logo can not be nothing, "
                            +"please try again > ");
        }
    }
        
    public abstract String carTypeDescription();
    public abstract String getType();
    
    
}
    
    
    
    

