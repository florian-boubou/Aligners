package aligner.aligners;

import aligner.utils.Alignment;

public class RandomTextAligner extends WidthBasedTextAligner {
	private static final int NB_RANDOM_POSITIONS = 20;

	public RandomTextAligner() {
		this(RandomTextAligner.DEFAULT_LINE_WIDTH);
	}

	public RandomTextAligner(int lW) {
		this.alignment = Alignment.RANDOM;
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
				int nbSpaces = lineWidth - line.length();
				double randomRatio = (Math.random() * (NB_RANDOM_POSITIONS+1))/NB_RANDOM_POSITIONS;

				int nbLeftSpaces = (int)(randomRatio * nbSpaces);
				int nbRightSpaces = (int)((1-randomRatio) * nbSpaces);

				String leftSpaces = "";
				String rightSpaces = "";

				if(nbLeftSpaces > 0)
					leftSpaces = String.format("%" + nbLeftSpaces + "s", "");
				
				if(nbRightSpaces > 0)
					rightSpaces = String.format("%" + nbRightSpaces + "s", "");

				line = leftSpaces + line + rightSpaces;
			}

			sb.append(line + "\n");
		}

		return sb.toString();
	}
}