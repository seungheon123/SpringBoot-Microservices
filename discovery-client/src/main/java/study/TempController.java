package study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
    @GetMapping("/discovery-service/welcome")
    public String welcome(){
        return "welcome";
    }
}
