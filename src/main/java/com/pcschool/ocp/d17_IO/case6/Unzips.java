package com.pcschool.ocp.d17_IO.case6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unzips {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File zipFile = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_IO\\Salary.7z");
        try(FileInputStream fis = new FileInputStream(zipFile);
                ZipInputStream zis = new ZipInputStream(fis);
                Reader r = new InputStreamReader(zis);){
             ZipEntry zipEntry = null;
             while((zipEntry = zis.getNextEntry()) != null) {
            System.out.printf("zip: %s\n", zis.getNextEntry().getName());
            char[] buffer = new char[1];
            StringBuilder sb = new StringBuilder();
            while((r.read(buffer) != -1)){
                sb.append(buffer);
                
            }
            System.out.println(sb);
                }
        }catch (Exception e) {
            
        }
    }
}
