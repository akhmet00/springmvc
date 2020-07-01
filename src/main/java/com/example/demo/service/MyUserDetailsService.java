package com.example.demo.service;



import com.example.demo.model.MyUserDetails;
import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Users> users = usersRepository.findByUserName(userName);

        users.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

        return users.map(MyUserDetails::new).get();
    }

}
