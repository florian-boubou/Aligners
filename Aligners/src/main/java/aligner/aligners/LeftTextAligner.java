package aligner.aligners;

import aligner.utils.Alignment;

public class LeftTextAligner extends AbstractTextAligner {

	public LeftTextAligner() {
		this.alignment = Alignment.LEFT;
	}

	@Override
	public String align(String str) {
		String[] lines = str.split("\n");
		StringBuilder sb = new StringBuilder();

		//for each line, erases spaces at its beginning
		for(String line : lines)
			sb.append(line.replaceAll("^{ }+", ""));
		
		return sb.toString();
	}
}