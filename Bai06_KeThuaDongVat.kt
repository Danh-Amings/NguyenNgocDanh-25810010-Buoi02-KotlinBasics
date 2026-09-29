// Nguyen Ngoc Danh 25810010

open class DongVat(val ten: String) {
    open fun keu(): String {
        return "Dong vat phat ra tieng keu"
    }
}
 
class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gau gau"
    }
}
 
class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}
 
class KhungLong(ten: String) : DongVat(ten){
    override fun keu(): String{
        return "Gào Gào"
    }
}
fun main() {
    val danhSach = listOf(Cho("Lu"), Meo("Mun"), KhungLong("Smalz"), Cho("Aly"), Meo("Axiao"), KhungLong("Bib"),)
 
    for (dongVat in danhSach) {
        println("${dongVat.ten}: ${dongVat.keu()}")
    }
}