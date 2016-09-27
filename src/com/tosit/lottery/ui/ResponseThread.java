package com.tosit.lottery.ui;

import com.tosit.lottery.dao.WinningPeopleDao;
import com.tosit.lottery.entity.RequestData;
import com.tosit.lottery.entity.WinningPeople;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by DELL on 2016/8/22.
 */
public class ResponseThread extends Thread{

    private WinningPeopleDao winningpeopleDao = new WinningPeopleDao();
    private Socket socket ;

    public ResponseThread(Socket socket) {
        this.socket = socket;

    }

    @Override
    public void run() {

        try {
            //获取流
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());



            //接收数据
            RequestData requestData = (RequestData)ois.readObject();
            String cmd = requestData.getCmd();
            if(cmd.equals("upload"))
            {
                List<WinningPeople> peoples = (List<WinningPeople>)requestData.getData();
                winningpeopleDao.saveAll(peoples);
                //向客户端发出响应
                oos.writeBoolean(true);
                oos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TreeSet myTreeSet = new TreeSet();
                  myTreeSet.add("x");
                   myTreeSet.add("z");
                   myTreeSet.add("y");
                   myTreeSet.add("a");
                   myTreeSet.add("b");
                  myTreeSet.add("c");
                  Iterator myIter= myTreeSet.iterator();
                  while(myIter.hasNext())
                      System.out.print(myIter.next());
                  System.out.println();
    }
}
