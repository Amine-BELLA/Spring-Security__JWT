package SpringSecurity.JWT.Controller;


import SpringSecurity.JWT.Service.AuthService;
import SpringSecurity.JWT.dto.AuthRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "/auth/login")
    public String signIn(@RequestBody AuthRequest authRequest) {
        System.out.println("*******88");
        System.out.println(authRequest);
        System.out.println("*******88");
        return authService.login(authRequest);
    }
}
