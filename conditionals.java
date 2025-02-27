import java.util.*;

public class conditionals {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int marks = src.nextInt();
        if(marks == 100){
            System.out.println("Bhai top mar diya");
        }else if (marks >= 90) {
            System.out.println("Bhai pdaku hai tu tho");
        }else if (marks >= 80) {
            System.out.println("Chal thek thek hai ");
        }else if (marks >= 70) {
            System.out.println("Muje farak nahi pdta");
        }else {
            System.out.println("phad le bhai tera future hai");
        }
    }
}
