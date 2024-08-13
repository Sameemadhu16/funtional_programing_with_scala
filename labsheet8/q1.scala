object CaesarCipher {

  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
  }

  def main(args: Array[String]): Unit = {
    println("Enter the text to be processed:")
    val inputText = scala.io.StdIn.readLine()

    println("Enter the shift value (an integer):")
    val shiftValue = scala.io.StdIn.readInt()

    println("Choose operation: (1) Encrypt, (2) Decrypt")
    val choice = scala.io.StdIn.readInt()

    val result = choice match {
      case 1 => cipher(inputText, shiftValue, encrypt)
      case 2 => cipher(inputText, shiftValue, decrypt)
      case _ => "Invalid choice!"
    }

    println(s"Result: $result")
  }
}
