package SanPham;

public class Ao extends SanPham {

    private boolean daiTay;
    private int vongNguc;
    private int vongEo;
    private int vongMong;

    public Ao(String maSp, String loaiSp, String tenSp, String mota, int giaTien,
              int soLuong, int size, boolean daiTay, int vongNguc, int vongEo, int vongMong) {
        super(maSp, loaiSp, tenSp, mota, giaTien, soLuong, size);
        this.daiTay = daiTay;
        this.vongNguc = vongNguc;
        this.vongEo = vongEo;
        this.vongMong = vongMong;
    }

    @Override
    public String toString() {
        return "Ao{" +
                "daiTay=" + daiTay +
                ", vongNguc=" + vongNguc +
                ", vongEo=" + vongEo +
                ", vongMong=" + vongMong +
                ", maSp='" + maSp + '\'' +
                ", loaiSp='" + loaiSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", mota='" + mota + '\'' +
                ", giaTien='" + giaTien + '\'' +
                ", soLuong=" + soLuong +
                ", size=" + size +
                '}';
    }

}
