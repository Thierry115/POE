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
    boolean CheckId(String id){
        if ( =  id.length() ==13) if (!id.matches("\\d{13}")) {
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
// we are checking phone number validatiom
public boolean checkcellphonenumber(String number){
 
    // the number must start with an international code and a max of 10 digits after the code
 // example : +27  123456789
 
      if (number.matches("^\\+\\d{1,3}\\d{1,10}$")) {
  
         return true ;
} else {
System.out.print("Invalid phone number ");
return false;
}
}


 






/**
 *
 * @author Student
 */
public class QuickChat {
String username;
String password;
String firstname;
String lastname;

public QuickChat(String username, String password, String firstname, String lastname) {
this.username = username;
this.password = password;
this.firstname = firstname;
this.lastname = lastname;

}

//we are verifying login
public String loginUser(String enteredUser, String enteredPass) {
 if (enteredUser.equals(username) && enteredPass.equals(password)) {
 return "Welcome" + firstname + "" + lastname + "It is great to see you again.";
 
 }
 return "Username or password incorrect,please try again";
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
