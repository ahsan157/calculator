/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
/**
 *
 * @author Ahsan
 */
public class polish {
    public static String Infixcal(String[] args){

    String stack[]=new String[10];

    String item="m";
    //for(int i=0;i<push(stack,5,item);i++)
        //stack=Intopost();
    //for(int i=0;i<stack.length;i++)
    //System.out.print(stack[i]);
    String a[]=args;
    String res=MyCalculator.Postfixcal(Intopost(a));
    
   /* for(int i=0;i<b.length;i++)
        if(b[i]!=null)
        System.out.print(b[i]+" ");
*/  return res;
    }
    public static int pop(String stack[],int top){
    if (top!=0)
    {
        //stack[top]=null;
        top=top-1;
        }
        return top;
    }
    public static int push(String stack[],int top,String item){
       
        stack[top]=item;
        top=top+1;

        return top;
    }
    public static String Intopost(String a[]){

        String postexp[]=new String[a.length+5];
        String stack[]=new String[a.length+1];
        String temp[]=new String[a.length+1];
        String post="";
        int top=1;
        int i,j;
        int expressionIndex=0;
        /*step-1*/
        
        for(i=0;i<a.length;i++)
            temp[i]=a[i];
            temp[a.length]=")";
          
        stack[0]="(";
       
       
        for(i=0;i<temp.length;i++)        {
     

       if( temp[i] == null ? "^" == null : temp[i].equals("^"))
            {
           top=push(stack,top,"^");
        }
        else if(temp[i] == null ? "/" == null : temp[i].equals("/")){
            j=top-1;
             while(stack[j] == null ? "(" != null : !stack[j].equals("(")){
                  if(stack[j] == null ? "^" == null : stack[j].equals("^")) {
                      top= pop(stack,top);
                      
                       post +="^";
                        postexp[expressionIndex++]="^";
                   }
             else if(stack[j] == null ? "/" == null : stack[j].equals("/"))
             {
                 top=pop(stack, top);
               
                 post+="/";
                   postexp[expressionIndex++]="/";
             }
            j--;

             }
              top=push(stack, top, "/");
               for(int q=0;q<top;q++)
               // if(stack[q]!=null)
                System.out.print("stack["+q+"]="+stack[q]+"\n");
        }
        else if(temp[i] == null ? "*"== null : temp[i].equals("*")){
             j=top-1;
            while(stack[j] == null ? "(" != null : !stack[j].equals("(")){
                if(stack[j] == null ? "^" == null : stack[j].equals("^")){
                      top= pop(stack,top);
                      post+="^";
                       postexp[expressionIndex++]="^";
                   }
                else if(stack[j] == null ? "/" == null : stack[j].equals("/")) {
                    top= pop(stack,top);
                    post+="/";
                    postexp[expressionIndex++]="/";
                     }
                    else if(stack[j] == null ? "*" == null : stack[j].equals("*")){
                        top= pop(stack,top);
                        post+="*";
                        postexp[expressionIndex++]="*";
                    }
                j--;
            }
         top=push(stack, top, "*");
         for(int q=0;q<top;q++)
                //if(stack[q]!=null)
                System.out.print("stack["+q+"]="+stack[q]+"\n");
        }
        else if(temp[i] == null ? "+" == null : temp[i].equals("+")){
             j=top-1;
            while(stack[j] == null ? "(" != null : !stack[j].equals("(")){
                if(stack[j] == null ? "^" == null : stack[j].equals("^")){
                      top= pop(stack,top);
                     // j=top;
                      post+="^";
                       postexp[expressionIndex++]="^";
                   }
                else if(stack[j] == null ? "/" == null : stack[j].equals("/")) {
                    top= pop(stack,top);
                    //j=top;
                    post+="/";
                    postexp[expressionIndex++]="/";
                     }
                    else if(stack[j] == null ? "*" == null : stack[j].equals("*")){
                        top= pop(stack,top);
                        //j=top;
                        post+="*";
                        postexp[expressionIndex++]="*";
                    }
                        else if(stack[j] == null ? "+" == null : stack[j].equals("+")){
                        top=pop(stack,top);
                        //j=top;
                        post+="+";
                        postexp[expressionIndex++]="+";
                        }
               j--;
            }
         top=push(stack, top, "+");
         for(int q=0;q<top;q++)
               // if(stack[q]!=null)
                System.out.print("stack["+q+"]="+stack[q]+"\n");
        }
        else if(temp[i] == null ? "-" == null : temp[i].equals("-")){


            j=top-1;
            while(stack[j] == null ? "(" != null : !stack[j].equals("(")){
                if(stack[j] == null ? "^" == null : stack[j].equals("^")){
                      top= pop(stack,top);
                      post+="^";
                       postexp[expressionIndex++]="^";
                   }
                else if(stack[j] == null ? "/" == null : stack[j].equals("/")) {
                    top= pop(stack,top);
                    post+="/";
                    postexp[expressionIndex++]="/";
                     }
                    else if(stack[j] == null ? "*" == null : stack[j].equals("*")){
                        top= pop(stack,top);
                        post+="*";
                        postexp[expressionIndex++]="*";
                    }
                        else if(stack[j] == null ? "+" == null : stack[j].equals("+")){
                        top=pop(stack,top);
                        post+="+";
                        postexp[expressionIndex++]="+";
                        }
                            else if(stack[j] == null ? "-" == null : stack[j].equals("-")){
                            top=pop(stack,top);
                            post+="-";
                            postexp[expressionIndex++]="-";

                            }
                j--;
            }
         top=push(stack, top, "-");
         
        }
        else if(temp[i] == null ? "(" == null : temp[i].equals("(")){
           top= push(stack,top,"(");
        }
        else if(temp[i] == null ? ")" == null : temp[i].equals(")")){
           
            top=pop(stack,top);
            while(stack[top] == null ? "(" != null : !stack[top].equals("(")){
                
                post+=stack[top];
                postexp[expressionIndex++]=stack[top];
            
                top=pop(stack,top);
            }
            
           
            
        }
        else{
            postexp[expressionIndex++]=temp[i];
            post+=temp[i];
            
        }


}String exp="";
        for( i=0;i<postexp.length;i++)
            if(postexp[i]!=null){
            exp+="(";
                exp+=postexp[i];
            exp+=")";
            }
return exp;
    }
}
