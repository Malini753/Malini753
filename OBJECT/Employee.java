class Employee
{
    int id=1;
    String name="Malini";
    float salary=23;
    public void work()
    {

        System.out.println("Iam in work");

    }
    public static void main(String[] args) {
        
        Employee obj=new Employee();
        System.out.println(obj);
        System.out.println(obj.id);
        System.out.println(obj.salary);
        System.out.println(obj.name);
        obj.work();
       
    }

}