package com.example.case_module4.Service;

import com.example.case_module4.Model.Account;
import com.example.case_module4.Model.ClassRoom;
import com.example.case_module4.Model.Roles;
import com.example.case_module4.Model.dto.ClassDto;
import com.example.case_module4.Repository.IAccountRepo;
import com.example.case_module4.Repository.IClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountSecive implements IUserService {
    @Autowired
    IAccountRepo iAccountRepo;

    @Autowired
    IClassRepo iClassRepo;

    @Override
    public List<Account> getAll() {
        return (List<Account>) iAccountRepo.findAll();
    }

    public List<ClassRoom> getAllClass(String email) {
        Account account = iAccountRepo.findByEMailName(email);
        List<ClassRoom> classes = account.getClasse();
        return classes;
    }

    public Account returnAccount(String email) {
        return iAccountRepo.findByEMailName(email);
    }


    @Override
    public void save(Account account) {
        iAccountRepo.save(account);
    }

    @Override
    public void delete(Long id) {
        iAccountRepo.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.findByEMailName(username);
        List<Roles> roles = new ArrayList<>();
        roles.add(account.getRoles());
        return new User(account.getEMail(), account.getPassWord(), roles);
    }

    public List<ClassRoom> classAll() {
        return (List<ClassRoom>) iClassRepo.findAll();
    }

    public ClassDto StudentClass(String nameClass) {
        List<Account> accounts = (List<Account>) iAccountRepo.findAll();
        List<Account> accounts1 = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            for (int j = 0; j < accounts.get(i).getClasse().size(); j++) {
                if (accounts.get(i).getClasse().get(j).getName_Class().equals(nameClass)) {
                    accounts1.add(accounts.get(i));
                }

            }

        }

        ClassDto classDto = new ClassDto(nameClass, accounts1);
        return classDto;

    }

}
