// Nguyen Ngoc Danh 25810010

class KhachHang(var ho: String, var ten: String) {

    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val viTri = value.trim().lastIndexOf(' ')
            if (viTri >= 0) {
                ho = value.trim().substring(0, viTri)
                ten = value.trim().substring(viTri + 1)
            } else {
                ho = ""
                ten = value.trim()
            }
        }
}
 
fun main() {
    val kh = KhachHang("Nguyen", "Binh")
    println("Ho ten ban dau: ${kh.hoTen}")
 
    kh.ten = "Danh"
    println("Sau khi doi ten: ${kh.hoTen}")
    
//ho ten moi
    kh.hoTen = "Tran Thi Mai Hien"
    println("Ho = ${kh.ho}")
    println("Ten = ${kh.ten}")
    println("HoTen = ${kh.hoTen}")
}