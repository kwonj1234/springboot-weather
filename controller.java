import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping('/api')

public class Controller {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}