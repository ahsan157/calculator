/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

/**
 *
 * @author Ahsan
 */
public class MathFuncTest {
    public static String[] test(String[] args){
    String temp1="",cal="",temp2="",temp3="";
    double res,m;
    int p=0,i,n,t;
    for(i=0;i<args.length;i++){
      temp1=args[i];

       temp2=temp1.substring(0, 1);
        if(temp2.equals("!")){
         cal=temp1.substring(1);
        int  q=Integer.parseInt(cal);
         res=mathfunc.Factorial(q);
         cal="        ";
         cal+=res;
         args[i]=cal;
    }
        if(temp2.equals("e")){
         cal=temp1.substring(1);
        m=Double.valueOf(cal);
         res=mathfunc.Exponential(m);
         cal="        ";
         cal+=res;
         args[i]=cal;
    }

     }




    for(i=0;i<args.length;i++){
       temp1=args[i];

       int j,c=0,r=0,s=0,scal=0;
       char a;
       for(j=0;j<temp1.length();j++){
           if(temp1.charAt(j)=='C')
           {
               c=1;
               scal=j;
               }
               if(temp1.charAt(j)=='P')
               {
                   r=1;
                   scal=j;
               }
            if(temp1.charAt(j)=='^')
            {
                s=1;
                scal=j;
            }
      
       
       
       }
        temp2=temp1.substring(0, scal);
        temp3=temp1.substring( scal+1);
        if(c==1){
            n=Integer.parseInt(temp2);
            t=Integer.parseInt(temp3);
             res=mathfunc.Combination(n,t);
              cal="    ";
             cal+=res;
            args[i]=cal;
        }
        if(r==1){
            n=Integer.parseInt(temp2);
            t=Integer.parseInt(temp3);
             res=mathfunc.Permutation(n,t);
             cal="    ";
             cal+=res;
            args[i]=cal;
        }
        if(s==1){
            n=Integer.parseInt(temp2);
            t=Integer.parseInt(temp3);
             res=mathfunc.XtoThePower(n,t);
             cal="    ";
             cal+=res;
            args[i]=cal;
        }
        }


     for(i=0;i<args.length;i++){
     temp1=args[i];
     temp1+="     ";
       temp2=temp1.substring(0, 2);
        if(temp2.equals("ln")){
         cal=temp1.substring(2);
         m=Double.valueOf(cal);
         res=mathfunc.lncal(m);
         cal="    ";
         cal+=res;
         args[i]=cal;
        }
       if(temp2.equals("pi")){
         //cal=temp1.substring(2);
       // m=Double.valueOf(cal);
         res=mathfunc.Pi();
         cal="";
         cal+=res;
         args[i]=cal;
        }
    }
    for(i=0;i<args.length;i++){
       temp1=args[i];
       temp1+="     ";
       temp2=temp1.substring(0, 3);
        if(temp2.equals("cos")){
         cal=temp1.substring(3);
        m=Double.valueOf(cal);
         res=mathfunc.Coscal(m);
         cal="";
         cal+=res;
         args[i]=cal;
        }
       if(temp2.equals("sin")){
         cal=temp1.substring(3);
        m=Double.valueOf(cal);
         res=mathfunc.Sincal(m);
         cal="";
         cal+=res;
         args[i]=cal;
        }
       if(temp2.equals("tan")){
         cal=temp1.substring(3);
        m=Double.valueOf(cal);
         res=mathfunc.Tancal(m);
         cal="";
         cal+=res;
         args[i]=cal;
        }
       if(temp2.equals("log")){
         cal=temp1.substring(3);
        m=Double.valueOf(cal);
         res=mathfunc.logcal(m);
         cal="";
         cal+=res;
         args[i]=cal;
        }
        if(temp2.equals("10^")){
         cal=temp1.substring(3);
        m=Double.valueOf(cal);
         res=mathfunc.TenTothepower(m);
         cal="";
         cal+=res;
         args[i]=cal;
        }
    }
   
    for(i=0;i<args.length;i++){
    temp1=args[i];
    temp1+="     ";
       temp2=temp1.substring(0, 4);
        if(temp2.equals("qube")){
         cal=temp1.substring(4);
        m=Double.valueOf(cal);
         res=mathfunc.Xcube(m);
         cal="    ";
         cal+=res;
         args[i]=cal;
    }
        if(temp2.equals("Root")){
         cal=temp1.substring(4);
        m=Double.valueOf(cal);
         res=mathfunc.XRoot(m);
         cal="    ";
         cal+=res;
         args[i]=cal;
    }
    }
    for(i=0;i<args.length;i++){
    temp1=args[i];
    temp1+="     ";
       temp2=temp1.substring(0, 6);
        if(temp2.equals("invcos")){
         cal=temp1.substring(6);
        m=Double.valueOf(cal);
         res=mathfunc.Invcos(m);
         cal="";
         cal+=res;
         args[i]=cal;
    }
       if(temp2.equals("invsin")){
         cal=temp1.substring(6);
        m=Double.valueOf(cal);
         res=mathfunc.Invsin(m);
         cal="";
         cal+=res;
         args[i]=cal;
    }
       if(temp2.equals("invtan")){
         cal=temp1.substring(6);
        m=Double.valueOf(cal);
         res=mathfunc.Invtan(m);
         cal="";
         cal+=res;
         args[i]=cal;
    }
        }
     
     
    return args;
    }

}
