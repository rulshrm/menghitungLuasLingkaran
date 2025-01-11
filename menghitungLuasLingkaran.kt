fun main(args: Array<String>) {
  val pi: Double = 3.14  
  
  print("Input: ")
  val input = readLine() 
  val r = input?.toIntOrNull() ?: run {
    print("Input tidak valid, Masukan angka!")
    return
  }

  val luas = pi * r * r
  print("Output: Luas lingkaran dengan jari-jari $r adalah $luas")
}
