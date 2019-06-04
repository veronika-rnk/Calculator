import java.util.Scanner;

class AdvancedCalc extends SimpleCalc {
    public AdvancedCalc() {
        super (Num_1, Num_2, Add, Div, Mul, Sub);
    }
    
    Scanner sc  = new Scanner(System.in);

    public double getTemp(double tem){
    	double t = 0;
    	System.out.println("Выберите действие: 1:ф-ц; 2:ц-ф");
        int opt = sc.nextInt();
        if (opt != 0) {
            System.out.println("Введите число:");
            t = sc.nextDouble();
        }
        switch(opt){
        case 1:
            System.out.println("Фаренгейт --- Цельсий:" + ((t*1.8) + 32));
            break;
        case 2:
            System.out.println("Кельвин --- Цельсий:" + ((t-32)* 1.8));
            break;
        }
        return 0;
    }

    public double getPeretv (double pt){
    	double a = 0;
        double a1 = 1000;
        double a2 = 1000000;
        System.out.println("Выберите операцию: 1:г-кг; 2:кг-г; 3:г-мг; 4:мг-г; 5:кг-мг; 6:мг-кг;");
        int opt = sc.nextInt();
        if (opt != 0) {
            System.out.println("Введите 1 число:");
            a = sc.nextDouble();
        }

        switch (opt) {
            case 1:
                System.out.println("Грамм --- Килограмм:" + a/a1);
                break;
            case 2:
                System.out.println("Килограмм --- Грамм:" + a*a1);
                break;
            case 3:
                System.out.println("Грамм --- Милиграмм:" + a*a1);
                break;
            case 4:
                System.out.println("Милиграмм --- Грамм:" + a/a1);
                break;
            case 5:
                System.out.println("Килограмм --- Милиграмм:" + a*a2);
                break;
            case 6:
                System.out.println("Милиграмм --- Килограмм:" + a/a2);
                break;

        }
        return 0;
    }
}