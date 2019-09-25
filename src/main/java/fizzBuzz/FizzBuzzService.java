package fizzBuzz;

import org.springframework.stereotype.Service;

@Service
public interface FizzBuzzService {
    public String compute(long number);
}
