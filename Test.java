package ITSOL.DaHinh_TruuTuong;

public class Test {
    public static void main(String[] args) {
        GiangVien[] giangViens = new GiangVien[10];
        giangViens[0] = new GiaoSu();
        System.out.println(giangViens[0].getName() == null);
    }
}
