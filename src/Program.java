import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        AdvancedCalc simcalc = new AdvancedCalc();
        Scanner sc = new Scanner(System.in);
        String vibor1 = "+";
        while (vibor1.equals("+")) {
            System.out.println("�������� �����������. 1 - �������, 2 - ����������");
            int vibor = sc.nextInt();
            if (vibor == 1 || vibor == 2) {
                if(vibor == 2) {
                    System.out.println("������� 0 ��� �������������� �����������");
                    System.out.println("������� 5 ��� �������������� ����");
                }
                System.out.println("������� 1 ��� ����������");
                System.out.println("������� 2 ��� �������");
                System.out.println("������� 3 ��� ���������");
                System.out.println("������� 4 ��� ���������");
                int opt = sc.nextInt();

                double Num_1 = 0;
                double Num_2 = 0;


                if (opt != 0 & opt != 5) {
                    System.out.println("������� ������ �����:");
                    Num_1 = sc.nextDouble();

                    System.out.println("������� ������ �����:");
                    Num_2 = sc.nextDouble();
                }

                switch (opt) {
                    case 0:
                        simcalc.getTemp(Num_1);
                        break;

                    case 1:
                        System.out.println("���������:" + simcalc.getAdd(Num_1,Num_2));
                        break;

                    case 2:
                        System.out.println("���������:" + simcalc.getDiv(Num_1, Num_2));
                        break;

                    case 3:
                        System.out.println("���������:" + simcalc.getMul(Num_1,Num_2));
                        break;

                    case 4:
                        System.out.println("���������:" + simcalc.getSub(Num_1,Num_2));
                        break;

                    case 5:
                        simcalc.getPeretv(Num_1);
                        break;
                }
                System.out.println("������� ����������? + ���� ��, - ���� ���");
                vibor1 = sc.next();
            }
        }
    }
}