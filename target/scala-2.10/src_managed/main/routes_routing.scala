// @SOURCE:/home/lucasmdm/java/play-bd-e-testes-master/conf/routes
// @HASH:5696d6d5b513665dfa9532240e5288f0c6fc6c05
// @DATE:Tue Jun 02 10:39:10 BRT 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:10
private[this] lazy val controllers_Application_anuncio2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncios"))))
        

// @LINE:11
private[this] lazy val controllers_Application_newAnuncio3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncios"))))
        

// @LINE:14
private[this] lazy val controllers_Application_RemoveAnuncio4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncios/RemoveAnuncio"))))
        

// @LINE:15
private[this] lazy val controllers_Application_Pergunta5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncios/Pergunta"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncios""","""controllers.Application.anuncio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncios""","""controllers.Application.newAnuncio()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncios/RemoveAnuncio""","""controllers.Application.RemoveAnuncio(anuncio:Long, nome:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncios/Pergunta""","""controllers.Application.Pergunta(anuncio:Long, pergunta:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:10
case controllers_Application_anuncio2(params) => {
   call { 
        invokeHandler(controllers.Application.anuncio(), HandlerDef(this, "controllers.Application", "anuncio", Nil,"GET", """""", Routes.prefix + """anuncios"""))
   }
}
        

// @LINE:11
case controllers_Application_newAnuncio3(params) => {
   call { 
        invokeHandler(controllers.Application.newAnuncio(), HandlerDef(this, "controllers.Application", "newAnuncio", Nil,"POST", """""", Routes.prefix + """anuncios"""))
   }
}
        

// @LINE:14
case controllers_Application_RemoveAnuncio4(params) => {
   call(params.fromQuery[Long]("anuncio", None), params.fromQuery[String]("nome", None)) { (anuncio, nome) =>
        invokeHandler(controllers.Application.RemoveAnuncio(anuncio, nome), HandlerDef(this, "controllers.Application", "RemoveAnuncio", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """anuncios/RemoveAnuncio"""))
   }
}
        

// @LINE:15
case controllers_Application_Pergunta5(params) => {
   call(params.fromQuery[Long]("anuncio", None), params.fromQuery[String]("pergunta", None)) { (anuncio, pergunta) =>
        invokeHandler(controllers.Application.Pergunta(anuncio, pergunta), HandlerDef(this, "controllers.Application", "Pergunta", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """anuncios/Pergunta"""))
   }
}
        
}

}
     