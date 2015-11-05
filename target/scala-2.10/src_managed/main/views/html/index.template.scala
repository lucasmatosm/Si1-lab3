
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


        <style type="text/css" media="all">
            #box-toggle """),format.raw/*20.25*/("""{"""),format.raw/*20.26*/("""
            width:500px;
            margin:0 auto;
            text-align:justify;
            font:12px/1.4 Arial, Helvetica, sans-serif;
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/("""
            #box-toggle .tgl """),format.raw/*26.30*/("""{"""),format.raw/*26.31*/("""margin-bottom:30px;"""),format.raw/*26.50*/("""}"""),format.raw/*26.51*/("""
            #box-toggle span """),format.raw/*27.30*/("""{"""),format.raw/*27.31*/("""
            display:block;
            cursor:pointer;
            font-weight:bold;
            font-size:14px;
            color:#c30;
            margin-top:15px;
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""
        </style>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
        <script type="text/javascript">
jQuery.fn.toggleText = function(a,b) """),format.raw/*38.38*/("""{"""),format.raw/*38.39*/("""
return   this.html(this.html().replace(new RegExp("("+a+"|"+b+")"),function(x)"""),format.raw/*39.79*/("""{"""),format.raw/*39.80*/("""return(x==a)?b:a;"""),format.raw/*39.97*/("""}"""),format.raw/*39.98*/("""));
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""

$(document).ready(function()"""),format.raw/*42.29*/("""{"""),format.raw/*42.30*/("""
	$('.tgl').before('<span>Revelar conteúdo</span>');
	$('.tgl').css('display', 'none')
	$('span', '#box-toggle').click(function() """),format.raw/*45.44*/("""{"""),format.raw/*45.45*/("""
		$(this).next().slideToggle('slow')
		.siblings('.tgl:visible').slideToggle('fast');

		$(this).toggleText('Revelar','Esconder')
		.siblings('span').next('.tgl:visible').prev()
		.toggleText('Revelar','Esconder')
	"""),format.raw/*52.2*/("""}"""),format.raw/*52.3*/(""");
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/(""")
</script>

    </head>
    <body>

    <div id="box-toggle">

        <div class="tgl">
            <div class="content">

                <div id="escondido" >

                    <div class="col-sm-4">
                        <h2>Novo Anúncio</h2>

                        <form action=""""),_display_(Seq[Any](/*69.40*/routes/*69.46*/.Application.newAnuncio())),format.raw/*69.71*/("""" method="post">
                            <label for="nome"> Nome: </label>
                            <input type="text" name="nome" id="inputNome" class="form-control"required="required">

                            <label for="descricao"> Descriçao:</label>
                            <input type="text" name="descricao" id="inputDescricao" class="form-control"required="required">

                            <label for="localizacao"> Localização: cidade/bairro </label>
                            <input type="text" name="localizacao" id="inputLocalizacao" class="form-control"required="required">

                            <label for="instrumentos"> Instrumentos: </label>
                            <select name="instrumentos" id="inputinstrumentos" class="form-control" multiple = "multiple" required = "required">
                                """),_display_(Seq[Any](/*81.34*/for(instrumento <- instrumentos) yield /*81.66*/ {_display_(Seq[Any](format.raw/*81.68*/("""
                                <option value=""""),_display_(Seq[Any](/*82.49*/instrumento/*82.60*/.getId())),format.raw/*82.68*/(""""> """),_display_(Seq[Any](/*82.72*/instrumento/*82.83*/.getNome())),format.raw/*82.93*/("""</option>
                                """)))})),format.raw/*83.34*/("""
                            </select>

                            <label for="estilos"> Estilos: </label>
                            <select name="estilos" id="inputestilos" class="form-control" multiple = "multiple" >
                                """),_display_(Seq[Any](/*88.34*/for(estilo <- estilos) yield /*88.56*/ {_display_(Seq[Any](format.raw/*88.58*/("""
                                <option value=""""),_display_(Seq[Any](/*89.49*/estilo/*89.55*/.getId())),format.raw/*89.63*/(""""> """),_display_(Seq[Any](/*89.67*/estilo/*89.73*/.getNome())),format.raw/*89.83*/("""</option>
                                """)))})),format.raw/*90.34*/("""
                            </select>

                            <label for="noestilos"> Estilos que nao gosta: </label>
                            <select name="noestilos" id="inputinoestilos" class="form-control" multiple = "multiple" >
                                """),_display_(Seq[Any](/*95.34*/for(estilo <- noestilos) yield /*95.58*/ {_display_(Seq[Any](format.raw/*95.60*/("""
                                <option value=""""),_display_(Seq[Any](/*96.49*/estilo/*96.55*/.getId())),format.raw/*96.63*/(""""> """),_display_(Seq[Any](/*96.67*/estilo/*96.73*/.getNome())),format.raw/*96.83*/("""</option>
                                """)))})),format.raw/*97.34*/("""
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
        </div>

        <div class="tgl">
            <h2>Conteúdo dois</h2>
            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi eleifend, purus quis laoreet faucibus, ante augue malesuada mi, id rhoncus augue lorem eget elit.</p>
            <p> Duis posuere odio sed velit vulputate venenatis. Suspendisse et dui ac metus auctor fringilla. Curabitur interdum augue a pede.</p>
        </div>

        <div class="tgl">
            <h2>Conteúdo três</h2>
            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi eleifend, purus quis laoreet faucibus, ante augue malesuada mi, id rhoncus augue lorem eget elit.</p>
            <p>Ut sollicitudin sodales purus. Phasellus libero felis, blandit nec, commodo ut, imperdiet ut, nibh. Suspendisse potenti. Donec ullamcorper cursus dolor. Duis vitae ipsum. Maecenas dapibus hendrerit diam. Morbi varius, massa id pretium accumsan, nunc lorem congue libero, ut euismod metus libero id nulla.</p>
        </div>

    </div>
        

    	<div class="col-sm-100">
        <h2 class="text-center">"""),_display_(Seq[Any](/*136.34*/contador)),format.raw/*136.42*/(""" Anúncio(s) foram finalizados</h2>
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

                        """),_display_(Seq[Any](/*156.26*/for(anuncio <- anuncios) yield /*156.50*/ {_display_(Seq[Any](format.raw/*156.52*/("""
                            <tr>

                            <td>"""),_display_(Seq[Any](/*159.34*/anuncio/*159.41*/.getNome())),format.raw/*159.51*/("""</td>
                            <td>"""),_display_(Seq[Any](/*160.34*/anuncio/*160.41*/.getDescricao())),format.raw/*160.56*/("""</td>
                            <td>"""),_display_(Seq[Any](/*161.34*/anuncio/*161.41*/.getLocalizacao())),format.raw/*161.58*/("""</td>
                            <td>"""),_display_(Seq[Any](/*162.34*/for(anuncios <- anuncio.getInstrumento()) yield /*162.75*/ {_display_(Seq[Any](format.raw/*162.77*/("""
                                <p> """),_display_(Seq[Any](/*163.38*/anuncios/*163.46*/.getNome())),format.raw/*163.56*/("""</p>
                            """)))})),format.raw/*164.30*/("""</td>
                            <td>"""),_display_(Seq[Any](/*165.34*/for(estilos <- anuncio.getEstilos()) yield /*165.70*/ {_display_(Seq[Any](format.raw/*165.72*/("""
                                <p> """),_display_(Seq[Any](/*166.38*/estilos/*166.45*/.getNome())),format.raw/*166.55*/("""</p>
                            """)))})),format.raw/*167.30*/("""</td>
                            <td>"""),_display_(Seq[Any](/*168.34*/for(estilosng <- anuncio.getNoestilo()) yield /*168.73*/ {_display_(Seq[Any](format.raw/*168.75*/("""
                                <p> """),_display_(Seq[Any](/*169.38*/estilosng/*169.47*/.getNome())),format.raw/*169.57*/("""</p>
                            """)))})),format.raw/*170.30*/("""</td>


                            <td>"""),_display_(Seq[Any](/*173.34*/anuncio/*173.41*/.getBandaocasional())),format.raw/*173.61*/("""</td>
                            <td>"""),_display_(Seq[Any](/*174.34*/anuncio/*174.41*/.getFormascontato())),format.raw/*174.60*/("""</td>
                            <td>"""),_display_(Seq[Any](/*175.34*/anuncio/*175.41*/.getHoje().getDayOfMonth())),format.raw/*175.67*/(""" / """),_display_(Seq[Any](/*175.71*/anuncio/*175.78*/.getHoje().getMonthValue())),format.raw/*175.104*/(""" / """),_display_(Seq[Any](/*175.108*/anuncio/*175.115*/.getHoje().getYear())),format.raw/*175.135*/("""</td>
                            <td>"""),_display_(Seq[Any](/*176.34*/anuncio/*176.41*/.getResposta())),format.raw/*176.55*/("""</td>

                        </tr>
                    """)))})),format.raw/*179.22*/("""
                    </tbody>
                </table>
            </div>
        </div>















		<div class="col-sm-15">

            <div class="col-sm-5">
        <h2>Marcar Anuncio como finalizado</h2>
        <form action="/anuncios/RemoveAnuncio" method="get">
            <select name="anuncio" id="inputAnuncio" class="form-control">
                <option value="" disabled>-- Select One --</option>
                """),_display_(Seq[Any](/*206.18*/for(anuncio <- anuncios) yield /*206.42*/ {_display_(Seq[Any](format.raw/*206.44*/("""
                    <option value=""""),_display_(Seq[Any](/*207.37*/anuncio/*207.44*/.getId())),format.raw/*207.52*/(""""> """),_display_(Seq[Any](/*207.56*/anuncio/*207.63*/.getNome())),format.raw/*207.73*/("""</option>
                """)))})),format.raw/*208.18*/("""
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
                        """),_display_(Seq[Any](/*223.26*/for(anuncio <- anuncios) yield /*223.50*/ {_display_(Seq[Any](format.raw/*223.52*/("""
                            <option value=""""),_display_(Seq[Any](/*224.45*/anuncio/*224.52*/.getId())),format.raw/*224.60*/(""""> """),_display_(Seq[Any](/*224.64*/anuncio/*224.71*/.getNome())),format.raw/*224.81*/("""</option>
                        """)))})),format.raw/*225.26*/("""
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
                        """),_display_(Seq[Any](/*240.26*/for(anuncio <- anuncios) yield /*240.50*/ {_display_(Seq[Any](format.raw/*240.52*/("""
                            <option value=""""),_display_(Seq[Any](/*241.45*/anuncio/*241.52*/.getId())),format.raw/*241.60*/(""""> """),_display_(Seq[Any](/*241.64*/anuncio/*241.71*/.getNome())),format.raw/*241.81*/("""</option>
                        """)))})),format.raw/*242.26*/("""
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
                    DATE: Wed Oct 28 22:23:25 BRT 2015
                    SOURCE: /home/lucas/SI-LABS/Si1-lab2/app/views/index.scala.html
                    HASH: ff9c3468fcfbf68100a6515eed7bc4414cc0e087
                    MATRIX: 835->1|1057->128|1961->1004|1990->1005|2171->1158|2200->1159|2258->1189|2287->1190|2334->1209|2363->1210|2421->1240|2450->1241|2657->1420|2686->1421|2928->1635|2957->1636|3064->1715|3093->1716|3138->1733|3167->1734|3198->1738|3226->1739|3284->1769|3313->1770|3471->1900|3500->1901|3743->2117|3771->2118|3801->2121|3829->2122|4158->2415|4173->2421|4220->2446|5124->3314|5172->3346|5212->3348|5297->3397|5317->3408|5347->3416|5387->3420|5407->3431|5439->3441|5514->3484|5805->3739|5843->3761|5883->3763|5968->3812|5983->3818|6013->3826|6053->3830|6068->3836|6100->3846|6175->3889|6487->4165|6527->4189|6567->4191|6652->4240|6667->4246|6697->4254|6737->4258|6752->4264|6784->4274|6859->4317|8871->6292|8902->6300|9803->7164|9844->7188|9885->7190|9990->7258|10007->7265|10040->7275|10116->7314|10133->7321|10171->7336|10247->7375|10264->7382|10304->7399|10380->7438|10438->7479|10479->7481|10554->7519|10572->7527|10605->7537|10672->7571|10748->7610|10801->7646|10842->7648|10917->7686|10934->7693|10967->7703|11034->7737|11110->7776|11166->7815|11207->7817|11282->7855|11301->7864|11334->7874|11401->7908|11479->7949|11496->7956|11539->7976|11615->8015|11632->8022|11674->8041|11750->8080|11767->8087|11816->8113|11857->8117|11874->8124|11924->8150|11966->8154|11984->8161|12028->8181|12104->8220|12121->8227|12158->8241|12249->8299|12721->8734|12762->8758|12803->8760|12877->8797|12894->8804|12925->8812|12966->8816|12983->8823|13016->8833|13076->8860|13709->9456|13750->9480|13791->9482|13873->9527|13890->9534|13921->9542|13962->9546|13979->9553|14012->9563|14080->9598|14783->10264|14824->10288|14865->10290|14947->10335|14964->10342|14995->10350|15036->10354|15053->10361|15086->10371|15154->10406
                    LINES: 26->1|29->1|48->20|48->20|53->25|53->25|54->26|54->26|54->26|54->26|55->27|55->27|62->34|62->34|66->38|66->38|67->39|67->39|67->39|67->39|68->40|68->40|70->42|70->42|73->45|73->45|80->52|80->52|81->53|81->53|97->69|97->69|97->69|109->81|109->81|109->81|110->82|110->82|110->82|110->82|110->82|110->82|111->83|116->88|116->88|116->88|117->89|117->89|117->89|117->89|117->89|117->89|118->90|123->95|123->95|123->95|124->96|124->96|124->96|124->96|124->96|124->96|125->97|164->136|164->136|184->156|184->156|184->156|187->159|187->159|187->159|188->160|188->160|188->160|189->161|189->161|189->161|190->162|190->162|190->162|191->163|191->163|191->163|192->164|193->165|193->165|193->165|194->166|194->166|194->166|195->167|196->168|196->168|196->168|197->169|197->169|197->169|198->170|201->173|201->173|201->173|202->174|202->174|202->174|203->175|203->175|203->175|203->175|203->175|203->175|203->175|203->175|203->175|204->176|204->176|204->176|207->179|234->206|234->206|234->206|235->207|235->207|235->207|235->207|235->207|235->207|236->208|251->223|251->223|251->223|252->224|252->224|252->224|252->224|252->224|252->224|253->225|268->240|268->240|268->240|269->241|269->241|269->241|269->241|269->241|269->241|270->242
                    -- GENERATED --
                */
            