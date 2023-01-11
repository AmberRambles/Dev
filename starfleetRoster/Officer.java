package starfleetRoster;

public class Officer {
    //attributes with default values to overwrite
    private String rank = "UNINITIALIZED_RANK";
    private String civillianFormalPrefix = "UNINITIALIZED_PREFIX"; //examples: Mr. Ms. Mx.
    private String firstName = "UNINITIALIZED_FIRSTNAME";
    private String middleName = "UNINITIALIZED_MIDDLENAME";
    private String lastNameOne = "UNINITIALIZED_LASTNAME";
    private String lastNameTwo = ""; //optional field
    private String suffix = ""; //optional field
    //Methods
    //GET Methods
    public String getRank (){ return rank; }
    public String getCivilianFormalPrefix (){ return civillianFormalPrefix; }
    public String getFirstName (){ return firstName; }
    public String getMiddleName (){ return middleName; }
    public String getLastNameOne (){ return lastNameOne; }
    public String getLastNameTwo (){ return lastNameTwo; }
    public String getSuffix (){ return suffix; }
    //SET Methods
    public void setRank (String inputRank){ rank = inputRank; }
    public void setCivilianFormalPrefix (String inputCivilianFormalPrefix){ civillianFormalPrefix = inputCivilianFormalPrefix; }
    public void setFirstName (String inputFirstName){ firstName = inputFirstName; }
    public void setMiddleName (String inputMiddleName){ middleName = inputMiddleName; }
    public void setLastNameOne (String inputLastNameOne){ lastNameOne = inputLastNameOne; }
    public void setLastNameTwo (String inputLastNameTwo){ lastNameTwo = inputLastNameTwo; }
    public void setSuffix (String inputSuffix){ suffix = inputSuffix; }
    //Print Methods
    public void printRank (){ System.out.print(rank); }
    public void printCivilianFormalPrefix () { System.out.print(civillianFormalPrefix); }
    public void printFirstName (){ System.out.print(firstName); }
    public void printMiddleName (){ System.out.print(middleName); }
    public void printLastNameOne (){ System.out.print(lastNameOne); }
    public void printLastNameTwo (){ System.out.print(lastNameTwo); }
    public void printSuffix (){ System.out.print(suffix); }
    public void printMilitaryName (){
        String militaryName = rank + " " + firstName + " ";
        if(middleName == ""){ militaryName += lastNameOne; }
        else{ militaryName += middleName.charAt(0) + ". " + lastNameOne; }
        if(lastNameTwo != ""){ militaryName+= " " + lastNameTwo; }
        if(suffix != ""){ militaryName += " " + suffix; }
        System.out.print(militaryName);
    }
    public void printCivilianName (){
        String civilianName = civillianFormalPrefix + " " + firstName + " ";
        if(middleName == ""){ civilianName += lastNameOne; }
        else{ civilianName += middleName + " " + lastNameOne; }
        if(lastNameTwo != ""){ civilianName+= " " + lastNameTwo; }
        if(suffix != ""){ civilianName += " " + suffix; }
        System.out.print(civilianName);
    }
    //Constructor Methods
    public Officer () {} //this is the default constructor. it makes blank officers.
    public Officer (String inputRank, String inputCivilianFormalPrefix, String inputFirstName, String inputMiddleName, String inputLastNameOne, String inputLastNameTwo, String inputSuffix){
        rank = inputRank;
        civillianFormalPrefix = inputCivilianFormalPrefix;
        firstName = inputFirstName;
        middleName = inputMiddleName;
        lastNameOne = inputLastNameOne;
        lastNameTwo = inputLastNameTwo;
        suffix = inputSuffix;
    }
}
