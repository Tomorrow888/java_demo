
package com.oopplus;

/**
 * @author jiajinshuo
 * @create 2019-12-25 19:01
 *对Student类的改进

 */
public class Student1 {

    int number;//学号
    int state;//年级
    int score;//成绩

    //显示学生的信息
    public String info(){
        return "学号："+number+"，年级："+state+",成绩"+score;
    }

}
class StudentTest1{
    public static void main(String[] args) {
        //创建Student类型的数组
        Student1[] stus = new Student1[20];
        //给数组元素赋值
        for(int i = 0;i<stus.length;i++){
            stus[i] = new Student1();
            //给student对象的属性赋值
            stus[i].number = i +1;
            //年级[1,6]
            stus[i].state = (int)(Math.random()*(6-1+1)+1);
            //成绩[0,100]
            stus[i].score = (int)(Math.random()*(100-0+1)+0);
        }
        //遍历学生数组
        StudentTest1 s1 = new StudentTest1();
        s1.print(stus);
        //打印出三年级state=3学生的信息
        s1.searchState(stus,3);

        System.out.println("接下来使用冒泡排序按学生成绩排序，并遍历所有信息");
        s1.sort(stus);
        s1.print(stus);

        //遍历
       /* for(int i = 0;i<stus.length;i++){
            System.out.println(stus[i].info());
        }*/

    }
    //遍历Student1[]数组的操作(把操作封装到方法里面）
    public void print(Student1[] stus){
        //遍历学生数组
        for(int i = 0;i<stus.length;i++){
            //直接打印会显示地址值。必须得调用
            System.out.println(stus[i].number+","+stus[i].state+","+stus[i].score);
        }
    }

    /**
     * 查找Student1[]指定年级的信息
     * @param stus 要找的数组
     * @param state 要找的年级
     */
    public void searchState(Student1[] stus,int state){
        for(int i = 0;i<stus.length;i++){
            if(stus[i].state == state){
                System.out.println( stus[i].info());
            }
        }
    }
    public void sort(Student1[] stus){//加形参Student1[] stus的原因：如果不加stus会报错
        for(int i = 0;i<stus.length - 1;i++){
            for(int j = 0;j<stus.length - 1- i;j++){
                if(stus[j].score > stus[j+1].score){
                    Student1 temp = stus[j]; //交换的不是学生成绩，是学生
                    stus[j] = stus[j+1];
                    stus[j+1]= temp;
                }
            }
        }
    }
}