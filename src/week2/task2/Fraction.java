package week2.task2;

public class Fraction {
    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sum = new Fraction(1,1);
        sum.numerator=(this.numerator*other.denominator)+(other.numerator*this.denominator);
        sum.denominator=(this.denominator*other.denominator);
        System.out.println(sum.numerator + "/" + sum.denominator);
        return sum;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction sub = new Fraction(1,1);
        sub.numerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);       
        sub.denominator = (this.denominator * other.denominator);
        System.out.println(sub.numerator + "/" + sub.denominator);
        return sub;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multiply = new Fraction(1,1);
        multiply.numerator = this.numerator * other.numerator;       
        multiply.denominator = this.denominator * other.denominator;
        System.out.println(multiply.numerator + "/" + multiply.denominator);
        return multiply;
        

    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction divide = new Fraction(1,1);
        divide.numerator = this.numerator * other.denominator;       
        divide.denominator = this.denominator * other.numerator;
        System.out.println(divide.numerator + "/" + divide.denominator);
        return divide;

    }
    public boolean equals(Object obj)
    {
        Fraction a = (Fraction) obj;
        if (this.numerator*a.denominator == a.numerator*this.denominator){
            return true;
        }
        return false;
    }
}
