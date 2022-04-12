public class Student{

   //Attributes
   private String studentName;
   private int studentAge;
   private College institution;
   private Programme course;
   
   //Non arguement constructor
   public Student(){ 
   }
   
   //constructor
   public Student(String name, int age){ 
      this.studentName = name;
      this.studentAge = age;
   }
         
    //Mutators   
   public void setStudentName(String name){ //Mutator for student's name
      this.studentName = name;
   }
   public void setStudentAge(int age){ //Mutator for student's age
      this.studentAge = age;
   }
   public void setInstitution(College school){ //Mutator for student's University name
      this.institution = school;
   }
   public void setCourse(Programme c){ //Mutator for Student's course
      this.course = c;
   }
   
   //Setters
   public String getStudentName(){ //Accessor for student name
      return this.studentName;
   }

   public int getStudentAge(){ //Accessor for student's age
      return this.studentAge;
   } 
   public College getInstitution(){ //Accessor for student's University name
   
      return this.institution;
   }
   public Programme getCourse(){ //Accessor for student's course
      return this.course;
   }
   
   public String toString(){
      
      return "\nStudent name: "+studentName+"\nStudent Age: "+studentAge+"\nStudent College: "+institution+"\n "+course;
   }
   
}