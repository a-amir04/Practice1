public class Task5 {
    public static void main(String[] args) {
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
    }
    //Этот метод принимает 3 числа и возвращает, что нужно сделать с a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы
    //получить N. Если ни одна из операций не может дать N, верните "none".
    public static String operation(int n, int a, int b){
        if (a + b == n){
            return "added";
        }
        if (a - b == n | b - a == n){
            return "subtracted";
        }
        if (a * b == n){
            return "multiplied";
        }
        if (a / b == n | b / a == n){
            return "divided";
        }
        return "none";
    }
}
