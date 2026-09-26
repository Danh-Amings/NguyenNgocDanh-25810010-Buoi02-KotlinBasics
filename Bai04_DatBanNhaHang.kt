// Họ tên: Nguyễn Ngọc Danh MSSV: 25810010
fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "ban thuong") {
    println("Dat ban cho $tenKhachHang, so khach: $soLuongKhach, loai ban: $loaiBan")
}
 
fun main() {
    
    datBan("Ruãn Yu Ming", 10)
    datBan("Ma ly A", 7, "bàn VIP")
    datBan(tenKhachHang = "Lian shi a", soLuongKhach = 6, loaiBan = "ban ngoai troi")
}