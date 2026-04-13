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
        if (id!= null && id.length() ==13) if (!id.matches("\\d{13}")) {
            System.out.print("The id must contain only digits.");
            return false;
        }else {
            return true;
                    
        }else {
            System.out.print("The id must be exactly 13 characters long.");
            
            
            return false;
        }
            
                    
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
