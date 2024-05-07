package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import DuAn.NguyenQuocHuy.models.KhachHang;
import DuAn.NguyenQuocHuy.service.KhachHangService;

import java.util.List;

@Controller
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/khachhang")
    public String getAllKhachHangs(Model model) {
        List<KhachHang> khachHangList = khachHangService.getAllKhachHangs();
        model.addAttribute("khachhangList", khachHangList);
        return "khachhang_list";
    }

    @GetMapping("/khachhang/form")
    public String showKhachHangForm(Model model) {
        model.addAttribute("khachHang", new KhachHang());
        return "khachhang_form";
    }

    @PostMapping("/khachhang/save")
    public String saveOrUpdateKhachHang(@ModelAttribute("khachHang") KhachHang khachHang) {
        khachHangService.saveOrUpdateKhachHang(khachHang);
        return "redirect:/khachhang/list";
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
        return "redirect:/khachhang/list";
    }
}
