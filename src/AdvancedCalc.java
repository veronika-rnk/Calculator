import java.util.Scanner;

class AdvancedCalc extends SimpleCalc {
    public AdvancedCalc() {
        super (Num_1, Num_2, Add, Div, Mul, Sub);
    }

    Scanner input = new Scanner(System.in);

    public double getCapacity(double cap){
        System.out.println("������� ������ ��������: ");
        int R = input.nextInt();
        System.out.println("������� ������ ��������: ");
        int h = input.nextInt();
        return Math.PI * Math.pow(R, 2) * h;
    }

    public double getSquare (double sqr){
        System.out.println("������� ������� A: ");
        int a = input.nextInt();
        System.out.println("������� ������� B: ");
        int b = input.nextInt();
        System.out.println("������� ������� C: ");
        int c = input.nextInt();
        System.out.println("������� ������ ��������: ");
        int R = input.nextInt();
        return ((a*b*c) / 4) * R ;
    }
}