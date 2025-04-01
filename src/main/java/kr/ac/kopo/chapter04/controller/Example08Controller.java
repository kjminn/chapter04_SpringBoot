package kr.ac.kopo.chapter04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Example08Controller {
    @GetMapping("/exam08")
    public ModelAndView modelAndViewExample() {
        ModelAndView modelAndView = new ModelAndView("viewPageModelAndView"); // 뷰 이름 설정

        modelAndView.addObject("message", "ModelAndView 예시!"); // 데이터 추가

        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        modelAndView.addObject("items", items);

        return modelAndView;
    }
}