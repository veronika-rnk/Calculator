public class SimpleCalc {
    protected static double Num_1;
    protected static double Num_2;
    static double Add;
    static double Div;
    static double Mul;
    static double Sub;
    public SimpleCalc(double Num_1, double Num_2, double Add, double Div, double Mul, double Sub){
        this.Num_1 = Num_1;
        this.Num_2 = Num_2;
        this.Add = Add;
        this.Div = Div;
        this.Mul = Mul;
        this.Sub = Sub;
    }
    public double getAdd(double Num_1, double Num_2){
        return (Num_1 + Num_2);
    }
    public double getDiv(double Num_1, double Num_2){
        return (Num_1 / Num_2);
    }
    public double getMul(double Num_1, double Num_2) {
        return (Num_1 * Num_2);
    }
    public double getSub(double Num_1, double Num_2) {
        return (Num_1 - Num_2);
    }
}

