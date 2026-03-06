class Amazonprimeott
{
static String kannadaSeries[]={
"Dia Web Series","Loose Connection","Humble Politician Nograj Series","By Mistake","Love Mocktail Series","Ganesh Talkies","Honeymoon","Gultoo Series",
"Tagaru Web Cut","Hero Web Stories","Kirik Party Series","U Turn Stories","Bell Bottom Files","Operation Alamelamma Series","Avane Srimannarayana Stories",
"RangiTaranga Files","Kavaludaari Stories","French Biriyani Series","Mayabazar 2016 Stories","Sarkari Hi. Pra. Shaale Series","Ondalla Eradalla Series",
"Godhi Banna Stories","Ulidavaru Kandanthe Series","Simple Agi Ond Love Story Series","Mugulu Nage Stories","Chamak Series","Raajakumara Stories",
"Yuvarathnaa Series","Roberrt Stories","KGF Chapter Stories"};

static String englishSeries[]={
"Stranger Things","Wednesday","Money Heist","The Witcher","Bridgerton","Breaking Bad","Better Call Saul","Dark","Friends","The Office","Game of Thrones",
"House of the Dragon","Peaky Blinders","The Crown","Black Mirror","Lucifer","Sherlock","Narcos","Vikings","The Boys","The Mandalorian","Loki","WandaVision",
"The Flash","Arrow","Lost","Prison Break","How I Met Your Mother","Suits","The Walking Dead"};

static String hindiSeries[]={
"Sacred Games","Delhi Crime","Kota Factory","She","Jamtara","Mirzapur","Panchayat","Aspirants","Scam 1992","Special OPS","The Family Man","Breathe",
"Made in Heaven","Paatal Lok","Hostel Daze","TVF Pitchers","Flames","Inside Edge","Abhay","Undekhi","Grahan","JL50","Rangbaaz","Bombay Begums","Aashram",
"Bard of Blood","Aranyak","Rocket Boys","Taj","Farzi"};

static String teluguSeries[]={
"Pitta Kathalu","Anger Tales","Loser","9 Hours","ATM","Kudi Yedamaithe","Locked","Sin","Gods of Dharmapuri","Gangstars","Unheard","Recce","Mansion 24",
"Dhootha","Save the Tigers","Parampara","High Priestess","Shootout at Alair","Tharagathi Gadhi Daati","Bhamakalapam Series","Oka Chinna Family Story",
"Masti's","Kumari Srimathi","Vyavastha","Newsense","Modern Love Hyderabad","Dayaa","Gaalivaana","Saitan","Telugu Crime Stories"};

static String tamilSeries[]={
"Suzhal: The Vortex","Navarasa","Auto Shankar","Queen","Stories by Rabindranath Tagore","November Story","Vilangu","Iru Dhuruvam","Live Telecast","Time Enna Boss",
"Triples","Fingertip","Paper Rocket","Sengalam","Ayali","Tamil Rockerz","Inspector Rishi","Anantham","America Mappillai","Marmadesam","Chutney Sambar",
"Label","Kana Kaanum Kaalangal","As I'm Suffering","Mad Company","Office","Mugilan","High Priestess Tamil","Crime Next Door","Tamil Thriller Stories"};

static String malayalamSeries[]={
"Kerala Crime Files","Masterpeace","Perilloor Premier League","Love Under Construction","Jai Mahendran","Karikku","Instagraamam","Average Ambili","Thera Para",
"Samarthya Shastram","MeenAviyal","Rock Paper Scissors","Panam Tharum Padam","Police Diary","Operation Java Series","Anjaam Pathiraa Series","Drishyam Files",
"Kuruthi Stories","Minnal Murali Series","Kumbalangi Nights Stories","Android Kunjappan Series","Uyare Stories","Virus Files","Take Off Series","Malik Stories",
"Joji Series","Ayyappanum Koshiyum Stories","Kala Stories","Pada Series","Malayalam Crime Stories"};

public static void main(String args[])
{
getKannadaSeries();
getEnglishSeries();
getHindiSeries();
getTeluguSeries();
getTamilSeries();
getMalayalamSeries();
}

static void getKannadaSeries()
{
System.out.println("Amazon Prime Kannada Web Series:");
for(String series : kannadaSeries)
{
System.out.println(series);
}
}

static void getEnglishSeries()
{
System.out.println("Amazon Prime English Web Series:");
for(String series : englishSeries)
{
System.out.println(series);
}
}

static void getHindiSeries()
{
System.out.println("Amazon Prime Hindi Web Series:");
for(String series : hindiSeries)
{
System.out.println(series);
}
}

static void getTeluguSeries()
{
System.out.println("Amazon Prime Telugu Web Series:");
for(String series : teluguSeries)
{
System.out.println(series);
}
}

static void getTamilSeries()
{
System.out.println("Amazon Prime Tamil Web Series:");
for(String series : tamilSeries)
{
System.out.println(series);
}
}

static void getMalayalamSeries()
{
System.out.println("Amazon Prime Malayalam Web Series:");
for(String series : malayalamSeries)
{
System.out.println(series);
}
}

}