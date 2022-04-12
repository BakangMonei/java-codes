class College{

   private String name;
   private String address;
   private Programme course;
   
   //------------------------------------------
   public College(){
   }
   //------------------------------------------
   public College(String name, String address){
      this.name = name;
      this.address = address;
   }
   //------------------------------------------
   
   //Setters
   public void setName(String name){
      this.name = name;
   }
   public void setAddress(String address){
      this.address = address;
   }
   public void setProgramme(Programme course){
      this.course = course;
   }
   //------------------------------------------
   
   //getters
   public String getName(){
      return name;
   }
   public String getAddress(){
      return address;
   }   
   public Programme getProgramme(){
      return course;
   } 
   public String toString(){
      return "\nCollege name: "+name+"\nCollege address: "+address+"\nCollege programme: "+course;
   }
   //------------------------------------------------------------------------------------
}