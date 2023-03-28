package uz.snow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.snow.service.VetService;

@Controller()
@RequestMapping("/vets")
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"", "/"})
    public String listVets(Model model) {
        var list = vetService.findAll().stream()
                .sorted((a, b) -> (a.getId() < b.getId()) ? 1 : 0);
        model.addAttribute("vets", list);
        return "vet/index";

    }
}
