package models;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Entidade que representa um Livro
// Referenciar a uma tabela
@Entity(name = "Anuncio")
public class Anuncio{

	// Todo Id tem que ter o GeneratedValue a não ser que ele seja setado
	// Usar Id sempre Long
	@Id
	@GeneratedValue
	private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
	private List<Noestilo> noestilo;
   @ManyToMany(cascade = CascadeType.ALL)
   private List<Instrumento> instrumento;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Estilo> estilos;


	@Column
	private String nome, descricao, localizacao, bandaocasional, formascontato,
			 chave, pergunta, resposta;
	@Column
	private LocalDate hoje;


	// Construtor vazio para o Hibernate criar os objetos
	public Anuncio() {
		this.instrumento = new ArrayList<Instrumento>();
		this.estilos = new ArrayList<Estilo>();
        this.noestilo = new ArrayList<Noestilo>();
		this.hoje = LocalDate.now();

	}

    public Anuncio(String nome, String descricao, String localizacao,String bandaocasional, String formascontato, String chave) {
        this();
        this.nome = nome;
		this.bandaocasional= bandaocasional;
		this.descricao =descricao;
		this.formascontato=formascontato;
		this.localizacao = localizacao;
		this.chave = chave;
		this.hoje = LocalDate.now();
    }






	public String getDescricao() {
		return descricao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public String getBandaocasional() {
		return bandaocasional;
	}

	public String getFormascontato() {
		return formascontato;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void setBandaocasional(String bandaocasional) {
		this.bandaocasional = bandaocasional;
	}

	public void setFormascontato(String formascontato) {
		this.formascontato = formascontato;
	}

	public String getNome() {
		return nome;
	}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
		return id;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public List<Instrumento> getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(List<Instrumento> instrumento) {
		this.instrumento = instrumento;
	}



	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public List<Estilo> getEstilos() {
		return estilos;
	}

	public void setEstilos(List<Estilo> estilos) {
		this.estilos = estilos;
	}



	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Anuncio)) {
			return false;
		}
		Anuncio outroAnuncio = (Anuncio) obj;
		return Objects.equal(outroAnuncio.getNome(), this.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.getNome());
	}

	public List<Noestilo> getNoestilo() {
		return noestilo;
	}

	public void setNoestilo(List<Noestilo> noestilo) {
		this.noestilo = noestilo;
	}

	public void setId(long id) {
        this.id = id;
    }

	public LocalDate getHoje() {
		return hoje;
	}



	public void setHoje(LocalDate hoje) {
		this.hoje = hoje;
	}
}
