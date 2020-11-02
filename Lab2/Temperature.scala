import java.text.SimpleDateFormat
import java.{util => ju}
object Temperature {

    def main(args : Array[String]){
        // temp_converter(40);
        date_converter("20/04/97")
    }

    // def temp_converter(celcius:Float){
    //     val fahr = (celcius * 9 /5) + 32
    //     println(fahr) 
    // }

    def date_converter(date : String) {
        val format:SimpleDateFormat  = new SimpleDateFormat("DD/MM/YY")

        println(format.parse(date))
    }
}
