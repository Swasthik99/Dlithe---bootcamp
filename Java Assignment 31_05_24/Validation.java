import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gmail: ");
        String gmail = sc.nextLine();
        if (ValidGmail(gmail)){
            System.out.println("Valid Gmail, Enetr the UserID:");
            String userID = sc.nextLine();
            if (ValiduserID(userID)) {            
                System.out.println("Enter the password:");            
                String pass = sc.nextLine();            
                if (validPassword(pass))             
                {                 
                    System.out.println("Entered password is valid: ");             
                } else             
                {                 
                    System.out.println("Entered password is invalid: ");             
                }        
            }         
            else          
            {            
                System.out.println("Entered user ID is invalid: " + userID);        
            }
        }
        else
            System.out.println("Invalid Gmail");
     
    } 
    

    static boolean ValidGmail(String gmail){
        if (!gmail.isEmpty() && !Character.isDigit(gmail.charAt(0)) && !Character.isWhitespace(gmail.charAt(0)) && gmail.endsWith("@gmail.com")) {
            int Index = gmail.indexOf("@");
            String beforeindex = gmail.substring(0, Index); 
            if (beforeindex.length() >= 3) {      
                 return true;
            } else {
            return false;
            }
        }
        else {
            return false;
        }  
     
    }

    static boolean ValiduserID(String userId){
        if (userId.length() < 5 || userId.length() > 15) {
            return false;
        }

        if (!Character.isLetter(userId.charAt(0))) {
            return false;
        }
        for (int i = 0; i < userId.length(); i++) {
            char c = userId.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        return true;
    }

    static boolean validPassword(String password){
        boolean uppercase = false;
        boolean lowercase = false;         
        boolean digit = false;         
        boolean spclchar = false;         
        boolean whitespace = false;          
        for (int i = 0; i < password.length(); i++) {             
            char ch = password.charAt(i);             
            if (Character.isUpperCase(ch)) {                 
                uppercase = true;             
            } else if (Character.isLowerCase(ch)) {                 
                lowercase = true;             
            } else if (Character.isDigit(ch)) {                 
                digit = true;             
            } else if (Character.isWhitespace(ch)) {                 
                whitespace = true;             
            } else {                 
                spclchar = true;             
            }         
        }         
        return uppercase && lowercase && digit && spclchar && !whitespace;
        
    }
    
}
