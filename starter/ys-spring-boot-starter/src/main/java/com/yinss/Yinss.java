package com.yinss;


import lombok.Data;

@Data
public class Yinss {
    String name ="百变小阴";
    String address = "日本东京秋叶原";
    String descirbe = "This is my starter";

    public Yinss() {
        System.out.println("Yinss 创建成功");
    }
}
