/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

/**
 * Answers class for quiz answer/option.
 * @author Burgess
 */
public class Answers {
    
    private String answer1;//String variable for the answer1/option1
    private String answer2;//String variable for the answer2/option2
    private String answer3;//String variable for the answer3/option3

    /**
     * Creates a constructor for Answers class if there are 2 options
     * @param answer1, String for the option1
     * @param answer2, String for the option2
     */
    public Answers(String answer1, String answer2) {
        setAnswer1(answer1);
        setAnswer2(answer2);
    }
       
    /**
     * Creates a constructor for Answers class if there are 3 options
     * @param answer1, String for the option1
     * @param answer2, String for the option2
     * @param answer3, String for the option3
     */
    public Answers(String answer1, String answer2, String answer3) {
        setAnswer1(answer1);
        setAnswer2(answer2);
        setAnswer3(answer3);
    }
    
    /**
     * Create a getter method to get the answer1
     * @return answer1
     */
    public String getAnswer1() {
        return answer1;
    }
    
    /**
     * Create a setter method to set a answer1
     * @param answer1, String
     * @throws IllegalArgumentException if the answer1 is null or nothing
     */
    public void setAnswer1(String answer1) throws IllegalArgumentException{
        if((answer1!=null)&&!(answer1.trim().equals(""))){
            this.answer1=answer1;
        }
        else{
            throw new IllegalArgumentException("The question can not be "
                    +"nothing, please try again > ");
        }
    }

    /**
     * Create a getter method to get the answer2
     * @return answer2
     */
    public String getAnswer2() {
        return answer2;
    }
    
    /**
     * Create a setter method to set a answer2
     * @param answer2, String
     * @throws IllegalArgumentException if the answer2 is null or nothing
     */
    public void setAnswer2(String answer2) throws IllegalArgumentException{
        if((answer2!=null)&&!(answer2.trim().equals(""))){
            this.answer2=answer2;
        }
        else{
            throw new IllegalArgumentException("The question can not be "
                    +"nothing, please try again > ");
        }
    }

    /**
     * Create a getter method to get the answer3, use if-else to figure if 
     * there is no option 3 for the question
     * @return answer3
     */
    public String getAnswer3() {
        
        String s;
        
        if(answer3!=null){
            s=answer3;
        }
        else{
            s="There is no third option.";
        }
        return s;
        
    }
    
    /**
     * Create a setter method to set a answer3
     * @param answer3, String
     * @throws IllegalArgumentException if the answer3 is null or nothing
     */
    public void setAnswer3(String answer3) throws IllegalArgumentException{
        if((answer3!=null)&&!(answer3.trim().equals(""))){
            this.answer3=answer3;
        }
        else{
            throw new IllegalArgumentException("The question can not be "
                    +"nothing, please try again > ");
        }
    }
    
    /**
     * toString method is to print all the answer for each question for the user
     * @return String for the answer
     */
    @Override
    public String toString(){
        
        String s = "";
        if(this.answer3!=null){
            s+=this.getAnswer1()+"\n"+this.getAnswer2()+"\n"+this.getAnswer3()
                    +"\n";
        }
        else{
            s+=this.getAnswer1()+"\n"+this.getAnswer2()+"\n";
        }
        return s;
    }
    
}

