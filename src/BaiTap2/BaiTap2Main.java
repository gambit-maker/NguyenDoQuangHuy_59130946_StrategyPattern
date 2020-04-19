/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author HP
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa h1 = new HangHoa("Cam", 90000, "Cam rất ngon");
        HangHoa h2 = new HangHoa("Bưởi", 100000, "Bưởi rất ngọt");
        HangHoa h3 = new HangHoa("Cà phê rang", 200000, "Cà phê rất đắng");
        
        GioHang gioHang = new GioHang();
        
        gioHang.themHangVaoGio(h1);
        gioHang.themHangVaoGio(h2);
        gioHang.themHangVaoGio(h3);
        
        System.out.println("Thanh toán Onlline");
        gioHang.setPhuongThucThanhToan(new ThanhToanOnlline());
        gioHang.inHoaDon();
        
        System.out.println();
        System.out.println("Thanh toán COD");
        gioHang.setPhuongThucThanhToan(new ThanhToanCOD());
        gioHang.inHoaDon();
    }
    
}
