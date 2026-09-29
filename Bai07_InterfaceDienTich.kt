// Nguyen Ngoc Danh 25810010

interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}
 
class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double = canh * canh
}
 
class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double = Math.PI * banKinh * banKinh
}
 
fun main() {
    val hv = HinhVuong(10.0)
    val ht = HinhTron(5.0)
 
    println("Dien tich hinh vuong canh ${hv.canh}: ${hv.tinhDienTich()}")
    println("Dien tich hinh tron ban kinh ${ht.banKinh}: ${ht.tinhDienTich()}")
}