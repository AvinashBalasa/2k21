package hackerEvents.cisco.t20;

import java.util.Arrays;

public class HowManyWords {
    public static void main(String[] args) {
        /*String para = "I am a bad 789 boy gir?l with? high-talent 123 -start end-" +
                " !juk ji! , hello,";*/
        String para = "jds dsaf lkdf kdsa fkldsf, ad?sbf ldka ads? asd bfdal ds bf[l." +
                " -start akf dhj ds 878  dwa WE DE 7475 dsfh  high-talent ds  RAMU 748 dj.";
        System.out.println(howManyWords(para));
    }

    public static int howManyWords(String sentence) {
        int count=0;

        if(sentence!=null){
            String[] words=sentence.split(" ");
            for(String a:words){
                if(a.matches("[a-zA-Z-\\?\\,\\.\\!]*")&& !a.contentEquals("")){
                    if(a.contains("?")&&a.endsWith("?")&&a.length()!=1){
                        count++;
                    }else if(a.contains(",")&&a.endsWith(",")&&a.length()!=1){
                        count++;
                    }else if(a.contains(".")&&a.endsWith(".")&&a.length()!=1){
                        count++;
                    }else if(a.contains("!")&&a.endsWith("!")&&a.length()!=1){
                        count++;
                    }else if(a.contains("-")&&!a.endsWith("-")&&!a.startsWith("-")){
                        count++;
                    }else if(a.matches("^[a-zA-Z]*$")){
                        count++;
                    }
                }
            }
        }

        return count;

    }
}
