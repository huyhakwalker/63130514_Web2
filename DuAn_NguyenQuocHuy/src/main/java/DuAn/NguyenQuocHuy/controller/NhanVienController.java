package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import DuAn.NguyenQuocHuy.models.NhanVien;
import DuAn.NguyenQuocHuy.service.NhanVienService;

@Controller
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/nhanvien")
    public String listAndSearchNhanVien(
            @RequestParam(name = "name", required = false, defaultValue = "") String name,
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "size", required = false, defaultValue = "5") int size,
            Model model) 
    {
        Page<NhanVien> nhanVienPage = nhanVienService.searchByTenNhanVien(name, page, size);
        model.addAttribute("nhanVienList", nhanVienPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", nhanVienPage.getTotalPages());
        model.addAttribute("searchName", name);
        return "nhanvien_list";
    }

    @GetMapping("/nhanvien/form")
    public String showNhanVienForm(Model model) {
        model.addAttribute("nhanVien", new NhanVien());
        return "nhanvien_form";
    }

    @PostMapping("/nhanvien/save")
    public String saveOrUpdateNhanVien(@ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienService.saveOrUpdateNhanVien(nhanVien);
        return "redirect:/nhanvien";
    }

    @GetMapping("/nhanvien/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        NhanVien nhanVien = nhanVienService.getNhanVienById(id);
        model.addAttribute("nhanVien", nhanVien);
        return "nhanvien_form";
    }

    @GetMapping("/nhanvien/delete/{id}")
    public String deleteNhanVien(@PathVariable("id") int id) {
        nhanVienService.deleteNhanVien(id);
        return "redirect:/nhanvien";
    }
}


