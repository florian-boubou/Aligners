package aligner;

public interface TextAligner {
	/**
	 * Aligns the given string according to certain rules.
	 * @param str the string whose content is to be aligned.
	 * @return the aligned string.
	*/
	public String align(String str);

	/**
	 * Returns the class alignment type.
	 * @return this alignment type of a TextAligner.
	 */
	public Alignment getAlignment();
}