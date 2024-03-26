package thiGK.ntu63130514.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu63130514.models.SinhVien;
import thiGK.ntu63130514.service.SinhVienService;

@Controller
public class Home_63130514Controller {
	@GetMapping("/index")
	public String Home(ModelMap mm) {
	    return "index";
	}
	
	@Autowired
    private SinhVienService sinhvienService;
	
	@GetMapping("/danh-sach-sinh-vien")
    public String danhSachSinhVien(ModelMap model) {
        List<SinhVien> danhSachSinhVien = sinhvienService.getAllSinhvien();
        model.addAttribute("danhSachSinhVien", danhSachSinhVien);
        return "danh-sach-sinh-vien";
    }

    @GetMapping("/them-sinh-vien")
    public String hienThiFormThemSinhVien() {
        return "form-them-sinh-vien";
    }

    @PostMapping("/luu-sinh-vien")
    public String luuSinhVien(@RequestParam String maSoSV, @RequestParam String hoVaTen) {
        SinhVien sinhVien = new SinhVien(maSoSV, hoVaTen);
        sinhvienService.themSinhVien(sinhVien);
        return "redirect:/them-sinh-vien?success=true";
    }

	@GetMapping("/tim-kiem-sinh-vien")
    public String showSearchForm() {
        return "tim-kiem-sinh-vien";
    }
	
	@GetMapping("/ket-qua-tim-kiem")
	public String searchSinhVien(@RequestParam String maSoSV, ModelMap model) {
	    SinhVien sinhVien = sinhvienService.findSinhVienById(maSoSV);
	    if (sinhVien != null) {
	        model.addAttribute("sinhVien", sinhVien);
	    } else {
	        model.addAttribute("errorMessage", "Không tìm thấy sinh viên");
	    }
	    return "ket-qua-tim-kiem";
	}

}
