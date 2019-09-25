package fizzBuzz;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {
    public String compute(long number) {
        if(number < 0 || number > 100){
            throw new OutOfFizzBuzzRangeException();
        }
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }else if(number % 3 == 0){
            return "Fizz";
        }else if(number % 5 == 0){
            return "Buzz";
        }
        return String.format("%s",number);

    }
}
