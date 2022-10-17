public class Task4 {
    public static void main(String[] args) {
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
    }
    //Этот метод получает на вход три аргумента и возвращает true, если prob * prize > pay; в противном случае возвращает false.
    public static boolean profitableGamble(double prob, double prize, double pay){
        return prob * prize > pay;
    }
}
