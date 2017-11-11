package aligner.aligners;

import aligner.utils.*;

public class CenterTextAligner extends WidthBasedTextAligner {
	public CenterTextAligner() {
		this(CenterTextAligner.DEFAULT_LINE_WIDTH);
	}

	public CenterTextAligner(int lW) {
		this.alignment = Alignment.CENTER;
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
				int nbSpaces = line.length() - lineWidth;
				String centeringSpaces = String.format("%" + nbSpaces/2 + "s", "");
				line = centeringSpaces + line + centeringSpaces;
			}

			sb.append(line + "\n");
		}

		return sb.toString();
	}
}