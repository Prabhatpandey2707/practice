import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class factorial {
public static void main(String[] args){
    Scanner io = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = io.nextInt();
    int fact =1;
    for (int i = 1; i<=n; i++){
        fact = i*fact;
    }
    System.out.println(fact);
}
}
