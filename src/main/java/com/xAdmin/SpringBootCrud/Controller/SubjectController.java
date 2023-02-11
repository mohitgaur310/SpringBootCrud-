package com.xAdmin.SpringBootCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xAdmin.SpringBootCrud.Service.SubjectService;
import com.xAdmin.SpringBootCrud.bean.Subject;

/** 
 * @author MohitGaur
 * 
 * */
@RestController
public class SubjectController {
	@Autowired
	private SubjectService subService;
	
	@GetMapping("/subjects")
	public List<Subject> getAllSubjects(){
	
		return subService.getAllSubjects() ;
	}
	@PostMapping("/AddSubject")
	public void addSubject(@RequestBody Subject subject) {
		subService.addSubjects(subject);
	}
	
	@PutMapping("/UpdateSubject/{id}")
	public void updateSubject(@PathVariable String id ,@RequestBody Subject subject) {
		subService.updateSubjects(id,subject);
	}
	@DeleteMapping("/DeleteSubject/{id}")
	public void deleteSubject(@PathVariable String id) {
		subService.deleteSubject(id);
	}
}
