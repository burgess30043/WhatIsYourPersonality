/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

/**
 * Create an enumeration class for the Car logo
 * @author Burgess
 */
public enum CarLogo {
    
    PORSCHE("Porsche"),
    FORD("Ford"),
    BMW("BMW"),
    TOYATA("Toyata");
    
    private String logo;//The variable for the logo

    /**
     * A constructor for creating the logo
     * @param logo is the String in the enumeration value
     */
    private CarLogo(String logo) {
        setLogo(logo);
    }

    /**
     * Create a getter method to get the car logo
     * @return String, the car logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Create a setter method to set a car logo
     * @param logo is the car logo
     * @throws IllegalArgumentException if the car logo is null or nothing
     */
    public void setLogo(String logo) throws IllegalArgumentException{
        if((logo!=null)&&!(logo.trim().equals(""))){
            this.logo=logo;
        }
        else{
            throw new IllegalArgumentException("The logo can not be nothing, "
                            +"please try again > ");
        }
    }
    
}
