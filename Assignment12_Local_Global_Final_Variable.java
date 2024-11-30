package test;

public class Assignment12_Local_Global_Final_Variable {
	
	
	// Global_Variable
    int globalVar = 100;

    // Final_Variable
    final int FINAL_VAR = 200;

    public void display() {
        // Local_Variable
        int localVar = 3000;

        System.out.println("Global Variable: " + globalVar);
        System.out.println("Final Variable: " + FINAL_VAR);
        System.out.println("Local Variable: " + localVar);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment12_Local_Global_Final_Variable example = new Assignment12_Local_Global_Final_Variable();
        example.display();
	}

}

