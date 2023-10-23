import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlace2() {
    int[] input1 = new int[]{1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = new int[]{1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

    @Test
  public void testAverage() {
    double[] input1 = new double[]{1, 1, 3, 3};
    double ans = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(3, ans, 0.0001);
  }


}
