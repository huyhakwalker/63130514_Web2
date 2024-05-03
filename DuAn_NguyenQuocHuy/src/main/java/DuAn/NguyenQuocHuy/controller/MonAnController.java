package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import DuAn.NguyenQuocHuy.models.MonAn;
import DuAn.NguyenQuocHuy.service.MonAnService;

import java.util.List;

@Controller
@RequestMapping("/monan")
public class MonAnController {
    @Autowired
    private MonAnService monAnService;

    @GetMapping("/list")
    public String getAllMonAns(Model model) {
        List<MonAn> monAnList = monAnService.getAllMonAns();
        model.addAttribute("monAnList", monAnList);
        return "monan_list";
    }

    @GetMapping("/form")
    public String showMonAnForm(Model model) {
        model.addAttribute("monAn", new MonAn());
        return "monan_form";
    }

    @PostMapping("/save")
    public String saveOrUpdateMonAn(@ModelAttribute("monAn") MonAn monAn) {
        monAnService.saveOrUpdateMonAn(monAn);
        return "redirect:/monan/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        MonAn monAn = monAnService.getMonAnById(id);
        model.addAttribute("monAn", monAn);
        return "monan_form";
    }

    @GetMapping("/delete/{id}")
    public String deleteMonAn(@PathVariable("id") int id) {
        monAnService.deleteMonAn(id);
        return "redirect:/monan/list";
    }
}

