package work;

public class Doctoral implements Student_manage, Teacher_manage {
    private String name;
    private String sex;
    private String age;
    private int tuition;
    private int salary;

    Doctoral(String name, String sex, String age, int tuition, int salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tuition = tuition;
        this.salary = salary;
    }

    public int getSalary(){
        if (salary<36000){
            return (int) (salary*0.03);
        }else{
            return (int)(((salary-36000)*0.1+1080)-2520);
        }
    }

    @Override
    public int Student_payTuition() {
        if(salary-this.getSalary()<tuition){
            int out=tuition-(salary-this.getSalary());
            this.salary=0;
            return out;
        }else{
            this.salary=salary-this.getSalary()-tuition;
            return 0;
        }
    }

    @Override
    public int Student_checkTuition() {
        return tuition;
    }

    @Override
    public int Teacher_getSalary() {
        return salary;
    }

    @Override
    public int Teacher_checkSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Doctoral{" +
                "姓名：'" + name + '\'' +
                ", 性别：'" + sex + '\'' +
                ", 年龄：'" + age + '\'' +
                ", 学费=" + tuition +
                ", 工资=" + salary +
                '}';
    }
}
