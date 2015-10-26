package controllers;

import models.Anuncio;
import models.Estilo;
import models.Instrumento;
import models.Noestilo;
import models.dao.GenericDAO;
import play.Logger;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Controlador Principal do Sistema
 */
public class Application extends Controller {
	private static Form<Anuncio> anuncioForm = Form.form(Anuncio.class);
	private static final GenericDAO dao = new GenericDAO();
    private static Integer contador = 15;

	public static Result index() {
		return redirect(routes.Application.anuncio());
	}

	/*
	 * A Anotação transactional é necessária em todas as Actions que
	 * usarem o BD.
	 */
	@Transactional
	public static Result anuncio() {
		// Todos os Livros do Banco de Dados
		List<Anuncio> result = dao.findAllByClass(Anuncio.class);
		List<Instrumento> instrumento = dao.findAllByClass(Instrumento.class);
		List<Estilo> estilo = dao.findAllByClass(Estilo.class);
		List<Noestilo> noestilo = dao.findAllByClass(Noestilo.class);

		boolean houveTroca = true;
		Anuncio temp;
		while(houveTroca){
			houveTroca = false;
			for(int i = 0; i < result.size() -1; i++){
				if(result.get(i).getHoje().isAfter(result.get(i+1).getHoje())){
					temp = result.get(i);
					result.set(i,result.get(i+1) );
					result.set(i+1, temp);
					houveTroca = true;
				}
			}
		}

		return ok(views.html.index.render(result, contador, instrumento, estilo, noestilo));
	}

	@Transactional
	public static Result newAnuncio() {
		// O formulário dos Livros Preenchidos
		Form<Anuncio> filledForm = anuncioForm.bindFromRequest();

		if (filledForm.hasErrors()) {
            List<Anuncio> result = dao.findAllByClass(Anuncio.class);
			List<Instrumento> instrumento = dao.findAllByClass(Instrumento.class);
			List<Estilo> estilo = dao.findAllByClass(Estilo.class);
			List<Noestilo> noestilo = dao.findAllByClass(Noestilo.class);
            //TODO falta colocar na interface mensagem de erro.
			return badRequest(views.html.index.render(result, contador, instrumento, estilo, noestilo));
		} else {
            Anuncio novoAnuncio = filledForm.get();
            Logger.debug("Criando ANUNCIO: " + filledForm.data().toString() + " como " + novoAnuncio.getNome());
            novoAnuncio.setInstrumento(getInstrumentosSelecionados());
            novoAnuncio.setEstilos(getEstilosSelecionados());
			novoAnuncio.setNoestilo(getEstilosNGSelecionados());
			//novoAnuncio.setEstilosnaogosta(getEstilosnaogostaSelecionados());
			// Persiste o Livro criado
			dao.persist(novoAnuncio);
			// Espelha no Banco de Dados
			dao.flush();
            /*
             * Usar routes.Application.<uma action> é uma forma de
             * evitar colocar rotas literais (ex: "/books")
             * hard-coded no código. Dessa forma, se mudamos no
             * arquivo routes, continua funcionando.
             */
			return redirect(routes.Application.anuncio());
		}
	}

	@Transactional
	public static Result RemoveAnuncio(Long id, String nome) {


		Anuncio anunciolista = dao.findByEntityId(Anuncio.class, id);
		if (anunciolista.getChave().equals(nome)){
			anunciolista.setEstilos(null);
			anunciolista.setNoestilo(null);
			anunciolista.setInstrumento(null);
			dao.removeById(Anuncio.class, id);
			dao.flush();

			 contador = contador +1;
			return redirect(routes.Application.anuncio());
		}
		else {
			List<Anuncio> result = dao.findAllByClass(Anuncio.class);
			List<Instrumento> instrumento = dao.findAllByClass(Instrumento.class);
			List<Estilo> estilo = dao.findAllByClass(Estilo.class);
			List<Noestilo> noestilo = dao.findAllByClass(Noestilo.class);
			//TODO falta colocar na interface mensagem de erro.
			return badRequest(views.html.index.render(result, contador, instrumento, estilo, noestilo));
		}
	}

	@Transactional
	private static List<Instrumento> getInstrumentosSelecionados(){
		List<Instrumento> instrumentos = new ArrayList<Instrumento>();
		//pega todos os elementos da pag
		Map<String,String[]> map = request().body().asFormUrlEncoded();
		String[] recuperaInstrumentos = map.get("instrumentos");

		if(recuperaInstrumentos != null){
			List<String> idInstrumentos = Arrays.asList(recuperaInstrumentos);
			for(String id : idInstrumentos){
				Long idInstrumento = Long.parseLong(id);
				Instrumento instrumento = dao.findByEntityId(Instrumento.class, idInstrumento);
				if(instrumento != null) {
					instrumentos.add(instrumento);
				}
			}
		}
		return instrumentos;
	}
	@Transactional
	private static List<Estilo> getEstilosSelecionados(){
		List<Estilo> estilos = new ArrayList<Estilo>();
		//pega todos os elementos da pag
		Map<String,String[]> map = request().body().asFormUrlEncoded();
		String[] recuperaEstilos = map.get("estilos");

		if(recuperaEstilos != null){
			List<String> idEstilos = Arrays.asList(recuperaEstilos);
			for(String id : idEstilos){
				Long idEstilo = Long.parseLong(id);
				Estilo estilo = dao.findByEntityId(Estilo.class, idEstilo);
				if(estilo != null) {
					estilos.add(estilo);
				}
			}
		}
		return estilos;
	}


	@Transactional
	private static List<Noestilo> getEstilosNGSelecionados(){
		List<Noestilo> estilos = new ArrayList<Noestilo>();
		//pega todos os elementos da pag
		Map<String,String[]> map = request().body().asFormUrlEncoded();
		String[] recuperaEstilos = map.get("noestilos");

		if(recuperaEstilos != null){
			List<String> idEstilos = Arrays.asList(recuperaEstilos);
			for(String id : idEstilos){
				Long idEstilo = Long.parseLong(id);
				Noestilo estilo = dao.findByEntityId(Noestilo.class, idEstilo);
				if(estilo != null) {
					estilos.add(estilo);
				}
			}
		}
		return estilos;
	}

    @Transactional
	public static Result Pergunta(long id, String pergunta) {
		Anuncio anunciolista = dao.findByEntityId(Anuncio.class, id);
		List<Instrumento> instrumento = dao.findAllByClass(Instrumento.class);
		List<Estilo> estilo = dao.findAllByClass(Estilo.class);
		List<Noestilo> noestilo = dao.findAllByClass(Noestilo.class);
		anunciolista.setPergunta(pergunta);
		dao.flush();
		List<Anuncio> result = dao.findAllByClass(Anuncio.class);

		return redirect(routes.Application.anuncio());
	}

	public static Integer getContador() {
		return contador;
	}

	public static void setContador(Integer contador) {
		Application.contador = contador;
	}
}
