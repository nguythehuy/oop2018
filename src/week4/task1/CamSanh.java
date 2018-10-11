package week4.task1;

public class CamSanh extends Cam {
    /**
    *
    * class CamSanh kế thừa từ class Cam
    *
     */

    public int soLuong,canNang;
    public void setCanNang(){
        this.canNang=canNang;
    }
    /**
    *
    *Getter,Setter cho cân nặng và số lượng
    *
    */
    public int getCanNang(){
        return canNang;
    }
    public void setSoLuong(){
        this.soLuong=soLuong;
    }
    public int getSoLuong(){

        return soLuong;
    }
    public void hethang(){
        System.out.println("Cam sành đã hết hàng ");
    }
}
