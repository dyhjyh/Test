package day6;

/**
 *  二分查找法:
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] array = {5, 12, 34, 54, 62, 87, 94, 105};
        int searchNumber = 105;
        int index = binarySearch(array, searchNumber);
        System.out.println("index = " + index);
    }
    
    private static int binarySearch(int[] array, int searchNumber) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middleIndex = (start + end) / 2;
            if (searchNumber > array[middleIndex]) {
                start = middleIndex + 1;
            } else if (searchNumber < array[middleIndex]) {
                end = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}
