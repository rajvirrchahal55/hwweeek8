package hwweek;
/*Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.*/
public class Person {
    String firstName;
    String lastName;
    int age;public static void main(String[]args){
    Person person = new Person();
person.setFirstName(""); // firstName is set to empty string
person.setLastName(""); // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John"); // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith"); // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());}
    /*Method named getFirstName without any parameters, it needsto return the value of the firstName
    field.*/
    public String getFirstName() {
        return firstName;
    }
/*method named getLastName without any parameters, it needs to return the value of the lastName
        field.*/
public String getLastName(){
    return lastName;
}
/*Method named getAge without any parameters, it needs to return the value of the age field.*/

    public int getAge() {
        return age;
    }
/*Method named setFirstName with one parameter of type String, it needs to set the value of the
    firstName field.*/
public void setFirstName(String FirstName){
    this.firstName=firstName;
}
/*Method named setLastName with one parameter oftype String, it needs to set the value of the
 lastName field.*/
public void setLastName(String lastName) {
    this.lastName = lastName;
}
/*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
    the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.*/
public void setAge(int age){
    if(age<0||age>100){
this.age=0;
  }else{
this.age=age;
}}
/*Method named isTeen without any parameters, it needs to return true if the value of the age field is
 greaterthan 12 and lessthan 20, otherwise, return false.*/
public boolean isTeen(){
if(age>12 && age<20){
}
return true;
}
/*mthod named getFullName without any parameters, it needs to return the full name ofthe person.
*In case both firstName and lastName fields are empty, Strings return an empty String.
*In case firstName is an empty String, return firstName.
*In case lastName is an empty String, return lastName.*/
public String getFullName(){
if(firstName.isEmpty() && lastName.isEmpty()){
return"";
}else if(firstName.isEmpty()){
return firstName;
}else if(lastName.isEmpty()){
return lastName;
}
return this.firstName+" "+lastName;
}
}




