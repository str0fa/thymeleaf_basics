package ru.bikmeev.thymeleaf_basics.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.bikmeev.thymeleaf_basics.repository.CustomerRepository;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping("/main")
    public String startPage(Model model) {
        model.addAttribute("customers", customerRepository.getAll());
        return "Main";
    }

}
