// Họ tên: Nguyễn Ngọc Danh MSSV: 25810010

fun main() {
    val danhSachNhacCu = listOf("Piano", "Guitar", "Violin", "Trumpet")
    val chuCaiDau = "P"
 
    val ketQuaEager = danhSachNhacCu.filter { it.startsWith(chuCaiDau) }
    println("Kq lọc eager: $ketQuaEager")
 
    val ketQuaLazy = danhSachNhacCu.asSequence()
        .filter { it.startsWith(chuCaiDau) }
        .toList()
    println("KQ loc qua Sequence: $ketQuaLazy")
 
}