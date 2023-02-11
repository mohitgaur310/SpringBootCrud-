/**
 * 
 */
package com.xAdmin.SpringBootCrud.Service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xAdmin.SpringBootCrud.bean.Subject;
import com.xAdmin.SpringBootCrud.repository.SubjectRepository;

/**
 * @author MohitGaur
 *
 */

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	public SubjectRepository subjectRepo;

	@Override
	public List<Subject> getAllSubjects(){
		List<Subject> subject=new ArrayList<>();
		subjectRepo.findAll().forEach(subject::add);
		return subject;
	}
	
	@Override
	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);	
	}
	@Override
	public void addSubjects(Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
	}                               
	@Override
	public void updateSubjects(String id, Subject subject) {
		subjectRepo.save(subject);
	}


	
}
