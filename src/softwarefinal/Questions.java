/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

/**
 * Questions class for quiz questions.
 * @author Burgess
 */
public class Questions {
    
    private String question;//String variable for the questions

    /**
     * Creates a constructor for question class
     * @param question 
     */
    public Questions(String question) {
        setQuestion(question);
    }

    /**
     * Create a getter method to get the question
     * @return String, question
     */
    public String getQuestion() {
        return question;
    }
    
    /**
     * Create a setter method to set a question
     * @param question is the question for the quiz
     * @throws IllegalArgumentException if the question is null or nothing
     */
    public void setQuestion(String question) throws IllegalArgumentException{
        if((question!=null)&&!(question.trim().equals(""))){
            this.question=question;
        }
        else{
            throw new IllegalArgumentException("The question can not be "
                    +"nothing, please try again > ");
        }
    }
    
}

