// Họ tên: Nguyễn Ngọc Danh MSSV: 25810010
fun main() {
    val tuoi = 20

    val loaiVe = if (tuoi < 6)
    {
        "Ve tre em"
    }
    else if (tuoi < 18)
    {
        "Ve nguoi lon"
    }
    else
    {
        "Ve cao tuoi"
    }

    println("Loai ve: $loaiVe")
}