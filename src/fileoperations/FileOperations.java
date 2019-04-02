/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.*;

/**
 *
 * @author bthnd
 */
public class FileOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static void dosyaYaz(String tip, String fiyat, String URL) {
        try {
            File f = new File(URL);
            FileWriter yazici = new FileWriter(f, true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            if (!("").equals(tip) && !("").equals(fiyat)) {
                yaz.write(tip);
                yaz.newLine();
                yaz.write(fiyat);
                yaz.newLine();
                yaz.close();
                System.out.println("Ekleme İşlemi Başarılı");
            }
        } catch (Exception hata) {
            hata.printStackTrace();
        }
    }

}
