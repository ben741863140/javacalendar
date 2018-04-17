package sample;

import java.util.ArrayList;

public class Node implements Comparable<Node>{
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
	public int compareTo(Node o) {  
        String a = this.getdate();
        String b = o.getdate();
        int len = a.length();
        if(b.length()<len)len = b.length();
        for(int i=0;i<len;++i){
        	char x = a.charAt(i);
        	char y = b.charAt(i);
        	if(x!=y)return x-y;
        }
        return 0;
    }

}
