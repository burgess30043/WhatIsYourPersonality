/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorCheck;

/**
 * This is the error check methods
 * @author burge
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaErrorCheck {
    
    /**
     * check that number should be greater than 1
     * @param sc
     * @return int
     */
    public int checkIntAndZero(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<=0){
                    throw new IllegalArgumentException("Number need to be "
                            +"greater than 0 > ");
                }
                
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input a number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        
        return num;
    }
    
    /**
     * ***********
     * check that int should between 1 to 2
     * @param sc
     * @return int
     */
    public int checkIntOneTwo(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<1){
                    throw new IllegalArgumentException("number need to be "
                            +"greater or equals to 1 > ");
                }
                else if (num>2){
                    throw new IllegalArgumentException("number need to be "
                            +"less or equals to 2 > ");
                }
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        return num;
    }
    
    /**
     * ***********
     * check that int should between 1 to 3
     * @param sc
     * @return int
     */
    public int checkIntOneTwoThree(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<1){
                    throw new IllegalArgumentException("number need to be "
                            +"greater or equals to 1 > ");
                }
                else if (num>3){
                    throw new IllegalArgumentException("number need to be "
                            +"less or equals to 3 > ");
                }
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        return num;
    }    
    
    /**
     * check that double should be greater than 0
     * @param sc
     * @return double
     */
    public double checkDoubleAndZero(Scanner sc){
        double num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextDouble();
                if(num<0){
                    throw new IllegalArgumentException("Number need to be "
                            +"greater than 0 > ");
                }
                if(num==0){
                    throw new IllegalArgumentException("Do not stay here, go "
                            +"out!! Enter a number > ");
                }
                
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input a number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        
        return num;
    }
    
    /**
     * ***********
     * check String for no ""
     * @param sc
     * @return String
     */
    public String checkEnterOfString(Scanner sc){
        String s="";
        boolean vaild = false;
        do{
            try{
                s=sc.nextLine();
                s=s.trim();
                if(s.equals("")){
                    throw new IllegalArgumentException("The name can not be "
                            +"nothing, please enter again > ");
                }
                
                vaild = true;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while(!vaild);
        return s;
    }
    
    /**
     * ***********
     * check String for no ""
     * @param sc
     * @return String
     */
    public String checkID(Scanner sc){
        String s="";
        boolean vaild = false;
        do{
            try{
                s=sc.nextLine();
                s=s.trim();
                if(s.equals("")||!s.matches("[9]{2}[0-9]{7}")){
                    throw new IllegalArgumentException("The name can not be "
                            +"nothing or in wrong format 99XXXXXXX, please "
                            +"enter again > ");
                }
                
                vaild = true;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while(!vaild);
        return s;
    }
    
    /**
     * check String only enter Y or N
     * @param sc
     * @return String
     */
    public String checkYorN(Scanner sc){
        String s="";
        boolean vaild = false;
        do{
            try{
                s=sc.nextLine();
                if(s.equals("y")||s.equals("Y")||s.equals("n")||s.equals("N")){
                    vaild = true;
                }
                else throw new IllegalArgumentException("Please enter 'Y/y' "
                            +"for 'Yes', 'N/n' for 'No' > ");

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while(!vaild);
        return s;
    }

    
}
