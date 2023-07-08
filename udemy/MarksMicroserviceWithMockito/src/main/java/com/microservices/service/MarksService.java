package com.microservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.util.json.JSONParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.microservices.entity.Marks;
import com.microservices.entity.StatusReasonRecord;
import com.microservices.repository.MarksRepo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



@Service("MarksService")
public class MarksService implements IMarksService {
	
	public static JSONArray jsonArray=null;
	public static DecimalFormat decimalFormat=new DecimalFormat("00");
	public LocalDate startdt; 
	
	
	
	
	public MarksService(MarksRepo rep) {
		super();
		this.rep = rep;
	}

	@Autowired
	@Qualifier("MarksRepository")
	MarksRepo rep;

	@Override
	public Marks addNewMarks(Marks marks) {
		// TODO Auto-generated method stub
		return rep.save(marks);
	}

	@Override
	public List<Marks> getAllMarks() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}
	
	public int getLengthofAllMarks() {
		return rep.findAll().size();
	}

	@Override
	public Marks updateMarksDetails(Marks marks) {
		// TODO Auto-generated method stub
		Marks existingMarks=rep.findById(marks.getmId()).get();
		existingMarks.setTamil(marks.getTamil());
		existingMarks.setEnglish(marks.getEnglish());
		existingMarks.setMaths(marks.getMaths());
		existingMarks.setScience(marks.getScience());
		existingMarks.setSocial(marks.getSocial());
		Marks updatedMarks=rep.save(existingMarks);
		return updatedMarks;
	}

	@Override
	public void removeMarksDetails(int id) {
		// TODO Auto-generated method stub
		rep.deleteById(id);
	}

	@Override
	public Marks getMarksByid(int id) {
		// TODO Auto-generated method stub
		return rep.findById(id).get();
	}
	
	
	@Override
	public List<Marks> getMarksOfPassedStudents() {
		List<Marks> passedMarks = new ArrayList<Marks>();
		List<Marks> marks=rep.findAll();
		for(int i=0;i<marks.size();i++) {
			if(marks.get(i).getTamil()>=35 && marks.get(i).getEnglish()>=35 && marks.get(i).getMaths()>=35 && marks.get(i).getScience()>=35 && marks.get(i).getSocial()>=35) {
				passedMarks.add(marks.get(i));
			}else {
				continue;
			}
		}
		return passedMarks;
		
	}
	
	@Override
	public Marks getPassedMarksByid(int id) {
		// TODO Auto-generated method stub
		List<Marks> passedMark=getMarksOfPassedStudents();
		for(int i=0;i<passedMark.size();i++) {
			if(passedMark.get(i).getmId()==id) {
				return passedMark.get(i);
			}else {
				return null;
			}
		}
		return null;
		
	}
	
	
	public JSONArray getStatusReasonCombination() throws JSONException, FileNotFoundException, IOException  {
		
		String loc= new String("C:/Users/mohamed aslam/Desktop/JSONExample.json");
		File file=new File(loc);
		String content=new String(Files.readAllBytes(Paths.get(file.toURI())));
		JSONObject jo = new JSONObject(content);
        jsonArray=jo.getJSONArray("statusReasonCombination");
        return  jsonArray;
        
	}
	
	
	public void setStatusReasonCombinations() throws FileNotFoundException, JSONException, IOException {
		JSONArray statusList=getStatusReasonCombination();
		Marks marks=new Marks();
		
		if(statusList!=null) {
			String statusReasons=getStatusReasons();
			marks.setC3StatusCodes(statusReasons);
		}
		
		System.out.println(marks.getC3StatusCodes());
		
	}
	
	
	public  String getStatus(int aindex) throws JSONException {
		//System.out.println(jsonArray);
		String value=null;
		if(jsonArray!=null) {
			JSONObject statusReason=(JSONObject)jsonArray.get(aindex);
			value=statusReason.get("status").toString();
			//System.out.println("value of status = "+value);
			
		}
		return value;
	}
	
	public  String getReason(int aindex) throws JSONException {
		//System.out.println(jsonArray);
		
		String value=null;
		if(jsonArray!=null) {
			JSONObject statusReason=(JSONObject) jsonArray.get(aindex);
			value=statusReason.get("reason").toString();
			
		}
		return value;
	}
	
	public  String getStatusReasons() throws JSONException {
		String statusReasons="";
		for(int i=0;i<jsonArray.length();i++) {
			if(i>0)
				statusReasons+=",";
			statusReasons+=getStatus(i);
			statusReasons+=getReason(i);
		}
		return statusReasons;
		
	}
	
	public void getCardWatchStartDate() throws JSONException {
		int index=0;
		
		if(jsonArray!=null) {
			JSONObject jsonObject=(JSONObject) jsonArray.get(index);
			System.out.println("Extracted json object ="+jsonObject);
			JSONObject value=(JSONObject) jsonObject.get("cardWatchEndDate");
			System.out.println("CardWatchEndDate= "+value);
			int month=(int) value.get("month");
			System.out.println("Month = "+month);
			int year=(int) value.get("year");
			System.out.println("year = "+year);
			int day=(int) value.get("day");
			System.out.println("day = "+day);
			Date date=new Date(year, month, day);
			String convertedDate=dateToString(date);
			System.out.println(date);
			System.out.println("Converted Date: "+ convertedDate);
			//return dateToString(date);
		}
		//return null;
	}

	private String dateToString(Date date) {
		// TODO Auto-generated method stub
		String dateString=null;
		if(date.getYear()!=0) {
			dateString=Integer.toString(date.getYear());
			dateString+=decimalFormat.format(date.getMonth());
			dateString+=decimalFormat.format(date.getDay());
		}
		return dateString;
		
	}
	
	public void testCPS() throws FileNotFoundException, JSONException, IOException{
		
		JSONArray statusList=getStatusReasonCombination();
		List<StatusReasonRecord> statusReasonRecords=new ArrayList<>();
		for(int i=0;i<statusList.length();i++) {
			StatusReasonRecord statusReasonRecord=new StatusReasonRecord();
			String status=getStatus(i);
			String reason=getReason(i);
			statusReasonRecord.setStatus(status);
			statusReasonRecord.setReason(reason);
			statusReasonRecords.add(statusReasonRecord);
		}
		
		for(int i=0;i<statusReasonRecords.size();i++) {
			System.out.println(statusReasonRecords.get(i));
		}
		
		
	}
	
	public void testCustCPS() throws FileNotFoundException, JSONException, IOException {
		
		JSONArray statusList=getStatusReasonCombination();
		JSONObject homePhone=null;
			JSONObject custdet=(JSONObject) jsonArray.get(0);
			homePhone=custdet.getJSONObject("homePhone");
			System.out.println(homePhone);
			String areaCode=(String) homePhone.get("areaCode");
			System.out.println(areaCode);
		
		
		
	}
	public void setStartDate(String adate) {
		this.startdt=LocalDate.of(Short.parseShort(adate.substring(0,4)),Short.parseShort(adate.substring(4,6)),Short.parseShort(adate.substring(6,8)));
		System.out.println(startdt);
	}
	

	
	
	
	
	
	

}
