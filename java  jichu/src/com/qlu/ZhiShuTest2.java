package com.qlu;

/**
 * @author jiajinshuo
 * @create 2019-12-21 15:54
 * 方法二：
 * 输出1-100的质数
 */
public class ZhiShuTest2 {
    public static void main(String[] args) {

        boolean isFlag = true;
        for(int i = 2;i<=100;i++){
            for(int j = 2;j<Math.sqrt(i);j++){//优化二：极限为两个乘数相等
                if(i % j == 0){//能被除断则不是质数
                    isFlag = false;
                    break;//优化一：能除断就判断是偶数了，就不要再除了
                }
            }
            if(isFlag == true){
                System.out.println(i+"\t");
            }
            //重置isFlag。因为前面可能存在偶数导致isFlag为false
            isFlag = true;
        }
    }
}
