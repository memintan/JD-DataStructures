import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Write a word:");
//        String word = scan.next();
//         String a = word.substring(0,1);
//         String b = word.substring(word.length()-1);
//         System.out.println(a+b);

//        String a = "laylaylom";
//        String result="";
//
//        for (int i=0; i<a.length(); i++){
//            char b = a.charAt(i);
//            result +=b;
//        }
//        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        StringBuffer sbr = new StringBuffer(word);
        if(word.length()>5) System.out.println("Too long!");
        else if(word.length()<5) System.out.println("Too short!");
        else System.out.println(sbr.reverse());




    }
}
