package SpringSecurity.JWT.Controller;


import SpringSecurity.JWT.Service.AuthService;
import SpringSecurity.JWT.dto.AuthRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/auth")
@CrossOrigin("*")
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "/login")
    public String signIn(@RequestBody AuthRequest authRequest) {
        return authService.login(authRequest);
    }
}
