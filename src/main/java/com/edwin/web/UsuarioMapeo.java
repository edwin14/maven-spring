
package com.edwin.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class UsuarioMapeo {
    
@Id
@Column(name="login")
    private String login;

@Column(name="password")
    private String password;

@Column(name="admin_rol")
    private Character admin_rol;

    public UsuarioMapeo() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.login != null ? this.login.hashCode() : 0);
        hash = 37 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 37 * hash + (this.admin_rol != null ? this.admin_rol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioMapeo other = (UsuarioMapeo) obj;
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password)) {
            return false;
        }
        if (this.admin_rol != other.admin_rol && (this.admin_rol == null || !this.admin_rol.equals(other.admin_rol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsuarioMapeo{" + "login=" + login + ", password=" + password + ", admin_rol=" + admin_rol + '}';
    }

    /**
     * Este constructor inicializa un objeto de tipo usuario a generarse como mapeo a la tabla usuario
     * 
     * @param login Mapeo a la columna login
     * @param password Mapeo a la columna password
     * @param admin_rol Mapeo a la columna admin_rol
     */
    public UsuarioMapeo(String login, String password, Character admin_rol) {
        this.login = login;
        this.password = password;
        this.admin_rol = admin_rol;
    }

    public Character getAdmin_rol() {
        return admin_rol;
    }

    public void setAdmin_rol(Character admin_rol) {
        this.admin_rol = admin_rol;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
