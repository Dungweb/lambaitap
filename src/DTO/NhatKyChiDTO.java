package DTO;

public class NhatKyChiDTO {
    private String ID;
    private String Ngay;
    private double MucChi;
    private double SoTien;
    private String GhiChu;

    public NhatKyChiDTO() {
    }

    public NhatKyChiDTO(String ID, String Ngay, double MucChi, double SoTien, String GhiChu) {
        this.ID = ID;
        this.Ngay = Ngay;
        this.MucChi = MucChi;
        this.SoTien = SoTien;
        this.GhiChu = GhiChu;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String ngay) {
        Ngay = ngay;
    }

    public double getMucChi() {
        return MucChi;
    }

    public void setMucChi(double mucChi) {
        MucChi = mucChi;
    }

    public double getSoTien() {
        return SoTien;
    }

    public void setSoTien(double soTien) {
        SoTien = soTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    @Override
    public String toString() {
        return ID + " | " +
            Ngay + " | " +
            MucChi + " | " +
            SoTien + " | " +
            GhiChu;
    }
}
