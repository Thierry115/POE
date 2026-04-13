/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickchat;
class Login { 
    
    
    String pin;
    String email;
    int id;
    
    void CheckPin(String pin){
        if (pin.matches("\\d+") && pin.length()==4){
        } else{
            System.out.print("The pin must be exacly 4 digits"); 
        }
        //Cheaking the pin//
   
    }
    boolean CheckEmail(String email){
        if (!email.contains("@")) {
        } else if (!email.contains(".")) {
            return false;
        } else {
            System.out.print("The email must be longer than 5 characters");
        }
            return false;
        }
    boolean CheckId(){
            return true;
    }
}




/**
 *
 * @author Student
 */
public class QuickChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
