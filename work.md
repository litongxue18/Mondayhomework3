 ＃第三次实验课 李灵臣 计G2020322084
## 1.实验要求
1.在博士研究生类中实现各个接口定义的抽象方法;  

2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；  

3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  

4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  

5.根据输入情况，要在程序中做异常处理。  


## 2.实验内容
1.某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  

2.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。  

3.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  

4.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。

## 3.实验目的
1.掌握Java中抽象类和抽象方法的定义；   

2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法  

3.了解异常的使用方法，并在程序中根据输入情况做异常处理  



## 4.实验过程  
(1).创建了4个类：Doctoral、main、Student_manage、Teacher_manage.  
Doctoral为博士类：设置了博士的姓名、性别、年龄、学费、薪水。 

Student_manage为学生接口：设置了缴纳学费方法和查询学费方法。

Teacher_manage为教师管理接口：设置了发放工资的方法和查询薪水的方法。  

（2）.通过博士类实现学生和老师的接口并重写接口中的方法；  
在Doctcral中定义了薪水的方法，从而用if else判断语句进行判断。重写了教师管理接口和学生管理接口，并且返回学费和工资。  

（3）main为主方法：初始化博士类并输出博士类的姓名、性别、年龄，调用了学费、薪水的方法。在main方法中通过集合和循环语  
句来实验第1、2、---+n个博士；在输入学费和薪水处设置异常，当薪水和学费输入为负数时，显示“输出错误！薪水/学费不能为负！”并同时终止输入，程序需重新运行。  



  

 
## 5.实验核心代码  
```
//学生管理接口
public interface Student_manage {
    //缴纳学费方法
    public int Student_payTuition();
    //查学费方法
    public int Student_checkTuition();
}

```
``` 
//教师管理接口
public interface Teacher_manage {
    //发放薪水方法
    public int Teacher_getSalary();
    //查询薪水方法
    public int Teacher_checkSalary();
}


```
```
//重写学生老师接口方法
  public int Student_checkTuition() {
        return tuition;
    }

    @Override
    public int Teacher_getSalary() {
        return salary;
    }

```
```
System.out.println("输入第" + (i + 1) + "位博士薪水：");
            Scanner salary = new Scanner(System.in);
            int Dsalary = salary.nextInt();
            try{
            	if(Dsalary<0){
            	throw new Exception("输出错误！薪水不能为负！"); //异常显示
            }
        }
            catch(Exception e){
          	  System.out.println("发生异常："+e.getMessage()); 
          	  System.exit(1); //发生异常后，终止运行
          }

```
```

for (int i = 0; i < Dnum; i++) {  //for循环 实现第1.2.3------+n个博士
            System.out.println("输入第" + (i + 1) + "位博士姓名：");
            Scanner name = new Scanner(System.in);
            String Dname = name.nextLine();
```
## 6.运行截图   
![alt console](http://m.qpic.cn/psc?/V50ghPAb3qpJGr4VGzMR1RNNj21NWrfC/ruAMsa53pVQWN7FLK88i5mn*CGjnEd3r40pIp4Ri7puA92bCfX58Mr8CFQY1ISMhxafECkwT3cmcGdVrJNJLeSqlo7UQ59Peg3X2DJt3nnc!/b&bo=*AAEAQAAAAADB9s!&rf=viewer_4)  
  
  
![alt console](http://m.qpic.cn/psc?/V50ghPAb3qpJGr4VGzMR1RNNj21NWrfC/45NBuzDIW489QBoVep5mcXPBUEt7Q7*b**VBpjWsUUOrSN1FgxAZ4bVxtlaCXolwzSJwADz99j7eZIzG9nXQuidK4uEXWdafHuo0bn578is!/b&bo=wgChAQAAAAADF1A!&rf=viewer_4)   
  
  
![alt console](http://m.qpic.cn/psc?/V50ghPAb3qpJGr4VGzMR1RNNj21NWrfC/45NBuzDIW489QBoVep5mcXPBUEt7Q7*b**VBpjWsUUOayfyk0ABivZTAY4F0dAHbIcAOJW18RtPbKBHgKAnkqTxexiHhRQUkHXoHyCAf0.I!/b&bo=sAIMAQAAAAADF40!&rf=viewer_4) 


## 7.编程感想  
1.通过编程掌握了如何实现接口中的方法，再次运用了List集合和for循环来实现博士生的个数。  

2.上网查询了发生异常后，终止运行的代码。System.exit(1);   

3.上网检索了税收的相关公式，并在软件中实现。  

4.在编程过程中出现了许多问题和报错，经过同学的帮助以及csdn的查询，逐步排错改错。

