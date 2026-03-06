class Zeefive
{

static String kannadaSerials[]={
"Gattimela","Jothe Jotheyali","Puttakkana Makkalu","Satya","Seetha Raama","Hitler Kalyana","Kamali","Yaare Nee Mohini","Naagini Kannada","Mangala Gowri",
"Sarvamangala Mangalye","Kannadathi","Kavacha","Jodi Hakki","Lakshmi Nivasa","Nammane Yuvarani","Radha Kalyana","Srinivasa Kalyana","Mahadevi","Shivaleela",
"Bhagya Lakshmi Kannada","Kanyadaan","Raja Rani Kannada","Kumkuma Bhagya Kannada","Annapoorna","Naga Kannike","Putta Gowri","Arundhati","Devayani","Sowbhagyalakshmi"};

static String hindiSerials[]={
"Kundali Bhagya","Bhagya Lakshmi","Kumkum Bhagya","Meet","Tujhse Hai Raabta","Zindagi Ki Mehek","Pavitra Rishta","Qubool Hai","Jamai Raja","Yeh Teri Galiyan",
"Ishq Subhan Allah","Guddan Tumse Na Ho Payega","Aap Ke Aa Jane Se","Brahmarakshas","Kasamh Se","Saat Phere","Jhansi Ki Rani","Jodha Akbar","Ek Tha Raja Ek Thi Rani",
"Hitler Didi","Punar Vivah","Sapne Suhane Ladakpan Ke","Fear Files","Agle Janam Mohe Bitiya Hi Kijo","Do Dil Bandhe Ek Dori Se","Service Wali Bahu","Dil Dhoondta Hai",
"Yeh Vaada Raha","Kaleerein","Tashan-e-Ishq"};

static String teluguSerials[]={
"Prema Entha Madhuram","Radhamma Kuthuru","Trinayani","Suryakantham","Krishna Tulasi","Kalyana Vaibhogam","No.1 Kodalu","Inti Guttu","Muddha Mandaram",
"Mangamma Gari Manavadu","Nagini Telugu","Srinivasa Kalyanam","Devatha","Mounaragam Telugu","Pelli Sandadi Serial","Rama Sakkani Seetha","Akka Chellellu",
"Varudhini Parinayam","Abhishekam","Savitramma Gari Abbayi","Mithai Kottu Chittemma","Agnipariksha","Amma Na Kodala","Kante Koothurne Kanali","Sundarakanda",
"Siri Siri Muvvalu","Sathamanam Bhavati","Santosham Serial","Gokulamlo Seetha","Gruhalakshmi Telugu"};

static String tamilSerials[]={
"Sembaruthi","Oru Oorla Oru Rajakumari","Yaaradi Nee Mohini","Sathya","Neethane Enthan Ponvasantham","Poove Poochudava","Chinna Poove Mella Pesu","Endrendrum Punnagai",
"Deivam Thantha Poove","Rajini","Mella Thirandhathu Kadhavu","Rekka Katti Parakkudhu","Naga Bhairavi Tamil","Kalyana Vaibhogam Tamil","Vidhya No 1",
"Thavamai Thavamirundhu","Thirumathi Hitler","Peranbu","Iniya Iru Malargal","Lakshmi Vandhachu","Suryavamsam","Rettai Roja","Pandian Stores","Chithi 2",
"Anbe Sivam Serial","Mounaragam Tamil","Roja","Arundhathi Tamil","Kannana Kanne","Vanathai Pola"};

static String malayalamSerials[]={
"Chembarathi","Kaiyethum Doorath","Neeyum Njanum","Mrs Hitler","Pookkalam Varavayi","Manam Pole Mangalyam","Sathya Malayalam","Naga Bhairavi Malayalam","Kabani",
"Swathi Nakshatram Chothi","Seetha Kalyanam Malayalam","Ammayariyathe","Kudumbavilakku","Karuthamuthu","Vanambadi","Parasparam","Bharya","Chandanamazha",
"Kasthooriman","Mounaragam Malayalam","Sumangali Bhava","Sthreepadham","Mangalyapattu","Nokketha Doorathu","Devi Mahatmyam","Ayalathe Sundari","Hridayam Sakshi",
"Indulekha","Sundari Malayalam","Janani"};

static String englishSerials[]={
"Doctor Who","The Good Wife","The Good Fight","Sherlock","Downton Abbey","Pride and Prejudice","Victoria","Call the Midwife","Broadchurch","Peaky Blinders",
"The Office","Friends","Stranger Things","Breaking Bad","Better Call Saul","House of Cards","Suits","Grey's Anatomy","The Crown","Black Mirror","The Witcher",
"Money Heist","Narcos","Lucifer","Vikings","Game of Thrones","House of the Dragon","The Walking Dead","The Boys","The Mandalorian"};

public static void main(String args[])
{
getKannadaSerials();
getHindiSerials();
getTeluguSerials();
getTamilSerials();
getMalayalamSerials();
getEnglishSerials();
}

static void getKannadaSerials()
{
System.out.println("ZEE5 Kannada Serials:");
for(String serial : kannadaSerials)
{
System.out.println(serial);
}
}

static void getHindiSerials()
{
System.out.println("ZEE5 Hindi Serials:");
for(String serial : hindiSerials)
{
System.out.println(serial);
}
}

static void getTeluguSerials()
{
System.out.println("ZEE5 Telugu Serials:");
for(String serial : teluguSerials)
{
System.out.println(serial);
}
}

static void getTamilSerials()
{
System.out.println("ZEE5 Tamil Serials:");
for(String serial : tamilSerials)
{
System.out.println(serial);
}
}

static void getMalayalamSerials()
{
System.out.println("ZEE5 Malayalam Serials:");
for(String serial : malayalamSerials)
{
System.out.println(serial);
}
}

static void getEnglishSerials()
{
System.out.println("ZEE5 English Serials:");
for(String serial : englishSerials)
{
System.out.println(serial);
}
}

}