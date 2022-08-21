import java.io.*;
import java.util.*;
public class Question {
    static ArrayList<HashMap<String, String>> ls=new ArrayList<>();
    Question(){
        for(int i=0;i<14;i++){
            ls.add(new HashMap<String, String>());
        }
        ls.get(0).put("name"," India's largest city by population");
        ls.get(0).put("option1","Delhi");
        ls.get(0).put("option2","Mumbai");
        ls.get(0).put("option3","Punee");
        ls.get(0).put("option5","Punee");
        ls.get(0).put("option4","Bangalore");
        ls.get(0).put("answer","2");
        ls.get(0).put("money","1000");

        ls.get(1).put("name","India is a federal union comprising twenty-nine states and how many union territories?");
        ls.get(1).put("option1","6");
        ls.get(1).put("option2","7");
        ls.get(1).put("option3","8");
        ls.get(1).put("option4","9");
        ls.get(1).put("answer","2");
        ls.get(1).put("money","2000");


        ls.get(2).put("name","What are the major languages spoken in Andhra Pradesh?");
        ls.get(2).put("option1"," English and Telugu");
        ls.get(2).put("option2","Telugu and Urdu");
        ls.get(2).put("option3","Telugu and Kannada");
        ls.get(2).put("option4","All of the above languages");
        ls.get(2).put("answer","2");
        ls.get(2).put("money","3000");

        ls.get(3).put("name","What is the state flower of Haryana?");
        ls.get(3).put("option1","Lotus");
        ls.get(3).put("option2","Rhododendron");
        ls.get(3).put("option3","Golden Shower");
        ls.get(3).put("option4","Not declared");
        ls.get(3).put("answer","2");
        ls.get(3).put("money","5000");

        ls.get(4).put("name"," Where was the International Conference on 'Yoga for Diabetes' organized from January 4-6, 2017?");
        ls.get(4).put("option1","New Delhi ");
        ls.get(4).put("option2","Jharkhand");
        ls.get(4).put("option3","Jammu and Kashmir");
        ls.get(4).put("option4","Haryana");
        ls.get(4).put("answer","1");
        ls.get(4).put("money","10000");

        ls.get(5).put("name","Name the tower which was lighted up in Tricolour of India on Republic Day, 2017?");
        ls.get(5).put("option1","WTC Towers");
        ls.get(5).put("option2","Jeddah Tower");
        ls.get(5).put("option3","Burj Khalifa");
        ls.get(5).put("option4","Burj Al Arab");
        ls.get(5).put("answer","3");
        ls.get(5).put("money","20000");

        ls.get(6).put("name","Which of the following states is not located in the North?");
        ls.get(6).put("option1","Himachal Pradesh");
        ls.get(6).put("option2","Jharkhand");
        ls.get(6).put("option3","Jammu and Kashmir");
        ls.get(6).put("option4","Haryana");
        ls.get(6).put("answer","2");
        ls.get(6).put("money","40000");

        ls.get(7).put("name", "In what state is the Elephant Falls located?");
        ls.get(7).put("option1", "Meghalaya");
        ls.get(7).put("option2","Mizoram");
        ls.get(7).put("option3","Orissa");
        ls.get(7).put("option4","Manipur");
        ls.get(7).put("answer","2");
        ls.get(7).put("money","80000");

        ls.get(8).put("name","Which state has the largest population?");
        ls.get(8).put("option1","Maharastra");
        ls.get(8).put("option2","Uttar Pradesh");
        ls.get(8).put("option3", "Bihar");
        ls.get(8).put("option4","Andra Pradesh");
        ls.get(8).put("answer","2");
        ls.get(8).put("money","160000");

        ls.get(9).put("name"," Which state has the largest area?");
        ls.get(9).put("option1","Maharashtra");
        ls.get(9).put("option2", "Rajasthan");
        ls.get(9).put("option3","Bihar");
        ls.get(9).put("option4","Andra Pradesh");
        ls.get(9).put("answer","2");
        ls.get(9).put("money","320000");

        ls.get(10).put("name","Which is the largest coffee producing state of India?");
        ls.get(10).put("option1","Maharastra");
        ls.get(10).put("option2","Karnataka");
        ls.get(10).put("option3","Maharashtra");
        ls.get(10).put("option4","Rajasthan");
        ls.get(10).put("answer","2");
        ls.get(10).put("money","640000");

        ls.get(11).put("name","In which state is the main language Khasi?");
        ls.get(11).put("option1","Nihal Sarin");
        ls.get(11).put("option2","Kush Bhagat");
        ls.get(11).put("option3","Praggnanandhaa");
        ls.get(11).put("option4","Vidit Gujrathi");
        ls.get(11).put("answer","2");
        ls.get(11).put("money","2500000");

        ls.get(12).put("name"," Which Bollywood actress is the new ambassador for Swachh Bharat Mission's youth-based 'Swachh Saathi' programme?");
        ls.get(12).put("option1","Vidya Balan ");
        ls.get(12).put("option2","Dia Mirza ");
        ls.get(12).put("option3","Priyanka Chopra");
        ls.get(12).put("option4","Sonakshi Sinha");
        ls.get(12).put("answer","2");
        ls.get(12).put("money","5000000");

        ls.get(13).put("name","When is the Indian Air Force Day celebrated?");
        ls.get(13).put("option1","October 9");
        ls.get(13).put("option2","October 10");
        ls.get(13).put("option3","October 8");
        ls.get(13).put("option4","October 11");
        ls.get(13).put("answer","3");
        ls.get(13).put("money","10000000");
    }
}
