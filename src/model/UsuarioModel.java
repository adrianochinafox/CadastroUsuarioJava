package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author adrianoabrantesdeandrade
 */
@Entity
@SequenceGenerator(name = "ID_SEQ", sequenceName = "ID", initialValue = 1, allocationSize = 1)
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ID_SEQ")
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.equals("Nome") || nome.isEmpty()) {
            return false;
        } else {
            this.nome = nome;
            return true;
        }

    }

}
