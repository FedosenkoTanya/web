package springboot.controller;

import const24.Calc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class MyWebController {

    @GetMapping("/")
    public String index(Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        String result = new Calc().setDate(date);
        model.addAttribute("date", date);
        model.addAttribute("result", result);
        return "index";
    }

    @PostMapping("/")
    public String sayHello(
        @RequestParam("date") String date,
        Model model
    )
    {
        String result = new Calc().setDate(date);
        model.addAttribute("date", date);
        model.addAttribute("result", result);
        return "index";
    }
}
