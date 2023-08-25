package cote;

public class Cards {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int c1 = 0;
        int c2 = 0;
        for(String word : goal){
            if(word == cards1[c1]){
                c1++;
                System.out.println(c1);
            }
            else if(word == cards2[c2]){
                c2++;
                System.out.println(c2);
            }
            else{
                answer = "No";
                break;
            }
        }
        return answer;
    }

    class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "Yes";

            int card1Index = 0;
            int card2Index = 0;

            for (int i = 0; i < goal.length; i++) {
                if(card1Index < cards1.length && goal[i].equals(cards1[card1Index])) {
                    card1Index++;
                    continue;
                }

                if(card2Index < cards2.length && goal[i].equals(cards2[card2Index])) {
                    card2Index++;
                    continue;
                }

                answer = "No";
                return answer;
            }

            return answer;
        }
    }
}
