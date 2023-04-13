package studio9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import assignment7.Student;

public class UniversityDatabase {
	private final Map<String, Student> poopyyyy;
	
	public UniversityDatabase(){
		poopyyyy = new HashMap<>();
		
	}
	
	public void addStudent(String accountName, Student student) {
		// TODO
		poopyyyy.put(accountName,student);
	}

	public int getStudentCount() {
		// TODO
		return poopyyyy.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		if(poopyyyy.get(accountName) == null) {
			return null;
		}
		String a = poopyyyy.get(accountName).getFullName();
			return a;
		
	}

	public double getTotalBearBucks() {
		// TODO
		double $$ = 0;
		for(String key:poopyyyy.keySet()){
			$$ += poopyyyy.get(key).getBearBucksBalance();
		}
		return $$;
	}
}
