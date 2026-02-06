package bha;
import java.util.Arrays;

public class band {




	    public static int maxBand(int[] i) {
	        Arrays.sort(i);
	        int left = 0, max = 1;

	        for (int right = 0; right < i.length; right++) {
	            while (i[right] - i[left] > 1) left++;
	            max = Math.max(max, right - left + 1);
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        int[] pitches = {1, 2, 2, 3, 3}; // Example → output = 4
	        System.out.println(maxBand(pitches));
	    }
	}