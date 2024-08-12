object CaesarCipher{
    def encrypt(text:String, shift:Int):String={
        text.map {char =>
            if(char.isLetter){
                val base = if(isUpper) 'A' else 'a'
                ((char - base + shift)%26 + base).toChar
            }else{
                char
            }
        }
    }
}