class TesterStudent{

   public static void main(String[]args){
   
      Student number1, number2;
      
      number1 = new Student();
      number1.setStudentName("Outule Mosweu");
      number1.setStudentAge(21);
      number1.setInstitution("BAC");
      number1.setCourse("CSE");
         
      System.out.println("\n"+number1.toString());
      
      number2 = new Student();
      number2.setStudentName("Kagiso Mosweu");
      number2.setStudentAge(23);
      number2.setInstitution("UB");
      number2.setCourse("Medicine");
         
      System.out.println(""+number2.toString());
         
   }

}