package DuAn.NguyenQuocHuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import DuAn.NguyenQuocHuy.service.ChiTietDonHangService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import DuAn.NguyenQuocHuy.models.ChiTietDonHang;
import DuAn.NguyenQuocHuy.models.DonHang;
import DuAn.NguyenQuocHuy.service.DonHangService;

import java.util.List;

@Controller
public class DonHangController {
    @Autowired
    private DonHangService donHangService;
    
    @Autowired
    private ChiTietDonHangService chiTietDonHangService;

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
        return "redirect:/donhang";
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
        return "redirect:/donhang";
    }
    @GetMapping("/donhang/detail/{id}")
    public String showDonHangDetail(@PathVariable("id") int id, Model model) {
        // Lấy thông tin đơn hàng từ bảng DonHang
        DonHang donHang = donHangService.getDonHangById(id);
        model.addAttribute("donHang", donHang);
        
        // Lấy chi tiết đơn hàng từ bảng ChiTietDonHang
        List<ChiTietDonHang> chiTietDonHangList = chiTietDonHangService.getChiTietDonHangByMaDonHang(id);
        model.addAttribute("chiTietDonHangList", chiTietDonHangList);
        
        return "donhang_detail";
    }


}

