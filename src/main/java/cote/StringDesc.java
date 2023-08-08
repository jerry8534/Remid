package cote;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringDesc {

    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
//        for(int i=0; i<charArray.length; i++) {
//            for(int j=0; j<charArray.length-1; j++) {
//                if(charArray[j] < charArray[j+1]) {
//                    char temp = charArray[j];
//                    charArray[j] = charArray[j+1];
//                    charArray[j+1] = temp;
//                }
//            }
//        }
//        answer = String.valueOf(charArray);
        Arrays.sort(charArray);
        answer = new StringBuilder(new String(charArray)).reverse().toString();
        return answer;
    }
}
