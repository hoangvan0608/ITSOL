package ITSOL.DaHinh_TruuTuong;

public class GiaoSu extends GiangVien{
    protected String level = "Giáo sư - Tiến Sĩ";
    protected int id = super.getIdGV();

    @Override
    public String toString() {

        return "id='" + id + '\'' +
                ", level=" + level +
                " "+super.toString();
    }
}
