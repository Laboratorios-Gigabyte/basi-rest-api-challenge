package mx.com.gigabyte.labs.basicrestapi.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class StudentController {

  @GetMapping("/hello")
  public ResponseEntity<ResponseApi> hello() {
    return new ResponseEntity<>(ResponseApi.builder()
      .response(LocalDateTime.now().toString())
      .build(), HttpStatus.OK);
  }

}
