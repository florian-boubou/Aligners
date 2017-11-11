package aligner;

import aligner.aligners.*;

import aligner.utils.Alignment;;

public class TextAligmentTool extends AbstractTextAligner {
	private TextAligner aligner;
	private Alignment   alignment;

	public TextAligmentTool() {
		this.aligner = new DefaultTextAligner();
		this.alignment = Alignment.DEFAULT;
	}

	public TextAligmentTool(Alignment alignment) {
		setAlignment(alignment);
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
		
		setNewAligner();
	}

	public void setNewAligner() {
		if(this.aligner.getAlignment() != this.alignment) {
			switch(this.alignment) {
				case LEFT: 
					this.aligner = new LeftTextAligner();
					break;
				case RIGHT:
					this.aligner = new RightTextAligner();
					break;
				case CENTER:
					this.aligner = new CenterTextAligner();
					break;
				default:
					this.aligner = new DefaultTextAligner();
			}
		}
	}
	public String align(String str) {
		return null;
	}

	public String align(String str, Alignment alignment) {
		return aligner.align(str);
	}

	public Alignment getAlignment() {
		return null;
	}
}