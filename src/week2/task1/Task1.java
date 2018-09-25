package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a==b){
            return a;
            }
        else if(a>b){
            return gcd(a-b,b);
        }
        else{ 
            retun gcd(a;b-a);
            }
        return 0;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0){
            return 0;
            }
        else if (n==1){
            return 1;
            }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
            }
        return 0;
    }
}
