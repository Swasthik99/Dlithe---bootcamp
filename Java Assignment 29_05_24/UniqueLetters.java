public class UniqueLetters {
    static boolean UniqueOrNot(String s){
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) != s.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(UniqueOrNot(s));
    }
}
