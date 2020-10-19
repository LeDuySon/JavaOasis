
public class Week4 {
    /**
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int minA = 9999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minA) {
                minA = arr[i];
            }
        }
        return minA;
    }

    /**
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = (double) Math.round((weight / (height * height)) * 10) / 10;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}