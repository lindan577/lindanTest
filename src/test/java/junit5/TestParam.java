package junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;//必须是static

/**
 * @author lindan
 * @date 2020-11-03 23:49
 */
public class TestParam {


    @ParameterizedTest
    @ValueSource(ints = { 1,23,4 })
  void getInteger(int candidate) {
       assertTrue(candidate>2 && candidate<=23);
   }




    @ParameterizedTest
    @MethodSource("palindromes")
    void testWithDefaultLocalMethodSource(String argument) {
        assertNotNull(argument);
    }

    static Stream<String> palindromes() {
        return Stream.of("apple","banana");
    }
}
