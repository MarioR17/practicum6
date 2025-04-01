package edu.iu.p466.arithmetic_service.controller;

import edu.iu.p466.arithmetic_service.service.IAddService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/add")
public class AddController {
    IAddService addService;

    public AddController(IAddService addService) {
        this.addService = addService;
    }

    @GetMapping("/{n}/{m}")
    public long addNumbers(@PathVariable long n, @PathVariable long m) {
        return addService.addNumbers(n, m);
    }
}
