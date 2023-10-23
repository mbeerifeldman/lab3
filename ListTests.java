import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
    ListChecker sc = new ListChecker();
	@Test 
	public void testFilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("s");
        input1.add("a");
        input1.add("thats that");
        List<String> input2 = new ArrayList<>();
        input2.add("s");
        input2.add("thats that");
        
        assertEquals(input2, ListExamples.filter(input1, sc));
	}

	@Test 
	public void testMerge() {
        List<String> input1 = new ArrayList<>();
        input1.add("b");
        input1.add("c");
        input1.add("d");
        List<String> input2 = new ArrayList<>();
        input2.add("a");
        input2.add("d");
        input2.add("e");
        input2.add("e");
        input2.add("e");


        List<String> input3 = new ArrayList<>();
        input3.add("a");
        input3.add("b");
        input3.add("c");
        input3.add("d");
        input3.add("d");
        input3.add("e");
        input3.add("e");
        input3.add("e");
        
        assertEquals(input3, ListExamples.merge(input1, input2));
	}
}

class ListChecker implements StringChecker{
   public boolean checkString(String s){
    return s.contains("s"); 
   }
}
