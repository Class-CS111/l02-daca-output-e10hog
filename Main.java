// PARTNER NAME: ETHAN LUONG
// PARTNER NAME:
// CS111 SECTION #: 
// DATE: 2/1/25

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surName, firstName, USCIS, category, cardNum, countryOfBirth, termsAndConditions, dateOfBirth, validDate, expireDate;
		char sex;
		
		//INPUT SECTION
		// I could of had separate variables for the month day and year for each date, but thats too much work!
		// even though technically we haven't learned about data manipulation, I basically got the idea of this lab
		// if it works, it works!
		surName = "SPECIMEN";
		firstName = "TEST V";
		USCIS = "000000725";
		category = "C09";
		cardNum = "SRC0000000725";
		countryOfBirth = "Ethiopia";
		termsAndConditions = "None";
		dateOfBirth = "01JAN1920";
		sex = 'M';
		validDate = "010180";
		expireDate = "051011";

		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surName);
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + firstName);
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + USCIS.substring(0, 3)+"-"+USCIS.substring(3, 6)+"-"+USCIS.substring(6) +"  "+ category + " " + cardNum); // splits string into parts based on index range
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,     " + countryOfBirth);
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /      "+ termsAndConditions);
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`        "+ dateOfBirth.substring(0, 2) + "" + dateOfBirth.substring(2, 5) + "" + dateOfBirth.substring(5) + "           " + sex);
		System.out.println("║                       Valid From:     "+validDate.substring(0, 2)+"/"+validDate.substring(2, 4)+"/"+validDate.substring(4));
		System.out.println("║                       Card Expires:   "+expireDate.substring(0, 2)+"/"+expireDate.substring(2, 4)+"/"+expireDate.substring(4));
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}