public class Task7 {
    public static void main(String[] args) {
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
    }
    //Этот метод принимает число и возвращает сумму всех чисел до него и включая его
    public static int addUpTo(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++){
            total = total + i;
        }
        return total;
    }
}
