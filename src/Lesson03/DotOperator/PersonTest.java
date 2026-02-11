package Lesson03.DotOperator;

public class PersonTest {

    public static void main(String[] args) {

        String fName = "Andreas";
        String mName = "Elias";
        String lName = "Mogensen";
        int age = 47;
        String sex = "Mand";

        OpretNytPersonObjekt(fName, mName, lName, age, sex);

        fName = "Lukas";
        mName = "Emil";
        lName = "Bager";
        age = 22;
        sex = "Mand";

        OpretNytPersonObjekt(fName, mName, lName, age, sex);

    }

    public static void OpretNytPersonObjekt(String fName, String mName, String lName, int age, String sex)
    {

        // Opretter et nyt Person-objekt
        Person p = new Person();

        // Sætter værdier
        p.firstName = fName;
        p.middleName = mName;
        p.lastName = lName;
        p.age = age;
        p.gender = sex;

        //Udskriv
        p.WritePersonInfo();
    }
}

