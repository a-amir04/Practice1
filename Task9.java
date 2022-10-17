public class Task9 {
    public static void main(String[] args) {
        System.out.println(sumOfCubes(new int[] {1, 5, 9}));
        System.out.println(sumOfCubes(new int[] {3, 4, 5}));
        System.out.println(sumOfCubes(new int[] {2}));
        System.out.println(sumOfCubes(new int[] {}));
    }
    //Этот метод принимает массив чисел и возвращает сумму его кубов
    public static int sumOfCubes(int[] myArray) {
        int total = 0;
        for (int i = 0; i < myArray.length; i++){
            total = total + (myArray[i] * myArray[i] * myArray[i]);
        }
        return total;
    }
}
