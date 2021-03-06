package aligner.aligners;

import aligner.utils.Alignment;

public abstract class AbstractTextAligner implements TextAligner {
	protected Alignment alignment;

	public abstract String align(String str);

	public Alignment getAlignment() {
		return this.alignment;
	}
}