import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        Assert.assertEquals(Week4.max2Int(26, 3), 26);
    }

    @Test
    public void testMax2Int2() {
        Assert.assertEquals(Week4.max2Int(23, 0), 23);
    }

    @Test
    public void testMax2Int3() {
        Assert.assertEquals(Week4.max2Int(-26, -3), -3);
    }

    @Test
    public void testMax2Int4() {
        Assert.assertEquals(Week4.max2Int(-26, 3), 3);
    }

    @Test
    public void testMax2Int5() {
        Assert.assertEquals(Week4.max2Int(3321, -1323), 3321);
    }

    @Test
    public void testMinArray1() {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 7};
        Assert.assertEquals(Week4.minArray(arr), 1);
    }

    @Test
    public void testMinArray2() {
        int[] arr = {-4, 3, -4, 5, 2, -33, 240, 0};
        Assert.assertEquals(Week4.minArray(arr), -33);
    }

    @Test
    public void testMinArray3() {
        int[] arr = {-4, -33, -4, -3, -5, -7, -9, 0};
        Assert.assertEquals(Week4.minArray(arr), -33);
    }

    @Test
    public void testMinArray4() {
        int[] arr = {-4, 3, -4, 5, 2, -33, 240, 0, -131};
        Assert.assertEquals(Week4.minArray(arr), -33);
    }

    @Test
    public void testMinArray5() {
        int[] arr = {0};
        Assert.assertEquals(Week4.minArray(arr), -33);
    }

    @Test
    public void testCalculateBMI1() {
        Assert.assertEquals(Week4.calculateBMI(50, 1.8), "Thiếu cân");
    }

    @Test
    public void testCalculateBMI2() {
        Assert.assertEquals(Week4.calculateBMI(70, 1.8), "Bình thường");
    }

    @Test
    public void testCalculateBMI3() {
        Assert.assertEquals(Week4.calculateBMI(75, 1.8), "Bình thường");

    }

    @Test
    public void testCalculateBMI4() {
        Assert.assertEquals(Week4.calculateBMI(70, 1.7), "Thừa cân");
    }

    @Test
    public void testCalculateBMI5() {
        Assert.assertEquals(Week4.calculateBMI(100, 1.75), "Béo phì");

    }
}