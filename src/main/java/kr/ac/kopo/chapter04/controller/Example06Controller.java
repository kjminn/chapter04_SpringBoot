package kr.ac.kopo.chapter04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example06Controller {
    @GetMapping("/exam06")
    public String requestMethod(Model model) {
        model.addAttribute("data1", "Model 예제");
        model.addAttribute("data2", "웹 요청 URL은 /exam06 입니다.");
        return "viewPage2";
    }
}
