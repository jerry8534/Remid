package cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TallerThanMeosuek {
    public int solution(int[] array, int height){
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream = Arrays.stream(array).boxed();
        list = stream.filter(i -> i > height).collect(Collectors.toList());
        answer = list.size();
        return answer;
    }
}
