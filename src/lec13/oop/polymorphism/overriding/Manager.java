package lec13.oop.polymorphism.overriding;

class Manager extends Employee {
	
	public void startProjectWork() {
		meetingWithCustomer();
		defineProjectSchedule();
		assignRespToTeam();
	}
	
	private void meetingWithCustomer() {
		System.out.println("meet Customer");
	}

	private void defineProjectSchedule() {
		System.out.println("Project Schedule");
	}

	private void assignRespToTeam() {
		System.out.println("team work starts");
	}
}