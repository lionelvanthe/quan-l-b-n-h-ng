package KhachHang;

import QuanLy.NguoiQuanLy;
import SanPham.SanPham;
import java.util.List;

public class KhachHang {
    private String hoTen;
    private String sdt;
    private String diachi;
    private String email;
    private GioHang gioHang;

    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", sdt='" + sdt + '\'' +
                ", diachi='" + diachi + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getSdt() {
        return sdt;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public KhachHang(String hoTen, String sdt, String diachi, String email, GioHang gioHang) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.diachi = diachi;
        this.email = email;
        this.gioHang = gioHang;
    }
    public void XemSanPhan(NguoiQuanLy quanLy){

        for(SanPham sanPham : quanLy.getListSanPham()){
            System.out.println(sanPham);
        }
    }

    public void TimSanPham(NguoiQuanLy quanLy, String spCanTim) {

        for (int i = 0; i < quanLy.getListSanPham().size(); i++) {
            if ((quanLy.getListSanPham().get(i).getLoaiSp().equals(spCanTim))) {
                System.out.println(quanLy.getListSanPham().get(i));
            } else if ((!quanLy.getListSanPham().get(i).getLoaiSp().equals(spCanTim)) && i == quanLy.getListSanPham().size() - 1) {
                System.out.println("Khong tim thay san pham can tim");
            }
        }
    }

    public void ThemVaoGio(List<SanPham> listSanPham){

        if(listSanPham == null){
            return;
        }
        else{
            gioHang.getListSanPham().addAll(listSanPham);
        }
    }

    public void ThanhToan(NguoiQuanLy quanLy){

        for(SanPham sanPham : gioHang.getListSanPham()){
            System.out.println(sanPham);
        }
        gioHang.ThanhToan();
        quanLy.ThemKhachHang(this);
        quanLy.CapNhatLaiSp();
    }
}
