package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import DuAn.NguyenQuocHuy.models.DonHang;
import DuAn.NguyenQuocHuy.service.DonHangService;

import java.util.List;

@Controller
public class DonHangController {
    @Autowired
    private DonHangService donHangService;

    @GetMapping("/donhang")
    public String getAllDonHangs(Model model) {
        List<DonHang> donHangList = donHangService.getAllDonHangs();
        model.addAttribute("donHangList", donHangList);
        return "donhang_list";
    }

    @GetMapping("/donhang/form")
    public String showDonHangForm(Model model) {
        model.addAttribute("donHang", new DonHang());
        return "donhang_form";
    }

    @PostMapping("/donhang/save")
    public String saveOrUpdateDonHang(@ModelAttribute("donHang") DonHang donHang) {
        donHangService.saveOrUpdateDonHang(donHang);
        return "redirect:/donhang/list";
    }

    @GetMapping("/donhang/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        DonHang donHang = donHangService.getDonHangById(id);
        model.addAttribute("donHang", donHang);
        return "donhang_form";
    }

    @GetMapping("/donhang/delete/{id}")
    public String deleteDonHang(@PathVariable("id") int id) {
        donHangService.deleteDonHang(id);
        return "redirect:/donhang/list";
    }
}


