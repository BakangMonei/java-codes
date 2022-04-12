public class Employees
{
    int salary;
    int hours, rop, car, grat;
    double tax;
    String iD ,name, surname, dob, gender, address, job, department;

    //Getters
    public String getID()
    {
        return iD;
    }
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public String getDob()
    {
        return dob;
    }
    public String getGender()
    {
        return gender;
    }
    public String getAddress()
    {
        return address;
    }
    public String getJob()
    {
        return job;
    }
    public int getHours()
    {
        return hours;
    }
    public String getDepartment()
    {
        return department;
    }
    public int getRop()
    {
        return rop;
    }
    public int getCar()
    {
        return car;
    }
    public int getGrat()
    {
        return grat;
    }
    public double getTax()
    {
        return tax;
    }

    //Setters
    public void setEmpID(String empID)
    {
        this.iD = empID;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setDob(String dob)
    {
        this.dob = dob;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setJob(String job)
    {
        this.job = job;
    }
    public void setHours(int hours)
    {
        this.hours = hours;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
    public void setRop(int rop)
    {
        this.rop = rop;
    }
    public void setCar(int car)
    {
        this.car = car;
    }
    public void setGrat(int grat)
    {
        this.grat = grat;
    }
    public void setTax(double tax)
    {
        this.tax = tax;
    }


    public double[] calcSalary()
    {
        double[] salary = new double[51];

        salary[1] = (3*120) * 4;
        salary[2] = (4*100) * 4;
        salary[3] = (4*150) * 4;
        salary[4] = (14*100) * 4;
        salary[5] = (7*100) * 4;
        salary[6] = (12*120) * 4;
        salary[7] = (1*120) * 4;
        salary[8] = (12*120) * 4;
        salary[9] = (14*150) * 4;
        salary[10] = (2*120) * 4;
        salary[11] = (13*120) * 4;
        salary[12] = (14*120) * 4;
        salary[13] = (6*150) * 4;
        salary[14] = (1*120) * 4;
        salary[15] = (15*150) * 4;
        salary[16] = (1*120) * 4;
        salary[17] = (1*150) * 4;
        salary[18] = (8*100) * 4;
        salary[19] = (1*120) * 4;
        salary[20] = (4*100) * 4;
        salary[21] = (15*120) * 4;
        salary[22] = (4*120) * 4;
        salary[23] = (8*120) * 4;
        salary[24] = (10*100) * 4;
        salary[25] = (8*120) * 4;
        salary[26] = (1*120) * 4;
        salary[27] = (6*100) * 4;
        salary[28] = (13*120) * 4;
        salary[29] = (15*100) * 4;
        salary[30] = (15*100) * 4;
        salary[31] = (6*100) * 4;
        salary[32] = (11*120) * 4;
        salary[33] = (6*120) * 4;
        salary[34] = (7*150) * 4;
        salary[35] = (9*120) * 4;
        salary[36] = (4*120) * 4;
        salary[37] = (9*150) * 4;
        salary[38] = (2*100) * 4;
        salary[39] = (7*120) * 4;
        salary[40] = (10*120) * 4;
        salary[41] = (13*250) * 4;
        salary[42] = (7*100) * 4;
        salary[43] = (1*100) * 4;
        salary[44] = (4*100) * 4;
        salary[45] = (13*120) * 4;
        salary[46] = (4*120) * 4;
        salary[47] = (3*100) * 4;
        salary[48] = (10*120) * 4;
        salary[49] = (5*100) * 4;
        salary[50] = (2*120) * 4;

        return salary;
    }

    public double[] calcGross()
    {
        double[] gross = new double[51];

        gross[1] = ((3*120*4) + 185);
        gross[2] = ((4*100*4) + ((4*100*4)*(.15) + 354));
        gross[3] = ((4*150*4) + (4*150*4)*(.15)) + 25;
        gross[4] = ((14*100*4) + (14*100*4)*(.15) + 135);
        gross[5] = ((7*100*4) + 20);
        gross[6] = ((12*100*4) + (12*100*4)*(.15) + 522);
        gross[7] = ((1*120*4));
        gross[8] = ((12*120*4) + 452);
        gross[9] = ((14*150*4) + (14*150*4)*(.15) + 788);
        gross[10] = ((2*120*4) + 288);
        gross[11] = ((13*120*4) + 186);
        gross[12] = ((14*120*4) + 456);
        gross[13] = ((6*150*4) + (6*150*4)*(.15) + 35);
        gross[14] = ((1*120*4) + 65);
        gross[15] = ((15*150*4) + (15*150*4)*(.15) + 87);
        gross[16] = ((1*120*4) + 97);
        gross[17] = ((1*150*4) + (1*150*4)*(.15) + 100);
        gross[18] = ((8*100*4) + (8*100*4)*(.15) + 156);
        gross[19] = ((1*120*4) + 50);
        gross[20] = ((4*100*4) + (4*150*4)*(.15) + 785);
        gross[21] = ((15*120*4) + 922);
        gross[22] = ((4*120*4) + 366);
        gross[23] = ((8*120*4) + 256);
        gross[24] = ((10*150*4) + (10*150*4)*(.15) + 957);
        gross[25] = ((8*120*4) + 312);
        gross[26] = ((1*120*4) + 85);
        gross[27] = ((6*100*4) + (10*100*4)*(.15) + 35);
        gross[28] = ((13*120*4) + 10);
        gross[29] = ((15*100*4) + ((15*100*4)*(.15)) + 15);
        gross[30] = ((15*100*4) + (15*100*4)*(.15) + 425);
        gross[31] = ((6*100*4) + 5);
        gross[32] = ((11*120*4) + 451);
        gross[33] = ((6*120*4) + 200);
        gross[34] = ((7*150*4) + (7*150*4)*(.15) + 365);
        gross[35] = ((9*120*4) + 456);
        gross[36] = ((4*120*4) + 54);
        gross[37] = ((9*150*4) + (9*100*4)*(.15) + 98);
        gross[38] = ((2*100*4) + (2*100*4)*(.15) + 156);
        gross[39] = ((7*120*4) + 658);
        gross[40] = ((10*120*4) + 385);
        gross[41] = ((13*250*4) + (13*250*4)*(.30) + 1025);
        gross[42] = ((7*100*4) + (7*100*4)*(.15) + 755);
        gross[43] = ((1*100*4) + (1*100*4)*(.15) + 760);
        gross[44] = ((4*100*4) + 80);
        gross[45] = ((13*120*4) + 92);
        gross[46] = ((4*120*4) + 700);
        gross[47] = ((3*100*4) + (3*100*4)*(.15) + 241);
        gross[48] = ((10*120*4) + 300);
        gross[49] = ((5*100*4) + (5*100*4)*(.15) + 654);
        gross[50] = ((2*120*4) + 200);

        return gross;
    }

    @Override
    public String toString() {
        String a = iD + " " + name + " " + surname + " " + dob + " " + gender + " " + address + " " + job + " " + hours
                + " " + department + " " + rop + " " + car + " " + grat + " " + tax + ";";

        return a;
    }
}
