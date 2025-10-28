public class isPalindrome {
    public static void main(String[] args) {
        String s="nitin";
        StringBuilder str=new StringBuilder().append(s).reverse();
        if(str.toString().equals(s))
        System.out.println("palindrome");
    }
}
