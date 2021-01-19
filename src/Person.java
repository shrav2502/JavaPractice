package JavaClasses;

public class Person {
   private String firstName;
   private String lastName;
   private int age;
   
   public void setFirstName(String firstName) {
	   this.firstName=firstName;
   }
   
   public void setLastName(String lastName) {
	   this.lastName=lastName;
   }
   
   public void setAge(int age) {
	   if(age < 0 || age > 100) {
		   this.age=0;
	   }
	   else {
		   this.age=age;
	   }
   }
   
   public String getFirstName() {
	   return this.firstName;
   }
   
   public String getLastName() {
	   return this.lastName;
   }
   
   public int getAge() {
	   return this.age;
   }
   
   public String getFullName() {

	   if(this.firstName==null && this.lastName==null) {
		   return "";
	   }
	   else if(this.lastName==null) {
		   return this.firstName;
	   }
	   else if(this.firstName==null) {
		   return this.lastName;
	   }
	   else {
		   return this.firstName+ " "+this.lastName;
	   }
   }
   
   public boolean isTeen() {
	  if(this.age>12 && this.age<20) {
		  return true;
	  }
	  else {
		  return false;
	  }
   }
   
}
