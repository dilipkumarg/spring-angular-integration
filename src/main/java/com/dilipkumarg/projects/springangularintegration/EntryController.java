package com.dilipkumarg.projects.springangularintegration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class EntryController {

 /*   @GetMapping("/")
    public View index(HttpServletRequest request) {
        return new RedirectView("/en", true);
    }*/
}
