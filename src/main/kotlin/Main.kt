import utils.IOUtils

class App{

    private fun run() {
        printHeader()
        inputPlayer()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }

    private fun printHeader() {

        println("terminal:~terminal$")
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    private fun inputPlayer() {
        println("Masukkan Pemain 1 : ")
        val inputPlayer1 = IOUtils.readString()
        println("Masukkan Pemain 2 : ")
        val inputPlayer2 = IOUtils.readString()

        println("Masukkan pemain 1 : $inputPlayer1")
        println("Masukkan pemain 2 : $inputPlayer2")
        if (inputPlayer1 == "gunting" && inputPlayer2 == "batu"){
            println("Pemain 2 MENANG!")
        }
        if (inputPlayer1 == "batu" && inputPlayer2 == "gunting"){
            println("Pemain 1 MENANG!")
        }
        if (inputPlayer1 == "kertas" && inputPlayer2 == "gunting"){
            println("Pemain 2 MENANG!")
        }
        if (inputPlayer1 == "gunting" && inputPlayer2 == "kertas"){
            println("Pemain 1 MENANG!")
        }
        if (inputPlayer1 == "kertas" && inputPlayer2 == "batu"){
            println("Pemain 1 MENANG!")
        }
        if (inputPlayer1 == "batu" && inputPlayer2 == "kertas"){
            println("Pemain 2 MENANG!")
        }
        if (inputPlayer1 == inputPlayer2){
            println("DRAW!")
        }
    }
}