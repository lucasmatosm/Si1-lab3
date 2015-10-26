// @SOURCE:/home/lucasmdm/java/play-bd-e-testes-master/conf/routes
// @HASH:5696d6d5b513665dfa9532240e5288f0c6fc6c05
// @DATE:Tue Jun 02 10:39:10 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:14
def RemoveAnuncio(anuncio:Long, nome:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "anuncios/RemoveAnuncio" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("anuncio", anuncio)), Some(implicitly[QueryStringBindable[String]].unbind("nome", nome)))))
}
                                                

// @LINE:10
def anuncio(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "anuncios")
}
                                                

// @LINE:11
def newAnuncio(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "anuncios")
}
                                                

// @LINE:15
def Pergunta(anuncio:Long, pergunta:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "anuncios/Pergunta" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("anuncio", anuncio)), Some(implicitly[QueryStringBindable[String]].unbind("pergunta", pergunta)))))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:14
def RemoveAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.RemoveAnuncio",
   """
      function(anuncio,nome) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncios/RemoveAnuncio" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("anuncio", anuncio), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("nome", nome)])})
      }
   """
)
                        

// @LINE:10
def anuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.anuncio",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncios"})
      }
   """
)
                        

// @LINE:11
def newAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newAnuncio",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncios"})
      }
   """
)
                        

// @LINE:15
def Pergunta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.Pergunta",
   """
      function(anuncio,pergunta) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncios/Pergunta" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("anuncio", anuncio), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pergunta", pergunta)])})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:14
def RemoveAnuncio(anuncio:Long, nome:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.RemoveAnuncio(anuncio, nome), HandlerDef(this, "controllers.Application", "RemoveAnuncio", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """anuncios/RemoveAnuncio""")
)
                      

// @LINE:10
def anuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.anuncio(), HandlerDef(this, "controllers.Application", "anuncio", Seq(), "GET", """""", _prefix + """anuncios""")
)
                      

// @LINE:11
def newAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newAnuncio(), HandlerDef(this, "controllers.Application", "newAnuncio", Seq(), "POST", """""", _prefix + """anuncios""")
)
                      

// @LINE:15
def Pergunta(anuncio:Long, pergunta:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.Pergunta(anuncio, pergunta), HandlerDef(this, "controllers.Application", "Pergunta", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """anuncios/Pergunta""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    