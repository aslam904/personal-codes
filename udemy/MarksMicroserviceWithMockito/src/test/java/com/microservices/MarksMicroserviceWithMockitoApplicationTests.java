package com.microservices;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;


import com.microservices.entity.Marks;
import com.microservices.repository.MarksRepo;
import com.microservices.service.MarksService;

@SpringBootTest
class MarksMicroserviceWithMockitoApplicationTests {

	
	
	
	//Spy test
	@Test
	public void addNewMarks() {
		MarksRepo rep=Mockito.spy(MarksRepo.class);
		MarksService ser= new MarksService(rep);
		
		
		Marks m1=new Marks(1,65,76,87,45,34);
		Marks m2=new Marks(2,75,56,67,35,44);
		Marks m3=new Marks(3,35,26,97,85,54);
		Marks m4=new Marks(4,95,86,57,65,64);
		ser.addNewMarks(m1);
		ser.addNewMarks(m2);
		ser.addNewMarks(m3);
		ser.addNewMarks(m4);
		//ser.addNewMarks(m1);
		
		Mockito.verify(rep,Mockito.times(1)).save(m1);
		Mockito.verify(rep).save(m2);
		Mockito.verify(rep).save(m3);
		Mockito.verify(rep).save(m4);
		
		
	}
	
	
	//Fake test
	@Test
	public void FindLengthOfMarks() {
		MarksRepo rep=Mockito.mock(MarksRepo.class);
		MarksService ser= new MarksService(rep);
		ArrayList<Marks> marks=new ArrayList<Marks>();
		
		Marks m1=new Marks(1,65,76,87,45,34);
		Marks m2=new Marks(2,75,56,67,35,44);
		Marks m3=new Marks(3,35,26,97,85,54);
		Marks m4=new Marks(4,95,86,57,65,64);
		marks.add(m1);
		marks.add(m2);
		marks.add(m3);
		marks.add(m4);

		Mockito.when(rep.findAll()).thenReturn(marks);
		assertEquals(4,ser.getLengthofAllMarks());
		
		
	}
	
	@Test
	public void findById() {
		MarksRepo rep=Mockito.mock(MarksRepo.class);
		MarksService ser= new MarksService(rep);
		int id=1;
		Marks marks=new Marks(id,56,67,78,90,89);
		Mockito.when(rep.findById(id)).thenReturn(Optional.of(marks));
		Marks m=ser.getMarksByid(id);
		assertEquals(marks.getmId(),m.getmId());
		
	}
	
	@Test
	public void getMarksOfPassedStudents() {
		
		MarksRepo rep=Mockito.mock(MarksRepo.class);
		MarksService ser= new MarksService(rep);
		ArrayList<Marks> marks=new ArrayList<Marks>();
		
		Marks m1=new Marks(1,65,76,87,45,34);
		Marks m2=new Marks(2,75,56,67,35,44);
		Marks m3=new Marks(3,35,26,97,85,54);
		Marks m4=new Marks(4,95,86,57,65,64);
		marks.add(m1);
		marks.add(m2);
		marks.add(m3);
		marks.add(m4);
		
		Mockito.when(rep.findAll()).thenReturn(marks);
		List<Marks> passedMarks = ser.getMarksOfPassedStudents();
		
		assertEquals(2,passedMarks.size());
		
		
		
		
		
		
	}
	
	
	
	
		
		

}
