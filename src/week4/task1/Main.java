package week4.task1;

public class Main {
    public static void main(String [] args){
        Cam cam= new Cam();
        cam.setXuatXu("Lạng Sơn");
        cam.setTaste("rất ngọt");
        System.out.println("Cam mua từ "+cam.getXuatXu()+" có mùi vị "+cam.getTaste());
        Tao tao =new Tao();
        tao.setSoLuong(50);
        tao.setThiTruong("Chợ Định Công");
        System.out.println("Khu vực "+tao.getThiTruong() + " tiêu thụ được  "+tao.getSoLuong() +" quả ");
        camCaoPhong cam1=new camCaoPhong(520,2);
        System.out.println(" Cam Cao Phong có mã số "+cam1.getId()+" thuộc nhóm hàng số "+cam1.getGroup());
    }
}
