/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarefinal;

/**
 * User class for user information.
 * @author Burgess
 */
public class User {
    
    private String userName;//String variable for the user name
    private String userID;//String variable for the user ID

    /**
     * Creates a constructor for user class
     * @param userName, String variable
     * @param userID, String variable
     */
    public User(String userName, String userID) {
        setUserName(userName);
        setUserID(userID);
    }

    /**
     * Create a getter method to get the user name
     * @return user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Create a setter method to set a userName
     * @param userName is the userName
     * @throws IllegalArgumentException if the userName is null or nothing
     */
    public void setUserName(String userName) throws IllegalArgumentException{
        if((userName!=null)&&!(userName.trim().equals(""))){
            this.userName=userName;
        }
        else{
            throw new IllegalArgumentException("The name can not be nothing, "
                            +"please enter again > ");
        }
    }

    /**
     * Create a getter method to get the user ID
     * @return user ID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Create a setter method to set a userID
     * @param userID is the userName
     * @throws IllegalArgumentException if the userID is null or nothing
     */
    public void setUserID(String userID) throws IllegalArgumentException{
        if((userID.matches("[9]{2}[0-9]{7}"))){
            this.userID=userID;
        }
        else{
            throw new IllegalArgumentException("Please enter student ID in the"
                            +"correct format 99XXXXXXX, please enter again > ");
        }
    }
    
    /**
     * toString method which is the information from the user is override
     * @return String for the user information
     */
    @Override
    public String toString(){
        String s ="";
        s+="Your name is: "+ this.getUserName()+"\n"
            + "Your ID is:"+ this.getUserID()+"\n";
        return s;
    }

    
    
}
