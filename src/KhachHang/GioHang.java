package KhachHang;

import SanPham.Ao;
import SanPham.Quan;
import SanPham.SanPham;

import java.util.ArrayList;
import java.util.List;

public class GioHang {

    private String thoiGianTao;
    List<SanPham> listSanPham;
    private boolean trangThaiThanhToan =false;

    public String getThoiGianTao() {
        return thoiGianTao;
    }

    @Override
    public String toString() {
        return "GioHang{" +
                "thoiGianTao='" + thoiGianTao + '\'' +
                ", listSanPham=" + listSanPham +
                ", trangThaiThanhToan=" + trangThaiThanhToan +
                '}';
    }

    public List<SanPham> getListSanPham() {
        return listSanPham;
    }

    public boolean isTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }


    public GioHang(String thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
        this.listSanPham = new ArrayList<SanPham>();
    }

    public void ThanhToan(){
        this.trangThaiThanhToan = true;
    }
}
