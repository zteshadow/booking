
class HttpServer(var x: Int, var y: Int) {

    def start(dx: Int, dy: Int): Unit = {
        x = dx
        y = dy
    }

    override def toString: String = 
        s"($x, $y)"
}

