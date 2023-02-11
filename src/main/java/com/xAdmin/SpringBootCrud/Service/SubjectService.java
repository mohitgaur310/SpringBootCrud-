package com.xAdmin.SpringBootCrud.Service;

import java.util.List;

import com.xAdmin.SpringBootCrud.bean.Subject;

public interface SubjectService
{	
	public List<Subject> getAllSubjects();
	public void addSubjects(Subject subject);
	public void updateSubjects(String id,Subject subject);
	public void deleteSubject(String id);

}
