package thiGK.ntu63130514.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
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
        // Lấy danh sách sinh viên từ service
        List<SinhVien> danhSachSinhVien = sinhvienService.getAllSinhvien();
        // Đưa danh sách sinh viên vào model để hiển thị trên view
        model.addAttribute("danhSachSinhVien", danhSachSinhVien);
        return "danh-sach-sinh-vien";
    }
	
	@GetMapping("/them-sinh-vien")
    public String hienThiFormThemSinhVien() {
        return "form-them-sinh-vien";
    }

	@PostMapping("/sinhvien/timkiem")
    public String searchSinhVienById(@RequestParam("maSinhVien") String maSinhVien, ModelMap model) {
        SinhVien sinhVien = sinhvienService.findSinhVienById(maSinhVien);
        if (sinhVien != null) {
            model.addAttribute("ketQuaTimKiem", sinhVien);
        } else {
            model.addAttribute("thongBao", "Không tìm thấy sinh viên với mã: " + maSinhVien);
        }
        return "ketquatiemkiem";
    }
}
