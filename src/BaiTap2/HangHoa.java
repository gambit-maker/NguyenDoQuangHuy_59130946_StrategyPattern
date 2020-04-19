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
public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;
    
    public HangHoa(String tenHH, int gia, String moTa){
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    
    public String inDanhSach(){
        return String.format("Tên hàng hóa: %s\nGiá tiền: %d\n"
                + "Mô tả: %s\n",tenHH,gia,moTa);
    }
    
    public int getGia(){
        return gia;
    }
    
    public void setGia(int gia){
        this.gia = gia;
    }
}
