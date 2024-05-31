public class UniqueLetters {
    static int UniqueOrNot(String s){
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) != s.lastIndexOf(ch)) {
                count++;
            }
        }
        return count/2;
        
    }
    
    public static void main(String[] args) {
        String s = "abceabse";
        if(UniqueOrNot(s) == 0){
            System.out.println("Unique"); 
        }else{
            System.out.println("Not Unique "+UniqueOrNot(s)+" are duplicate");
        }
    }
}
