package dev.younes.scheduling;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/demo")
@RequiredArgsConstructor
public class DemoController {

    @GetMapping("")
    public String hello(){
        return "Hello";
    }

}
