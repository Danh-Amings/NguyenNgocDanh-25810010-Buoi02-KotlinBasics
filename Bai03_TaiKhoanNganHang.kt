// Họ tên: Nguyen Ngoc Danh - MSSV: 25810010

fun main() {
    val soDuBanDau: Long = 5_000_000
    var soDuHienTai: Long = soDuBanDau

    println("Số dư ban đầu: $soDuBanDau Vnđ")

    soDuHienTai += 2_000_000
    println("Gửi 2.000.000 đồng, số dư: $soDuHienTai Vnđ")

    soDuHienTai -= 1_500_000
    println("Rút 1.500.000 đồng, số dư: $soDuHienTai Vnđ")
    
    //dung val cho sDBĐ vì nó là 1 số cố định, còn dùng var cho sDHT thay vì val do con số nó thay đổi
}