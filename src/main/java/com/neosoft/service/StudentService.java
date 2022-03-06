package com.neosoft.service;


import com.neosoft.model.Student;
import com.neosoft.dao.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService implements UserDetailsService {

    @Autowired
    private StudentRepository studentRepo;


    @Transactional
    public Student create(Student student) {
        return studentRepo.save(student);
    }

    @Transactional
    public Student getStudent(Integer id) {
        return studentRepo.findById(id).get();
    }

    @Transactional
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
