/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

/**
 *
 * @author Ahsan
 */
import java.io.PrintStream;
import java.util.*;
public class mathfunc {
    public static double Torad(double a){
   
    return Math.toRadians(a);
           }
    public static Double Tancal(double a){

        return Math.tan(Math.toRadians(a));
    }
    public static Double Sincal(double a){

        return Math.sin(Math.toRadians(a));
    }
    public static Double Coscal(double a){

        return Math.cos(Math.toRadians(a));

    }
     public static Double logcal(double a){

        return Math.log10(a);

    }
     public static Double lncal(double a){

        return Math.log(a);


    }  
     public static double Invtan(double b){

       return Math.toDegrees(Math.atan(b));

       }
       public static double Invcos(double b){

       return Math.toDegrees(Math.acos(b));

       }
       public static double Invsin(double b){

       return Math.toDegrees(Math.asin(b));

       }
       public static double TenTothepower(double a){

           return Math.pow(10, a);

       }
       public static double Exponential(double a){
       return Math.exp(a);
       }
       public static int Factorial(int a){
       int f=1;
		while(a>1){
			f*=a;
			a--;
			}
		return f;
       }
       public static int Combination(int n,int r){

       return Factorial(n)/(Factorial(r)*Factorial(n-r));
       }
       public static int Permutation(int n,int r){

       return Factorial(n)/Factorial(n-r);
       }
       public static double Pi(){

           return Math.PI;
       }
       public static double XtoThePower(double x,double r){

       return Math.pow(x, r);
       }
        public static double XRoot(double x){

       return Math.sqrt(x);
       }
       public static double Xcube(double x){

       return Math.cbrt(x);
       }
     public static void main(String args[]){
         
        Scanner in=new Scanner(System.in);
        double b=in.nextDouble();
        double r=in.nextDouble();
         System.out.print(XtoThePower(b, r));

     }
}
