public class Main {
    public static void main(String[] args) {
 First first = new First(1.0,2.0,3.0);
Second second = new Second(3.0,4.0,5.0);
Third third = new Third(6.0,7.0,8.0);
double Calculate = first.Calculate();
        System.out.println("середнє значення: " + first.Calculate());
        double Calculate2 = second.Calculate();
        System.out.println("середнє значення: " + second.Calculate());
        double Calculate3 = third.Calculate();
        System.out.println("середнє значення: " + third.Calculate());
    }
}