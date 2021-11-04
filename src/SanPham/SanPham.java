package SanPham;

public abstract class SanPham {
    protected String maSp;
    protected String loaiSp;

    protected String tenSp;
    protected String mota;
    protected int giaTien;
    protected int soLuong;

    public SanPham(String maSp, String loaiSp, String tenSp, String mota, int giaTien, int soLuong, int size) {
        this.maSp = maSp;
        this.loaiSp = loaiSp;
        this.tenSp = tenSp;
        this.mota = mota;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.size = size;
    }

    protected int size;

    public String getLoaiSp() {
        return loaiSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public String getMaSp() {
        return maSp;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

}
