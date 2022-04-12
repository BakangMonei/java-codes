class Programme{

   private String name;
   private String requirements;
   private Module subject;
   
   //Constructor
   public Programme(){
   }
   public Programme(String name, String requirements){
      this.name = name;
      this.requirements = requirements;
   }
   //-------------------------------------------
   
   //setters
   public void setName(String name){
      this.name = name;
   }
   public void setRequirements(String requirements){
      this.requirements = requirements;
   }
   public void setModule(Module subject){
      this.subject = subject;
   }
   //-----------------------------------------------
   
   //getters
   public String getName(){
      return name;
   }
   public String getRequirements(){
      return requirements;
   }
   public Module getModule(){
      return subject;
   }
   public String toString(){
      return "\nProgramme name: "+name+"\nProgramme requirements: "+requirements+"\nProgramme module: "+subject;
   }
   //------------------------------------------------------------------------------------

}