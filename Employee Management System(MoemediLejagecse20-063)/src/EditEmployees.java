public class EditEmployees
{
    static String[][] empData;

    public static void method()
    {
        empData = new String[51][];
        allEmpMethods();
        //emp.setSalary(1000);

    }

    public static void allEmpMethods()
    {
        emp1();
        emp2();
        emp3();
        emp4();
        emp5();
        emp6();
        emp7();
        emp8();
        emp9();
        emp10();
        emp11();
        emp12();
        emp13();
        emp14();
        emp15();
        emp16();
        emp17();
        emp18();
        emp19();
        emp20();
        emp21();
        emp22();
        emp23();
        emp24();
        emp25();
        emp26();
        emp27();
        emp28();
        emp29();
        emp30();
        emp31();
        emp32();
        emp33();
        emp34();
        emp35();
        emp36();
        emp37();
        emp38();
        emp39();
        emp40();
        emp41();
        emp42();
        emp43();
        emp44();
        emp45();
        emp46();
        emp47();
        emp48();
        emp49();
        emp50();
    }

    public static String[] emp1()
    {
        Employees emp1 = new Employees();
        emp1.setEmpID("EMP001");
        emp1.setName("Sam");
        emp1.setSurname("Hernandez");
        emp1.setDob("12/03/1983");
        emp1.setGender("Male");
        emp1.setAddress("Gaborone");
        emp1.setJob("Marketer");
        emp1.setHours(3);
        emp1.setDepartment("Marketing");
        emp1.setRop(120);
        emp1.setCar(0);
        emp1.setGrat(185);
        emp1.setTax(4.7);

        empData[1] = new String[]{emp1.iD, emp1.name, emp1.surname, emp1.dob, emp1.gender, emp1.address, emp1.job,
                String.valueOf(emp1.hours), emp1.department, String.valueOf(emp1.rop), String.valueOf(emp1.car), String.valueOf(emp1.grat), String.valueOf(emp1.tax)};

        return empData[1];
    }
    public static String[] emp2()
    {
        Employees emp2 = new Employees();
        emp2.setEmpID("EMP002");
        emp2.setName("Wilbur");
        emp2.setSurname("Tate");
        emp2.setDob("05/05/2001");
        emp2.setGender("Male");
        emp2.setAddress("Molepolole");
        emp2.setJob("Support");
        emp2.setHours(12);
        emp2.setDepartment("ICT");
        emp2.setRop(100);
        emp2.setCar(15);
        emp2.setGrat(354);
        emp2.setTax(5.2);

        empData[2] = new String[]{emp2.iD, emp2.name, emp2.surname, emp2.dob, emp2.gender, emp2.address, emp2.job,
                String.valueOf(emp2.hours), emp2.department, String.valueOf(emp2.rop), String.valueOf(emp2.car), String.valueOf(emp2.grat), String.valueOf(emp2.tax)};

        return empData[2];
    }
    public static String[] emp3()
    {
        Employees emp3 = new Employees();
        emp3.setEmpID("EMP003");
        emp3.setName("Harvey");
        emp3.setSurname("Hayes");
        emp3.setDob("06/01/1984");
        emp3.setGender("Female");
        emp3.setAddress("Molepolole");
        emp3.setJob("Officer");
        emp3.setHours(4);
        emp3.setDepartment("Resources");
        emp3.setRop(150);
        emp3.setCar(15);
        emp3.setGrat(25);
        emp3.setTax(5.6);

        empData[3] = new String[]{emp3.iD, emp3.name, emp3.surname, emp3.dob, emp3.gender, emp3.address, emp3.job,
                String.valueOf(emp3.hours), emp3.department, String.valueOf(emp3.rop), String.valueOf(emp3.car), String.valueOf(emp3.grat), String.valueOf(emp3.tax)};

        return empData[3];
    }
    public static String[] emp4()
    {
        Employees emp4 = new Employees();
        emp4.setEmpID("EMP004");
        emp4.setName("Margarita");
        emp4.setSurname("Long");
        emp4.setDob("06/02/2001");
        emp4.setGender("Female");
        emp4.setAddress("Lobatse");
        emp4.setJob("Support");
        emp4.setHours(16);
        emp4.setDepartment("Sales");
        emp4.setRop(100);
        emp4.setCar(15);
        emp4.setGrat(135);
        emp4.setTax(5.2);

        empData[4] = new String[]{emp4.iD, emp4.name, emp4.surname, emp4.dob, emp4.gender, emp4.address, emp4.job,
                String.valueOf(emp4.hours), emp4.department, String.valueOf(emp4.rop), String.valueOf(emp4.car), String.valueOf(emp4.grat), String.valueOf(emp4.tax)};

        return empData[4];
    }
    public static String[] emp5()
    {
        Employees emp5 = new Employees();
        emp5.setEmpID("EMP005");
        emp5.setName("Don");
        emp5.setSurname("Russell");
        emp5.setDob("16/07/1984");
        emp5.setGender("Male");
        emp5.setAddress("Serowe");
        emp5.setJob("Support");
        emp5.setHours(7);
        emp5.setDepartment("Temp");
        emp5.setRop(100);
        emp5.setCar(0);
        emp5.setGrat(20);
        emp5.setTax(4.9);

        empData[5] = new String[]{emp5.iD, emp5.name, emp5.surname, emp5.dob, emp5.gender,
                emp5.address, emp5.job, String.valueOf(emp5.hours), emp5.department,
                String.valueOf(emp5.rop), String.valueOf(emp5.car), String.valueOf(emp5.grat),
                String.valueOf(emp5.tax)};

        return empData[5];
    }
    public static String[] emp6()
    {
        Employees emp6 = new Employees();
        emp6.setEmpID("EMP006");
        emp6.setName("Warren");
        emp6.setSurname("Castro");
        emp6.setDob("02/12/2000");
        emp6.setGender("Male");
        emp6.setAddress("Francistown");
        emp6.setJob("Support");
        emp6.setHours(12);
        emp6.setDepartment("ICT");
        emp6.setRop(100);
        emp6.setCar(15);
        emp6.setGrat(522);
        emp6.setTax(5.2);

        empData[6] = new String[]{emp6.iD, emp6.name, emp6.surname, emp6.dob, emp6.gender, emp6.address, emp6.job,
                String.valueOf(emp6.hours), emp6.department, String.valueOf(emp6.rop), String.valueOf(emp6.car), String.valueOf(emp6.grat), String.valueOf(emp6.tax)};

        return empData[6];
    }
    public static String[] emp7()
    {
        Employees emp7 = new Employees();
        emp7.setEmpID("EMP007");
        emp7.setName("Clayton");
        emp7.setSurname("Curry");
        emp7.setDob("01/04/1997");
        emp7.setGender("Female");
        emp7.setAddress("Gaborone");
        emp7.setJob("Marketer");
        emp7.setHours(1);
        emp7.setDepartment("Marketing");
        emp7.setRop(120);
        emp7.setCar(0);
        emp7.setGrat(0);
        emp7.setTax(4.7);

        empData[7] = new String[]{emp7.iD, emp7.name, emp7.surname, emp7.dob, emp7.gender,
                emp7.address, emp7.job, String.valueOf(emp7.hours), emp7.department,
                String.valueOf(emp7.rop), String.valueOf(emp7.car), String.valueOf(emp7.grat),
                String.valueOf(emp7.tax)};
        return empData[7];
    }
    public static String[] emp8()
    {
        Employees emp8 = new Employees();
        emp8.setEmpID("EMP008");
        emp8.setName("Woods");
        emp8.setSurname("Hernandez");
        emp8.setDob("14/08/1998");
        emp8.setGender("Male");
        emp8.setAddress("Gaborone");
        emp8.setJob("Marketer");
        emp8.setHours(12);
        emp8.setDepartment("Marketing");
        emp8.setRop(100);
        emp8.setCar(0);
        emp8.setGrat(452);
        emp8.setTax(4.7);

        empData[8] = new String[]{emp8.iD, emp8.name, emp8.surname, emp8.dob, emp8.gender,
                emp8.address, emp8.job, String.valueOf(emp8.hours), emp8.department,
                String.valueOf(emp8.rop), String.valueOf(emp8.car), String.valueOf(emp8.grat),
                String.valueOf(emp8.tax)};
        return empData[8];
    }
    public static String[] emp9()
    {
        Employees emp9 = new Employees();
        emp9.setEmpID("EMP009");
        emp9.setName("Craig");
        emp9.setSurname("Ford");
        emp9.setDob("05/12/1991");
        emp9.setGender("Male");
        emp9.setAddress("Francistown");
        emp9.setJob("Officer");
        emp9.setHours(14);
        emp9.setDepartment("Resources");
        emp9.setRop(150);
        emp9.setCar(15);
        emp9.setGrat(788);
        emp9.setTax(5.6);

        empData[9] = new String[]{emp9.iD, emp9.name, emp9.surname, emp9.dob, emp9.gender,
                emp9.address, emp9.job, String.valueOf(emp9.hours), emp9.department,
                String.valueOf(emp9.rop), String.valueOf(emp9.car), String.valueOf(emp9.grat),
                String.valueOf(emp9.tax)};
        return empData[9];
    }
    public static String[] emp10()
    {
        Employees emp10 = new Employees();
        emp10.setEmpID("EMP010");
        emp10.setName("Theresa");
        emp10.setSurname("Walton");
        emp10.setDob("05/06/1999");
        emp10.setGender("Female");
        emp10.setAddress("Molepolole");
        emp10.setJob("Marketer");
        emp10.setHours(2);
        emp10.setDepartment("Marketing");
        emp10.setRop(120);
        emp10.setCar(0);
        emp10.setGrat(288);
        emp10.setTax(4.7);

        empData[10] = new String[]{emp10.iD, emp10.name, emp10.surname, emp10.dob, emp10.gender,
                emp10.address, emp10.job, String.valueOf(emp10.hours), emp10.department,
                String.valueOf(emp10.rop), String.valueOf(emp10.car), String.valueOf(emp10.grat),
                String.valueOf(emp10.tax)};
        return empData[10];
    }
    public static String[] emp11()
    {
        Employees emp11 = new Employees();
        emp11.setEmpID("EMP011");
        emp11.setName("Harry");
        emp11.setSurname("Oliver");
        emp11.setDob("03/09/1988");
        emp11.setGender("Male");
        emp11.setAddress("Gaborone");
        emp11.setJob("Marketer");
        emp11.setHours(1);
        emp11.setDepartment("Marketing");
        emp11.setRop(120);
        emp11.setCar(0);
        emp11.setGrat(186);
        emp11.setTax(4.7);

        empData[11] = new String[]{emp11.iD, emp11.name, emp11.surname, emp11.dob, emp11.gender,
                emp11.address, emp11.job, String.valueOf(emp11.hours), emp11.department,
                String.valueOf(emp11.rop), String.valueOf(emp11.car), String.valueOf(emp11.grat),
                String.valueOf(emp11.tax)};
        return empData[11];

    }
    public static String[] emp12()
    {
        Employees emp12 = new Employees();
        emp12.setEmpID("EMP012");
        emp12.setName("Claire");
        emp12.setSurname("Moreno");
        emp12.setDob("08/08/1990");
        emp12.setGender("Female");
        emp12.setAddress("Francistown");
        emp12.setJob("Marketer");
        emp12.setHours(14);
        emp12.setDepartment("Marketing");
        emp12.setRop(120);
        emp12.setCar(0);
        emp12.setGrat(456);
        emp12.setTax(4.7);

        empData[12] = new String[]{emp12.iD, emp12.name, emp12.surname, emp12.dob, emp12.gender,
                emp12.address, emp12.job, String.valueOf(emp12.hours), emp12.department,
                String.valueOf(emp12.rop), String.valueOf(emp12.car), String.valueOf(emp12.grat),
                String.valueOf(emp12.tax)};
        return empData[12];

    }
    public static String[] emp13()
    {
        Employees emp13 = new Employees();
        emp13.setEmpID("EMP013");
        emp13.setName("Holly");
        emp13.setSurname("Todd");
        emp13.setDob("18/07/1992");
        emp13.setGender("Female");
        emp13.setAddress("Francistown");
        emp13.setJob("Officer");
        emp13.setHours(6);
        emp13.setDepartment("Accounts");
        emp13.setRop(150);
        emp13.setCar(15);
        emp13.setGrat(35);
        emp13.setTax(5.6);

        empData[13] = new String[]{emp13.iD, emp13.name, emp13.surname, emp13.dob, emp13.gender,
                emp13.address, emp13.job, String.valueOf(emp13.hours), emp13.department,
                String.valueOf(emp13.rop), String.valueOf(emp13.car), String.valueOf(emp13.grat),
                String.valueOf(emp13.tax)};
        return empData[13];
    }
    public static String[] emp14()
    {
        Employees emp14 = new Employees();
        emp14.setEmpID("EMP014");
        emp14.setName("Ronnie");
        emp14.setSurname("Snyder");
        emp14.setDob("21/07/1993");
        emp14.setGender("Male");
        emp14.setAddress("Lobatse");
        emp14.setJob("Marketer");
        emp14.setHours(1);
        emp14.setDepartment("Marketing");
        emp14.setRop(120);
        emp14.setCar(0);
        emp14.setGrat(65);
        emp14.setTax(4.7);

        empData[14] = new String[]{emp14.iD, emp14.name, emp14.surname, emp14.dob, emp14.gender,
                emp14.address, emp14.job, String.valueOf(emp14.hours), emp14.department,
                String.valueOf(emp14.rop), String.valueOf(emp14.car), String.valueOf(emp14.grat),
                String.valueOf(emp14.tax)};
        return empData[14];

    }
    public static String[] emp15()
    {
        Employees emp15 = new Employees();
        emp15.setEmpID("EMP015");
        emp15.setName("Elsa");
        emp15.setSurname("Barber");
        emp15.setDob("18/07/1984");
        emp15.setGender("Female");
        emp15.setAddress("Gaborone");
        emp15.setJob("Officer");
        emp15.setHours(15);
        emp15.setDepartment("Accounts");
        emp15.setRop(150);
        emp15.setCar(15);
        emp15.setGrat(87);
        emp15.setTax(5.6);

        empData[15] = new String[]{emp15.iD, emp15.name, emp15.surname, emp15.dob, emp15.gender,
                emp15.address, emp15.job, String.valueOf(emp15.hours), emp15.department,
                String.valueOf(emp15.rop), String.valueOf(emp15.car), String.valueOf(emp15.grat),
                String.valueOf(emp15.tax)};
        return empData[15];
    }
    public static String[] emp16()
    {
        Employees emp16 = new Employees();
        emp16.setEmpID("EMP016");
        emp16.setName("Johnnie");
        emp16.setSurname("Wagner");
        emp16.setDob("06/10/1987");
        emp16.setGender("Male");
        emp16.setAddress("Molepolole");
        emp16.setJob("Marketer");
        emp16.setHours(1);
        emp16.setDepartment("Marketing");
        emp16.setRop(120);
        emp16.setCar(0);
        emp16.setGrat(97);
        emp16.setTax(4.7);

        empData[16] = new String[]{emp16.iD, emp16.name, emp16.surname, emp16.dob, emp16.gender,
                emp16.address, emp16.job, String.valueOf(emp16.hours), emp16.department,
                String.valueOf(emp16.rop), String.valueOf(emp16.car), String.valueOf(emp16.grat),
                String.valueOf(emp16.tax)};
        return empData[16];
    }
    public static String[] emp17()
    {
        Employees emp17 = new Employees();
        emp17.setEmpID("EMP017");
        emp17.setName("Perry");
        emp17.setSurname("Brock");
        emp17.setDob("22/04/2001");
        emp17.setGender("Male");
        emp17.setAddress("Francistown");
        emp17.setJob("Officer");
        emp17.setHours(1);
        emp17.setDepartment("Resources");
        emp17.setRop(150);
        emp17.setCar(15);
        emp17.setGrat(100);
        emp17.setTax(5.6);

        empData[17] = new String[]{emp17.iD, emp17.name, emp17.surname, emp17.dob, emp17.gender,
                emp17.address, emp17.job, String.valueOf(emp17.hours), emp17.department,
                String.valueOf(emp17.rop), String.valueOf(emp17.car), String.valueOf(emp17.grat),
                String.valueOf(emp17.tax)};
        return empData[17];
    }
    public static String[] emp18()
    {
        Employees emp18 = new Employees();
        emp18.setEmpID("EMP018");
        emp18.setName("Laverne");
        emp18.setSurname("Collins");
        emp18.setDob("26/01/2000");
        emp18.setGender("Female");
        emp18.setAddress("Gaborone");
        emp18.setJob("Support");
        emp18.setHours(8);
        emp18.setDepartment("Sales");
        emp18.setRop(100);
        emp18.setCar(15);
        emp18.setGrat(156);
        emp18.setTax(5.2);

        empData[18] = new String[]{emp18.iD, emp18.name, emp18.surname, emp18.dob, emp18.gender,
                emp18.address, emp18.job, String.valueOf(emp18.hours), emp18.department,
                String.valueOf(emp18.rop), String.valueOf(emp18.car), String.valueOf(emp18.grat),
                String.valueOf(emp18.tax)};
        return empData[18];
    }
    public static String[] emp19()
    {
        Employees emp19 = new Employees();
        emp19.setEmpID("EMP019");
        emp19.setName("Tommie");
        emp19.setSurname("Miller");
        emp19.setDob("23/10/1984");
        emp19.setGender("Male");
        emp19.setAddress("Francistown");
        emp19.setJob("Marketer");
        emp19.setHours(1);
        emp19.setDepartment("Marketing");
        emp19.setRop(120);
        emp19.setCar(0);
        emp19.setGrat(50);
        emp19.setTax(4.7);

        empData[19] = new String[]{emp19.iD, emp19.name, emp19.surname, emp19.dob, emp19.gender,
                emp19.address, emp19.job, String.valueOf(emp19.hours), emp19.department,
                String.valueOf(emp19.rop), String.valueOf(emp19.car), String.valueOf(emp19.grat),
                String.valueOf(emp19.tax)};
        return empData[19];
    }
    public static String[] emp20()
    {
        Employees emp20 = new Employees();
        emp20.setEmpID("EMP020");
        emp20.setName("Nicole");
        emp20.setSurname("Sharp");
        emp20.setDob("29/01/1999");
        emp20.setGender("Female");
        emp20.setAddress("Lobatse");
        emp20.setJob("Officer");
        emp20.setHours(4);
        emp20.setDepartment("Accounts");
        emp20.setRop(150);
        emp20.setCar(15);
        emp20.setGrat(785);
        emp20.setTax(5.6);

        empData[20] = new String[]{emp20.iD, emp20.name, emp20.surname, emp20.dob, emp20.gender,
                emp20.address, emp20.job, String.valueOf(emp20.hours), emp20.department,
                String.valueOf(emp20.rop), String.valueOf(emp20.car), String.valueOf(emp20.grat),
                String.valueOf(emp20.tax)};
        return empData[20];
    }
    public static String[] emp21()
    {
        Employees emp21 = new Employees();
        emp21.setEmpID("EMP021");
        emp21.setName("Ellis");
        emp21.setSurname("Parker");
        emp21.setDob("06/02/2000");
        emp21.setGender("Female");
        emp21.setAddress("Gaborone");
        emp21.setJob("Marketer");
        emp21.setHours(15);
        emp21.setDepartment("Marketing");
        emp21.setRop(120);
        emp21.setCar(0);
        emp21.setGrat(922);
        emp21.setTax(4.7);

        empData[21] = new String[]{emp21.iD, emp21.name, emp21.surname, emp21.dob, emp21.gender,
                emp21.address, emp21.job, String.valueOf(emp21.hours), emp21.department,
                String.valueOf(emp21.rop), String.valueOf(emp21.car), String.valueOf(emp21.grat),
                String.valueOf(emp21.tax)};

        return empData[21];

    }
    public static String[] emp22()
    {
        Employees emp22 = new Employees();
        emp22.setEmpID("EMP022");
        emp22.setName("Geoffrey");
        emp22.setSurname("Moore");
        emp22.setDob("19/09/1983");
        emp22.setGender("Male");
        emp22.setAddress("Molepolole");
        emp22.setJob("Marketer");
        emp22.setHours(4);
        emp22.setDepartment("Marketing");
        emp22.setRop(120);
        emp22.setCar(0);
        emp22.setGrat(366);
        emp22.setTax(4.7);

        empData[22] = new String[]{emp22.iD, emp22.name, emp22.surname, emp22.dob, emp22.gender,
                emp22.address, emp22.job, String.valueOf(emp22.hours), emp22.department,
                String.valueOf(emp22.rop), String.valueOf(emp22.car), String.valueOf(emp22.grat),
                String.valueOf(emp22.tax)};
        return empData[22];

    }
    public static String[] emp23()
    {
        Employees emp23 = new Employees();
        emp23.setEmpID("EMP023");
        emp23.setName("Lamar");
        emp23.setSurname("Mcdonald");
        emp23.setDob("22/02/2001");
        emp23.setGender("Male");
        emp23.setAddress("Gaborone");
        emp23.setJob("Marketer");
        emp23.setHours(8);
        emp23.setDepartment("Marketing");
        emp23.setRop(120);
        emp23.setCar(0);
        emp23.setGrat(256);
        emp23.setTax(4.7);

        empData[23] = new String[]{emp23.iD, emp23.name, emp23.surname, emp23.dob, emp23.gender,
                emp23.address, emp23.job, String.valueOf(emp23.hours), emp23.department,
                String.valueOf(emp23.rop), String.valueOf(emp23.car), String.valueOf(emp23.grat),
                String.valueOf(emp23.tax)};
        return empData[23];

    }
    public static String[] emp24()
    {
        Employees emp24 = new Employees();
        emp24.setEmpID("EMP024");
        emp24.setName("Josh");
        emp24.setSurname("Sanchez");
        emp24.setDob("23/10/1984");
        emp24.setGender("Male");
        emp24.setAddress("Lobatse");
        emp24.setJob("Officer");
        emp24.setHours(10);
        emp24.setDepartment("Accounts");
        emp24.setRop(150);
        emp24.setCar(15);
        emp24.setGrat(957);
        emp24.setTax(5.6);

        empData[24] = new String[]{emp24.iD, emp24.name, emp24.surname, emp24.dob, emp24.gender,
                emp24.address, emp24.job, String.valueOf(emp24.hours), emp24.department,
                String.valueOf(emp24.rop), String.valueOf(emp24.car), String.valueOf(emp24.grat),
                String.valueOf(emp24.tax)};
        return empData[24];
    }
    public static String[] emp25()
    {
        Employees emp25 = new Employees();
        emp25.setEmpID("EMP025");
        emp25.setName("Andrea");
        emp25.setSurname("Colon");
        emp25.setDob("16/01/2001");
        emp25.setGender("Female");
        emp25.setAddress("Francistown");
        emp25.setJob("Marketer");
        emp25.setHours(8);
        emp25.setDepartment("Marketing");
        emp25.setRop(120);
        emp25.setCar(0);
        emp25.setGrat(312);
        emp25.setTax(4.7);

        empData[25] = new String[]{emp25.iD, emp25.name, emp25.surname, emp25.dob, emp25.gender,
                emp25.address, emp25.job, String.valueOf(emp25.hours), emp25.department,
                String.valueOf(emp25.rop), String.valueOf(emp25.car), String.valueOf(emp25.grat),
                String.valueOf(emp25.tax)};
        return empData[25];
    }
    public static String[] emp26()
    {
        Employees emp26 = new Employees();
        emp26.setEmpID("EMP026");
        emp26.setName("Leslie");
        emp26.setSurname("Malone");
        emp26.setDob("08/11/1983");
        emp26.setGender("Male");
        emp26.setAddress("Molepolole");
        emp26.setJob("Marketer");
        emp26.setHours(1);
        emp26.setDepartment("Marketing");
        emp26.setRop(120);
        emp26.setCar(0);
        emp26.setGrat(85);
        emp26.setTax(4.7);

        empData[26] = new String[]{emp26.iD, emp26.name, emp26.surname, emp26.dob, emp26.gender,
                emp26.address, emp26.job, String.valueOf(emp26.hours), emp26.department,
                String.valueOf(emp26.rop), String.valueOf(emp26.car), String.valueOf(emp26.grat),
                String.valueOf(emp26.tax)};
        return empData[26];
    }
    public static String[] emp27()
    {
        Employees emp27 = new Employees();
        emp27.setEmpID("EMP027");
        emp27.setName("Ronald");
        emp27.setSurname("Davidson");
        emp27.setDob("04/07/2001");
        emp27.setGender("Male");
        emp27.setAddress("Francistown");
        emp27.setJob("Support");
        emp27.setHours(6);
        emp27.setDepartment("Sales");
        emp27.setRop(100);
        emp27.setCar(5);
        emp27.setGrat(35);
        emp27.setTax(5.2);

        empData[27] = new String[]{emp27.iD, emp27.name, emp27.surname, emp27.dob, emp27.gender,
                emp27.address, emp27.job, String.valueOf(emp27.hours), emp27.department,
                String.valueOf(emp27.rop), String.valueOf(emp27.car), String.valueOf(emp27.grat),
                String.valueOf(emp27.tax)};
        return empData[27];
    }
    public static String[] emp28()
    {
        Employees emp28 = new Employees();
        emp28.setEmpID("EMP028");
        emp28.setName("Francis");
        emp28.setSurname("Reeves");
        emp28.setDob("13/08/1985");
        emp28.setGender("Male");
        emp28.setAddress("Francistown");
        emp28.setJob("Marketer");
        emp28.setHours(13);
        emp28.setDepartment("Marketing");
        emp28.setRop(120);
        emp28.setCar(0);
        emp28.setGrat(10);
        emp28.setTax(4.7);

        empData[28] = new String[]{emp28.iD, emp28.name, emp28.surname, emp28.dob, emp28.gender,
                emp28.address, emp28.job, String.valueOf(emp28.hours), emp28.department,
                String.valueOf(emp28.rop), String.valueOf(emp28.car), String.valueOf(emp28.grat),
                String.valueOf(emp28.tax)};
        return empData[28];
    }
    public static String[] emp29()
    {
        Employees emp29 = new Employees();
        emp29.setEmpID("EMP029");
        emp29.setName("Marlon");
        emp29.setSurname("Patrick");
        emp29.setDob("01/04/2000");
        emp29.setGender("Male");
        emp29.setAddress("Francistown");
        emp29.setJob("Support");
        emp29.setHours(15);
        emp29.setDepartment("Driver");
        emp29.setRop(100);
        emp29.setCar(15);
        emp29.setGrat(0);
        emp29.setTax(5.2);

        empData[29] = new String[]{emp29.iD, emp29.name, emp29.surname, emp29.dob, emp29.gender,
                emp29.address, emp29.job, String.valueOf(emp29.hours), emp29.department,
                String.valueOf(emp29.rop), String.valueOf(emp29.car), String.valueOf(emp29.grat),
                String.valueOf(emp29.tax)};
        return empData[29];
    }
    public static String[] emp30()
    {
        Employees emp30 = new Employees();
        emp30.setEmpID("EMP030");
        emp30.setName("Sean");
        emp30.setSurname("Estrada");
        emp30.setDob("17/05/1994");
        emp30.setGender("Male");
        emp30.setAddress("Gaborone");
        emp30.setJob("Support");
        emp30.setHours(15);
        emp30.setDepartment("Temp");
        emp30.setRop(100);
        emp30.setCar(0);
        emp30.setGrat(425);
        emp30.setTax(4.9);

        empData[30] = new String[]{emp30.iD, emp30.name, emp30.surname, emp30.dob, emp30.gender,
                emp30.address, emp30.job, String.valueOf(emp30.hours), emp30.department,
                String.valueOf(emp30.rop), String.valueOf(emp30.car), String.valueOf(emp30.grat),
                String.valueOf(emp30.tax)};
        return empData[30];
    }
    public static String[] emp31()
    {
        Employees emp31 = new Employees();
        emp31.setEmpID("EMP031");
        emp31.setName("Marianne");
        emp31.setSurname("Greer");
        emp31.setDob("20/08/1992");
        emp31.setGender("Female");
        emp31.setAddress("Lobatse");
        emp31.setJob("Support");
        emp31.setHours(6);
        emp31.setDepartment("Temp");
        emp31.setRop(100);
        emp31.setCar(0);
        emp31.setGrat(5);
        emp31.setTax(4.9);

        empData[31] = new String[]{emp31.iD, emp31.name, emp31.surname, emp31.dob, emp31.gender,
                emp31.address, emp31.job, String.valueOf(emp31.hours), emp31.department,
                String.valueOf(emp31.rop), String.valueOf(emp31.car), String.valueOf(emp31.grat),
                String.valueOf(emp31.tax)};
        return empData[31];
    }
    public static String[] emp32()
    {
        Employees emp32 = new Employees();
        emp32.setEmpID("EMP032");
        emp32.setName("Harriet");
        emp32.setSurname("Hines");
        emp32.setDob("25/07/1998");
        emp32.setGender("Female");
        emp32.setAddress("Francistown");
        emp32.setJob("Marketer");
        emp32.setHours(11);
        emp32.setDepartment("Marketing");
        emp32.setRop(120);
        emp32.setCar(0);
        emp32.setGrat(451);
        emp32.setTax(4.7);

        empData[32] = new String[]{emp32.iD, emp32.name, emp32.surname, emp32.dob, emp32.gender,
                emp32.address, emp32.job, String.valueOf(emp32.hours), emp32.department,
                String.valueOf(emp32.rop), String.valueOf(emp32.car), String.valueOf(emp32.grat),
                String.valueOf(emp32.tax)};
        return empData[32];

    }
    public static String[] emp33()
    {
        Employees emp33 = new Employees();
        emp33.setEmpID("EMP033");
        emp33.setName("Melissa");
        emp33.setSurname("Obrien");
        emp33.setDob("30/11/1999");
        emp33.setGender("Female");
        emp33.setAddress("Molepolole");
        emp33.setJob("Marketer");
        emp33.setHours(6);
        emp33.setDepartment("Marketing");
        emp33.setRop(120);
        emp33.setCar(0);
        emp33.setGrat(200);
        emp33.setTax(4.7);

        empData[33] = new String[]{emp33.iD, emp33.name, emp33.surname, emp33.dob, emp33.gender,
                emp33.address, emp33.job, String.valueOf(emp33.hours), emp33.department,
                String.valueOf(emp33.rop), String.valueOf(emp33.car), String.valueOf(emp33.grat),
                String.valueOf(emp33.tax)};
        return empData[33];
    }
    public static String[] emp34()
    {
        Employees emp34 = new Employees();
        emp34.setEmpID("EMP034");
        emp34.setName("Nicolas");
        emp34.setSurname("Ramsey");
        emp34.setDob("26/09/1983");
        emp34.setGender("Male");
        emp34.setAddress("Gaborone");
        emp34.setJob("Officer");
        emp34.setHours(7);
        emp34.setDepartment("Resources");
        emp34.setRop(150);
        emp34.setCar(15);
        emp34.setGrat(365);
        emp34.setTax(5.6);

        empData[34] = new String[]{emp34.iD, emp34.name, emp34.surname, emp34.dob, emp34.gender,
                emp34.address, emp34.job, String.valueOf(emp34.hours), emp34.department,
                String.valueOf(emp34.rop), String.valueOf(emp34.car), String.valueOf(emp34.grat),
                String.valueOf(emp34.tax)};
        return empData[34];
    }
    public static String[] emp35()
    {
        Employees emp35 = new Employees();
        emp35.setEmpID("EMP035");
        emp35.setName("Frances");
        emp35.setSurname("Hart");
        emp35.setDob("15/09/2001");
        emp35.setGender("Male");
        emp35.setAddress("Gaborone");
        emp35.setJob("Marketer");
        emp35.setHours(9);
        emp35.setDepartment("Marketing");
        emp35.setRop(120);
        emp35.setCar(0);
        emp35.setGrat(456);
        emp35.setTax(4.7);

        empData[35] = new String[]{emp35.iD, emp35.name, emp35.surname, emp35.dob, emp35.gender,
                emp35.address, emp35.job, String.valueOf(emp35.hours), emp35.department,
                String.valueOf(emp35.rop), String.valueOf(emp35.car), String.valueOf(emp35.grat),
                String.valueOf(emp35.tax)};
        return empData[35];
    }
    public static String[] emp36()
    {
        Employees emp36 = new Employees();
        emp36.setEmpID("EMP036");
        emp36.setName("Sammy");
        emp36.setSurname("Arnold");
        emp36.setDob("10/11/2000");
        emp36.setGender("Female");
        emp36.setAddress("Francistown");
        emp36.setJob("Marketer");
        emp36.setHours(4);
        emp36.setDepartment("Marketing");
        emp36.setRop(120);
        emp36.setCar(0);
        emp36.setGrat(54);
        emp36.setTax(4.7);

        empData[36] = new String[]{emp36.iD, emp36.name, emp36.surname, emp36.dob, emp36.gender,
                emp36.address, emp36.job, String.valueOf(emp36.hours), emp36.department,
                String.valueOf(emp36.rop), String.valueOf(emp36.car), String.valueOf(emp36.grat),
                String.valueOf(emp36.tax)};
        return empData[36];
    }
    public static String[] emp37()
    {
        Employees emp37 = new Employees();
        emp37.setEmpID("EMP037");
        emp37.setName("Cecilia");
        emp37.setSurname("Erickson");
        emp37.setDob("26/12/1983");
        emp37.setGender("Female");
        emp37.setAddress("Gaborone");
        emp37.setJob("Officer");
        emp37.setHours(9);
        emp37.setDepartment("Resources");
        emp37.setRop(150);
        emp37.setCar(15);
        emp37.setGrat(98);
        emp37.setTax(5.6);

        empData[37] = new String[]{emp37.iD, emp37.name, emp37.surname, emp37.dob, emp37.gender,
                emp37.address, emp37.job, String.valueOf(emp37.hours), emp37.department,
                String.valueOf(emp37.rop), String.valueOf(emp37.car), String.valueOf(emp37.grat),
                String.valueOf(emp37.tax)};
        return empData[37];
    }
    public static String[] emp38()
    {
        Employees emp38 = new Employees();
        emp38.setEmpID("EMP038");
        emp38.setName("Rodney");
        emp38.setSurname("Nash");
        emp38.setDob("03/06/1999");
        emp38.setGender("Male");
        emp38.setAddress("Gaborone");
        emp38.setJob("Support");
        emp38.setHours(2);
        emp38.setDepartment("TourOperator");
        emp38.setRop(100);
        emp38.setCar(15);
        emp38.setGrat(156);
        emp38.setTax(5.2);

        empData[38] = new String[]{emp38.iD, emp38.name, emp38.surname, emp38.dob, emp38.gender,
                emp38.address, emp38.job, String.valueOf(emp38.hours), emp38.department,
                String.valueOf(emp38.rop), String.valueOf(emp38.car), String.valueOf(emp38.grat),
                String.valueOf(emp38.tax)};
        return empData[38];
    }
    public static String[] emp39()
    {
        Employees emp39 = new Employees();
        emp39.setEmpID("EMP039");
        emp39.setName("Forrest");
        emp39.setSurname("Soto");
        emp39.setDob("20/05/1997");
        emp39.setGender("Male");
        emp39.setAddress("Lobatse");
        emp39.setJob("Marketer");
        emp39.setHours(7);
        emp39.setDepartment("Marketing");
        emp39.setRop(120);
        emp39.setCar(0);
        emp39.setGrat(658);
        emp39.setTax(4.7);

        empData[39] = new String[]{emp39.iD, emp39.name, emp39.surname, emp39.dob, emp39.gender,
                emp39.address, emp39.job, String.valueOf(emp39.hours), emp39.department,
                String.valueOf(emp39.rop), String.valueOf(emp39.car), String.valueOf(emp39.grat),
                String.valueOf(emp39.tax)};
        return empData[39];
    }
    public static String[] emp40()
    {
        Employees emp40 = new Employees();
        emp40.setEmpID("EMP040");
        emp40.setName("Leona");
        emp40.setSurname("Parsons");
        emp40.setDob("02/08/1999");
        emp40.setGender("Female");
        emp40.setAddress("Gaborone");
        emp40.setJob("Marketer");
        emp40.setHours(10);
        emp40.setDepartment("Marketing");
        emp40.setRop(120);
        emp40.setCar(0);
        emp40.setGrat(385);
        emp40.setTax(4.7);

        empData[40] = new String[]{emp40.iD, emp40.name, emp40.surname, emp40.dob, emp40.gender,
                emp40.address, emp40.job, String.valueOf(emp40.hours), emp40.department,
                String.valueOf(emp40.rop), String.valueOf(emp40.car), String.valueOf(emp40.grat),
                String.valueOf(emp40.tax)};
        return empData[40];
    }
    public static String[] emp41()
    {
        Employees emp41 = new Employees();
        emp41.setEmpID("EMP041");
        emp41.setName("William");
        emp41.setSurname("Rodriquez");
        emp41.setDob("16/09/1993");
        emp41.setGender("Male");
        emp41.setAddress("Gaborone");
        emp41.setJob("Manager");
        emp41.setHours(13);
        emp41.setDepartment("Management");
        emp41.setRop(250);
        emp41.setCar(30);
        emp41.setGrat(1025);
        emp41.setTax(6.1);

        empData[41] = new String[]{emp41.iD, emp41.name, emp41.surname, emp41.dob, emp41.gender,
                emp41.address, emp41.job, String.valueOf(emp41.hours), emp41.department,
                String.valueOf(emp41.rop), String.valueOf(emp41.car), String.valueOf(emp41.grat),
                String.valueOf(emp41.tax)};
        return empData[41];

    }
    public static String[] emp42()
    {
        Employees emp42 = new Employees();
        emp42.setEmpID("EMP042");
        emp42.setName("Reginald");
        emp42.setSurname("Hardy");
        emp42.setDob("29/04/1991");
        emp42.setGender("Male");
        emp42.setAddress("Molepolole");
        emp42.setJob("Support");
        emp42.setHours(7);
        emp42.setDepartment("TourOperator");
        emp42.setRop(100);
        emp42.setCar(15);
        emp42.setGrat(755);
        emp42.setTax(5.2);

        empData[42] = new String[]{emp42.iD, emp42.name, emp42.surname, emp42.dob, emp42.gender,
                emp42.address, emp42.job, String.valueOf(emp42.hours), emp42.department,
                String.valueOf(emp42.rop), String.valueOf(emp42.car), String.valueOf(emp42.grat),
                String.valueOf(emp42.tax)};
        return empData[42];
    }
    public static String[] emp43()
    {
        Employees emp43 = new Employees();
        emp43.setEmpID("EMP043");
        emp43.setName("Viola");
        emp43.setSurname("Curtis");
        emp43.setDob("06/12/1988");
        emp43.setGender("Female");
        emp43.setAddress("Gaborone");
        emp43.setJob("Officer");
        emp43.setHours(1);
        emp43.setDepartment("Accounts");
        emp43.setRop(150);
        emp43.setCar(15);
        emp43.setGrat(760);
        emp43.setTax(5.6);

        empData[43] = new String[]{emp43.iD, emp43.name, emp43.surname, emp43.dob, emp43.gender,
                emp43.address, emp43.job, String.valueOf(emp43.hours), emp43.department,
                String.valueOf(emp43.rop), String.valueOf(emp43.car), String.valueOf(emp43.grat),
                String.valueOf(emp43.tax)};
        return empData[43];
    }
    public static String[] emp44()
    {
        Employees emp44 = new Employees();
        emp44.setEmpID("EMP044");
        emp44.setName("Ed");
        emp44.setSurname("Gordon");
        emp44.setDob("16/03/1999");
        emp44.setGender("Male");
        emp44.setAddress("Francistown");
        emp44.setJob("Support");
        emp44.setHours(4);
        emp44.setDepartment("Temp");
        emp44.setRop(100);
        emp44.setCar(0);
        emp44.setGrat(80);
        emp44.setTax(4.9);

        empData[44] = new String[]{emp44.iD, emp44.name, emp44.surname, emp44.dob, emp44.gender,
                emp44.address, emp44.job, String.valueOf(emp44.hours), emp44.department,
                String.valueOf(emp44.rop), String.valueOf(emp44.car), String.valueOf(emp44.grat),
                String.valueOf(emp44.tax)};
        return empData[44];
    }
    public static String[] emp45()
    {
        Employees emp45 = new Employees();
        emp45.setEmpID("EMP045");
        emp45.setName("Edd");
        emp45.setSurname("Barnett");
        emp45.setDob("02/05/1995");
        emp45.setGender("Male");
        emp45.setAddress("Gaborone");
        emp45.setJob("Marketer");
        emp45.setHours(13);
        emp45.setDepartment("Marketing");
        emp45.setRop(120);
        emp45.setCar(0);
        emp45.setGrat(92);
        emp45.setTax(4.7);

        empData[45] = new String[]{emp45.iD, emp45.name, emp45.surname, emp45.dob, emp45.gender,
                emp45.address, emp45.job, String.valueOf(emp45.hours), emp45.department,
                String.valueOf(emp45.rop), String.valueOf(emp45.car), String.valueOf(emp45.grat),
                String.valueOf(emp45.tax)};
        return empData[45];
    }
    public static String[] emp46()
    {
        Employees emp46 = new Employees();
        emp46.setEmpID("EMP046");
        emp46.setName("Eddy");
        emp46.setSurname("Brooks");
        emp46.setDob("09/03/1987");
        emp46.setGender("Male");
        emp46.setAddress("Gaborone");
        emp46.setJob("Marketer");
        emp46.setHours(1);
        emp46.setDepartment("Marketing");
        emp46.setRop(120);
        emp46.setCar(0);
        emp46.setGrat(700);
        emp46.setTax(4.7);

        empData[46] = new String[]{emp46.iD, emp46.name, emp46.surname, emp46.dob, emp46.gender,
                emp46.address, emp46.job, String.valueOf(emp46.hours), emp46.department,
                String.valueOf(emp46.rop), String.valueOf(emp46.car), String.valueOf(emp46.grat),
                String.valueOf(emp46.tax)};
        return empData[46];
    }
    public static String[] emp47()
    {
        Employees emp47 = new Employees();
        emp47.setEmpID("EMP047");
        emp47.setName("Emma");
        emp47.setSurname("Brooks");
        emp47.setDob("06/05/2000");
        emp47.setGender("Female");
        emp47.setAddress("Gaborone");
        emp47.setJob("Support");
        emp47.setHours(3);
        emp47.setDepartment("Driver");
        emp47.setRop(100);
        emp47.setCar(15);
        emp47.setGrat(241);
        emp47.setTax(4.7);

        empData[47] = new String[]{emp47.iD, emp47.name, emp47.surname, emp47.dob, emp47.gender,
                emp47.address, emp47.job, String.valueOf(emp47.hours), emp47.department,
                String.valueOf(emp47.rop), String.valueOf(emp47.car), String.valueOf(emp47.grat),
                String.valueOf(emp47.tax)};
        return empData[47];
    }
    public static String[] emp48()
    {
        Employees emp48 = new Employees();
        emp48.setEmpID("EMP048");
        emp48.setName("Wilbert");
        emp48.setSurname("Allison");
        emp48.setDob("14/02/1983");
        emp48.setGender("Male");
        emp48.setAddress("Molepolole");
        emp48.setJob("Marketer");
        emp48.setHours(10);
        emp48.setDepartment("Marketing");
        emp48.setRop(120);
        emp48.setCar(0);
        emp48.setGrat(300);
        emp48.setTax(4.7);

        empData[48] = new String[]{emp48.iD, emp48.name, emp48.surname, emp48.dob, emp48.gender,
                emp48.address, emp48.job, String.valueOf(emp48.hours), emp48.department,
                String.valueOf(emp48.rop), String.valueOf(emp48.car), String.valueOf(emp48.grat),
                String.valueOf(emp48.tax)};
        return empData[48];
    }
    public static String[] emp49()
    {
        Employees emp49 = new Employees();
        emp49.setEmpID("EMP049");
        emp49.setName("Belinda");
        emp49.setSurname("Wise");
        emp49.setDob("03/07/1985");
        emp49.setGender("Female");
        emp49.setAddress("Gaborone");
        emp49.setJob("Support");
        emp49.setHours(5);
        emp49.setDepartment("ICT");
        emp49.setRop(100);
        emp49.setCar(15);
        emp49.setGrat(654);
        emp49.setTax(5.2);

        empData[49] = new String[]{emp49.iD, emp49.name, emp49.surname, emp49.dob, emp49.gender,
                emp49.address, emp49.job, String.valueOf(emp49.hours), emp49.department,
                String.valueOf(emp49.rop), String.valueOf(emp49.car), String.valueOf(emp49.grat),
                String.valueOf(emp49.tax)};
        return empData[49];
    }
    public static String[] emp50()
    {
        Employees emp50 = new Employees();
        emp50.setEmpID("EMP050");
        emp50.setName("Doreen");
        emp50.setSurname("Haynes");
        emp50.setDob("17/07/2000");
        emp50.setGender("Female");
        emp50.setAddress("Gaborone");
        emp50.setJob("Marketer");
        emp50.setHours(2);
        emp50.setDepartment("Marketing");
        emp50.setRop(120);
        emp50.setCar(0);
        emp50.setGrat(200);
        emp50.setTax(4.7);

        empData[50] = new String[]{emp50.iD, emp50.name, emp50.surname, emp50.dob, emp50.gender,
                emp50.address, emp50.job, String.valueOf(emp50.hours), emp50.department,
                String.valueOf(emp50.rop), String.valueOf(emp50.car), String.valueOf(emp50.grat),
                String.valueOf(emp50.tax)};
        return empData[50];
    }


    //public static void main(String[] args) {




        //Getting salary getter
        /*int sal = emp.getSalary();
        int increment = 0;

        //Incrementing salary based on condition
        if((sal >= 1000) && (sal <= 1500))
        {
            increment += (sal*2)/100;
            sal = sal+increment;

            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);
        }
        else if((sal >= 1500) && (sal <= 20000))
        {
            increment += (sal*5)/100;
            sal = sal + increment;

            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);
        }else {
            System.out.println("\n Salary is not incremented \n");
            System.out.println(emp);
        }*/
    //}
}
