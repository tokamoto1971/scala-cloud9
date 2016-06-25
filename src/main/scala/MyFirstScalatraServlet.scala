import org.scalatra._
import scalate.ScalateSupport


class MyFirstScalatraServlet extends ScalatraServlet with ScalateSupport {
  get("/") {
    contentType="text/html"
    ssp("/index", "foo" -> "uno", "bar" -> "dos")
  }
}
