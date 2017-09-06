package com.busi.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/13 9:40
 */
public class DataWriter {
    public static void main(String[] args) {
        File file = new File("aaa.txt");
        try {
            if (!file.isFile()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            writer.write("demo2");
            //writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
