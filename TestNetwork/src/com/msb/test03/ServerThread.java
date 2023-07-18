package com.msb.test03;

import java.io.*;
import java.net.Socket;

/**
 * @author: Adam
 * @date: 2023/7/13 - 14:37
 * @description: com.msb.test03
 * @version: 1.0
 */
public class ServerThread extends Thread {//线程：专门处理客户端的请求
    DataOutputStream dos = null;
    ObjectInputStream ois = null;
    Socket s = null;
    public ServerThread(Socket s){
        this.s = s;
    }

    @Override
    public void run() {
        try{
            InputStream is = s.getInputStream();
            ois = new ObjectInputStream(is);

            //4.读取客户端的数据
            User user = (User)(ois.readObject());

            //对对象进行验证
            boolean flag = false;
            if(user.getName().equals("娜娜")&&user.getPwd().equals("123321")){
                flag = true;
            }

            //向客户端输出结果 ---》操作输出流
            OutputStream os = s.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeBoolean(flag);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }finally{
            try {
                if(dos!=null) {
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(ois!=null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
