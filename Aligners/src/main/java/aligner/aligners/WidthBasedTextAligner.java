package aligner.aligners;

import aligner.utils.AlignerUtils;

public abstract class WidthBasedTextAligner extends AbstractTextAligner {
	protected static final int DEFAULT_LINE_WIDTH = 150;
	
	protected int lineWidth;
	
	protected void setLineWidth(int lW) {
		this.lineWidth = lW;
	}

	public abstract String align(String str);

	protected void checkLineWidth(String[] arr) {
		int max = AlignerUtils.getMaxLineWidth(arr);

		if(max > this.lineWidth)
			setLineWidth(max);
	}
}