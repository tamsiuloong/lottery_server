package com.tosit.lottery.ui;

import java.io.*;
import java.util.Scanner;

/**
 * _ooOoo_
 * o8888888o
 * 88" . "88
 * (| -_- |)
 * O\  =  /O
 * ____/`---'\____
 * .'  \\|     |//  `.
 * /  \\|||  :  |||//  \
 * /  _||||| -:- |||||-  \
 * |   | \\\  -  /// |   |
 * | \_|  ''\---/''  |   |
 * \  .-\__  `-`  ___/-. /
 * ___`. .'  /--.--\  `. . __
 * ."" '<  `.___\_<|>_/___.'  >'"".
 * | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 * \  \ `-.   \_ __\ /__ _/   .-` /  /
 * ======`-.____`-.___\_____/___.-`____.-'======
 * `=---='
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/8/31.
 **/

public class Account {

        private String accountName;
        private double  amount;
        public void deposit(double money)
        {
            amount+=money;
        }



        public int withdraw(double money)
        {
            int result = 1;
            //当存款余额大于取款金额时，执行取款修改余额；
            if(amount>money)
            {
                amount-=money;
                result = 0;
            }
            return result;
        }


    public static void main(String[] args) {
        try {
            String filePath = "d:\\text.txt";
            DataInputStream dis = new DataInputStream(new FileInputStream(filePath));
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath));

            Scanner input = new Scanner(System.in);
            String s=  null;
            while(true)
            {
                s = input.nextLine();
                if(s.equals("done"))
                {
                    break;
                }
                dos.writeUTF(s);
            }

            dos.close();

            try{
                while((s= dis.readUTF())!=null)
                {
                    System.out.println(s);
                }
            }catch(EOFException e2){}

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
