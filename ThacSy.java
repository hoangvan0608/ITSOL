package ITSOL.DaHinh_TruuTuong;

public class ThacSy extends GiangVien{
    protected String level = "Thạc sỹ";
    protected int id = super.getIdGV();

    @Override
    public String toString() {

        return "id='" + id + '\'' +
                ", level=" + level +
                " "+super.toString();
    }
}
