
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[List[Anuncio],Integer,List[Instrumento],List[Estilo],List[Noestilo],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(anuncios: List[Anuncio])(contador: Integer)(instrumentos: List[Instrumento])(estilos: List[Estilo])(noestilos: List[Noestilo]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.129*/("""

<html lang="">
    <head>
        <title>Classificado de bandas</title>
        <meta charset="UTF-8">
        <meta name=description content="">
        <meta name=viewport content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap CSS -->
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" media="screen">
            <!-- jQuery -->
        <script src="http://code.jquery.com/jquery.js"></script>
            <!-- Bootstrap JavaScript -->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <script language="javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>


        <script>
$(document).ready(function()"""),format.raw/*20.29*/("""{"""),format.raw/*20.30*/("""
	$( "#Clique" ).click(function() """),format.raw/*21.34*/("""{"""),format.raw/*21.35*/("""
  $("#escondido").css("display","block");
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/(""");
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/(""");
</script>

        <style type="text/css">
        #escondido"""),format.raw/*28.19*/("""{"""),format.raw/*28.20*/("""
        display:none;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
        </style>

    </head>
    <body>

    <div class="content">

        <div id="escondido" >

            <div class="col-sm-4">
                <h2>Novo Anuncio</h2>

                <form action=""""),_display_(Seq[Any](/*43.32*/routes/*43.38*/.Application.newAnuncio())),format.raw/*43.63*/("""" method="post">
                    <label for="nome"> Nome: </label>
                    <input type="text" name="nome" id="inputNome" class="form-control"required="required">

                    <label for="descricao"> Descriçao:</label>
                    <input type="text" name="descricao" id="inputDescricao" class="form-control"required="required">

                    <label for="localizacao"> Localização: cidade/bairro </label>
                    <input type="text" name="localizacao" id="inputLocalizacao" class="form-control"required="required">

                    <label for="instrumentos"> Instrumentos: </label>
                    <select name="instrumentos" id="inputinstrumentos" class="form-control" multiple = "multiple" required = "required">
                       """),_display_(Seq[Any](/*55.25*/for(instrumento <- instrumentos) yield /*55.57*/ {_display_(Seq[Any](format.raw/*55.59*/("""
                            <option value=""""),_display_(Seq[Any](/*56.45*/instrumento/*56.56*/.getId())),format.raw/*56.64*/(""""> """),_display_(Seq[Any](/*56.68*/instrumento/*56.79*/.getNome())),format.raw/*56.89*/("""</option>
                        """)))})),format.raw/*57.26*/("""
                    </select>

                    <label for="estilos"> Estilos: </label>
                    <select name="estilos" id="inputestilos" class="form-control" multiple = "multiple" >
                    """),_display_(Seq[Any](/*62.22*/for(estilo <- estilos) yield /*62.44*/ {_display_(Seq[Any](format.raw/*62.46*/("""
                        <option value=""""),_display_(Seq[Any](/*63.41*/estilo/*63.47*/.getId())),format.raw/*63.55*/(""""> """),_display_(Seq[Any](/*63.59*/estilo/*63.65*/.getNome())),format.raw/*63.75*/("""</option>
                    """)))})),format.raw/*64.22*/("""
                    </select>

                    <label for="noestilos"> Estilos que nao gosta: </label>
                    <select name="noestilos" id="inputinoestilos" class="form-control" multiple = "multiple" >
                    """),_display_(Seq[Any](/*69.22*/for(estilo <- noestilos) yield /*69.46*/ {_display_(Seq[Any](format.raw/*69.48*/("""
                        <option value=""""),_display_(Seq[Any](/*70.41*/estilo/*70.47*/.getId())),format.raw/*70.55*/(""""> """),_display_(Seq[Any](/*70.59*/estilo/*70.65*/.getNome())),format.raw/*70.75*/("""</option>
                    """)))})),format.raw/*71.22*/("""
                    </select>





                    <label for="bandaocasional">Formar banda ou tocar ocasionalmente?</label>
                    <input type="text" name="bandaocasional" id="inputOcasional" class="form-control"required="required">

                    <label for="formascontato">Formas de Contato: Email e/ou Facebook</label>
                    <input type="text" name="formascontato" id="inputContato" class="form-control"required="required">

                    <label for="chave">Chave de segurança: Apenas numeros</label>
                    <input type="text" name="chave" id="inputchave" class="form-control"required="required">

                    <input type="submit" class="btn btn-primary" value="Create">
                </form>
            </div>

        </div>

        <button target="_blank" id="Clique" align="center">criar novo anúncio</button>




    	<div class="col-sm-50">
        <h2 class="text-center">"""),_display_(Seq[Any](/*99.34*/contador)),format.raw/*99.42*/(""" Anuncio(s) foram finalizados</h2>
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Titulo </th>
                            <th>Descrição </th>
                            <th>Localização </th>
                            <th>Instrumentos tocados</th>
                            <th>Estilos Musicais</th>
                            <th>Estilos não aceitos</th>
                            <th>Banda ocasional</th>
                            <th>formas de contato</th>
                            <th>Data da postagem</th>
                            <th>Pergunta</th>
                            <th>Resposta</th>
                        </tr>
                    </thead>
                    <tbody>

                        """),_display_(Seq[Any](/*119.26*/for(anuncio <- anuncios) yield /*119.50*/ {_display_(Seq[Any](format.raw/*119.52*/("""
                            <tr>

                            <td>"""),_display_(Seq[Any](/*122.34*/anuncio/*122.41*/.getNome())),format.raw/*122.51*/("""</td>
                            <td>"""),_display_(Seq[Any](/*123.34*/anuncio/*123.41*/.getDescricao())),format.raw/*123.56*/("""</td>
                            <td>"""),_display_(Seq[Any](/*124.34*/anuncio/*124.41*/.getLocalizacao())),format.raw/*124.58*/("""</td>
                            <td>"""),_display_(Seq[Any](/*125.34*/for(anuncios <- anuncio.getInstrumento()) yield /*125.75*/ {_display_(Seq[Any](format.raw/*125.77*/("""
                                <p> """),_display_(Seq[Any](/*126.38*/anuncios/*126.46*/.getNome())),format.raw/*126.56*/("""</p>
                            """)))})),format.raw/*127.30*/("""</td>
                            <td>"""),_display_(Seq[Any](/*128.34*/for(estilos <- anuncio.getEstilos()) yield /*128.70*/ {_display_(Seq[Any](format.raw/*128.72*/("""
                                <p> """),_display_(Seq[Any](/*129.38*/estilos/*129.45*/.getNome())),format.raw/*129.55*/("""</p>
                            """)))})),format.raw/*130.30*/("""</td>
                            <td>"""),_display_(Seq[Any](/*131.34*/for(estilosng <- anuncio.getNoestilo()) yield /*131.73*/ {_display_(Seq[Any](format.raw/*131.75*/("""
                                <p> """),_display_(Seq[Any](/*132.38*/estilosng/*132.47*/.getNome())),format.raw/*132.57*/("""</p>
                            """)))})),format.raw/*133.30*/("""</td>


                            <td>"""),_display_(Seq[Any](/*136.34*/anuncio/*136.41*/.getBandaocasional())),format.raw/*136.61*/("""</td>
                            <td>"""),_display_(Seq[Any](/*137.34*/anuncio/*137.41*/.getFormascontato())),format.raw/*137.60*/("""</td>
                            <td>"""),_display_(Seq[Any](/*138.34*/anuncio/*138.41*/.getHoje().getDayOfMonth())),format.raw/*138.67*/(""" / """),_display_(Seq[Any](/*138.71*/anuncio/*138.78*/.getHoje().getMonthValue())),format.raw/*138.104*/(""" / """),_display_(Seq[Any](/*138.108*/anuncio/*138.115*/.getHoje().getYear())),format.raw/*138.135*/("""</td>
                            <td>"""),_display_(Seq[Any](/*139.34*/anuncio/*139.41*/.getResposta())),format.raw/*139.55*/("""</td>

                        </tr>
                    """)))})),format.raw/*142.22*/("""
                    </tbody>
                </table>
            </div>
        </div>















		<div class="col-sm-15">

            <div class="col-sm-5">
        <h2>Marca Anuncio como finalizado</h2>
        <form action="/anuncios/RemoveAnuncio" method="get">
            <select name="anuncio" id="inputAnuncio" class="form-control">
                <option value="" disabled>-- Select One --</option>
                """),_display_(Seq[Any](/*169.18*/for(anuncio <- anuncios) yield /*169.42*/ {_display_(Seq[Any](format.raw/*169.44*/("""
                    <option value=""""),_display_(Seq[Any](/*170.37*/anuncio/*170.44*/.getId())),format.raw/*170.52*/(""""> """),_display_(Seq[Any](/*170.56*/anuncio/*170.63*/.getNome())),format.raw/*170.73*/("""</option>
                """)))})),format.raw/*171.18*/("""
            </select>
            <label for="nome"> Chave: </label>
            <input type="text" name="nome" id="inputnome" class="form-control"required="required">
            <input type="submit" class="btn btn-primary" value="ok">


        </form>
</div>

            <div class="col-sm-5">
                <h2>Perguntar ao Anunciante</h2>
                <form action="/anuncios/Pergunta" method="get">
                    <select name="anuncio" id="inputAnuncio" class="form-control">
                        <option value="" disabled>-- Select One --</option>
                        """),_display_(Seq[Any](/*186.26*/for(anuncio <- anuncios) yield /*186.50*/ {_display_(Seq[Any](format.raw/*186.52*/("""
                            <option value=""""),_display_(Seq[Any](/*187.45*/anuncio/*187.52*/.getId())),format.raw/*187.60*/(""""> """),_display_(Seq[Any](/*187.64*/anuncio/*187.71*/.getNome())),format.raw/*187.81*/("""</option>
                        """)))})),format.raw/*188.26*/("""
                    </select>
                    <label for="pergunta">Pergunta : </label>
                    <input type="text" name="pergunta" id="inputpergunta" class="form-control"required="required">
                    <input type="submit" class="btn btn-primary" value="ok">


                </form>
            </div>

            <div class="col-sm-5">
                <h2>Responder a pergunta:</h2>
                <form action="/anuncios/RemoveAnuncio" method="get">
                    <select name="anuncio" id="inputAnuncio" class="form-control">
                        <option value="" disabled>-- Select One --</option>
                        """),_display_(Seq[Any](/*203.26*/for(anuncio <- anuncios) yield /*203.50*/ {_display_(Seq[Any](format.raw/*203.52*/("""
                            <option value=""""),_display_(Seq[Any](/*204.45*/anuncio/*204.52*/.getId())),format.raw/*204.60*/(""""> """),_display_(Seq[Any](/*204.64*/anuncio/*204.71*/.getNome())),format.raw/*204.81*/("""</option>
                        """)))})),format.raw/*205.26*/("""
                    </select>
                    <label for="nome"> Chave: </label>
                    <input type="text" name="nome" id="inputnome" class="form-control"required="required">
                    <input type="submit" class="btn btn-primary" value="ok">


                </form>
            </div>





        </div>


    </div>


    </body>
</html>



<ul>
    
</ul>

    
"""))}
    }
    
    def render(anuncios:List[Anuncio],contador:Integer,instrumentos:List[Instrumento],estilos:List[Estilo],noestilos:List[Noestilo]): play.api.templates.HtmlFormat.Appendable = apply(anuncios)(contador)(instrumentos)(estilos)(noestilos)
    
    def f:((List[Anuncio]) => (Integer) => (List[Instrumento]) => (List[Estilo]) => (List[Noestilo]) => play.api.templates.HtmlFormat.Appendable) = (anuncios) => (contador) => (instrumentos) => (estilos) => (noestilos) => apply(anuncios)(contador)(instrumentos)(estilos)(noestilos)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 05 00:05:23 BRT 2015
                    SOURCE: /home/lucasmdm/java/play-bd-e-testes-master/app/views/index.scala.html
                    HASH: 8e79f89d5c3b986077e7357b2d7e9e2886a24729
                    MATRIX: 835->1|1057->128|1938->981|1967->982|2029->1016|2058->1017|2128->1060|2156->1061|2186->1064|2214->1065|2306->1129|2335->1130|2393->1161|2422->1162|2664->1368|2679->1374|2726->1399|3557->2194|3605->2226|3645->2228|3726->2273|3746->2284|3776->2292|3816->2296|3836->2307|3868->2317|3935->2352|4190->2571|4228->2593|4268->2595|4345->2636|4360->2642|4390->2650|4430->2654|4445->2660|4477->2670|4540->2701|4816->2941|4856->2965|4896->2967|4973->3008|4988->3014|5018->3022|5058->3026|5073->3032|5105->3042|5168->3073|6157->4026|6187->4034|7088->4898|7129->4922|7170->4924|7275->4992|7292->4999|7325->5009|7401->5048|7418->5055|7456->5070|7532->5109|7549->5116|7589->5133|7665->5172|7723->5213|7764->5215|7839->5253|7857->5261|7890->5271|7957->5305|8033->5344|8086->5380|8127->5382|8202->5420|8219->5427|8252->5437|8319->5471|8395->5510|8451->5549|8492->5551|8567->5589|8586->5598|8619->5608|8686->5642|8764->5683|8781->5690|8824->5710|8900->5749|8917->5756|8959->5775|9035->5814|9052->5821|9101->5847|9142->5851|9159->5858|9209->5884|9251->5888|9269->5895|9313->5915|9389->5954|9406->5961|9443->5975|9534->6033|10005->6467|10046->6491|10087->6493|10161->6530|10178->6537|10209->6545|10250->6549|10267->6556|10300->6566|10360->6593|10993->7189|11034->7213|11075->7215|11157->7260|11174->7267|11205->7275|11246->7279|11263->7286|11296->7296|11364->7331|12067->7997|12108->8021|12149->8023|12231->8068|12248->8075|12279->8083|12320->8087|12337->8094|12370->8104|12438->8139
                    LINES: 26->1|29->1|48->20|48->20|49->21|49->21|51->23|51->23|52->24|52->24|56->28|56->28|58->30|58->30|71->43|71->43|71->43|83->55|83->55|83->55|84->56|84->56|84->56|84->56|84->56|84->56|85->57|90->62|90->62|90->62|91->63|91->63|91->63|91->63|91->63|91->63|92->64|97->69|97->69|97->69|98->70|98->70|98->70|98->70|98->70|98->70|99->71|127->99|127->99|147->119|147->119|147->119|150->122|150->122|150->122|151->123|151->123|151->123|152->124|152->124|152->124|153->125|153->125|153->125|154->126|154->126|154->126|155->127|156->128|156->128|156->128|157->129|157->129|157->129|158->130|159->131|159->131|159->131|160->132|160->132|160->132|161->133|164->136|164->136|164->136|165->137|165->137|165->137|166->138|166->138|166->138|166->138|166->138|166->138|166->138|166->138|166->138|167->139|167->139|167->139|170->142|197->169|197->169|197->169|198->170|198->170|198->170|198->170|198->170|198->170|199->171|214->186|214->186|214->186|215->187|215->187|215->187|215->187|215->187|215->187|216->188|231->203|231->203|231->203|232->204|232->204|232->204|232->204|232->204|232->204|233->205
                    -- GENERATED --
                */
            