import java.io.*;
import java.util.*;

class MyStemmer{

	public static void Stemmer(String s,boolean N){
		//8
		if(s.startsWith("hey_")){
			s=s.replace("hey_","");
			if(s.endsWith("au") && N==false){// 8.2
				System.out.println("The root is :"+s.replace("au",""));
				System.out.println("Its Features are VOCATIVE + dual");
			}
			else if(s.endsWith("ah") && N==false){ // 8.3
				System.out.println("The root is :"+s.replace("ah",""));
				System.out.println("Its Features are VOCATIVE + plural");
			}
			else if(s.endsWith("ni") && N==true){// 8.3 + neuter
				System.out.println("The root is :"+s.replace("ni",""));
				System.out.println("Its Features are VOCATIVE + dual + neuter");
			}
			else if(s.endsWith("i") && N==true){ // 8.2 + neuter
				if(s.endsWith("ii"))
					System.out.println("The root is :"+s.replace("ii","i"));
				else
					System.out.println("The root is :"+s.replace("i",""));
				System.out.println("Its Features are VOCATIVE + plural + neuter");
			}
			else{ // 8.1
				System.out.println("The root is :"+s);
				System.out.println("Its Features are VOCATIVE + singular");
				if(N==true) System.out.print("+ true");
			}
		}
		else if(s.endsWith("m") && N==true){ // 1.1 + 2.1 + neuter
			if(s.endsWith("mm"))
				System.out.println("The root is :"+s.replace("mm","m"));
			else
				System.out.println("The root is :"+s.replace("m",""));
			System.out.println("Its Features are NOMINATIVE + singular + neuter");
			System.out.println("Its Features are ACCUSATIVE + singular + neuter");
		}
		else if(s.endsWith("yni") && N==true){ // 1.2 + 2.2 + neuter
			System.out.println("The root is :"+s.replace("yni",""));
			System.out.println("Its Features are NOMINATIVE + dual + neuter");
			System.out.println("Its Features are ACCUSATIVE + dual + neuter");
		}
		else if(s.endsWith("ni") && N==true){ // 1.3 + 2.3 + neuter
			System.out.println("The root is :"+s.replace("ni",""));
			System.out.println("Its Features are NOMINATIVE + plural + neuter");
			System.out.println("Its Features are ACCUSATIVE + plural + neuter");
		}
		else if(s.endsWith("aah")){ // 1.3
			System.out.println("The root is :"+s.replace("aah",""));
			System.out.println("Its Features are NOMINATIVE + plural");
		}
		else if(s.endsWith("ah")){ // 1.1 
			System.out.println("The root is :"+s.replace("ah",""));
			System.out.println("Its Features are NOMINATIVE + singular");
		}
		else if(s.endsWith("au")){ // 1.2 + 2.2
			System.out.println("The root is :"+s.replace("au",""));
			System.out.println("Its Features are NOMINATIVE + singular");
			System.out.println("Its Features are ACCUSATIVE + dual");
		}
		else if(s.endsWith("anam")){ // 6.3
			System.out.println("The root is :"+s.replace("anam",""));
			System.out.println("Its Features are GENITIVE + plural");
		}
		else if(s.endsWith("abhyam")){ // 3.2 + 4.2 + 5.2
			System.out.println("The root is :"+s.replace("abhyam",""));
			System.out.println("Its Features are INSTRUMENTAL + dual");
			System.out.println("Its Features are DATIVE + dual");
			System.out.println("Its Features are ABLATIVE + dual");
		}
		else if(s.endsWith("m")){ // 2.1 
			if(s.endsWith("mm"))
				System.out.println("The root is :"+s.replace("mm","m"));
			else
				System.out.println("The root is :"+s.replace("m",""));
			System.out.println("Its Features are ACCUSATIVE + singular");
		}
		else if(s.endsWith("aan")){ // 2.3
			System.out.println("The root is :"+s.replace("aan",""));
			System.out.println("Its Features are ACCUSATIVE + plural");
		}
		else if(s.endsWith("en")){ // 3.1
			System.out.println("The root is :"+s.replace("en",""));
			System.out.println("Its Features are INSTRUMENTAL + singular");
		}
		else if(s.endsWith("aeh")){ // 3.3
			System.out.println("The root is :"+s.replace("aeh",""));
			System.out.println("Its Features are INSTRUMENTAL + plural");
		}
		else if(s.endsWith("ay")){ // 4.1
			System.out.println("The root is :"+s.replace("ay",""));
			System.out.println("Its Features are DATIVE + singular");
		}
		else if(s.endsWith("abhyh")){ // 4.3 + 5.3
			System.out.println("The root is :"+s.replace("abhyh",""));
			System.out.println("Its Features are DATIVE + plural");
			System.out.println("Its Features are ABLATIVE + plural");
		}
		else if(s.endsWith("at")){ // 5.1
			System.out.println("The root is :"+s.replace("at",""));
			System.out.println("Its Features are ABLATIVE + singular");
		}
		else if(s.endsWith("asy")){ // 6.1
			System.out.println("The root is :"+s.replace("asy",""));
			System.out.println("Its Features are GENITIVE + singular");
		}
		else if(s.endsWith("yoh")){ // 6.2 + 7.2
			System.out.println("The root is :"+s.replace("yoh",""));
			System.out.println("Its Features are GENITIVE + dual");
			System.out.println("Its Features are LOCATIVE + dual");
		}
		else if(s.endsWith("e")){ // 7.1
			if(s.endsWith("ee"))
				System.out.println("The root is :"+s.replace("ee","e"));
			else
				System.out.println("The root is :"+s.replace("e",""));
			System.out.println("Its Features are LOCATIVE + singular");
		}
		else if(s.endsWith("asu")){ // 7.3
			System.out.println("The root is :"+s.replace("asu",""));
			System.out.println("Its Features are LOCATIVE + plural");
		}
	}

	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please write the name of file you wish to open from present directory : ");
		String fname=sc.nextLine();
		Scanner ss = new Scanner(new File(fname));
    		while(ss.hasNext()){
			System.out.println("----------Next Word------------");
        		String s = ss.next();
			boolean N=(	s.contains("asya") || 
				   	s.contains("vari") || 
					s.contains("madhu")
				   )?true:false;
			boolean M=(	s.contains("ram") || 
				   	s.contains("dev") || 
				   	s.contains("gati")|| 
					s.contains("pitr")
				   )?true:false;
			boolean F=(	s.contains("kanta")
				   )?true:false;
			System.out.print("word is "+s);
			if(M==true)System.out.println(" and its Masculine");
			if(F==true)System.out.println(" and its Feminine");
			if(N==true)System.out.println("");
			Stemmer(s,N);
			System.out.println("-------------------------------");
    		}		
	}

}