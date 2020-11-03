
package ammonite
package $file.Basic_Functional_Scala
import _root_.ammonite.interp.api.InterpBridge.{
  value => interp
}
import _root_.ammonite.interp.api.InterpBridge.value.{
  exit
}
import _root_.ammonite.interp.api.IvyConstructor.{
  ArtifactIdExt,
  GroupIdExt
}
import _root_.ammonite.runtime.tools.{
  browse,
  grep,
  time,
  tail
}
import _root_.ammonite.repl.tools.{
  desugar,
  source
}
import _root_.ammonite.main.Router.{
  doc,
  main
}
import _root_.ammonite.repl.tools.Util.{
  pathScoptRead
}


object Functions{
/*<script>*/import scala.math.pow
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
}/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "Functions"
  /*</generated>*/
}
