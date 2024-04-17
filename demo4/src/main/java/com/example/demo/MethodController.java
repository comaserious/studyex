package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MethodController {

    @GetMapping("/redirect")
    public String redirect(Model model, RedirectAttributes rttr){
        System.out.println("첫번째 핸들러 메소드 발동");
        model.addAttribute("message","보냈음 받아라");
//        rttr.addFlashAttribute("message","redirect 플래시 세션을 섰으니 받아라");
        return "redirect:/";
    }
}
