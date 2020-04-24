/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Date;

/**
 *
 * @author HP
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        QLSV qlsv = new QLSV();
        SinhVien a = new SinhVien("Alex",new Date(2,24,1999),6.5f);
        SinhVien b = new SinhVien("BohnSon",new Date(2,14,1999),7);
        SinhVien c = new SinhVien("Cichael",new Date(20,6,1999),9);
        SinhVien d = new SinhVien("Diasa",new Date(2,9,1999),5.5f);
        qlsv.themSinhVien(a);
        qlsv.themSinhVien(b);
        qlsv.themSinhVien(c);
        qlsv.themSinhVien(d);
        
        System.out.println("So sánh theo điểm\n");
        qlsv.setQLSV(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
        
        System.out.println("So sánh theo tên\n");                
        qlsv.setQLSV(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
                
    }
    
}
