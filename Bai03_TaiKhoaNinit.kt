// Nguyen Ngoc Danh 25810010

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau
 
    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tk $soTaiKhoan thanh cong, so du ban dau: $soDuBanDau")
        }
    }
}
 
fun main() {
    val tk1 = TaiKhoanNganHang("123-456-789", 5000000.0)
    val tk2 = TaiKhoanNganHang("987-654-321", -5000000.0) 
}