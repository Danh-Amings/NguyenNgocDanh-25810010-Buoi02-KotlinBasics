// Nguyen Ngoc Danh 25810010

class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
 
    constructor(ten: String) : this("TAM", ten, 0.0)
}
 
fun main() {
    val nv1 = NhanVien("Danh", "Ng Ngoc Danh", 8000000.0)
    val nv2 = NhanVien("Mã ly")                       
 
	println("Nhan vien 1: ${nv1.ten} - Luong thang: ${"%.1f".format(nv1.luongThang)}")
	println("Nhan vien 2: ${nv2.ten} - Luong thang: ${"%.1f".format(nv2.luongThang)}")
}