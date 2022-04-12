import java.util.Scanner;

class Calculate{ 

   private int addition;
   private int subtraction;
   private int multiplication;
   private int division;
   
   int num1,num2;
      
   public Calculate(){
   }
    //getters   
   public void getUserInput(){
      Scanner input = new Scanner(System.in);
         
      System.out.println("Enter first integer");
      num1 = input.nextInt();
      System.out.println("Enter second integer");
      num2 = input.nextInt();
   }
   
    //Setters     
   public void setAddition(){
      System.out.println(num1+" + "+num2+" = "+(num1 + num2));
   }
   
   public void setSubtraction(){
      System.out.println(num1+" - "+num2+" = "+(num1 - num2));
   }
   public void setMultiplication(){
      System.out.println(num1+" * "+num2+" = "+(num1 * num2));
   }
   public void setDivision(){
      if (num2 == 0){
         System.out.print("ERROR 2, division is not possible when b is 0");
      } else {
         System.out.println(num1+" / "+num2+" = "+(num1 / num2));
      }
      
   }
        
}