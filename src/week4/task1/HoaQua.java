package week4.task1;

public class HoaQua {
    private String ngayNhap;
    public int soLuong;

    public void setNgayNhap(String a){
        this.ngayNhap=a;
    }
    public String getNgayNhap(){
        return ngayNhap;
    }
    public void setSoLuong(int b){
        this.soLuong=b;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void gioiThieu(){
        System.out.println("Mua hoa quả vào "+ngayNhap+"với số lượng"+soLuong);


    }

}
