// Nguyen Ngoc Danh 25810010

class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan $soTaiKhoan thanh cong, so du ban dau: $soDuBanDau")
        }
    }
    fun napTien(soTien: Double) {
        soDu += soTien
    }

    // Ham thanh vien: tru tien neu du so du, tra ve true, nguoc lai tra ve false
    fun rutTien(soTien: Double): Boolean {
        if (soTien <= soDu) {
            soDu -= soTien
            return true
        }
        return false
    }
}

fun main() {
    val tk = TaiKhoanNganHang("017-180-222-45", 1000000.0)

    tk.napTien(500000.0)
    println("Sau khi nap 500.000: so du = ${tk.soDu}")

    println("Rut 300.000: ${tk.rutTien(300000.0)}: so du = ${tk.soDu}")
    println("Rut 5.000.000: ${tk.rutTien(5000000.0)}: so du = ${tk.soDu}") // khong du tien

    tk.napTien(200000.0)
    println("Sau khi nap 200.000: so du = ${tk.soDu}")
}