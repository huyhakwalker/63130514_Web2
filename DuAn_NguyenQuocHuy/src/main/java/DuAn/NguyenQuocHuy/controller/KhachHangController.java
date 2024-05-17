package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import DuAn.NguyenQuocHuy.models.KhachHang;
import DuAn.NguyenQuocHuy.service.KhachHangService;

@Controller
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/khachhang")
    public String listAndSearchKhachHang(
    		@RequestParam(name = "name", required = false, defaultValue = "") String name,
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "size", required = false, defaultValue = "5") int size,
            Model model) 
    {
        Page<KhachHang> khachHangPage = khachHangService.searchByTenKhachHang(name, page, size);
        model.addAttribute("khachHangList", khachHangPage.getContent());
        model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", khachHangPage.getTotalPages());
		model.addAttribute("searchName", name);
		return "khachhang_list";
    }

    @GetMapping("/khachhang/form")
    public String addKhachHangForm(Model model) {
        KhachHang khachHang = new KhachHang();
        model.addAttribute("khachHang", khachHang);
        return "khachhang_form";
    }

    @PostMapping("/khachhang/save")
    public String saveOrUpdateKhachHang(@ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.saveOrUpdateKhachHang(khachHang);
        return "redirect:/khachhang";
    }

    @GetMapping("/khachhang/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        KhachHang khachHang = khachHangService.getKhachHangById(id);
        model.addAttribute("khachHang", khachHang);
        return "khachhang_form";
    }

    @GetMapping("/khachhang/delete/{id}")
    public String deleteKhachHang(@PathVariable("id") int id) {
        khachHangService.deleteKhachHang(id);
        return "redirect:/khachhang";
    }
}
