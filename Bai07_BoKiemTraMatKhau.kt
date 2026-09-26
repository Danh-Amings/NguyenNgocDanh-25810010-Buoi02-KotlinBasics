// Họ tên: Nguyễn Ngọc Danh MSSV: 25810010

val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }
 
fun main() {
    val matKhau1 = "abcd1234"
    val matKhau2 = "matkhau"
    val matKhau3 = "Aa1234@@"
 
    println("$matKhau1 -> ${kiemTraDoDai(matKhau1)}")
    println("$matKhau2 -> ${kiemTraDoDai(matKhau2)}")
    println("$matKhau3 -> ${kiemTraDoDai(matKhau3)}")
}
 