class UltimateStudentTester{

   public static void main(String[]args){
   
      Student number1 = new Student();
      number1.setStudentName("Professor Monei");
      number1.setStudentAge(19);
      
      College school = new College();
      school.setName("Botswana Accountancy College");
      school.setAddress("Fairground Internation Office Park, Plot 50661, Gaborone");
      number1.setInstitution(school);
      //number1.getInstitution().setName("University Of Botswana");
      
      Programme course = new Programme();
      course.setName("Computer Systems Engineering");
      course.setRequirements("36 points and above");
      school.setProgramme(course);
      //number1.getInstitution().getProgramme().setRequirements("A+");
          
      Module subject = new Module();
      subject.setName("Introduction to java");
      subject.setCredits(20);
      subject.setPrerequisite("CMS");
      course.setModule(subject);
      System.out.println(number1);
   }

} 