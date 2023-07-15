import java.util.Scanner;

public class ClosestMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int output = findClosestMinMax(array);
        System.out.println("Output : " + output);
    }

    private static int findClosestMinMax(int[] array) {
        int size = array.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for( int i = 0; i < size; i++){
            if(array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        int minIndex = -1;
        int maxIndex = -1;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++){
            if(array[i] == min){
                minIndex = i;
                if(maxIndex >= 0){
                    result = Math.min(result, i - maxIndex + 1);
                }
            }
            if(array[i] == max){
                maxIndex = i;
                if(minIndex >= 0){
                    result = Math.min(result, i - minIndex + 1);
                }
            }
        }
        return result;
    }
}
