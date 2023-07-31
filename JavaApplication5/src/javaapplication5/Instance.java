
package javaapplication5;
  class InstanceMethods {
      //class Fields
     public String name;
     public int age;
     public double gpa;
     //constructor
     InstanceMethods(String name , int age , double gpa)
     {
         this.name = name;
         this.age = age;
         this.gpa = gpa;
     }
     //Instance Method
     public boolean isEligble()
     {
         if(this.gpa > 3.2)
         {
             return true;
         }
         return false;
     }
          
             
     
    
}
public class Instance
{
    public static void main(String[] args)
    {
        //Instance Object
        InstanceMethods instance = new InstanceMethods("murtaza" , 25 , 2.7);
        System.out.println(instance.isEligble() + " "+instance.name+ " "+instance.gpa + " "+instance.age);
      
    }
}