import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToATextFile {

    public static void main(String[] args) {
        Employees employee1 = new Employees("BK001", "Monei", "BKG", "20/July/2002", 'M', "P_O_Box_817_Mochudi", "CEO", "20/July/2017", "Management", 200, 160, 40, 0.30 * (160 * 200), 0.0212 * (160 * 200), 0.14 * (160 * 200), ((200 * 160) + (0.30 * (160 * 200))) - ((0.14 * (160 * 200)) + (0.0212 * (160 * 200))), "Gaborone");
        Employees employee2 = new Employees("BK002", "Bosa", "Maake", "16/September/2002", 'F', "P_O_Box_9_Mochudi", "HR", "05/March/2021", "Management", 200, 150, 30, 0.30 * (150 * 20), 0.0212 * (150 * 200), 0.14 * (150 * 200), ((200 * 150) + (0.30 * (150 * 200))) - ((0.14 * (150 * 200)) + (0.0212 * (150 * 200))), "Gaborone");
        Employees employee3 = new Employees("BK003", "Richard", "Motladiile", "22/June/2002", 'M', "P_O_Box_32_Digawana", "Finance and Marketing Officer", "05/March/2021", "Management", 200, 140, 30, 0.30 * (140 * 20), 0.0212 * (140 * 200), 0.14 * (140 * 200), ((200 * 140) + (0.30 * (140 * 200))) - ((0.14 * (140 * 200)) + (0.0212 * (140 * 200))), "Gaborone");
        Employees employee4 = new Employees("BK004", "Same", "Mokgosi", "05/June/2002", 'F', "P_O_Box_465_Lobatse", "Finance Manager", "05/March/2021", "Management", 200, 130, 30, 0.30 * (130 * 20), 0.0212 * (130 * 200), 0.14 * (130 * 200), ((200 * 130) + (0.30 * (130 * 200))) - ((0.14 * (130 * 200)) + (0.0212 * (130 * 200))), "Gaborone");
        Employees employee5 = new Employees("BK005", "Bampati", "Leririma", "09/June/2002", 'M', "P_O_Box_67_Digawana", "Marketing Manager", "05/March/2021", "Management", 200, 130, 30, 0.30 * (130 * 20), 0.0212 * (130 * 200), 0.14 * (130 * 200), ((200 * 130) + (0.30 * (130 * 200))) - ((0.14 * (130 * 200)) + (0.0212 * (130 * 200))), "Gaborone");
        Employees employee6 = new Employees("BK006", "Wesley", "Koothupile", "18/02/02", 'M', "P_O_Box_63_Molapowabojang", "ICT", "05/March/2021", "Support Stuff", 200, 118, 28, 0.15 * (118 * 20), 0.0212 * (118 * 200), 0.14 * (118 * 200), ((200 * 118) + (0.15 * (118 * 200))) - ((0.14 * (118 * 200)) + (0.0212 * (118 * 200))), "Gaborone");
        Employees employee7 = new Employees("BK007", "Oratile", "Seoke", "03/February/2001", 'F', "P_O_Box_748 Gaborone", "Sales Officer 1", "05/March/2021", "Support Stuff", 200, 112, 30, 0.15 * (112 * 20), 0.0212 * (112 * 200), 0.14 * (112 * 200), ((200 * 112) + (0.15 * (112 * 200))) - ((0.14 * (112 * 200)) + (0.0212 * (112 * 200))), "Gaborone");
        Employees employee8 = new Employees("BK008", "Luba", "Daisy", "06/June/2002", 'F', "P_O_Box_37378_Francistown", "Sales Officer 3", "05/March/2021", "Temporary Stuff", 200, 112, 28, 0.15 * (112 * 20), 0.0212 * (112 * 200), 0.14 * (112 * 200), ((200 * 112) + (0.15 * (112 * 200))) - ((0.14 * (112 * 200)) + (0.0212 * (112 * 200))), "Francistown");
        Employees employee9 = new Employees("BK009", "Chao", "Mothuti", "20/March/2002", 'F', "P_O_Box_8659_Serowe", "Sales Officer 3", "05/March/2021", "Temporary Stuff", 200, 112, 28, 0.15 * (112 * 20), 0.0212 * (112 * 200), 0.14 * (112 * 200), ((200 * 112) + (0.15 * (112 * 200))) - ((0.14 * (112 * 200)) + (0.0212 * (112 * 200))), "Gaborone");
        Employees employee10 = new Employees("BK010", "Ame", "Mmaseapei", "18/November/2000", 'F', "P_O_Box_737_Gaborone", "Sales Officer 4", "05/March/2021", "Support Stuff", 200, 112, 28, 0.15 * (112 * 20), 0.0212 * (112 * 200), 0.14 * (112 * 200), ((200 * 112) + (0.15 * (112 * 200))) - ((0.14 * (112 * 200)) + (0.0212 * (112 * 200))), "Manila");
        Employees employee11 = new Employees("BK011", "Blessings", "Motshabi", "21/January/1999", 'M', "P_O_Box_763 Palapye", "Sales Officer 5", "05/March/2021", "Temporary Stuff", 200, 112, 28, 0.15 * (112 * 20), 0.0212 * (112 * 200), 0.14 * (112 * 200), ((200 * 112) + (0.15 * (112 * 200))) - ((0.14 * (112 * 200)) + (0.0212 * (112 * 200))), "Tianjin");
        Employees employee12 = new Employees("BK012", "Wame", "Setombeko", "14/April/2002", 'M', "P_O_Box_54_Molapowabojang", "Tour Operator 1", "05/March/2021", "Support Stuff", 200, 100, 28, 0.15 * (100 * 20), 0.0212 * (100 * 200), 0.14 * (100 * 200), ((200 * 100) + (0.15 * (110 * 200))) - ((0.14 * (100 * 200)) + (0.0212 * (100 * 200))), "Hong Kong");
        Employees employee13 = new Employees("BK013", "Kaone", "Phiri", "30/July/2002", 'F', "P_O_Box_653_Lobatse", "Tour Operator 2", "05/March/2021", "Support Stuff", 200, 100, 28, 0.15 * (100 * 20), 0.0212 * (100 * 200), 0.14 * (100 * 200), ((200 * 100) + (0.15 * (110 * 200))) - ((0.14 * (100 * 200)) + (0.0212 * (100 * 200))), "Mumbai");
        Employees employee14 = new Employees("BK014", "Phatsimo", "Sinah", "16/June/2002", 'F', "P_O_Box_434_Gaborone", "Driver 1", "05/March/2021", "Temporary Stuff", 200, 98, 28, 0.15 * (98 * 20), 0.0212 * (98 * 200), 0.14 * (98 * 200), ((200 * 98) + (0.15 * (98 * 200))) - ((0.14 * (98 * 200)) + (0.0212 * (98 * 200))), "Sydney");
        Employees employee15 = new Employees("BK015", "Katlego", "Thabare", "15/February/2002", 'F', "P_O_Box_87887_Maun", "Driver 2", "05/March/2021", "Support Stuff", 200, 98, 28, 0.15 * (98 * 20), 0.0212 * (98 * 200), 0.14 * (98 * 200), ((200 * 98) + (0.15 * (98 * 200))) - ((0.14 * (98 * 200)) + (0.0212 * (98 * 200))), "Gaborone");
        Employees employee16 = new Employees("BK016", "Katlego", "Chaba", "28/May/2002", 'F', "P_O_Box_767_Lobatse", "HR Officer 1", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "Seoul");
        Employees employee17 = new Employees("BK017", "Leatile", "Ramakgetla", "09/December/2001", 'M', "P_O_Box_989_Mahalapye", "HR Officer 2", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "Doha");
        Employees employee18 = new Employees("BK018", "Ame", "Makaba", "09/October/2001", 'F', "P_O_Box_89_Lobatse", "HR Officer 3", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "Las Vegas");
        Employees employee19 = new Employees("BK019", "Theo", "Dipholo", "17/August/2000", 'M', "P_O_Box_23_Kang", "HR Officer 4", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "Isranbul");
        Employees employee20 = new Employees("BK020", "Noah", "Pelaelo", "29/January/2001", 'M', "P_O_Box_876_Gaborone", "HR Officer 5", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "Washington DC");
        Employees employee21 = new Employees("BK021", "Kokamo", "Mothuti", "28/February/2002", 'F', "P_O_Box_29_Lobatse", "Account Officer 1", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "Prague");
        Employees employee22 = new Employees("BK022", "Tsotlhe", "Madingwane", "13/March/2001", 'F', "P_O_Box_383_Tlokweng", "Account Officer 2", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "Berlin");
        Employees employee23 = new Employees("BK023", "Karabo", "Moseki", "28/May/2001", 'F', "P_O_Box_848_Palapye", "Account Officer 3", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "Amsterdam");
        Employees employee24 = new Employees("BK024", "Botlhe", "Ramoitoi", "31/October/2001", 'F', "P_O_Box_21_Tlokweng", "Account Officer 4", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "St. Petersburg");
        Employees employee25 = new Employees("BK025", "Theo", "Makaba", "07/May/2002", 'M', "P_O_Box_78_Ramotswa", "Account Officer 5", "05/March/2021", "HR and Account Stuff", 200, 110, 35, 0.15 * (110 * 20), 0.0212 * (110 * 200), 0.14 * (110 * 200), ((200 * 110) + (0.15 * (110 * 200))) - ((0.14 * (110 * 200)) + (0.0212 * (110 * 200))), "Abu Dabhi");
        Employees employee26 = new Employees("BK026", "Leungo", "Tshwaaro", "10/November/2001", 'F', "P_O_Box_737_Mochudi", "Marketing Executive 1", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Barcelona");
        Employees employee27 = new Employees("BK027", "Billy", "Gwakuba", "12/March/2002", 'F', "P_O_Box_84_Molepolole", "Marketing Executive 2", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Madrid");
        Employees employee28 = new Employees("BK028", "Taboka", "Mutshewa", "13/January/2002", 'F', "P_O_Box_8579_Gaborone", "Marketing Executive 3", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "San Fracisco");
        Employees employee29 = new Employees("BK029", "Nelly", "Sekgabo", "15/June/2002", 'F', "P_O_Box_38_Lobatse", "Marketing Executive 4", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Toronto");
        Employees employee30 = new Employees("BK030", "Laone", "Bagopi", "03/July/2001", 'F', "P_O_Box_838_Mochudi", "Marketing Executive 5", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Johannesburg");
        Employees employee31 = new Employees("BK031", "Asele", "Godson", "03/February/2001", 'M', "P_O_Box_26_Pitsane-Molopo", "Marketing Executive 6", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Cape Town");
        Employees employee32 = new Employees("BK032", "Mokwadi", "Gibe", "25/October/2001", 'M', "P_O_Box_36_Rasesa", "Marketing Executive 7", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Harare");
        Employees employee33 = new Employees("BK033", "Moses", "JP", "06/May/2001", 'M', "P_O_Box_625_Francistown", "Marketing Executive 8", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Lusaka");
        Employees employee34 = new Employees("BK034", "Ace", "Swantalala", "03/April/2001", 'M', "P_O_Box_74_Mochudi", "Marketing Executive 9", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Budapest");
        Employees employee35 = new Employees("BK035", "Peo", "Sebara", "09/July/2002", 'F', "P_O_Box_12_Mogobane", "Marketing Executive 10", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Manchester City");
        Employees employee36 = new Employees("BK036", "Resego", "Maiswe", "09/March/2001", 'F', "P_O_Box_252_GaboroneNorth", "Marketing Executive 11", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Barcelona");
        Employees employee37 = new Employees("BK037", "Thuto", "Lucas", "02/March/2002", 'M', "P_O_Box_353_Maun", "Marketing Executive 12", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Accra");
        Employees employee38 = new Employees("BK038", "Kebaone", "Keabetswe", "07/December/2002", 'M', "P_O_Box_747_Maun", "Marketing Executive 13", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Pretoria");
        Employees employee39 = new Employees("BK040", "Black", "Cheddar", "02/January/2002", 'M', "P_O_Box_45_Mahalapye", "Marketing Executive 14", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Paris");
        Employees employee40 = new Employees("BK040", "Kamogelo", "Mbulai", "09/March/2002", 'F', "P_O_Box_646_Tsabong", "Marketing Executive 15", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Venezuela");
        Employees employee41 = new Employees("BK041", "Sophie", "Lore", "05/April/2000", 'F', "P_O_Box_34_Kgomokasitswa", "Marketing Executive 16", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "London");
        Employees employee42 = new Employees("BK042", "Phemelo", "Marumo", "08/May/2001", 'F', "P_O_Box_333_Tlokweng", "Marketing Executive 17", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Moscow");
        Employees employee43 = new Employees("BK043", "Lone", "Obakeng", "13/December/2002", 'F', "P_O_Box_56_Serowe", "Marketing Executive 18", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Tokyo");
        Employees employee44 = new Employees("BK044", "Thembi", "Mokoti", "23/June/2001", 'F', "P_O_Box_34_Ghanzi", "Marketing Executive 19", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Singapore");
        Employees employee45 = new Employees("BK045", "Cheludo", "Gondo", "09/April/2001", 'F', "P_O_Box_45_Nkange", "Marketing Executive 20", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Dubai");
        Employees employee46 = new Employees("BK046", "Lorato", "Bakwena", "23/December/2002", 'F', "P_O_Box_47_Nkange", "Marketing Executive 21", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "New York");
        Employees employee47 = new Employees("BK047", "Dineo", "Ngwako", "16/December/2002", 'F', "P_O_Box_36_Serowe", "Marketing Executive 22", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Los Angelos");
        Employees employee48 = new Employees("BK048", "Benjamin", "Moilwa", "20/January/2002", 'M', "P_O_Box_3873_Francistown", "Marketing Executive 23", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Madrid");
        Employees employee49 = new Employees("BK049", "Letso", "Motshegwe", "26/May/2002", 'F', "P_O_Box_373_Kang", "Marketing Executive 24", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Rome");
        Employees employee50 = new Employees("BK050", "Grivas", "Molefhe", "27/April/2001", 'M', "P_O_Box_817_Mathangwane", "Marketing Executive 25", "05/March/2021", "Marketing Executive Stuff", 200, 108, 30, 0, 0.0212 * (108 * 200), 0.14 * (108 * 200), ((200 * 108)) - ((0.14 * (108 * 200)) + (0.0212 * (108 * 200))), "Chicago");

        Employees[] Access = new Employees[50];
        Access[0] = employee1;
        Access[1] = employee2;
        Access[2] = employee3;
        Access[3] = employee4;
        Access[4] = employee5;
        Access[5] = employee6;
        Access[6] = employee7;
        Access[7] = employee8;
        Access[8] = employee9;
        Access[9] = employee10;
        Access[10] = employee11;
        Access[11] = employee12;
        Access[12] = employee13;
        Access[13] = employee14;
        Access[14] = employee15;
        Access[15] = employee16;
        Access[16] = employee17;
        Access[17] = employee18;
        Access[18] = employee19;
        Access[19] = employee20;
        Access[20] = employee21;
        Access[21] = employee22;
        Access[22] = employee23;
        Access[23] = employee24;
        Access[24] = employee25;
        Access[25] = employee26;
        Access[26] = employee27;
        Access[27] = employee28;
        Access[28] = employee29;
        Access[29] = employee30;
        Access[30] = employee31;
        Access[31] = employee32;
        Access[32] = employee33;
        Access[33] = employee34;
        Access[34] = employee35;
        Access[35] = employee36;
        Access[36] = employee37;
        Access[37] = employee38;
        Access[38] = employee39;
        Access[39] = employee40;
        Access[40] = employee41;
        Access[41] = employee42;
        Access[42] = employee43;
        Access[43] = employee44;
        Access[44] = employee45;
        Access[45] = employee46;
        Access[46] = employee47;
        Access[47] = employee48;
        Access[48] = employee49;
        Access[49] = employee50;
        for (int i = 0; i < Access.length; i++) {

            //Creating a file
            File file = new File("employee.txt");
            try {
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.println(Access[0].toString());
                printWriter.println(Access[1].toString());
                printWriter.println(Access[2].toString());
                printWriter.println(Access[3].toString());
                printWriter.println(Access[4].toString());
                printWriter.println(Access[5].toString());
                printWriter.println(Access[6].toString());
                printWriter.println(Access[7].toString());
                printWriter.println(Access[8].toString());
                printWriter.println(Access[9].toString());
                printWriter.println(Access[10].toString());
                printWriter.println(Access[11].toString());
                printWriter.println(Access[12].toString());
                printWriter.println(Access[13].toString());
                printWriter.println(Access[14].toString());
                printWriter.println(Access[15].toString());
                printWriter.println(Access[16].toString());
                printWriter.println(Access[17].toString());
                printWriter.println(Access[18].toString());
                printWriter.println(Access[19].toString());
                printWriter.println(Access[20].toString());
                printWriter.println(Access[21].toString());
                printWriter.println(Access[22].toString());
                printWriter.println(Access[23].toString());
                printWriter.println(Access[24].toString());
                printWriter.println(Access[25].toString());
                printWriter.println(Access[26].toString());
                printWriter.println(Access[27].toString());
                printWriter.println(Access[28].toString());
                printWriter.println(Access[29].toString());
                printWriter.println(Access[30].toString());
                printWriter.println(Access[31].toString());
                printWriter.println(Access[32].toString());
                printWriter.println(Access[33].toString());
                printWriter.println(Access[34].toString());
                printWriter.println(Access[35].toString());
                printWriter.println(Access[36].toString());
                printWriter.println(Access[37].toString());
                printWriter.println(Access[38].toString());
                printWriter.println(Access[39].toString());
                printWriter.println(Access[40].toString());
                printWriter.println(Access[41].toString());
                printWriter.println(Access[42].toString());
                printWriter.println(Access[43].toString());
                printWriter.println(Access[44].toString());
                printWriter.println(Access[45].toString());
                printWriter.println(Access[46].toString());
                printWriter.println(Access[47].toString());
                printWriter.println(Access[48].toString());
                printWriter.println(Access[49].toString());
                printWriter.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}




