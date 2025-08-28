package Encapsulation.model;

public class Employee {
    private String name;
    private int age;
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18){
        this.age = age;
    }else {
            System.out.println("Less than required age limit");
        }
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

}
