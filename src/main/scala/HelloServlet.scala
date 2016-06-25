import org.scalatra.ScalatraServlet

class HelloServlet extends ScalatraServlet {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  get("/get") {
    params.get("param") match {
      case Some(x) => redirect("/get/" + x)
      case None =>
        contentType="text/html"
        <html>
          <body>
            <h1>Scalatra GET Tutorial</h1>
            <form action="./get" method="get" >
              <input type="text" name="param" value="" />
              <input type="submit" value="送信" />
            </form>
            <hr/>
            <a href="/">Beck To Index</a>
          </body>
        </html>
    }
  }

  get("/get/:param") {
    contentType="text/html"
    <html>
      <body>
        <h1>Scalatra GET Tutorial</h1>
        <p>You submitted: {params("param")}</p>
        <hr/>
        <a href="/">Beck To Index</a>
      </body>
    </html>
  }
  
}