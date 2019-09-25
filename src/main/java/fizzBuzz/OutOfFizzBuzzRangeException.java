package fizzBuzz;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "The number you are seeking cannot be found.")
public class OutOfFizzBuzzRangeException extends RuntimeException{
}
