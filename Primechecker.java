import java.util.Scanner;
public class Primechecker {
    public static boolean isPrime(int num){
        if(num<2) {
            return false;

        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter prime number");
        int number = sc.nextInt();
        if(isPrime(number)){
            System.out.println(number+"is a prime number");
        }
        else{
            System.out.println(number+"is not a prime number");
        }
    }
    
}