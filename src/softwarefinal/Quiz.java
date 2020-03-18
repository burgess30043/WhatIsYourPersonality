/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import errorCheck.JavaErrorCheck;

/**
 * The quiz class is the main class to start the quiz
 * @author Burgess
 */
public class Quiz {

    /**
     * Main method to call the whole method, first is the greeting method,
     * second is the mkUser method and startQ method to begin the whole mission
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        greeting();
        mkUser();
        startQ();
    }
    
    /**
     * greeting static method is to introduce the quiz for the user
     */
    public static void greeting(){

        String s = "";
        s+= "Let your mind choose the best car for you!";
        System.out.println(s);
        System.out.println("---------------------------------------------------"
            +"---------------------------------------------------"
            +"---------------------------------------------------");
    }
    
    /**
     * mkUser method is to create a new user for the quiz
     */
    public static void mkUser(){
        
        Scanner input = new Scanner(System.in);
        JavaErrorCheck jec = new JavaErrorCheck();
        
        System.out.println("Please enter your name:");
        String name = jec.checkEnterOfString(input);
        System.out.println("Please enter your student ID:");
        String ID = jec.checkID(input);
        
        User newUser = new User(name, ID);
        System.out.println(newUser.toString());
        System.out.println("Let's start our journey!");
        System.out.println("---------------------------------------------------"
            +"---------------------------------------------------"
            +"---------------------------------------------------");
        
    }
    
    /**
     * startQ method will start the quiz, it contains the mkQuestions and 
     * mkAnswers method and do the quiz
     */
    public static void startQ(){
        
        Random ran = new Random();// randomly pick the first three question
        Scanner input = new Scanner(System.in);
        JavaErrorCheck jec = new JavaErrorCheck();//error check for the user
        
        ArrayList<Questions> Qarr = mkQuestions();//make all the question
        ArrayList<Answers> Aarr = mkAnswers();//make all the answer

        System.out.println("Here is your first question and the options > ");
        int count = ran.nextInt(2);
        
        int choice;
        int SedanNum=0, VanNum=0, SportNum=0, SUVNum=0;
        int FordNum=0, BMWNum=0, ToyotaNum=0, PorscheNum=0;
        //The int will calculate all the score and use the method to generate 
        //the best car
        
        switch (count){//the first question is picked from the question 1, 2
            case 0:
                System.out.println(Qarr.get(0).getQuestion());
                System.out.println(Aarr.get(0).toString());
                System.out.println("Please enter your answer:");
                choice = jec.checkIntOneTwoThree(input);
                
                if(choice==1){
                   SedanNum++; 
                }
                else if(choice==2){
                   VanNum++;
                   SUVNum++;
                }
                else SportNum++;
                break;
                
            case 1:
                System.out.println(Qarr.get(1).getQuestion());
                System.out.println(Aarr.get(1).toString());
                System.out.println("Please enter your answer:");
                choice = jec.checkIntOneTwoThree(input);
                
                if(choice==1){
                   SedanNum++; 
                }
                else if(choice==2){
                   SportNum++;
                }
                else{
                   VanNum++;
                   SUVNum++;
                }
                break;
        }
        
        System.out.println("Here is your next question and the options > ");
        count = ran.nextInt(2);
        switch (count){//the second question is picked from the question 3, 4
            case 0:
                System.out.println(Qarr.get(2).getQuestion());
                System.out.println(Aarr.get(2).toString());
                System.out.println("Please enter your answer:");
                choice = jec.checkIntOneTwoThree(input);
                
                if(choice==1){
                   PorscheNum++; 
                }
                else if(choice==2){
                   BMWNum++;
                   FordNum++;
                }
                else ToyotaNum++; 
                break;
                
            case 1:
                System.out.println(Qarr.get(3).getQuestion());
                System.out.println(Aarr.get(3).toString());
                System.out.println("Please enter your answer:");
                choice = jec.checkIntOneTwoThree(input);
                
                if(choice==1){
                   ToyotaNum++; 
                }
                else if(choice==2){
                   BMWNum++;
                   FordNum++;
                }
                else PorscheNum++;
                break;
        }
        
        System.out.println("Here is your next question and the options > ");
        count = ran.nextInt(2);
        switch (count){//the third question is picked from the question 5, 6
            case 0:
                System.out.println(Qarr.get(4).getQuestion());
                System.out.println(Aarr.get(4).toString());
                System.out.println("Please enter your answer:");
                choice = jec.checkIntOneTwoThree(input);
                
                if(choice==1){
                   SedanNum++; 
                }
                else if(choice==2){
                   VanNum++;
                   SUVNum++;
                }
                else SportNum++;
                break;
                
            case 1:
                System.out.println(Qarr.get(5).getQuestion());
                System.out.println(Aarr.get(5).toString());
                System.out.println("Please enter your answer:");
                choice = jec.checkIntOneTwoThree(input);
                
                if(choice==1){
                   SUVNum++; 
                }
                else if(choice==2){
                   SportNum++;
                }
                else{
                   VanNum++;
                   SedanNum++;
                }
                break;
        }
        
        System.out.println("Here is your next questions and the options > ");
        //the fourth question
        System.out.println(Qarr.get(6).getQuestion());
        System.out.println(Aarr.get(6).toString());       
        System.out.println("Please enter your answer:");
        choice = jec.checkIntOneTwo(input);

        if(choice==1){
            SportNum+=3;
            SUVNum++;
        }
        else{
            SedanNum++;
            VanNum++;
        }
        
        System.out.println("Here is your next questions and the options > ");
        //the fifth question
        System.out.println(Qarr.get(7).getQuestion());
        System.out.println(Aarr.get(7).toString());
        System.out.println("Please enter your answer:");
        choice = jec.checkIntOneTwo(input);

        if(choice==1){
            SportNum++;
            SUVNum+=3; 
        }
        else{
            SedanNum++;
            VanNum++;
        }
        
        System.out.println("Here is your final questions and the options > ");
        //the sixth question
        System.out.println(Qarr.get(8).getQuestion());
        System.out.println(Aarr.get(8).toString());
        System.out.println("Please enter your answer:");
        choice = jec.checkIntOneTwo(input);
                
        if(choice==1){
            PorscheNum+=3;
            ToyotaNum++;
            FordNum++;
            BMWNum++;
        }
        else{
            PorscheNum++;
            ToyotaNum+=3;
            FordNum+=2;
            BMWNum+=2;
        }
        
        //favoriteCar method generate all the option's score and find the best
        //car
        favoriteCar(SedanNum, VanNum, SportNum, SUVNum, FordNum, BMWNum, 
                ToyotaNum, PorscheNum);

    }
    
    /**
     * mkQuestions will make all the question the quiz need
     * @return ArrayList<Questions> which store all the questions
     */
    public static ArrayList<Questions> mkQuestions(){
        
        ArrayList<Questions> Qarr = new ArrayList();
        Qarr.add(new Questions("What type of vehicle do you most commonly "
                + "drive? "));
        Qarr.add(new Questions("Are you looking for a vehicle that uses "
                + "electricity, petrol or diesel? "));
        
        Qarr.add(new Questions("How many cars are you most likely to own? "));
        Qarr.add(new Questions("How much would you spend on your car? "));
        
        Qarr.add(new Questions("What type of vehicle is your dream car? "));
        Qarr.add(new Questions("In a car do you pay more attention to the "
                + "electronics, luxury? "));
        
        Qarr.add(new Questions("Do you enjoy going off roading? "));
        Qarr.add(new Questions("If your on a road trip, and your on open road, "
                + "are you more likely drive fast or go on the speed limit? "));
        Qarr.add(new Questions("Do you care about the vehicle brand? "));
        
        return Qarr;
        
    }
    
    /**
     * mkAnswers will make all the answers the quiz need
     * @return ArrayList<Answers> which store all the answers
     */
    public static ArrayList<Answers> mkAnswers(){
        ArrayList<Answers> Aarr = new ArrayList();
        Aarr.add(new Answers("1. Sedan","2. Van(family car)","3. Sports car"));
        Aarr.add(new Answers("1. Electricity","2. Petrol","3. Diesel"));
        
        Aarr.add(new Answers("1. 1-2","2. 2-4","3. 4 and up"));
        Aarr.add(new Answers("1. 20k-35k","2. 35k-65k","3. 65k and higher"));
          
        Aarr.add(new Answers("1. Sedan","2. Van(family car)","3. Sports car"));
        Aarr.add(new Answers("1. Electricity and gimmicks ",
                "2. Luxury","3. Looks of the car are irrelevant "));
        
        Aarr.add(new Answers("1. Yes","2. No"));
        Aarr.add(new Answers("1. Drive fast","2. speed limit"));
        Aarr.add(new Answers("1. Yes","2. No"));
        
        return Aarr;
    }
    
    /**
     * mkCars method use the Results class and store all the cars in the
     * array list
     * @return Results objects for all the cars
     */
    public static Results mkCars(){  
        
        Results allCars = new Results();
        allCars.generateAllCars();
        
        return allCars;
    }
    
    /**
     * favoriteCar method help to calculate the score and generate the best car
     * @param SedanNum, is the score for the type Sedan
     * @param VanNum, is the score for the type Van
     * @param SportNum, is the score for the type Sport
     * @param SUVNum, is the score for the type SUV
     * @param FordNum, is the score for the logo Ford
     * @param BMWNum, is the score for the logo BMW
     * @param ToyotaNum, is the score for the logo Toyota
     * @param PorscheNum , is the score for the logo Porsche
     */
    public static void favoriteCar(int SedanNum, int VanNum, int SportNum
        , int SUVNum, int FordNum, int BMWNum, int ToyotaNum, int PorscheNum){
        
        //HashMap array is to generate the key and value for the car and the score
        HashMap arr1 = new HashMap();
        //calculate the type score first
        arr1.put("Sedan",SedanNum);
        arr1.put("Van",VanNum);
        arr1.put("Sport car",SportNum);
        arr1.put("SUV",SUVNum);
        
        List<Map.Entry<String, Integer>> list1 = new ArrayList<>(arr1.entrySet());
        list1.sort((Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
                -> o2.getValue().compareTo(o1.getValue()));
        
        HashMap arr2 = new HashMap();
        //calculate the type score for the second step
        arr1.put("Ford",FordNum);
        arr1.put("BMW",BMWNum);
        arr1.put("Toyota",ToyotaNum);
        arr1.put("Porsche",PorscheNum);
        
        List<Map.Entry<String, Integer>> list2 = new ArrayList<>(arr1.entrySet());
        list2.sort((Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
                -> o2.getValue().compareTo(o1.getValue()));

        
        mkCars();
        //find the best car now after get the score
        int findFirstCar=0;
        for (int i = 0; i < mkCars().getCars().size(); i++) {
            if(mkCars().getCars().get(i).getCarLogo().equals(list2.get(0).getKey())
                &&mkCars().getCars().get(i).getType().equals(list1.get(0).getKey())){
                findFirstCar=i;
                break; 
            }
        }
        
        String s = "";
        s+="Your best car is..."+"\n"+"Car logo: "
                +mkCars().getCars().get(findFirstCar).getCarLogo()+"\n"
                +"Car Type: "+mkCars().getCars().get(findFirstCar).getType()
                +"\n"+"Car Detail: "
                +mkCars().getCars().get(findFirstCar).carTypeDescription();
        
        System.out.println("---------------------------------------------------"
            +"---------------------------------------------------"
            +"---------------------------------------------------");
        System.out.println(s);
    }
                 
}
     
