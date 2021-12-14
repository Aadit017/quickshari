import java.util.*;
class prcarm{ 
    public static void inputFunc(){    //! Function used to take the input and to print the boolean result
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int input=sc.nextInt();
        sc.close();
        System.out.println(checkForArm(input));
    }
    public static boolean checkForArm(int input){ 
        /* 
        !- the way to calculate armstrong number :- 
        1^3 + 5^3 + 7^3 = 153 => if true then the following number is armstrong
        */
        int sum=0;//! used to calculate the sum of all the numbers
        int temp=input;//! stores the value of input for the time being 
        while(input>0){ 
            int lastDigit = input%10; // captures the last digit of the input 
            sum += Math.pow(lastDigit,3); 
            input/=input;// value becomes from nn->n
        }
        return sum==temp;
    }
    public static void main(String args[]){
        inputFunc();
    }
}
