/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class GioHang {
    private IThanhToan hinhThucThanhToan;
    ArrayList<HangHoa> danhSachHangHoa = new ArrayList<>();
    
    public void setPhuongThucThanhToan(IThanhToan hinhIThanhToan){
        this.hinhThucThanhToan = hinhIThanhToan;
    }
    
    public void themHangVaoGio(HangHoa hangHoa){
        danhSachHangHoa.add(hangHoa);
    }
    
    public void inHoaDon(){
        int giaTien = 0;
        for(HangHoa i:danhSachHangHoa){
            System.out.println(i.inDanhSach());
            giaTien += i.getGia();            
        }
        System.out.println("Tổng hóa đơn "+hinhThucThanhToan.thanhToan(giaTien));        
    }
    
}
