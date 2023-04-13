package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstName;
	private String lastName;	
	private int idNumber;
	private int attemptedCredits;
	private int passingCredits;
	private double qualityPoints;
	private double bearbucks;
	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = id;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public int getId() {
		return idNumber;
	}

	public void depositBearBucks(double amount) {
		bearbucks += amount;
	}

	public double getBearBucksBalance() {
		return bearbucks;
	}
}
