package uz.snow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.snow.service.OwnerSrevice;
@Controller
@RequestMapping("/owners")

public class OwnerController {
    private final OwnerSrevice ownerSrevice;

    public OwnerController(OwnerSrevice ownerSrevice) {
        this.ownerSrevice = ownerSrevice;
    }

    @GetMapping({"", "/", "/index"})
    public String listOwners(Model model) {
        var list = ownerSrevice.findAll().stream()
                .sorted((a, b) -> (a.getId() < b.getId()) ? 1 : 0);
        model.addAttribute("owners", list);
        return "owner/index";

    }
}
