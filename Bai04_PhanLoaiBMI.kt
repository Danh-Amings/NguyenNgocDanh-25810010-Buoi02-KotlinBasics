// Họ tên: Nguyen Ngoc Danh - MSSV: 25810010

fun main() {
	val canNang : Double = 70.0
    val chieuCao :Double = 1.71
    val bmi: Double = canNang / (chieuCao * chieuCao)
    
    val phanLoai : String 
    if (bmi < 15) {
        phanLoai = "Gầy"
    }
    else if (bmi < 20) {
        phanLoai = "Binh thường"
    }
    else if (bmi <30) {
        phanLoai = "Thừa cân"
    }
    else {
        phanLoai = "Béo Phì"
    }
    
    println("Chỉ số khối cơ thể (BMI): ${"%.2f".format(bmi)}")
    println("Phân loại: $phanLoai")
}