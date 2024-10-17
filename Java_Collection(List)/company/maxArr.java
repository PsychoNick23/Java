package company;

public class maxArr {
    public static <T extends Comparable<T>>T maximum (T[] array){
        T max = array[0]; // Assume the first element is the largest
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element; // Update max if current element is larger
            }
        }
        return max; // Returns the largest object
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        String[] fruits={"apple","pear","orange"};
        Float[] floats={6.6f,7.7f,8.8f,9.9f};
        Double[] doubles={4.5,6.5,7.6,3.4};
        System.out.println("Maximum from the array is "+maximum(numbers));
    }
}
