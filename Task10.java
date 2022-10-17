public class Task10 {
    public static void main(String[] args) {
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }
    //Этот метод будет для данного a, b, c выполнять следующие действия:
    //– Добавьте A к себе B раз.
    //– Проверьте, делится ли результат на C
    public static boolean abcmath(int a, int b, int c) {
        int total = a;
        for (int i = 0; i < b; i++){
            total += a;
            a = total;
        }
        return total % c == 0;
    }
}
