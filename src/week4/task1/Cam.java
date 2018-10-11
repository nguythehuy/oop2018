package week4.task1;

public class Cam extends HoaQua {
    /**
    *
    *Class Cam kế thừa từ class HoaQua
    *
    */
    private String xuatXu;
    public String taste;
    public int giaBan;
    /**
    *
    *Getter,Setter cho xuất xứ,vị,giá
    *
    */

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setGiaBan() {
        this.giaBan = giaBan;
    }

    public int getGiaBan() {
        return giaBan;
    }

}
