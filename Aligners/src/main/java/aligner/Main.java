package aligner;

import aligner.utils.Alignment;

public class Main {
	public static void main(String[] args) {
		TextAligmentTool alignTool = new TextAligmentTool(Alignment.RANDOM);

		String text =   "                I'm currently dying\n"
						  + "                    From a strange pain in my chest\n"
						  + " When will it go away ?\n"
						  + "   Wondering when it will stop\n"
						  + "                      I found myself thinking of something\n"
						  + "                This pain is a S P O O K Y  GHOST !!!!";
		
		System.out.println(text);

		System.out.println(String.format("%25s","").replace(' ', '-'));

		System.out.println(alignTool.align(text));
	}
}