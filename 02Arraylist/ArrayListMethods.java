import java.util.*;

public class 20141112{
	public void collapseDuplicates(ArrayList<Integer> L){
	for(int x = 0; x < L.size() + 1; x++){
		if(L.get(x) == L.get(x+1)){
			L.remove(x);
			x = 0;}
	}
	}
	}
