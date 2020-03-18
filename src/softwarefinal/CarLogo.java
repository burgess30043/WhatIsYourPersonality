/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

/**
 *
 * @author burge
 */
public enum CarLogo {
    
    PORSCHE("Porsche"),
    FORD("Ford"),
    BMW("BMW"),
    TOYATA("Toyata");
    
    private String logo;

    private CarLogo(String logo) {
        setLogo(logo);
    }

    public String getLogo() {
        return logo;
    }

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
