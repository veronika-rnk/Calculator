import java.util.Scanner;

class AdvancedCalc extends SimpleCalc {
    public AdvancedCalc() {
        super (Num_1, Num_2, Add, Div, Mul, Sub);
    }

    Scanner input = new Scanner(System.in);

    public double getCapacity(double cap){
        System.out.println("¬ведите радиус цилиндра: ");
        int R = input.nextInt();
        System.out.println("¬ведите высоту цилиндра: ");
        int h = input.nextInt();
        return Math.PI * Math.pow(R, 2) * h;
    }

    public double getSquare (double sqr){
        System.out.println("¬ведите сторону A: ");
        int a = input.nextInt();
        System.out.println("¬ведите сторону B: ");
        int b = input.nextInt();
        System.out.println("¬ведите сторону C: ");
        int c = input.nextInt();
        System.out.println("¬ведите радиус цилиндра: ");
        int R = input.nextInt();
        return ((a*b*c) / 4) * R ;
    }
}