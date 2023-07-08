import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JSONReadExample
{
	
	public static JSONArray jsonArray=null;
	public static int size=0;
	
    public static void main(String[] args) throws Exception
    {
        // parsing file "JSONExample.json"
    	
    	Object obj = new JSONParser().parse(new FileReader("C:\\Users\\mohamed aslam\\Desktop\\JSONExample.json"));
        JSONObject jo = (JSONObject) obj;
        
        jsonArray=(JSONArray) jo.get("statusReasonCombination");
         
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
/*
        Iterator iter = jsonArray.iterator();
        String reason = null;
        String status = null;
        List<StatusReasonRecord> statusReasonRecordList=new ArrayList<>();

       while(iter.hasNext()){
           StatusReasonRecord statusReasonRecord=new StatusReasonRecord();

           for(Object o : ((Map) iter.next()).entrySet()){
               Map.Entry pair = (Map.Entry) o;
               
               if(pair.getKey().equals("reason")){
                   reason= (String) pair.getValue();
                   statusReasonRecord.setReason(reason);
                   System.out.println(reason);
               }
               if(pair.getKey().equals("status")){
                   status=(String) pair.getValue();
                   statusReasonRecord.setStatus(status);
                   System.out.println(status);
               }
           }
           statusReasonRecordList.add(statusReasonRecord);
        

       }
       
       

for(int i=0;i<statusReasonRecordList.size();i++){
    System.out.println(statusReasonRecordList.get(i));


}
*/



        // typecasting obj to JSONObject
        //JSONObject jo = (JSONObject) obj;
       // JSONArray jsonArray=(JSONArray) jo.get("customerDetailRecords");
        Iterator itr2 = jsonArray.iterator();


        JSONObject homePhone=null;
        while (itr2.hasNext())
        {
            for (Object o : ((Map) itr2.next()).entrySet()) {
                Map.Entry pair = (Map.Entry) o;
                if(pair.getKey().equals("homePhone")){
                     homePhone=(JSONObject) pair.getValue();
                }
                //System.out.println(pair.getKey() + " : " + pair.getValue());
            }
            System.out.println(homePhone);
            String areaCode= (String) homePhone.get("areaCode");
            System.out.println("AreaCode= "+areaCode);


        }
        
        

 


    }
}