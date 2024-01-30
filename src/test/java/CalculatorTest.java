import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void run() {
        assertEquals(3+3,6);


    }

    @ParameterizedTest
    @CsvSource(value = {"5+1-22+4*2:-8.0", "8-2.5:5.5", "5+1:demo"}, delimiter = ':')
    void calculate(String input, String expected){
        assertEquals(Calculator.Run(input), expected);

    }

    @Test
    void calculate(){
        assertEquals(3+8*2,19);

    }
}

