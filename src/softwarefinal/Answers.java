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
public class Answers {
    
    private String answer1;
    private String answer2;
    private String answer3;

    public Answers(String answer1, String answer2) {
        setAnswer1(answer1);
        setAnswer2(answer2);
    }

    public Answers(String answer1, String answer2, String answer3) {
        setAnswer1(answer1);
        setAnswer2(answer2);
        setAnswer3(answer3);
    }
    
    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) throws IllegalArgumentException{
        if((answer1!=null)&&!(answer1.trim().equals(""))){
            this.answer1=answer1;
        }
        else{
            throw new IllegalArgumentException("The question can not be "
                    +"nothing, please try again > ");
        }
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) throws IllegalArgumentException{
        if((answer2!=null)&&!(answer2.trim().equals(""))){
            this.answer2=answer2;
        }
        else{
            throw new IllegalArgumentException("The question can not be "
                    +"nothing, please try again > ");
        }
    }

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

    public void setAnswer3(String answer3) throws IllegalArgumentException{
        if((answer3!=null)&&!(answer3.trim().equals(""))){
            this.answer3=answer3;
        }
        else{
            throw new IllegalArgumentException("The question can not be "
                    +"nothing, please try again > ");
        }
    }
    
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

