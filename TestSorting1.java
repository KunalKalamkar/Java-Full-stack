import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestSorting1{
public static void main(String[] args){

List<Developer> result = new ArrayList<Developer>();
	result.add(new Developer("Varnan",175000,50));
	result.add(new Developer("Kumar",80000,66));
	result.add(new Developer("chitra",150000,40));
	result.add(new Developer("Balaji",170000,27));
	System.out.println("Before sort");
	for(Developer developer : result){
		System.out.println(developer);

	}

	Collections.sort(result,new Comparator<Developer>()
	{
		@Override
		public int compare(Developer o1,Developer o2){
			return o1.getAge() - o2.getAge();
			}

		}

	
	
	);

	System.out.println("After sort");
	for(Developer developer :result){
	System.out.println(developer);
}

}

}