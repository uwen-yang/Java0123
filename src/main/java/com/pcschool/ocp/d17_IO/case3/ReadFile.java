package com.pcschool.ocp.d17_IO.case3;

import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_IO\\report");
        try(FileReader fis = new FileReader(file);) {//預設抓取 ANSI編碼內容(會有亂碼)
            StringBuilder sb = new StringBuilder();
            char[] cbuf = new char[1];
            while (fis.read(cbuf) != -1) {
                String s = new String(cbuf);
                sb.append(s);   
            }
        }catch (Exception e) {
    }
    
}
}
