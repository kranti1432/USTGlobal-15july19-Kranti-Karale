package com.dev.Practice1.ManyToMany;

import com.many.dto.Student;
import com.many.dto.University;

public interface MethodForImplementation {
boolean addInformationUniversity(University university);
boolean removeUniversity(University university);
boolean findUniversity(String University ,int priKey);

boolean addInformationStudent(Student student);
boolean removeStudent(Student student);
boolean findStudent(String Student ,int priKey);
}
