import java.util.Scanner;

class AdvancedCalc extends SimpleCalc {
    public AdvancedCalc() {
        super (Num_1, Num_2, Add, Div, Mul, Sub);
    }
    
    Scanner sc  = new Scanner(System.in);

    public double getTemp(double tem){
    	double t = 0;
    	System.out.println("�������� ��������: 1:�-�; 2:�-�");
        int opt = sc.nextInt();
        if (opt != 0) {
            System.out.println("������� �����:");
            t = sc.nextDouble();
        }
        switch(opt){
        case 1:
            System.out.println("��������� --- �������:" + ((t*1.8) + 32));
            break;
        case 2:
            System.out.println("������� --- �������:" + ((t-32)* 1.8));
            break;
        }
        return 0;
    }

    public double getPeretv (double pt){
    	double a = 0;
        double a1 = 1000;
        double a2 = 1000000;
        System.out.println("�������� ��������: 1:�-��; 2:��-�; 3:�-��; 4:��-�; 5:��-��; 6:��-��;");
        int opt = sc.nextInt();
        if (opt != 0) {
            System.out.println("������� 1 �����:");
            a = sc.nextDouble();
        }

        switch (opt) {
            case 1:
                System.out.println("����� --- ���������:" + a/a1);
                break;
            case 2:
                System.out.println("��������� --- �����:" + a*a1);
                break;
            case 3:
                System.out.println("����� --- ���������:" + a*a1);
                break;
            case 4:
                System.out.println("��������� --- �����:" + a/a1);
                break;
            case 5:
                System.out.println("��������� --- ���������:" + a*a2);
                break;
            case 6:
                System.out.println("��������� --- ���������:" + a/a2);
                break;

        }
        return 0;
    }
}