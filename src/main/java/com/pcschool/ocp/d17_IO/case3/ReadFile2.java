package com.pcschool.ocp.d17_IO.case3;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadFile2 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_IO\\report");
        try(InputStreamReader fis = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);) {//將 ANSI 轉 UTF-8
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
