import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String input = "admin";
		State state = new State(input, input.length(), 0);
		Keyword map = new Keyword("bin/Keywords.txt");
		Libinjection libinjection = new Libinjection();

		//System.out.println(map.keywordMap.get("0N&1"));

		libinjection.libinjection_sqli("SELECT table_name FROM all_tab_tables");
		//Test test = new Test("src/sqli-all.txt");
		//libinjection.libinjection_sqli("");
		//libinjection.libinjection_sqli("24/* */ union select 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22--"); // line 7002
//		libinjection.libinjection_sqli("(select min(@:=1)from (select 1 union select 2)k group by concat(version(),@:=@-1))--"); // line 14170
		
		
//		boolean issqli = test.libinjection_sqli("admin' OR 1=1--");
//		System.out.println(issqli);
		
//		String s = "blah";
//		System.out.println(s.substring(2,4));
		
//		String[] as = {
//			" ", "[","]","{","}","<",">",":","\\","?","=","@","!","#","~","+","-","*","/","&","|","^","%",
//			"(",")","'",";","\t","\n","\\v","\f","\r","\"","\240","\000"
//		};
//		
//		String[] samples = {
//			"abc",
//			"[",
//			"[[",
//			"]",
//			"def"
//		};
	
//		StringBuffer sb = new StringBuffer();
//		sb.append("[");
//		for(String s : as) {
//			sb.append( Pattern.quote( s ) );
//			System.out.println(Pattern.quote(s));
//		}
//		sb.append("]*");
//		String regexp = sb.toString();
//		
//		Pattern pattern = Pattern.compile( regexp);
//		
////		for(String sample : samples) {
////			
////			System.out.println("");
////			System.out.println( sample);
////			
////			matcher = pattern.matcher( sample );
////			
////			if ( matcher.matches()) {
////				System.out.println("--- MATCHES: yes----");
////				System.out.println(matcher.groupCount());			
////			}
////			else {
////				System.out.println("--- MATCHES: no----");
////			}
////		}
		
	}
}
