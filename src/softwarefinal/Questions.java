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
public class Questions {
    
    private String question;

    public Questions(String question) {
        setQuestion(question);
    }

    public String getQuestion() {
        return question;
    }

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

