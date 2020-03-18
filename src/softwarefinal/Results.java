/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

import java.util.ArrayList;

/**
 * Results class for quiz, it contains all the cars from the car logo and type.
 * @author Burgess
 */
public class Results {
    
    private ArrayList<Car> cars = new ArrayList();// An arraylist to store 
                                                //all the cars

    /**
     * Creates a default constructor for Results class
     */
    public Results() {
    }

    /**
     * Create a getter method to get the ArrayList<Car>
     * @return ArrayList<Car>, for the whole information store in the array list
     */
    public ArrayList<Car> getCars() {
        return cars;
    }

    /**
     * Create a setter method to set a car
     * @param cars, for the object car
     */
    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    /**
     * Create a generateAllCars method to store all cars
     */
    public void generateAllCars(){
        ArrayList<Car> cs = new ArrayList();
        cs.add(new SUV(CarLogo.BMW,"SUV"));
        cs.add(new SUV(CarLogo.FORD,"SUV"));
        cs.add(new SUV(CarLogo.PORSCHE,"SUV"));
        cs.add(new SUV(CarLogo.TOYATA,"SUV"));
        
        cs.add(new Sedan(CarLogo.BMW,"Sedan"));
        cs.add(new Sedan(CarLogo.FORD,"Sedan"));
        cs.add(new Sedan(CarLogo.PORSCHE,"Sedan"));
        cs.add(new Sedan(CarLogo.TOYATA,"Sedan"));
        
        cs.add(new Sport(CarLogo.BMW,"Sport car"));
        cs.add(new Sport(CarLogo.FORD,"Sport car"));
        cs.add(new Sport(CarLogo.PORSCHE,"Sport car"));
        cs.add(new Sport(CarLogo.TOYATA,"Sport car"));
        
        cs.add(new Van(CarLogo.BMW,"Van"));
        cs.add(new Van(CarLogo.FORD,"Van"));
        cs.add(new Van(CarLogo.PORSCHE,"Van"));
        cs.add(new Van(CarLogo.TOYATA,"Van"));
        
        this.setCars(cs);
    }
    
//    public static void main(String[] args) {
//        Results allCars = new Results();
//        allCars.generateAllCars();
//        System.out.println(allCars.getCars().get(15).getCarLogo());
//        System.out.println(allCars.getCars().get(15).getType());
//        System.out.println(allCars.getCars().get(15).carTypeDescription());
//        
//    }
    
}
