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
public class User {
    
    private String userName;
    private String userID;

    public User(String userName, String userID) {
        setUserName(userName);
        setUserID(userID);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws IllegalArgumentException{
        if((userName!=null)&&!(userName.trim().equals(""))){
            this.userName=userName;
        }
        else{
            throw new IllegalArgumentException("The name can not be nothing, "
                            +"please enter again > ");
        }
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IllegalArgumentException{
        if((userID.matches("[9]{2}[0-9]{7}"))){
            this.userID=userID;
        }
        else{
            throw new IllegalArgumentException("Please enter student ID in the"
                            +"correct format 99XXXXXXX, please enter again > ");
        }
    }
    
    @Override
    public String toString(){
        String s ="";
        s+="Your name is: "+ this.getUserName()+"\n"
            + "Your ID is:"+ this.getUserID()+"\n";
        return s;
    }

    
    
}
