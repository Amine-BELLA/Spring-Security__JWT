package SpringSecurity.JWT.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/")
    public String welcome() {
        return "Controller to test JWT Authentication";
    }
}
