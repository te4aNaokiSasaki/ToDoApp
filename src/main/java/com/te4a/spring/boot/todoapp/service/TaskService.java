package com.te4a.spring.boot.todoapp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.te4a.spring.boot.todoapp.domain.entity.Task;
import com.te4a.spring.boot.todoapp.domain.repository.TaskRepository;

@Service
@Transactional
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public List<Task> findAll(){
        return taskRepository.findAll();
    }
    public Task saveAndFlush(Task task){
        return taskRepository.saveAndFlush(task);
    }
}