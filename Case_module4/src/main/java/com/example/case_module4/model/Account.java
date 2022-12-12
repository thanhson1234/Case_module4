package com.example.case_module4.model;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_Account;

    private String fullName;
    private String passWord;
    private String gmail;
    private String phone;
    private Date dateOfBirth;
    private String address;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status_hv status_hv;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Class> classe ;

    public long getId_Account() {
        return id_Account;
    }

    public void setId_Account(long id_Account) {
        this.id_Account = id_Account;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Status_hv getStatus_hv() {
        return status_hv;
    }

    public void setStatus_hv(Status_hv status_hv) {
        this.status_hv = status_hv;
    }

    public List<Class> getClasse() {
        return classe;
    }

    public void setClasse(List<Class> classe) {
        this.classe = classe;
    }
}
