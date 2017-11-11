package aligner.aligners;

import aligner.utils.Alignment;

public class DefaultTextAligner extends LeftTextAligner {
	//this class defines the default alignment behaviour
	public DefaultTextAligner() {
		this.alignment = Alignment.DEFAULT;
	}
}