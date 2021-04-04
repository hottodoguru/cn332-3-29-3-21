public class person {
   private final String name;
   private final String surname;
   private int age;
   private final String gender;
   public person(String firstName, String lastname, int age, String gender){
      name = firstName;
      surname = lastname;
      this.age = age;
      this.gender = gender;
   }
   public String getFirstname(){
      return name;
   }
   public String getLastname(){
      return surname;
   }
   public int getAge(){
      return age;
   }
   public String getGender(){
      return gender;
   }
   public person withFirstname(String firstName){
      return new person(firstName,surname,age,gender);
   }
   public person withLastname(String lastName){
      return new person(name,lastName,age,gender);
   }
   public void addAge(){
      age = age + 1;
   }
   public String toString(){
      return "Person(" + name + "," + surname + ","+ gender + ")";
   }
}
