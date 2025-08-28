package Encapsulation;

public class Employee {
    public static void main(String[] args) {
        Encapsulation.model.Employee obj=new Encapsulation.model.Employee();
        obj.setName("Harish");
        obj.setAge(17);
        obj.setDept("CS");
        System.out.println("Employee name: "+obj.getName()+" Age: "+obj.getAge()+" Dept: "+obj.getDept());
        System.out.println(obj.getAge());
    }
}
