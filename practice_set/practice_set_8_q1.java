class Employee{
    int Salary;
    String name;
    public int getSalary(){
        return Salary;
    }

    public String getName() {
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
public class practice_set_8_q1 {
    public static void main(String[] args) {
        Employee harry=new Employee();
        harry.setname("CodeWithHarry");
        harry.Salary=233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());



    }
}
