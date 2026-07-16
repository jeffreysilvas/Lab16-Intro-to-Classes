/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 *
 * @author Jeffrey Silvas (jeffreysilvas09@gmail.com)
 * @version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
DACArecipient
-----------------------------------------
-surname : String
-givenName : String
-uscisNumber : String
-countryOfOrigin : String
-birthday : int
-validFromDate : int
-expirationDate : int
-----------------------------------------
+getSurname() : String
+getGivenName() : String
+getUscisNumber() : String
+getCountryOfOrigin() : String
+getsex() : char
+getBirthday() : int
+getValidFromDate() : int
+getExpirationDate() : int
+setSurname(surname:String) : void
+setGivenName(givenName:String) : void
+setUscisNumber(uscisNumber:String) : void
+setCountryOfOrigin(countryOfOrigin:String) : void
+setBirthday(birthday:int) : void
+setSex(char:sex) : void
+setValidFromDate(validFromDate:int) : void
+setExpirationDate(expirationDate:int) : void
+setAll(surname:String, givenName: String, uscisNumber:String, countryOfOrigin:String,
birthday:int, validFromDate:int, expirationDate:int) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
    private String surname, givenName, uscisNumber, countryOfOrigin;
    private char sex;
    private int birthday, validFromDate, expirationDate;

	/***** ACCESSORS *****/

    /**
     * @return Surname of DACArecipient
     * **/
    public String getSurname() {
        return surname;
    }

    /**
     * @return Given name of DACArecipient
     * **/
    public String getGivenName() {
        return givenName;
    }

    /**
     * @return USCIS number of DACArecipient
     * **/
    public String getUscisNumber() {
        return uscisNumber;
    }

    /**
     * @return Country of origin of DACArecipient
     * **/
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * @return Sex of DACArecipient
     * **/
    public char getSex() {
        return sex;
    }

    /**
     * @return Birthday of DACArecipient as JDN
     * **/
    public int getBirthday() {
        return birthday;
    }

    /**
     * @return Valid from date of DACArecipient as JDN
     * **/
    public int getValidFromDate() {
        return validFromDate;
    }

    /**
     * @return Expiration date of DACArecipient as JDN
     * **/
    public int getExpirationDate() {
        return expirationDate;
    }

    /***** MUTATORS *****/

    /**
     * @param surname Surname of DACArecipient
     * **/
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @param givenName Given name of DACArecipient
     * **/
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * @param uscisNumber USCIS number of DACArecipient
     * **/
    public void setUscisNumber(String uscisNumber) {
        this.uscisNumber = uscisNumber;
    }

    /**
     * @param countryOfOrigin Country of origin of DACArecipient
     * **/
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * @param sex Country of origin of DACArecipient
     * **/
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * @param birthday Birthday of DACArecipient as JDN
     * **/
    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    /**
     * @param validFromDate Valid from date of DACArecipient as JDN
     * **/
    public void setValidFromDate(int validFromDate) {
        this.validFromDate = validFromDate;
    }

    /**
     * @param expirationDate Expiration date of DACArecipient as JDN
     * **/
    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @param surname Surname of DACArecipient
     * @param givenName Given name of DACArecipient
     * @param uscisNumber USCIS number of DACArecipient
     * @param countryOfOrigin Country of origin of DACArecipient
     * @param sex Sex of DACArecipient
     * @param birthday Birthday of DACArecipient as JDN
     * @param validFromDate Valid from date of DACArecipient as JDN
     * @param expirationDate Expiration date of DACArecipient as JDN
     * **/
    public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin,
                       char sex, int birthday, int validFromDate, int expirationDate) {
        setSurname(surname);
        setGivenName(givenName);
        setUscisNumber(uscisNumber);
        setCountryOfOrigin(countryOfOrigin);
        setSex(sex);
        setBirthday(birthday);
        setValidFromDate(validFromDate);
        setExpirationDate(expirationDate);
    }
}