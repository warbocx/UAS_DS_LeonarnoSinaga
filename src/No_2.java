public class No_2 {
    public static int linearSearchOddIterative(String[] array, String x) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0 && array[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchEvenRecursive(String[] array, String x, int index) {
        if (index >= array.length) {
            return -1;
        }
        if (index % 2 == 0 && array[index].equals(x)) {
            return index;
        }
        return linearSearchEvenRecursive(array, x, index + 1);
    }
    public static int linearSearchEven(String[] array, String x) {
        return linearSearchEvenRecursive(array, x, 0);
    }
    public static int binarySearch(String[] array, String x) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid].equals(x)) {
                return mid;
            } else if (array[mid].compareTo(x) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        String x = "cherry";
        int index = linearSearchOddIterative(array, x);
        if (index == -1) {
            System.out.println(x + " tidak ditemukan dalam array dengan urutan ganjil menggunakan linear search");
        } else {
            System.out.println(x + " ditemukan pada index " + index + " dengan urutan ganjil menggunakan linear search");
        }
        index = linearSearchEven(array, x);
        if (index == -1) {
            System.out.println(x + " tidak ditemukan dalam array dengan urutan genap menggunakan linear search");
        } else {
            System.out.println(x + " ditemukan pada index " + index + " dengan urutan genap menggunakan linear search");
        }
        index = binarySearch(array, x);
        if (index == -1) {
            System.out.println(x + " tidak ditemukan dalam array dengan menggunakan binary search");
        } else {
            System.out.println(x + " ditemukan pada index " + index + " dengan menggunakan binary search");
        }
    }
}
