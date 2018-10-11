package week4.task1;

public class CamCaoPhong extends Cam {
    /*
    *
    * Class CamCaoPhong kế thừa từ class Cam
    *
     */
    public int id,group;
    camCaoPhong(int id,int group){
        id=id;
        group=group;
    }
    /**
    *
    *Getter,Setter cho id và group;
    *
    */

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setGroup(int group){
        this.group=group;
    }
    public int getGroup(){
        return group;
    }
    /*
    *
    * Id là mã số của cam
    * Group là nhóm hàng
     */

}
