package models;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Entidade que representa uma Tabela no Banco de Dados
@Entity
public class Noestilo {

	// Gerador de Sequencia para o Id
	@Id
	@GeneratedValue
	private Long id;

	// Nome do Autor dos Livros
	private String nome;

	// Relação Muitos para Muitos
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	private List<Anuncio> livros;

	// Construtor Vazio para o Hibernate criar os objetos
	public Noestilo() {
		this.livros = new ArrayList<Anuncio>();
	}

    public Noestilo(String nome) {
        this();
        this.nome = nome;
    }

	public List<Anuncio> getLivros() {
		return Collections.unmodifiableList(livros);
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Noestilo)) {
			return false;
		}
		Noestilo outroAutor = (Noestilo) obj;
		return Objects.equal(outroAutor.getNome(), this.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.nome);
	}

    public void addLivro(Anuncio anuncio) {
        this.livros.add(anuncio);
    }
}
