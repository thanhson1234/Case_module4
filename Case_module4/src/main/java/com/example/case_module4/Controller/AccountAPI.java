package com.example.case_module4.Controller;

import com.example.case_module4.Model.Account;
import com.example.case_module4.Model.ClassRoom;
import com.example.case_module4.Model.dto.ClassDto;
import com.example.case_module4.Model.dto.UserToken;
import com.example.case_module4.Repository.IAccountRepo;
import com.example.case_module4.Repository.IClassRepo;
import com.example.case_module4.Service.AccountSecive;
import com.example.case_module4.Service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class AccountAPI {
    @Autowired
    IAccountRepo iAccountRepo;
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtService jwtService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AccountSecive accountSecive;

    @Autowired
    IClassRepo iClassRepo;


    @PostMapping("/login")
    public ResponseEntity<UserToken> login(@RequestBody Account account) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(account.getEMail(), account.getPassWord()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        Account account1 = iAccountRepo.findByEMailName(account.getEMail());
        String token = jwtService.generateTokenLogin(authentication);
        UserToken userToken = new UserToken(account.getEMail(), token, account1.getRoles());
        return new ResponseEntity<>(userToken, HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody Account account) {
        String pass = passwordEncoder.encode(account.getPassWord());
        account.setPassWord(pass);
        iAccountRepo.save(account);


        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @DeleteMapping("/account/{id}")
    public void delete(@PathVariable Long id) {

        iAccountRepo.deleteById(id);
    }


    @GetMapping("/account/{id}")
    public ResponseEntity<Account> edit(@PathVariable Long id) {
        return new ResponseEntity<>(iAccountRepo.findById(id).get(), HttpStatus.OK);
    }


    @PostMapping("/account/edit")
    public ResponseEntity<Account> update(@RequestBody Account account) {
        String pass = passwordEncoder.encode(account.getPassWord());
        account.setPassWord(pass);
        return new ResponseEntity<>(iAccountRepo.save(account), HttpStatus.OK);
    }

    @GetMapping("/class")
    public ResponseEntity<List<ClassRoom>> classAccount() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Account account = accountSecive.returnAccount(userDetails.getUsername());
        List<ClassRoom> classes = accountSecive.getAllClass(account.getEMail());
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }


    @GetMapping("/classall")
    public ResponseEntity<List<ClassRoom>> classAll() {
        List<ClassRoom> classes = accountSecive.classAll();
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<ClassDto> AllStudent(@PathVariable long id) {
        ClassRoom classRoom = iClassRepo.findByIdClass(id);
        ClassDto classDto = accountSecive.StudentClass(classRoom.getName_Class());
        return new ResponseEntity<>(classDto, HttpStatus.OK);
    }


}
