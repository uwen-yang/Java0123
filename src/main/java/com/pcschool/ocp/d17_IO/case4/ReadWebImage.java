package com.pcschool.ocp.d17_IO.case4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadWebImage {
    public static void main(String[] args) throws MalformedURLException, IOException {
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_IO\\report");
        String path ="https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.mini.com.tw%2Fzh_TW%2Fhome%2Frange%2Fmini-3-door-hatch.html&psig=AOvVaw1Dl63hvFZRLHd5fk59o4Ct&ust=1598584783377000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIjtseO3uusCFQAAAAAdAAAAABAE";
        URL url = new URL(path);
        try(InputStream is = url.openStream();
                FileOutputStream fos = new FileOutputStream(file);) {
                byte[] b = new byte[1];
                while (is.read(b) != -1) { // 將資料一個 byte 一個 byte 的讀進 byte[] b   
                    fos.write(b); // 將 byte[] b 的資料一個 byte 一個 byte 的寫入到指定檔案 file 
            }
                System.out.println("寫入完成");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
