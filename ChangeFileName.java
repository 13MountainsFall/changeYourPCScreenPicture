package com.gao;


import java.io.*;

/**
 * gaoyuxin
 * qiuyebai123@gmail.com
 */
public class ChangeFileName {
    //        源文件路径
    static String str1 = "E:\\E02图片\\AllBiZhi01";

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        //获取所有文件名list
        File file = new File(str1);
        File[] list = file.listFiles();
        //System.out.println(list);//[Ljava.lang.String;@1b6d3586

        //gei all names for String
        for (File item : list) {
            if(!item.isDirectory() && !item.getName().endsWith(".jpg") && !item.getName().endsWith(".txt") && !item.getName().endsWith(".bat")){
                System.out.println(item);
                System.out.println(str1+"\\"+item.getName()+".jpg");
                item.renameTo(new File(str1+"\\"+item.getName()+".jpg"));
                System.out.println("改名成功");
                System.out.println("---------------------");
            }
        }
    }
}





