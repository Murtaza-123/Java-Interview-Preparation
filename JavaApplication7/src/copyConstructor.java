
class Constructor {
    public int id;
    public String name;
    public int age;
    Constructor(int id , String name , int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    Constructor(Constructor c1)
    {
        this.id = c1.id;
        this.name = c1.name;
        this.age = c1.age;
    }

    public void display()
    {
        System.out.println(this.id + " "+this.name + " "+this.age);
    }
}
    public class copyConstructor{
        public static void main(String[] args)
        {
            Constructor c1 = new Constructor(1,"murtaza",22);
            Constructor c2 = new Constructor(c1);
            c1.display();;
            c2.display();
            
        }
    }
