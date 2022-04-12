class Module{

   private String name;
   private int credits;
   private String prerequisite;
   
   //Constructors
   public Module(){
   }
   public Module(String name, int credits){
      this.name = name;
      this.credits = credits;
   }
   //--------------------------------------
   
   //Setters
   public void setName(String name){
      this.name = name;
   }
   public void setCredits(int credits){
      this.credits = credits;
   }
   public void setPrerequisite(String prerequisite){
      this.prerequisite = prerequisite;
   }
   //-----------------------------------------------
   
   //Getters
   public String getName(){
      return name;
   }
   public int getCredits(){
      return credits;
   }
   public String getPrerequisite(){
      return prerequisite;
   }
   public String toString(){
      return "\nModule name: "+name+"\nModule credits: "+credits+"\nModule prerequisite: "+prerequisite;
   }

}