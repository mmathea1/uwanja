// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mingina/Projects/uwanja/conf/routes
// @DATE:Wed Aug 22 16:46:09 EAT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
