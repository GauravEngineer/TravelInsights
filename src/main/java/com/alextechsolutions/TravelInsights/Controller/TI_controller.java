package com.alextechsolutions.TravelInsights.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TI_controller {
    @GetMapping("/contact")
    public RedirectView getContactPage() {
        return new RedirectView("/html/contact.html");
    }
}
