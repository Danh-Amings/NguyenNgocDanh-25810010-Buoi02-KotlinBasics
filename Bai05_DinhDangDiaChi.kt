// Họ tên: Nguyễn Ngọc Danh MSSV: 25810010

fun dinhDangDiaChi(soNha: String, tenDuong: String, phuong: String = "", quan: String = "",
    thanhPho: String = "TP.HCM"): String {
    return "$soNha $tenDuong, $phuong, $quan, $thanhPho"
}
 
fun main() {
    val diaChi = dinhDangDiaChi("404", "Le Hong Phong",phuong = "TDH",quan = "Di An", thanhPho = "TP.HCM")
    println(diaChi)
}