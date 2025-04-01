package kr.ac.kopo.chapter04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Example07Controller {

    @GetMapping("/exam07")
    public String example(ModelMap modelMap) {
        modelMap.addAttribute("message", "ModelMap 사용 예시!");

        List<String> items = new ArrayList<>();
        items.add("사과");
        items.add("바나나");
        items.add("오렌지");
        modelMap.addAttribute("items", items);

        return "viewPageModelMap";
    }
}