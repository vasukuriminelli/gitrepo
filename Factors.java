class Factors {
    public static void main(String[] args) {
    int num1=3,start=1,count=0;
     
     while(start<=num1)
     {
   if(num1%2==0)
   {
       System.out.println("even");
       num1=num1/2;
        System.out.println(num1);
System.out.println("even");
   }
   else
   {

       System.out.println(num1);
       System.out.println("odd");
 	

       num1=3*num1+1;
       
       System.out.println(num1);
   }
   
 start++;
     }
     
    
    }
}