package SanPham;

public class Quan extends SanPham{
    private int rongTui;
    private boolean quanDai;

    public Quan(String maSp, String loaiSp, String tenSp, String mota, int giaTien, int soLuong, int size, int rongTui, boolean quanDai) {
        super(maSp, loaiSp, tenSp, mota, giaTien, soLuong, size);
        this.rongTui = rongTui;
        this.quanDai = quanDai;
    }

    @Override
    public String toString() {
        return "Quan{" +
                "rongTui=" + rongTui +
                ", quanDai=" + quanDai +
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
