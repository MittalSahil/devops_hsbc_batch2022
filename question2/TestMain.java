import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sArray[] = new Student[3];
		int studentId;
		String studentName;
		String city;
		int marks1, marks2, marks3;
		float feePerMonth;
		boolean isEligibleForScholorship;
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter the below details for student"+(i+1));
			sArray[i] = new Student();
			System.out.print("Enter Id : ");
			studentId = scan.nextInt();
			System.out.print("Enter Name : ");
			studentName = scan.next();
			System.out.print("Enter City : ");
			city = scan.next();
			System.out.print("Enter Marks1 : ");
			marks1 = scan.nextInt();
			System.out.print("Enter Marks2 : ");
			marks2 = scan.nextInt();
			System.out.print("Enter Marks3 : ");
			marks3 = scan.nextInt();
			System.out.print("Enter fee per month : ");
			feePerMonth = scan.nextFloat();
			System.out.print("Enter true/false for isEligibleForScholorship : ");
			isEligibleForScholorship = scan.nextBoolean();
			
			sArray[i].setStudentId(studentId);
			sArray[i].setStudentName(studentName);
			sArray[i].setCity(city);
			sArray[i].setMarks1(marks1);
			sArray[i].setMarks2(marks2);
			sArray[i].setMarks3(marks3);
			sArray[i].setFeePerMonth(feePerMonth);
			sArray[i].setIsEligibleForScholorship(isEligibleForScholorship);
			System.out.println("");
		}
		
		scan.close();
		System.out.println("--------------------------------------------------------------------");
		int totalMarksArr[] = new int[3];
		
		for(int i=0; i<3; i++)
		{
			totalMarksArr[i] = sArray[i].getTotalMarks();
		}
		
		int maxMarks = totalMarksArr[0];
		float minPerMonthFee = sArray[0].getFeePerMonth();
		int idMarks =0;
		int idFee =0;
		for(int i=1; i<3; i++)
		{
			if(maxMarks < totalMarksArr[i])
			{
				maxMarks = totalMarksArr[i];
				idMarks =i;
			}
			if(minPerMonthFee > sArray[i].getFeePerMonth())
			{
				minPerMonthFee = sArray[i].getFeePerMonth();
				idFee = i;
			}
		}
		
		System.out.println(sArray[idMarks].getStudentName()+" has the highest total marks.");
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println(sArray[idFee].getStudentName()+" has the least per month fee which is "+sArray[idFee].getFeePerMonth());
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Details of students :");
		
		for(int i=0; i<3; i++)
		{
			
			System.out.println("Student Name : "+ sArray[i].getStudentName());
			System.out.println("Total Marks : "+ sArray[i].getTotalMarks());
			System.out.println("Average Marks : "+ sArray[i].getAverage());
			System.out.println("Result : "+ sArray[i].getResult());
			if(sArray[i].getIsEligibleForScholorship())
			{
				System.out.println("Scolorship Available");
			}
			else
			{
				System.out.println("Scolorship Not Available");
			}
			System.out.println("");
		}
		
		
	}

}
