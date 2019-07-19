/**
 * 简易银行管理系统流程
 * 1.查看余额
 * 2.取钱
 * 3.存钱
 * 4.转账
 * 5.退出
 *业务能循环
 *
 * 每个功能要拆分成方法
 * 用控制台代替触屏和按键
 * sout输出
 */


package com.neuedu.function;

import java.util.Scanner;

public class Demo1 {

    //定义余额为10000
    static int money = 10000;
    //定义输入流
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        showMenu();
    }

    //定义菜单
    static void showMenu() {
        while (true) {
            System.out.println("1.查看余额");
            System.out.println("2.取钱");
            System.out.println("3.存钱");
            System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("输入序号选择功能");

            //输入
            int index = input.nextInt();
            //清除nextLine能识别的空格符
            input.nextLine();
            //选择循环，如果输入1，执行case1，......
            switch (index) {
                case 1:
                    lookmoney();
                    break;
                case 2:
                    cutmoney();
                    break;
                case 3:
                    savemoney();
                    break;
                case 4:
                    transfermoney();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("没有此项");
            }
        }
    }
    //定义查看余额的方法
    static void lookmoney() {
        System.out.println("余额为："+money);
    }
    //定义取钱的方法
    static void cutmoney() {
        System.out.println("请输入取钱金额");
        int cut = input.nextInt();
        input.nextLine();
        if (money > cut) {
            money -= cut;
        }else {
            System.out.println("存款不足");
        }
        System.out.println("取钱金额为"+cut);
    }
    //定义存钱的方法
    static void savemoney() {
        System.out.println("请输入存入金额");
        int add = input.nextInt();
        input.nextLine();
        money += add;
        System.out.println("成功");
    }
    //定义转账的方法
    static void transfermoney() {
        System.out.println("请输入转账金额");
        int transfer = input.nextInt();
        input.nextLine();
        money -= transfer;
        System.out.println("转账成功");
    }
}

