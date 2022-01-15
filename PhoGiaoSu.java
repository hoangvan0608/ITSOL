package ITSOL.DaHinh_TruuTuong;

public class PhoGiaoSu extends GiangVien{
    protected String level = "Phó giáo sư - Tiến Sĩ";
    protected int id = super.getIdGV();

    @Override
    public String toString() {

        return "id='" + id + '\'' +
                ", level=" + level +
                " "+super.toString();
    }
}
