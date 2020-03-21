package com.superexer;

/**
 * @author jiajinshuo
 * @create 2019-12-28 18:29
 * 写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账号为 1122、余
 * 额为 20000、年利率 4.5%，可透支限额为 5000 元的 CheckAccount 对象。
 * 使用 withdraw 方法提款 5000 元，并打印账户余额和可透支额。
 * 再使用 withdraw 方法提款 18000 元，并打印账户余额和可透支额。
 * 再使用 withdraw 方法提款 3000 元，并打印账户余额和可透支额。
 */
public class CheckOutTest {
    public static void main(String[] args) {

        CheckOut co = new CheckOut(1122, 20000, 0.045, 5000);
        co.withdraw(5000);
        System.out.println("账户余额为："+co.getBalance()+"可透支额为"+co.getOverdraft());
        co.withdraw(18000);
        System.out.println("账户余额为："+co.getBalance()+"可透支额为"+co.getOverdraft());
        co.withdraw(3000);
        System.out.println("账户余额为："+co.getBalance()+"可透支额为"+co.getOverdraft());
    }
}
