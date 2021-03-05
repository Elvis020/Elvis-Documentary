::#!
@echo off
call scala %0 %*

goto :eof
::!#
object HelloWorld{
    def main(args: Array[String]){
        println("Hello from Scala")
    }
}

HelloWorld.main(args)