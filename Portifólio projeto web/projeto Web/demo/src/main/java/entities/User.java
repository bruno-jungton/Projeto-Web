package entities;
import java.util.Objects;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


public class User {
	private int id;
    private String nome;
    private String email;
    private String telefone;
    private String password;
}

public User(int id, String nome, String email, String telefone, String password) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.password = password;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public int hashCode() {
    return Objects.hash(id, nome, email, telefone, password);
}

public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    User usuario = (User) obj;
    return id == usuario.id &&
           Objects.equals(nome, usuario.nome) &&
           Objects.equals(email, usuario.email) &&
           Objects.equals(telefone, usuario.telefone) &&
           Objects.equals(password, usuario.password);
}

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String password;
}
