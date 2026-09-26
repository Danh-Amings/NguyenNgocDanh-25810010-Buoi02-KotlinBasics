// Họ tên: Nguyễn Ngọc Danh MSSV: 25810010

fun main() {
    val danhSachSo = listOf(10, 2, 9, 4, 8)
    val danhSachNhanDoi = danhSachSo.map { it * 2 }
    println("Danh sach khi nhan doi (map): $danhSachNhanDoi")
 
    val danhSachLongNhau = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8, 9)
    )
    val danhSachPhang = danhSachLongNhau.flatten()
    println("Danh sach sau khi gop (flatten): $danhSachPhang")
}