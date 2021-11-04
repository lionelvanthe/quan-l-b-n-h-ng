package QuanLy;

import KhachHang.KhachHang;
import SanPham.SanPham;
import java.util.ArrayList;
import java.util.List;

public class NguoiQuanLy {

    private List<SanPham> listSanPham;
    private List<KhachHang> listKhachHang;

    public NguoiQuanLy(List<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
        this.listKhachHang = new ArrayList<>();
    }

    public List<KhachHang> getListKhachHang() {
        return listKhachHang;
    }

    public List<SanPham> getListSanPham() {
        return listSanPham;
    }

    public void ThemSanPham(SanPham sanPham){
        if(sanPham == null){
            return;
        }
        else{
            listSanPham.add(sanPham);
        }
    }

    public void XemSanPham(){
        for(SanPham sanPham : listSanPham){
            System.out.println(sanPham);
        }
    }
    public void XoaSanPham(String maSp){
        this.listSanPham.removeIf(sanPham -> sanPham.getMaSp().equals(maSp));
    }

    public void TimSanPham(String tenHoacMa){
        for(SanPham sanPham : listSanPham){
            if((sanPham.getMaSp().equals(tenHoacMa) || sanPham.getTenSp().equals(tenHoacMa))){
                System.out.println(sanPham);
            }
        }

    }

    public void TimSanPham(int giaTien){
        for(SanPham sanPham : listSanPham){
            if(sanPham.getGiaTien() == giaTien){
                System.out.println(sanPham);
            }
        }
    }

    public void TimKhachHang(String khCanTim){
        for (KhachHang khachHang: this.listKhachHang) {
            if(khachHang.getHoTen().equals(khCanTim) || khachHang.getSdt().equals(khCanTim)){
                System.out.println(khachHang);
            }

        }
    }

    public void ThemKhachHang(KhachHang khachHang){
        listKhachHang.add(khachHang);
    }

    public void BanTheoLoai(String loaiSp){

        for(KhachHang khachHang : this.listKhachHang){
            if(khachHang.getGioHang().isTrangThaiThanhToan()){
                for(SanPham sanPham : khachHang.getGioHang().getListSanPham()){
                    if(sanPham.getLoaiSp().equals(loaiSp)){
                        System.out.println(sanPham);
                    }
                }
            }
        }
    }

    public void BanTheoNgay(String ngay){
        for(KhachHang khachHang : this.listKhachHang){
            if(khachHang.getGioHang().isTrangThaiThanhToan() && khachHang.getGioHang().getThoiGianTao().equals(ngay)){
                for(SanPham sanPham : khachHang.getGioHang().getListSanPham()){
                    System.out.println(sanPham);
                }
            }
        }
    }

    public int DoanhThuTheoNgay(String ngay){
        int doanhThu = 0;
        for(KhachHang khachHang : this.listKhachHang){
            if(khachHang.getGioHang().isTrangThaiThanhToan() && khachHang.getGioHang().getThoiGianTao().equals(ngay)){
                for(SanPham sanPham : khachHang.getGioHang().getListSanPham()){
                    doanhThu += sanPham.getGiaTien() * sanPham.getSoLuong();
                }
            }
        }
        return doanhThu;
    }

    public void CapNhatLaiSp(){
        for (KhachHang khachHang: this.listKhachHang) {
            if(khachHang.getGioHang().isTrangThaiThanhToan()){
                for(int i = 0 ; i < khachHang.getGioHang().getListSanPham().size() ; i++){
                    XoaSanPham(khachHang.getGioHang().getListSanPham().get(i).getMaSp());
                }
            }
        }
    }
}
