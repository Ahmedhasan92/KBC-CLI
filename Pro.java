import java.util.HashMap;
import java.util.Scanner;
public class Pro extends Question {
    public static boolean isAnswerCorrect(StringBuffer sb, HashMap<String,String> hm){
        return hm.get("answer").equals(sb.toString());
    }
    public static void Lifeline(HashMap<String,String> hm){
        if(hm.get("answer").equals("2")){
            System.out.println("Option 3 :"+hm.get("option3"));
            System.out.println("Option 2 :"+hm.get("option2"));
        }
        if(hm.get("answer").equals("1")){
            System.out.println("Option 3 :"+hm.get("option3"));
            System.out.println("Option 1 :"+hm.get("option1"));
        }
        if(hm.get("answer").equals("3")){
            System.out.println("Option 3 :"+hm.get("option3"));
            System.out.println("Option 2 :"+hm.get("option2"));
        }
    }
    public static void main(String args[]){
        Question obj=new Question();
        Scanner sc=new Scanner(System.in);
        int idx=1,m=0,padaav=0;
        boolean l=true;
        for(HashMap<String,String> hm : ls){
            if(idx==6){
                padaav=10000;
            }
            if(idx==11){
                padaav=320000;
            }
            System.out.println("Question "+(idx++)+":"+hm.get("name"));
            System.out.println("Option 1:"+hm.get("option1"));
            System.out.println("Option 2:"+hm.get("option2"));
            System.out.println("Option 3:"+hm.get("option3"));
            System.out.println("Option 4:"+hm.get("option4"));
            System.out.println("Your choice (1-4)");
            if(l)
                System.out.println("You have 1 Lifeline");
            String ans=sc.next();
            StringBuffer sb=new StringBuffer(ans);
            if(ans.toLowerCase().equals("quit")){
                System.out.println("You won :"+m+" rupees");
                System.exit(0);
            }
            if(ans.toLowerCase().equals("ll") && l){
                l=false;
                Lifeline(hm);
                System.out.println("Your choice (1-4)");
                sb=new StringBuffer(sc.next());
            }
            if(isAnswerCorrect(sb,hm)){
                m=m+Integer.parseInt(hm.get("money"));
                System.out.println("Correct!!");
            }else{
                System.out.println("Wrong Answer");
                System.out.println("You won :"+padaav+" rupees");
                break;
            }
        }
    }
}
