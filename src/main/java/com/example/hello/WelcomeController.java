/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author noom
 */
@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String showWelcomePage() {
        return "welcome_thailand"; // ชื่อไฟล์ HTML (ไม่ต้องมี .html)
    }
}
