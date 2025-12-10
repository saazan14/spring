package np.com.sajansubba.spring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class APIController {
    @GetMapping("/hello")
    public ResponseEntity<Map<String, Object>> index(){
        Map<String, Object> response  = new HashMap<>();
        response.put("message", "Hello! Spring Boot");
        response.put("status", "success");
        response.put("timestamp", System.currentTimeMillis());

        return ResponseEntity.ok(response);
    }
}
