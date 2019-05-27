import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        AdvancedCalc simcalc = new AdvancedCalc();
        Scanner sc = new Scanner(System.in);
        String vibor1 = "+";
        while (vibor1.equals("+")) {
            System.out.println("Выберите калькулятор. 1 - Обычный, 2 - Инженерный");
            int vibor = sc.nextInt();
            if (vibor == 1 || vibor == 2) {
                if(vibor == 2) {
                    System.out.println("Введите 0 для вычисления объема цилиндра");
                    System.out.println("Введите 5 для вычисления площади треугольника");
                }
                System.out.println("Введите 1 для добавления");
                System.out.println("Введите 2 для деления");
                System.out.println("Введите 3 для умножения");
                System.out.println("Введите 4 для вычитания");
                int opt = sc.nextInt();

                double Num_1 = 0;
                double Num_2 = 0;


                if (opt != 0 & opt != 5) {
                    System.out.println("Введите первое число:");
                    Num_1 = sc.nextDouble();

                    System.out.println("Введите второе число:");
                    Num_2 = sc.nextDouble();
                }

                switch (opt) {
                    case 0:
                        System.out.println("Результат:" + simcalc.getCapacity(Num_1));
                        break;

                    case 1:
                        System.out.println("Результат:" + simcalc.getAdd(Num_1,Num_2));
                        break;

                    case 2:
                        System.out.println("Результат:" + simcalc.getDiv(Num_1, Num_2));
                        break;

                    case 3:
                        System.out.println("Результат:" + simcalc.getMul(Num_1,Num_2));
                        break;

                    case 4:
                        System.out.println("Результат:" + simcalc.getSub(Num_1,Num_2));
                        break;

                    case 5:
                        System.out.println("Результат:" + simcalc.getSquare(Num_1));
                        break;
                }
                System.out.println("Желаете продолжить? + если да, - если нет");
                vibor1 = sc.next();
            }
        }
    }
}