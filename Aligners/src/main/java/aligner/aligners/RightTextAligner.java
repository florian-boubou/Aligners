package aligner.aligners;

import aligner.utils.*;

public class RightTextAligner extends WidthBasedTextAligner {
	public RightTextAligner() {
		this(RightTextAligner.DEFAULT_LINE_WIDTH);
	}

	public RightTextAligner(int lW) {
		this.alignment = Alignment.RIGHT;
		setLineWidth(lW);
	}

	@Override
	public String align(String str) {
		String[] lines = str.split("\n");
		StringBuilder sb = new StringBuilder();

		checkLineWidth(lines);

		for(String line : lines) {
			line = line.trim();
			
			if(line.length() < this.lineWidth) {
				int nbSpaces = this.lineWidth - line.length();
				line = String.format("%" + nbSpaces + "s", "") + line;
			}

			sb.append(line).append('\n');
		}
		
		return sb.toString();
	}
}