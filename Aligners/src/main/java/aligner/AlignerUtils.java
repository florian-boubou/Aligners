package aligner;

public class AlignerUtils {
	public static int getMaxLineWidth(String[] arr) {
		int max = 0;
		
		for(String line : arr)
			if(line.length() > max)
				max = line.length();
		
		return max;
	}
}