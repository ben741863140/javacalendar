package sample;

import java.util.ArrayList;

public class Node {
	private String text;
	private String date;
	Node(){}
	Node(String a,String b)
	{
		text = a;
		date = b;
	}
	public String gettext(){
		return text;
	}
	public String getdate(){
		return date;
	}
}
