import KhachHang.GioHang;
import KhachHang.KhachHang;
import QuanLy.NguoiQuanLy;
import SanPham.Ao;
import SanPham.Quan;
import SanPham.SanPham;

import java.util.ArrayList;
import java.util.List;

public class QuanLyBanHang {

    public static void main(String[] args) {

        List<SanPham> listSanPhamQuanLy = new ArrayList<>();
        listSanPhamQuanLy.add(new Ao("1","1","ao1","dep1",25, 5, 5, false, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("2","1","ao1","dep1",26, 5, 5, false, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("3","1","ao1","dep1",27, 5, 5, false, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("4","1","ao1","dep1",28, 5, 5, false, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("5","2","ao5","dep2",20, 5, 5, true, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("6","2","ao6","dep2",21, 5, 5, true, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("7","2","ao7","dep2",22, 5, 5, true, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("8","2","ao8","dep2",22, 5, 5, true, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("9","3","ao9","dep3",21, 5, 5, false, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("10","3","ao10","dep3",22, 5, 5, false, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("11","3","ao10","dep3",23, 5, 5, false, 5, 5,5));
        listSanPhamQuanLy.add(new Ao("12","3","ao12","dep3",24, 5, 5, false, 5, 5,5));

        listSanPhamQuanLy.add(new Quan("1","1","quan4","dep1",25, 5, 5, 7, true ));
        listSanPhamQuanLy.add(new Quan("2","1","quan2","dep1",26, 5, 5, 7, true));
        listSanPhamQuanLy.add(new Quan("3","1","quan3","dep1",27, 5, 5, 7, true));
        listSanPhamQuanLy.add(new Quan("4","1","quan4","dep1",28, 5, 5, 7, true));
        listSanPhamQuanLy.add(new Quan("5","2","quan5","dep2",20, 5, 5, 8, false));
        listSanPhamQuanLy.add(new Quan("6","2","quan6","dep2",21, 5, 5, 8, false));
        listSanPhamQuanLy.add(new Quan("7","2","quan7","dep2",22, 5, 5, 8, false));
        listSanPhamQuanLy.add(new Quan("8","2","quan8","dep2",22, 5, 5, 8, false));

        List<SanPham> listSpGioHang1 = new ArrayList<>();
        listSpGioHang1.add(new Ao("1","1","ao1","dep1",25, 5, 5, false, 5, 5,5));
        listSpGioHang1.add(new Ao("5","2","ao5","dep2",20, 5, 5, true, 5, 5,5));
        listSpGioHang1.add(new Ao("9","3","ao9","dep3",21, 5, 5, false, 5, 5,5));
        listSpGioHang1.add(new Quan("1","1","quan4","dep1",25, 5, 5, 7, true ));
        listSpGioHang1.add(new Quan("5","2","quan5","dep2",20, 5, 5, 8, false));

        NguoiQuanLy quanLy = new NguoiQuanLy(listSanPhamQuanLy);

        GioHang gioHang1 = new GioHang("20/10/2021");

        KhachHang khachHang1 = new KhachHang("a","09","dong tam", "a@gmail.com", gioHang1);

        khachHang1.TimSanPham(quanLy, "7");
//        khachHang1.ThemVaoGio(listSpGioHang1);
//        khachHang1.ThanhToan(quanLy);
//
//        for(SanPham sanPham : quanLy.getListSanPham()){
//            System.out.println(sanPham);
//        }



    }
}
