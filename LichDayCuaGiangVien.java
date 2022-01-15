package ITSOL.DaHinh_TruuTuong;

import java.util.Arrays;

public class LichDayCuaGiangVien {
    public GiangVien gv;
    public MonHoc[] monHocs;
    public int[] solops;

    public LichDayCuaGiangVien() {
    }

    public LichDayCuaGiangVien(GiangVien gv, MonHoc[] monHocs, int[] solops) {
        this.gv = gv;
        this.monHocs = monHocs;
        this.solops = solops;
    }

    @Override
    public String toString() {
        return "LichDayCuaGiangVien{" +
                "gv=" + gv +
                ", monHocs=" + Arrays.toString(monHocs) +
                ", solops=" + Arrays.toString(solops) +
                '}';
    }

    public GiangVien getGv() {
        return gv;
    }

    public void setGv(GiangVien gv) {
        this.gv = gv;
    }

    public MonHoc[] getMonHocs() {
        return monHocs;
    }

    public void setMonHocs(MonHoc[] monHocs) {
        this.monHocs = monHocs;
    }

    public int[] getSolops() {
        return solops;
    }

    public void setSolops(int[] solops) {
        this.solops = solops;
    }
}
