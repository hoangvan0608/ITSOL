package ITSOL.DaHinh_TruuTuong;

public class GiangVienChinh extends GiangVien{
    protected String level = "Giảng viên chính";
    protected int id = super.getIdGV();

    @Override
    public String toString() {

        return "id='" + id + '\'' +
                ", level=" + level +
                " "+super.toString();
    }
}
