package fizzBuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
public class FizzBuzzServiceTests {

    @Test
    public void given3_thenFizz(){
        FizzBuzzServiceImpl fizzBuzz = new FizzBuzzServiceImpl();
        String response = fizzBuzz.compute(3);
        assertEquals("Fizz",response);
    }

    @Test
    public void given5_thenBuzz(){
        FizzBuzzServiceImpl fizzBuzz = new FizzBuzzServiceImpl();
        String response = fizzBuzz.compute(5);
        assertEquals("Buzz",response);
    }
    @Test
    public void given15_thenBuzz(){
        FizzBuzzServiceImpl fizzBuzz = new FizzBuzzServiceImpl();
        String response = fizzBuzz.compute(15);
        assertEquals("FizzBuzz",response);
    }

    @Test
    public void given1Not3Or5AndBetween0and100_whenProcess_thenInput(){
        FizzBuzzServiceImpl fizzBuzz = new FizzBuzzServiceImpl();
        String response = fizzBuzz.compute(11);
        assertEquals("11",response);
    }
    @Test(expected = OutOfFizzBuzzRangeException.class)
    public void givenLessThan0_whenProcess_thenNotFound() throws Exception {
        FizzBuzzServiceImpl fizzBuzz = new FizzBuzzServiceImpl();
        String response = fizzBuzz.compute(-11);
    }

    @Test(expected = OutOfFizzBuzzRangeException.class)
    public void givenGreaterThan100_whenProcess_thenNotFound() throws Exception {
        FizzBuzzServiceImpl fizzBuzz = new FizzBuzzServiceImpl();
        String response = fizzBuzz.compute(110);
    }

}
