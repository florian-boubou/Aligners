package aligner.aligners;

import aligner.utils.*;

public class RightTextAligner extends AbstractTextAligner {
	private static final int DEFAULT_LINE_WIDTH = 150;
	
	private int lineWidth;

	public RightTextAligner() {
		this(RightTextAligner.DEFAULT_LINE_WIDTH);
	}

	public RightTextAligner(int lW) {
		this.alignment = Alignment.RIGHT;
		setLineWidth(lW);
	}
	
	public void setLineWidth(int lW) {
		this.lineWidth = lW;
	}

	public String align(String str) {
		String[] lines = str.split("\n");
		StringBuilder sb = new StringBuilder();

		checkLineWidth(lines);

		for(String line : lines) {
			if(line.length() < this.lineWidth) {
				int nbSpaces = this.lineWidth - line.length();
				line = String.format("%" + nbSpaces + "s", "") + line;
			}

			sb.append(line).append('\n');
		}
		
		return sb.toString();
	}

	private void checkLineWidth(String[] arr) {
		int max = AlignerUtils.getMaxLineWidth(arr);

		if(max > this.lineWidth)
			setLineWidth(max);
	}
}