import scala.math.pow
object Functions{


    def main(args : Array[String]){
        operate("Power", 2,2)
    }

    def operate(operation:String,a:Int,b:Int)
    {
        if(operation.toLowerCase().equals("add")) println(a + b)
        if(operation.toLowerCase().equals("subtract")) println(a - b)
        if(operation.toLowerCase().equals("power")) println(pow(a,b))
    }
}