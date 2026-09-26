// Họ tên: Nguyễn Ngọc Danh MSSV: 25810010
fun ghiNhatKyTuongMinh(hanhDong: String): Unit {
    println("[LOG] $hanhDong")
}
 
// Bản bỏ qua khai báo Unit
fun ghiNhatKy(hanhDong: String) {
    println("[LOG] $hanhDong")
}
fun main() {
    ghiNhatKyTuongMinh("Đăng nhập hệ thống")
    ghiNhatKy("Đăng nhập hệ thống")
}