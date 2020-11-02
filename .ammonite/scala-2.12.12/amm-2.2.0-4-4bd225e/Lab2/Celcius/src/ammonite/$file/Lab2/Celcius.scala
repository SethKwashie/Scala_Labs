
package ammonite
package $file.Lab2
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


object Celcius{
/*<script>*/def temperature(celcius : float) : float = f = (celcius * 9/5) + 32;

/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "Celcius"
  /*</generated>*/
}
