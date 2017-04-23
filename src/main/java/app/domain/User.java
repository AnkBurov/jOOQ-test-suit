package app.domain;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "user")
public class User {

    @Column(name = "id", table = "user")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "id", table = "category")
    private Long secondId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getSecondId() {
        return secondId;
    }

    public void setSecondId(Long secondId) {
        this.secondId = secondId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", categoryId=" + categoryId +
                ", secondId=" + secondId +
                '}';
    }
}
