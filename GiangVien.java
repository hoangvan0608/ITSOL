package ITSOL.DaHinh_TruuTuong;

import java.util.Scanner;

public class GiangVien implements TinhTienLuong{
    static Scanner scanner = new Scanner(System.in);
    private static int idTemp = 100;

    protected int idGV;
    protected String name, address, phoneNumber;

    public void nhap()
    {
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        phoneNumber = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public GiangVien() {
        idGV = idTemp++;
    }

    public int getIdGV() {
        return idGV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public double thanhToan(MonHoc monHoc) {
        return 0;
    }

    @Override
    public double tienLuongGiaoVien(MonHoc[] monHocs) {
        double tienLuong = 0;
        for (MonHoc m : monHocs) {
            if(m != null)
            {
                tienLuong+=m.getMucKinhPhi();
            }
        }
        return tienLuong;
    }
}
