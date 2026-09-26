// Họ tên: Nguyễn Ngọc Danh MSSV: 25810010

fun binhPhuongDayDu(x: Int): Int {
    return x * x
}
 
fun chuViHinhVuongDayDu(canh: Double): Double {			
    return canh * 4
}
 
fun laSoChanDayDu(x: Int): Boolean {
    return x % 2 == 0
}
 
// --- Bản rút gọn (single expression function) ---
fun binhPhuong(x: Int) = x * x
 
fun chuViHinhVuong(canh: Double) = canh * 4
 
fun laSoChan(x: Int) = x % 2 == 0
 
fun main() {
    println("Binh phuong (day du): ${binhPhuongDayDu(5)}")
    println("Binh phuong  (rut gon): ${binhPhuong(5)}")
 
    println("Chu vi hinh vuong (day du): ${chuViHinhVuongDayDu(4.0)}")
    println("Chu vi hinh vuong (rut gon): ${chuViHinhVuong(4.0)}")
 
    println("So chan (day du): ${laSoChanDayDu(7)}")
    println("So chan (rut gon): ${laSoChan(7)}")
}