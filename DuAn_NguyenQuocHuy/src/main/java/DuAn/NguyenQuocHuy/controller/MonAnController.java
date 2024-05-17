package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import DuAn.NguyenQuocHuy.models.MonAn;
import DuAn.NguyenQuocHuy.service.MonAnService;

@Controller
public class MonAnController {
    @Autowired
    private MonAnService monAnService;

    @GetMapping("/monan")
    public String listAndSearchMonAn(
    		@RequestParam(name = "name", required = false, defaultValue = "") String name,
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "size", required = false, defaultValue = "5") int size,
            Model model) 
    {
        Page<MonAn> monAnPage = monAnService.searchByTenMonAn(name, page, size);
        model.addAttribute("monAnList", monAnPage.getContent());
        model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", monAnPage.getTotalPages());
		model.addAttribute("searchName", name);
		return "monan_list";
    }


    @GetMapping("/monan/form")
    public String showMonAnForm(Model model) {
        model.addAttribute("monAn", new MonAn());
        return "monan_form";
    }

    @PostMapping("/monan/save")
    public String saveOrUpdateMonAn(@ModelAttribute("monAn") MonAn monAn) {
        monAnService.saveOrUpdateMonAn(monAn);
        return "redirect:/monan";
    }

    @GetMapping("/monan/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        MonAn monAn = monAnService.getMonAnById(id);
        model.addAttribute("monAn", monAn);
        return "monan_form";
    }

    @GetMapping("/monan/delete/{id}")
    public String deleteMonAn(@PathVariable("id") int id) {
        monAnService.deleteMonAn(id);
        return "redirect:/monan";
    }
}

