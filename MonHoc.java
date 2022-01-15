package ITSOL.DaHinh_TruuTuong;

import java.util.Scanner;

public class MonHoc implements TinhTienLuong {
    static Scanner scanner = new Scanner(System.in);
    private static int tempID = 100;
    protected int id;
    protected String tenMon;
    protected int tongSoTiet, tietLyThuyet;
    protected double mucKinhPhi;

    public double getMucKinhPhi() {
        return mucKinhPhi;
    }

    public void setMucKinhPhi(double mucKinhPhi) {
        this.mucKinhPhi = mucKinhPhi;
    }

    public MonHoc()
    {
        id = tempID++;
    }

    public void nhapMonHoc()
    {
        System.out.print("Tên môn học: ");
        tenMon = scanner.nextLine();
        System.out.print("Tổng số tiết: ");
        tongSoTiet = Integer.parseInt(scanner.nextLine());
        do {
            System.out.print("Nhập số tiết lý thuyết: ");
            tietLyThuyet = Integer.parseInt(scanner.nextLine());
        }while (tietLyThuyet > tongSoTiet);
        mucKinhPhi = thanhToan(this);
        id ++;
    }

    @Override
    public String toString() {
        return "MonHoc{ id=" +id+
                ", tenMon='" + tenMon + '\'' +
                ", tongSoTiet=" + tongSoTiet +
                ", tietLyThuyet=" + tietLyThuyet +", mucKinhPhi="+mucKinhPhi+
                '}';
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public int getTietLyThuyet() {
        return tietLyThuyet;
    }

    public void setTietLyThuyet(int tietLyThuyet) {
        this.tietLyThuyet = tietLyThuyet;
    }

    @Override
    public double thanhToan(MonHoc monHoc) {
        int sum = monHoc.getTongSoTiet();
        int lyThuyet = monHoc.getTietLyThuyet();
        int thucHanh = sum - lyThuyet;
        System.out.print("Nhập số tiền cần thanh toán cho 1 tiết lý thuyết: ");
        int salaryPerOne = Integer.parseInt(scanner.nextLine());
        double salary = 1.0*(lyThuyet * salaryPerOne + thucHanh*salaryPerOne*0.7);
        return salary;
    }

    @Override
    public double tienLuongGiaoVien(MonHoc[] monHocs) {
        return 0;
    }
}
