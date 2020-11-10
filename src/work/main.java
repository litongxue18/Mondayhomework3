package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Doctoral> Doctoral = new ArrayList<Doctoral>();
        System.out.println("输入博士个数：");
        Scanner num = new Scanner(System.in);
        int Dnum = num.nextInt();
        for (int i = 0; i < Dnum; i++) {
            System.out.println("输入第" + (i + 1) + "位博士姓名：");
            Scanner name = new Scanner(System.in);
            String Dname = name.nextLine();
            System.out.println("输入第" + (i + 1) + "位博士性别：");
            Scanner sex = new Scanner(System.in);
            String Dsex = sex.nextLine();
//            try{
            	System.out.println("输入第" + (i + 1) + "位博士年龄：");
                Scanner age = new Scanner(System.in);
                String Dage = age.nextLine();
//                if(Dage<0){
//                	throw new Exception("年龄错误");
//                }
//            }
            
            try{
            	System.out.println("输入第" + (i + 1) + "位博士学费：");
                Scanner tuition = new Scanner(System.in);
                int Dtuition = tuition.nextInt();
                if(Dtuition<0){
                	throw new Exception("输出错误！学费不能为负！");
                }
            }
            
            catch(Exception e){
            	  System.out.println("发生异常："+e.getMessage());
            	  System.exit(1);
            }
          
            try{
            	System.out.println("输入第" + (i + 1) + "位博士薪水：");
                Scanner salary = new Scanner(System.in);
                int Dsalary = salary.nextInt();
                if(Dsalary<0){
                	throw new Exception("输出错误！薪水不能为负！");
                
                }
            }
                catch(Exception e){
                	System.out.println("发生异常："+e.getMessage());
                	System.exit(1);
                }
          
            
            Doctoral doctoral = new Doctoral(Dname, Dsex, Dage, i, i);
            Doctoral.add(doctoral);
        }
        for (Doctoral i : Doctoral) {
            System.out.println("---------------------------");
            System.out.println(i.toString());
            System.out.println("该博士的税收："+i.getSalary());
            System.out.println("该博士的学费还需（已减去薪水）："+i.Student_payTuition());
            System.out.println(i.toString());
            System.out.println("---------------------------");
        }

    }
}
