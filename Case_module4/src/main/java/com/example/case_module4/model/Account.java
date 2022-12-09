package com.example.case_module4.model;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_Account;

    private String fullName;
    private String passWord;
    private String eMail;
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



}
