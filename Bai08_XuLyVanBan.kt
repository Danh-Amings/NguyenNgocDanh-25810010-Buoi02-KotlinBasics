// Họ tên: Nguyễn Ngọc Danh MSSV: 25810010

fun xuLyVanBan(chuoi: String, xuLy: (String) -> String): String {
    return xuLy(chuoi)
}
 
fun vietHoaChuoi(chuoi: String): String {
    return chuoi.uppercase()
}
 
fun main() {
    val ketQua1 = xuLyVanBan("Xin chao", { it.reversed() })
    println(ketQua1)
 
    val ketQua2 = xuLyVanBan("xin chao", ::vietHoaChuoi)
    println(ketQua2)
 
    val ketQua3 = xuLyVanBan("你好，今天过得怎么样") { chuoi -> chuoi.trim() }
    println(ketQua3)
}