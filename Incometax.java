import java.util.*;
public class Incometax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double income =sc.nextDouble();
        int age = sc.nextInt();
        double tax;
        if (income>250000 && income<=300000){
            if (age <60){
                tax = (income-250000)* 0.10;
            }else {
                tax = 0.0;
            }
        } else if (income>30000 && income<=500000) {
            if (age<60){
                tax=(300000-250000)*0.10 + (income-300000)*0.10;
            }else if(age>=60 && age<80){
                tax = (income-300000)*0.10;
            }else {
                tax =0.0;
            }
        } else if (income >500000 && income<=1000000) {
            if (age<60){
                tax=(300000-250000)*0.10 + (500000-300000)*0.10 + (income-500000)*0.20;
            }else if(age>=60 && age<80){
                tax = (500000-300000)*0.10 + (income-500000)*0.20;
            }else {
                tax = (income-500000)* 0.20;
            }
        }else if (income>1000000){
            if (age<60){
                tax = (300000-250000)*0.10 + (500000-300000)*0.10 + (1000000-500000)*0.2 + (income-1000000)*0.30;
            }else if (age>=60 && age<80){
                tax = (500000-300000)*0.10 + (1000000-500000)*0.20 + (income-1000000)*0.30;
            }else {
                tax = income*0.20 + (income-1000000)*0.30;
            }
        }else {
            tax = 0.0;
        }
        System.out.println(tax);
    }
}
