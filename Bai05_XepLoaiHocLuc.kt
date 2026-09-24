// Họ tên: Nguyen Ngoc Danh - MSSV: 25810010
fun main() {
    val diemTrungBinh: Double = 8.0

    val xepLoai = when (diemTrungBinh) {
        in 8.5..10.0 -> "Xuất sắc"
        in 7.0..8.5  -> "Giỏi"
        in 5.5..7.0  -> "Khá"
        in 4.0..5.5  -> "Trung bình"
        in 0.0..4.0  -> "Yếu"
        else -> "Điểm không hợp lệ"
    }

    println("Điểm trung bình: $diemTrungBinh")
    println("Xếp loại: $xepLoai")
}