package algorithmstest0;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class AlgorithmsTest0 {
    
    public static void main(String[] args) {
        
        System.out.println(solution(3, 5));
        
    }
    
    public static int solution(int A, int B) {
        
        if ( A < 0 || A > 100000000 ) return -1;
        if ( B < 0 || B > 100000000 ) return -1;
        
        int mul = A * B;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> ind = new ArrayList<Integer>();
        
        int counter = 1;
        while ( counter <= mul ) {
            arr.add(counter);
            ind.add(0);
            counter *= 2;
        }
        
        int n = 0;
        while ( mul != 0 ) {
            int looper = 0;
            while ( arr.size() > looper && mul >= arr.get(looper) ) {
                looper++;
            }
        
            n++;
            mul -= arr.get(looper - 1);            
        }
        
        return n;
    }
        
}


