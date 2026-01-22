package harsh.maurya.moment.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
   
    

    public ResponseEntity<String>  createMoment(RequestEntity<Object> payload) {
      
    
       return new ResponseEntity<>("this is the request", HttpStatus.OK);
    }
}
