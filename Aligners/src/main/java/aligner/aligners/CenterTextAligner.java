package aligner.aligners;

import aligner.utils.*;

public class CenterTextAligner extends AbstractTextAligner {
	private static final int DEFAULT_LINE_WIDTH = 150;

	private int lineWidth;

	public CenterTextAligner() {
		this(CenterTextAligner.DEFAULT_LINE_WIDTH);
	}

	public CenterTextAligner(int lW) {
		this.alignment = Alignment.CENTER;
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
				int nbSpaces = line.length() - lineWidth;
				String centeringSpaces = String.format("%" + nbSpaces/2 + "s", "");
				line = centeringSpaces + line + centeringSpaces;
			}

			sb.append(line + "\n");
		}

		return sb.toString();
	}

	private void checkLineWidth(String[] arr) {
		int max = AlignerUtils.getMaxLineWidth(arr);

		if(max > this.lineWidth)
			setLineWidth(max);		
	}
}