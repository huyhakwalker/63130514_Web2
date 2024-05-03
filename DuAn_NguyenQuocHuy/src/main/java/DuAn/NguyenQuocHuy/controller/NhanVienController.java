package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import DuAn.NguyenQuocHuy.models.NhanVien;
import DuAn.NguyenQuocHuy.service.NhanVienService;
import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/list")
    public String getAllNhanViens(Model model) {
        List<NhanVien> nhanVienList = nhanVienService.getAllNhanViens();
        model.addAttribute("nhanVienList", nhanVienList);
        return "nhanvien_list";
    }

    @GetMapping("/form")
    public String showNhanVienForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        return "nhanvien_form";
    }

    @PostMapping("/save")
    public String saveOrUpdateNhanVien(@ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienService.saveOrUpdateNhanVien(nhanVien);
        return "redirect:/nhanvien/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        NhanVien nhanVien = nhanVienService.getNhanVienById(id);
        model.addAttribute("nhanVien", nhanVien);
        return "nhanvien_form";
    }

    @GetMapping("/delete/{id}")
    public String deleteNhanVien(@PathVariable("id") int id) {
        nhanVienService.deleteNhanVien(id);
        return "redirect:/nhanvien/list";
    }
}


