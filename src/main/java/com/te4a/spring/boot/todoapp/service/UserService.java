package com.te4a.spring.boot.todoapp.service;
import java.util.List;
import com.te4a.spring.boot.todoapp.domain.entity.User;
import com.te4a.spring.boot.todoapp.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User saveAndFlush(User user){
        return userRepository.saveAndFlush(user);
    }
}
