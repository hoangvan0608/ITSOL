package ITSOL.DaHinh_TruuTuong;

import ITSOL.KeThua_DongGoi.KHTNSach;

import java.util.Scanner;

public class Main {
    static MonHoc[] monHocs = new MonHoc[100];
    static GiangVien[] giangViens = new GiangVien[100];
    static KeKhaiGiangDay[] keKhaiGiangDays = new KeKhaiGiangDay[100];
    static  KeKhaiGiangDay k = new KeKhaiGiangDay();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        do {
            menu();
            System.out.print("Lựa chọn của bạn: ");
            n = scanner.nextInt();
            scanner.nextLine();
            if(n == 1)
            {
                int sl = -1;
                do {
                    System.out.print("Mời bạn nhập số lượng môn học: ");
                     sl= scanner.nextInt();
                     monHocs = new MonHoc[sl];
                    for (int i = 0; i < monHocs.length; i++) {
                        monHocs[i] = new MonHoc();
                        monHocs[i].nhapMonHoc();
                    }
                }while (sl<0);
            }
            else if(n == 2)
            {
                System.out.println("Danh sách môn học: ");
                for (int i=0; i< monHocs.length;i++)
                {
                    if(monHocs[i] !=null)
                        System.out.println(monHocs[i].toString());
                }
            }
            else if(n == 3)
            {
                int loaiGv = -1;
                int slGV = -10;
                do {
                    System.out.print("Mời bạn nhập số lượng giảng viên: ");
                    slGV= scanner.nextInt();
                    giangViens  = new GiangVien[slGV];
                    for (int i = 0; i < giangViens.length; i++) {
                        do{
                            System.out.println("Nhập giảng viên muốn thêm mới:");
                            System.out.println("1. Giáo sư - tiến sĩ");
                            System.out.println("2. Phó giáo sư - tiến sĩ");
                            System.out.println("3. Thạc sĩ");
                            System.out.println("4. Giảng viên chính");
                            System.out.print("Lựa chọn: ");
                            loaiGv = scanner.nextInt();
                            switch (loaiGv)
                            {
                                case 1:
                                    giangViens[i] = new GiaoSu();
                                    giangViens[i].nhap();
                                    break;
                                case 2:
                                    giangViens[i] = new PhoGiaoSu();
                                    giangViens[i].nhap();
                                    break;
                                case 3:
                                    giangViens[i] = new ThacSy();
                                    giangViens[i].nhap();
                                    break;
                                case 4:
                                    giangViens[i] = new GiangVienChinh();
                                    giangViens[i].nhap();
                                    break;
                                default:
                                    System.out.println("Chọn sai!");
                                    break;
                            }
                        }while (loaiGv<0);
                    }

                }while (slGV<0);
            }
            else if(n ==4)
            {
                System.out.println("Danh sách giảng viên: ");
                for (int i=0; i< giangViens.length;i++)
                {
                    if(giangViens[i] !=null)
                        System.out.println(giangViens[i].toString());
                }
            }
            else if(n == 5)
            {
                k.nhapKeHoachGiangDay(giangViens,monHocs);
            }
            else if( n== 6)
            {
                k.sxTenGiangVien();
                k.showLich(giangViens);
            }
        }while (n!=0);
    }
    public static void menu()
    {
        System.out.println("Mời bạn chọn một trong số các chức năng sau: ");
        System.out.println("1. Thêm môn học mới");
        System.out.println("2. Hiển thị danh sách môn học");
        System.out.println("3. Thêm giảng viên mới");
        System.out.println("4. Hiển thị danh sách giảng viên");
        System.out.println("5. Nhập và hiển thị bảng kê khai giảng dạy cho giảng viên");
        System.out.println("6. Sắp xếp danh sách kê khai giảng dạy");
        System.out.println("7. Thanh toán và lập bảng tính tiền cho mỗi giáo viên");
        System.out.println("0. Thoát");
    }
}
