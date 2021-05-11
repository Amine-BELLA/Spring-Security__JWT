package SpringSecurity.JWT.Service;

import SpringSecurity.JWT.dto.AuthRequest;
import SpringSecurity.JWT.utils.JwtUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class AuthService {
    private final JwtUtils jwt;
    private final AuthenticationManager authenticationManager;

    public String login(AuthRequest authRequest) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(),authRequest.getPassword())
            );
        }
        catch (Exception ex) {
            return "Invalid Credentials";
        }
        return jwt.generateToken(authRequest.getUsername());
    }
}
