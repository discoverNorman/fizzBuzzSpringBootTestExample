package fizzBuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    @Autowired
    private FizzBuzzService fizzBuzzService;
    @RequestMapping(value = "/v1/fizzBuzz", method = RequestMethod.GET)
    public FizzBuzzResponse greeting(@RequestParam(value="number", defaultValue="") long number) throws OutOfFizzBuzzRangeException {
       return new FizzBuzzResponse(this.fizzBuzzService.compute(number));
    }
}
