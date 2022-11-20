package diospringsecurty;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class WelcomeController {
    @GetMapping()
    public String WelcomeController() {
        return "Welcome TO my Spring Boot web API";
    }

    @GetMapping("/users")
    public String users(){
        return "Autorized user";
    }

    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager";
    }
    
    
}
