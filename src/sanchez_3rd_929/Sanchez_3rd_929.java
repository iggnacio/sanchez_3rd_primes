/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanchez_3rd_929;



 
public class Sanchez_3rd_929 {//first brace
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println(i+" is odd ");
             if(isPrime(i)){
                 
             }
             }
             }
    
    
static boolean isEven(int number){
    return (number%2==0);
}

static boolean isOdd(int number){
    return (number%2 != 0);
}
static boolean isPrime(int number){
        int divisors = 0;
            for( int i = 2; i<number/2; i++){
                if(number % i == 0){
                        divisors +=1;
            }
            }
            if(divisors>0){
                return false;
            }else{
                return true;
            }
            //return (divisors == 0);
            }
            }//final brace

