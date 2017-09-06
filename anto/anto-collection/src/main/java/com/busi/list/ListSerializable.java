package com.busi.list;

import java.io.*;


/**
 * @author antoWorld
 * @description ArrayList序列化示例
 * @create 2017/6/12 10:02
 */
public class ListSerializable<E> implements Serializable{
    private String name;
    /**
     * 该数组成员没有用transient修饰
     * 进行序列化操作时会直接序列化成字节流
     */
    private Object[] table;
    private int size;

    public ListSerializable(int capatity) {
        size = 0;
        table = new Object[capatity];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E add(E data) {

        if (size > table.length)
            throw new IllegalArgumentException("table is full");
        table[size++] = data;
        return data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size:" + size);
        sb.append(",data{");
        for (int i = 0; i < size; i++) {
            sb.append(table[i].toString());
            sb.append(i != size - 1 ? "," : "");
        }
        sb.append("}");
        return sb.toString();
    }

    public E get(int index){
        if(index<0||index>size)
            throw new IllegalArgumentException("index is out of the border");
        return (E)table[index];
    }
    public static void main(String[] args) {
        ListSerializable<User> list = new ListSerializable(5);
        list.setName("dataList");
        User user = new User("aa",1);
        list.add(user);
        list.add(new User("bb",2));
        list.add(new User("cc",3));
        System.out.println(list.toString());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(outputStream);
            out.writeObject(list);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream input = new ObjectInputStream(inputStream);

            ListSerializable<User> newList = (ListSerializable) input.readObject();
            System.out.println(newList);

            User user1 = newList.get(0);
            System.out.println(user==user1);//false
            System.out.println(list.getName()==newList.getName());//false
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
