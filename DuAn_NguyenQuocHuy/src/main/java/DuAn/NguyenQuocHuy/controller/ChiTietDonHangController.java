package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import DuAn.NguyenQuocHuy.models.ChiTietDonHang;
import DuAn.NguyenQuocHuy.service.ChiTietDonHangService;

import java.util.List;

@Controller
@RequestMapping("/chitietdonhang")
public class ChiTietDonHangController {
    @Autowired
    private ChiTietDonHangService chiTietDonHangService;

    @GetMapping("/list")
    public String getAllChiTietDonHangs(Model model) {
        List<ChiTietDonHang> chiTietDonHangList = chiTietDonHangService.getAllChiTietDonHangs();
        model.addAttribute("chiTietDonHangList", chiTietDonHangList);
        return "chitietdonhang_list";
    }

    @GetMapping("/form")
    public String showChiTietDonHangForm(Model model) {
        model.addAttribute("chiTietDonHang", new ChiTietDonHang());
        return "chitietdonhang_form";
    }

    @PostMapping("/save")
    public String saveOrUpdateChiTietDonHang(@ModelAttribute("chiTietDonHang") ChiTietDonHang chiTietDonHang) {
        chiTietDonHangService.saveOrUpdateChiTietDonHang(chiTietDonHang);
        return "redirect:/chitietdonhang/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        ChiTietDonHang chiTietDonHang = chiTietDonHangService.getChiTietDonHangById(id);
        model.addAttribute("chiTietDonHang", chiTietDonHang);
        return "chitietdonhang_form";
    }

    @GetMapping("/delete/{id}")
    public String deleteChiTietDonHang(@PathVariable("id") int id) {
        chiTietDonHangService.deleteChiTietDonHang(id);
        return "redirect:/chitietdonhang/list";
    }
}

