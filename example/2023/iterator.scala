object example extends App{
    val it = Iterator("a", "number", "of", "words")
    while (it.hasNext){
    println(it.next())
    }
}
