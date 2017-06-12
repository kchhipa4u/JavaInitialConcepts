package lec8.oop.scopeofvariables;

public class VariableScope {
	int i;
	int j =i;  // j =0;
	
    void foo()
	{
		j = k;   // valid
	}
	
    j = k;   // invalid, we can't write this in class
	
	int k;  // valid class level variable or instance variable, 0

}
