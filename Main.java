/********************************************
*	DEVELOPER:	<name>
* COLLABORATORS: <names>
*	LAST MODIFIED:	<date>
********************************************/

import java.sql.SQLOutput;

/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient recipientA = new DACArecipient();
    DACArecipient recipientB = new DACArecipient();

    recipientA.setSurname("Bonaparte");
    recipientA.setGivenName("Napoleon");
    recipientA.setUscisNumber("01-1-0839");
    recipientA.setCountryOfOrigin("France");
    recipientA.setSex('M');
    recipientA.setBirthday(99999999);
    recipientA.setValidFromDate(0);
    recipientA.setExpirationDate(1234567);

    recipientB.setAll("Cat", "Garfield", "66-6-6666", "Lasagna Land",
            93485798, 248, 2389, 'M');

    System.out.printf("Name: %s %s%nUSCIS: %s%nCountry of origin: %s%n" +
                "Sex: %c%nBirthday (JDN): %d%nValid From Date (JDN): %d%nExpiration Date: %d",
                recipientA.getGivenName(), recipientA.getSurname(), recipientA.getUscisNumber(),
                recipientA.getCountryOfOrigin(), recipientA.getSex(), recipientA.getBirthday(),
                recipientA.getValidFromDate(), recipientA.getExpirationDate());
    System.out.println();
    System.out.println();
    System.out.printf("Name: %s %s%nUSCIS: %s%nCountry of origin: %s%n" +
                      "Sex: %c%nBirthday (JDN): %d%nValid From Date (JDN): %d%nExpiration Date: %d",
              recipientB.getGivenName(), recipientB.getSurname(), recipientB.getUscisNumber(),
              recipientB.getCountryOfOrigin(), recipientB.getSex(), recipientB.getBirthday(),
              recipientB.getValidFromDate(), recipientB.getExpirationDate());
  }
}