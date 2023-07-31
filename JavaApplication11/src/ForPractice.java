
public class ForPractice {

    public static void main(String[] args) {
        person prs = new person();
        prs.set(23);
        System.out.print(prs.getage());
    }
}
class person
{
    int age;
    public void set(int age)
    {
        this.age = age;
    }
    public int getage()
    {
        return this.age;
    }
}
