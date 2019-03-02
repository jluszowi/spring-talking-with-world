package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
@RequestMapping("/headers")
public class HeaderController {

    public class MyException extends RuntimeException {
    }

    public class MyException1 extends RuntimeException {
    }

    public class MyException2 extends RuntimeException {
    }


    MyException runtimeException = new MyException();
    MyException1 runtimeException1 = new MyException1();
    MyException2 runtimeException2 = new MyException2();


   /* @GetMapping
    public String test () {

        int rand = new Random().nextInt(3);
        switch (rand) {
            case 0:
                throw new MyException();
            case 1:
                throw new MyException1();
            case 2:
                throw new MyException2();
        }
    }
*/


    @ExceptionHandler(RuntimeException.class)
    public String exception() {
        return "kot";
    }

    @ExceptionHandler(RuntimeException.class)
    public String exception1() {
        return "kot1";
    }

    @ExceptionHandler(RuntimeException.class)
    public String exception2() {
        return "kot2";
    }

}
