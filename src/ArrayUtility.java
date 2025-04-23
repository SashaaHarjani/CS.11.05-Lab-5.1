public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
    }

    public static int sum (int[] array) {
            int total = 0;
            for (int i = 0; i < array.length; i++) {
                total += array[i];
            }
            return total;
        }

    public static double average(int[] array) {
            double total = 0;
            for (int i=0; i < array.length; i++){
                total += array[i];
            }
          double average = total/array.length;
          int averageTimesHundred = (int) (average * 100);
          return averageTimesHundred/100;
        }


    public static int minimum(int[] array) {
            int currentMin = array[0];
            for(int i = 0; i < array.length; i++){
                if (currentMin > array[i]) currentMin = array[i];
            }
            return currentMin;
    }

    public static int maximum(int[] array) {
            int currentMax = array[0];
            for(int i =0; i < array.length; i++){
                if(currentMax < array[i]) currentMax = array[i];
            }
            return currentMax;
        }

    public static int evenCount(int[] array) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) count++;
            }
            return count;
    }

    public static int[] reverseOne(int[] array) {
            int[] reversedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }
            return reversedArray;
        }

    public static void reverseTwo(int[] array){
            for (int i = 0; i < array.length / 2 - 1; i++) {
                array[i] = array[array.length - 1 - i];
                int temp = array.length - 1 - i;
                array[temp] = array[i];
            }
        }
    }

    public static boolean linearSearchInt(int[] array, int num){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) return true;
                }
                return false;
                }

    public static boolean linearSearchString(String[] array, String str){
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null && array[i].equals(str)) return true;
                }
                    return false;
                }

    public static void multiplyByTwo(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] *= 2;
            }
    }

    public static void multiplyByN(int[] array, int n) {
            for (int i = 0; i < array.length; i++) {
                array[i] *= n;
            }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
            if (i < array.length - 1) {
                result += ",";
            }
            return result;
        }
    }

    public static boolean twoSum(int[] array, int num){
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == num) return true;
                    }
                return false;
                    }
                }

    public static void shiftRight(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int firstElement = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public static void shiftLeft(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
    }

    public static void shiftRight(int[] array) {
      array[0] = array[array.length-1];
      for (int i = 1; i < array.length; i++){
        array[i] = array[i-1];
    }
}

    public static void shiftLeft(int[] array) {
      array[array.length-1] = array [0];
      for (int i = 0; i < array.length-1; i++){
        array[i] = array[i+1];
    }
}

    public static void shiftRightNTimes(int[] array, int n) {
      for (int i = 0; i < n; i++){
        shiftRight(array);
    }
}

    public static void shiftLeftNTimes(int[] array, int n) {
      for (int i = 0; i < n; i++){
        shiftLeft(array);
    }
}