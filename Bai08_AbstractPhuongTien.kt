// Nguyen Ngoc Danh 25810010

abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int
 
    fun moTa() {
        println("Phuong tien nay co toc do toi da la $tocDoToiDa km/h")
    }
}
 
class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa = 60
}
 
class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa = 150
}
 
fun main() {
    val xeMay = XeMay()
    val oTo = OTo()
 
    print("Xe may: ")
    xeMay.moTa()
    print("O to: ")
    oTo.moTa()
}