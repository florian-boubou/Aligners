package aligner;

public class TextAligmentTool implements TextAligner {
	private TextAligner aligner;
	private Alignment   alignment;

	public TextAligmentTool() {
		this.aligner = new DefaultTextAligner();
		this.alignment = Alignment.DEFAULT;
	}

	public TextAligmentTool(Alignment alignment) {
		this.alignment = alignment;
	}

	public String align(String str) {
		return aligner.align(str);
	}

	enum Alignment {
		LEFT,
		RIGHT,
		CENTER,
		DEFAULT;
	}
}