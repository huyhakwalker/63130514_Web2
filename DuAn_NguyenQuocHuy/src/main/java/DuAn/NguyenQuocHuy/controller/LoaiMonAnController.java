package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import DuAn.NguyenQuocHuy.models.LoaiMonAn;
import DuAn.NguyenQuocHuy.service.LoaiMonAnService;

import java.util.List;

@Controller
@RequestMapping("/loaimonan")
public class LoaiMonAnController {
    @Autowired
    private LoaiMonAnService loaiMonAnService;

    @GetMapping("/list")
    public String getAllLoaiMonAns(Model model) {
        List<LoaiMonAn> loaiMonAnList = loaiMonAnService.getAllLoaiMonAns();
        model.addAttribute("loaiMonAnList", loaiMonAnList);
        return "loaimonan_list";
    }

    @GetMapping("/form")
    public String showLoaiMonAnForm(Model model) {
        model.addAttribute("loaiMonAn", new LoaiMonAn());
        return "loaimonan_form";
    }

    @PostMapping("/save")
    public String saveOrUpdateLoaiMonAn(@ModelAttribute("loaiMonAn") LoaiMonAn loaiMonAn) {
        loaiMonAnService.saveOrUpdateLoaiMonAn(loaiMonAn);
        return "redirect:/loaimonan/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        LoaiMonAn loaiMonAn = loaiMonAnService.getLoaiMonAnById(id);
        model.addAttribute("loaiMonAn", loaiMonAn);
        return "loaimonan_form";
    }

    @GetMapping("/delete/{id}")
    public String deleteLoaiMonAn(@PathVariable("id") int id) {
        loaiMonAnService.deleteLoaiMonAn(id);
        return "redirect:/loaimonan/list";
    }
}


