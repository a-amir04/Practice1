public class Task8 {
    public static void main(String[] args) {
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
    }
    //Этот метод принимает значения двух рёбер треугольника и  находит максимальное значение третьего ребра треугольника
    //Так как сумма двух сторон треугольника должна быть больше третьей стороны, мы можем сказать что максимальная длина третьей стороны это сумма двух сторон минус 1
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }
}
