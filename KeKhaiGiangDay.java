package ITSOL.DaHinh_TruuTuong;

import java.util.Scanner;

public class KeKhaiGiangDay {
    static Scanner scanner = new Scanner(System.in);
    private static GiangVien[] GIANGVIENS;
    private static MonHoc[] MONHOCS;
    private static LichDayCuaGiangVien[] lichDays;
    private static int soLop = 3;
    private static int tongSoTietDay = 200;


    public void nhapKeHoachGiangDay(GiangVien[] giangVien, MonHoc[] monHoc)
    {
        int slGiangVien = giangVien.length;
        lichDays = new LichDayCuaGiangVien[slGiangVien];
        int sum = 0;
        for(int i = 0; i < slGiangVien; i++){
            boolean check = false;
            GiangVien gv = giangVien[i];
            System.out.print("Nhập số lượng môn giảng dạy của giảng viên "+gv.getIdGV());
            int slMonHoc;
            do {
                slMonHoc = scanner.nextInt();
                if( slMonHoc > monHoc.length){
                    System.out.print("Nhập lại số lượng môn giảng dạy: ");
                    check = true;
                }
                else
                    check = false;
            }while (check);
            MONHOCS = new MonHoc[slMonHoc];
            int[] soLops = new int [slMonHoc];
            boolean check1 = true;
            do{
                sum = 0;
                for(int j = 0; j < slMonHoc; j++){
                    System.out.print("Nhập ID môn học: ");
                    int id;
                    MonHoc mh;
                    do {
                        id = scanner.nextInt();
                        mh = checkIdMonHoc(monHoc,id);
                        if(mh == null){
                            System.out.print("Nhập lại ID: ");
                            check1 = true;
                        }
                        else
                            check1=false;
                    }while (check1);

                    int c;
                    System.out.print("Nhập số lớp dạy: ");
                    c = scanner.nextInt();
                    sum = sum + c * mh.getTongSoTiet();
                    if(sum > 200){
                        System.out.println("GV đã dạy quá số tiết quy định! ");
                        check = true;
                    }
                    else check = false;
                    soLops[j] = c;
                    MONHOCS[j] = mh;
                }
            }while (check);

            LichDayCuaGiangVien kh = new LichDayCuaGiangVien(gv, MONHOCS, soLops);
            lichDays[i] = kh;
        }
        for(int i = 0; i < slGiangVien; i++)
        {
            System.out.println(lichDays[i]);
        }
    }
    public void showLich(GiangVien[] giangViens)
    {
        for(int i = 0; i < giangViens.length; i++) {
            System.out.println(lichDays[i]);
        }
    }

    public void sxTenGiangVien() {
        LichDayCuaGiangVien tam = new LichDayCuaGiangVien();
        for (int i = 0; i < lichDays.length - 1; i++) {
            for (int j = i + 1; j < lichDays.length; j++) {
                if (lichDays[i].getGv().getName().compareTo(lichDays[j].getGv().getName()) > 0) {
                    tam = lichDays[i];
                    lichDays[i] = lichDays[j];
                    lichDays[j] = tam;
                }
            }
        }
    }
    public void tinhLuong(){
        for(int i = 0; i < lichDays.length; i++){
            System.out.println(lichDays[i].gv);
            MONHOCS= lichDays[i].getMonHocs();
            int[] solops = lichDays[i].getSolops();
            double total = 0.0;
            for(int j = 0; j < lichDays[i].getMonHocs().length; j++ ){
                total = total + (MONHOCS[j].getTongSoTiet() - MONHOCS[j].getTietLyThuyet()) * MONHOCS[j].getMucKinhPhi() * 0.7 + MONHOCS[j].getTietLyThuyet() * MONHOCS[j].getMucKinhPhi() * solops[j];
            }
            System.out.println("Lương: " + total + " đồng.");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public MonHoc checkIdMonHoc(MonHoc[] monHoc, int id)
    {
        for (int i = 0; i < monHoc.length; i++) {
            if (monHoc[i].getId() == id)
                return monHoc[i];
        }
        return null;
    }

    public static GiangVien[] getGIANGVIENS() {
        return GIANGVIENS;
    }

    public static void setGIANGVIENS(GiangVien[] GIANGVIENS) {
        KeKhaiGiangDay.GIANGVIENS = GIANGVIENS;
    }

    public static MonHoc[] getMONHOCS() {
        return MONHOCS;
    }

    public static void setMONHOCS(MonHoc[] MONHOCS) {
        KeKhaiGiangDay.MONHOCS = MONHOCS;
    }

    public static LichDayCuaGiangVien[] getLichDays() {
        return lichDays;
    }

    public static void setLichDays(LichDayCuaGiangVien[] lichDays) {
        KeKhaiGiangDay.lichDays = lichDays;
    }

    public static int getSoLop() {
        return soLop;
    }

    public static void setSoLop(int soLop) {
        KeKhaiGiangDay.soLop = soLop;
    }

    public static int getTongSoTietDay() {
        return tongSoTietDay;
    }

    public static void setTongSoTietDay(int tongSoTietDay) {
        KeKhaiGiangDay.tongSoTietDay = tongSoTietDay;
    }
}
