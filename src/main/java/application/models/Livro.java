//importando os pacotes de caracteristicas para o livro

package application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livros")  //Criando a tabela no banco de dados
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   //Criando o codigo do livro id automático
    private String titulo; //Criando o titulo do livro

    public int getId() {   //Usando Set e Get (inserindo e vizualizando dados do livro)
        return id;
    }
    public void setId(int id) { 
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    
}
