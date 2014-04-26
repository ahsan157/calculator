/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Ahsan
 */
public class MyCalculator {

    /**
     * @param args the command line arguments
     */
    public static String Postfixcal(String args) {
         String m;
     java.util.Scanner input =new java.util.Scanner(System.in);
      System.out.println("Please Input PostFix Expression: \n ");
     m=args;
  //   System.out.println("**********ok************");
    String[] output= GetInput(m);
        for (int i = 0; i < output.length; i++) {
                
             System.out.print("output["+i+"]"+output[i]+"\n");
        }
        
         String result=getPostfixResult(output);
        
     
    return result;
}
    public static String Prefixcal(String args) {
         String m;
     java.util.Scanner input =new java.util.Scanner(System.in);
      System.out.println("Please Input PostFix Expression: \n ");
     m=args;
  //   System.out.println("**********ok************");
    String[] output= GetInput(m);
        for (int i = 0; i < output.length; i++) {

             System.out.print("output["+i+"]"+output[i]+"\n");
        }

         String result=getPrefixResult(output);
       

    return result;
}
     public static String[]  GetInput(String m)
     {
         int j=0;
         char c,k;
         String p=null;
      String a[]=new String[m.length()+1];
       a[m.length()]=null;
    for(int i=0;(i+j)<m.length();i++)
    {
        
        c=m.charAt(i+j);
        
        if(c=='(')
        {  
            p="";
            
             j++;
                 
            k=m.charAt(i+j) ;
            while(k!=')'){
            p+=Character.toString(k);
            j++;
             k=m.charAt(i+j) ;
            }                    
            a[i]=p;
       
        }
    else{
        a[i]=Character.toString(c);

   
       
        }
    }
     
         return a;
     
     }
     public static String getPostfixResult(String a[]){
    
    Double stack[]=new Double[a.length];
    Double temp1,temp2, result = 0.0;
        int stin = 0;
        int j=0;
        String p=null, s="";
        
        while(a[j]!=null)
        {
        j++;
        }
      //System.out.println(j);
  try{
  for(int i=0;i<j;i++)
    {
        p="";


            if( a[i] == null ? "/" == null : a[i].equals("/"))
            {
                temp1=stack[--stin];
                temp2=stack[--stin];
                result=temp2/temp1;
                stack[stin++]=result;
                stack[stin]=null;
                System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);
               
                }

            else if(a[i] == null ? "*" == null : a[i].equals("*")){
                temp1=stack[--stin];
                temp2=stack[--stin];
                result=temp2*temp1;
                stack[stin++]=result;
                stack[stin]=null;
              System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);
                
            }
 else
            if(a[i] == null ? "-" == null : a[i].equals("-")){
                temp1=stack[--stin];
                temp2=stack[--stin];
                result=temp2-temp1;
                stack[stin++]=result;
                stack[stin]=null;
               System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);
            }
 else
            if(a[i] == null ? "+" == null : a[i].equals("+")){
                temp1=stack[--stin];
                temp2=stack[--stin];
                result=temp2+temp1;
                stack[stin++]=result;
                stack[stin]=null;
               System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);
            }
 else
            {
                    p+=a[i];
                    stack[stin++]=Double.valueOf(p);
                    System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);

       
    }
        }
  if(stack[1]==null)
  {
      result=stack[0];
       s+=result;
      }
      else
      s="Syntex error...";

   
  }catch(ArrayIndexOutOfBoundsException e){s+="Syntex Error";}
   
    return s;
    }
      public static String getPrefixCal(String a[]){

    Double stack[]=new Double[a.length];
    Double temp1,temp2, result = 0.0;
        int stin = 0;
        int j=0;
        String p=null, s="";

        while(a[j]!=null)
        {
        j++;
        }
      //System.out.println(j);
  try{
  for(int i=0;i<j;i++)
    {
        p="";


            if( a[i] == null ? "/" == null : a[i].equals("/"))
            {
                temp1=stack[--stin];
                temp2=stack[--stin];
                result=temp1/temp2;
                stack[stin++]=result;
                stack[stin]=null;
                System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);

                }

            else if(a[i] == null ? "*" == null : a[i].equals("*")){
                temp1=stack[--stin];
                temp2=stack[--stin];
                result=temp2*temp1;
                stack[stin++]=result;
                stack[stin]=null;
              System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);

            }
 else
            if(a[i] == null ? "-" == null : a[i].equals("-")){
                temp1=stack[--stin];
                temp2=stack[--stin];
                result=temp1-temp2;
                stack[stin++]=result;
                stack[stin]=null;
               System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);
            }
 else
            if(a[i] == null ? "+" == null : a[i].equals("+")){
                temp1=stack[--stin];
                temp2=stack[--stin];
                result=temp2+temp1;
                stack[stin++]=result;
                stack[stin]=null;
               System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);
            }
 else
            {
                    p+=a[i];
                    stack[stin++]=Double.valueOf(p);
                    System.out.println("Stack["+(stin-1)+"]="+stack[stin-1]);


    }
        }
  if(stack[1]==null)
  {
      result=stack[0];
       s+=result;
      }
      else
      s="Syntex error...";


  }catch(ArrayIndexOutOfBoundsException e){s+="Syntex Error";}

    return s;
    }
     	public static String getPrefixResult(String a[]){
	     Double stack[]=new Double[a.length];

	    Double temp1,temp2, result = 0.0;
	        int stin = 0;
	        int j=0;
	        while(a[j]!=null)
	        {
	        j++;
	        }
	        System.out.println(j);
	        String ptp[]=new String[a.length];

	        for(int i=j-1;i>=0;i--)
	            ptp[j-i-1]=a[i];

	        return getPrefixCal(ptp);
	 
	    }

     
     
}
