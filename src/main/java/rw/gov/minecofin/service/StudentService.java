package rw.gov.minecofin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rw.gov.minecofin.model.Student;
import rw.gov.minecofin.repository.StudentRepository;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Transactional
    public Student getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Transactional
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Transactional
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id);
        if (student != null) {
            studentRepository.delete(student);
        }
    }
}
