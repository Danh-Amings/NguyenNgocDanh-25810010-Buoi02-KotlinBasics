// Nguyen Ngoc Danh 25810010

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    val sp1 = SanPham("May Tinh Acer", 1000000.0, 10)

    val sp2 = SanPham(tenSanPham = "Quan Ao", gia = 350000.0, 20)

    println("San pham 1")
    println("Ten san pham: ${sp1.tenSanPham}")
    println("Gia: ${sp1.gia}")
    println("So luong ton kho: ${sp1.soLuongTonKho}")

    println("San pham 2")
    println("Ten san pham: ${sp2.tenSanPham}")
    println("Gia: ${sp2.gia}")
    println("So luong ton kho: ${sp2.soLuongTonKho}")
}