package com.script972.Model;

/**
 * Created by script972 on 27.12.2016.
 */
public class User {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int degree;
    private String position;
    private int rank;
    private String phonenumber;
    private int idSubdivisionPost;
    private String photo;
    private String login;
    private String password;
    private String email;
    private String lastVision;
    private String IPLastVision;

    public User(int id, String surname, String name, String patronymic, int degree, String position, int rank, String phonenumber, int idSubdivisionPost, String photo, String login, String password, String email, String lastVision, String IPLastVision) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.degree = degree;
        this.position = position;
        this.rank = rank;
        this.phonenumber = phonenumber;
        this.idSubdivisionPost = idSubdivisionPost;
        this.photo = photo;
        this.login = login;
        this.password = password;
        this.email = email;
        this.lastVision = lastVision;
        this.IPLastVision = IPLastVision;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", rank='" + rank + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", idSubdivisionPost='" + idSubdivisionPost + '\'' +
                ", photo='" + photo + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", lastVision='" + lastVision + '\'' +
                ", IPLastVision='" + IPLastVision + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getIdSubdivisionPost() {
        return idSubdivisionPost;
    }

    public void setIdSubdivisionPost(int idSubdivisionPost) {
        this.idSubdivisionPost = idSubdivisionPost;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastVision() {
        return lastVision;
    }

    public void setLastVision(String lastVision) {
        this.lastVision = lastVision;
    }

    public String getIPLastVision() {
        return IPLastVision;
    }

    public void setIPLastVision(String IPLastVision) {
        this.IPLastVision = IPLastVision;
    }
}
