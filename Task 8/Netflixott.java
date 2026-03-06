class Netflixott
{

static String kannadaMovies[]={
"KGF: Chapter 1","Kantara","Sapta Sagaradaache Ello – Side A","Hostel Hudugaru Bekagiddare","Bagheera","KGF: Chapter 2","Charlie 777","Vikrant Rona",
"Avane Srimannarayana","Ugramm","Raajakumara","Yuvarathnaa","Roberrt","James","Kirik Party","RangiTaranga","Bell Bottom","Operation Alamelamma","Gultoo","Chamak",
"Mugulu Nage","Mayabazar 2016","Sarkari Hi Pra Shaale","Ondalla Eradalla","Godhi Banna Sadharana Mykattu","Ulidavaru Kandanthe","French Biriyani",
"Simple Agi Ond Love Story","Love Mocktail","Dia"};

static String englishMovies[]={
"Red Notice","Extraction","The Gray Man","Bird Box","Glass Onion: A Knives Out Mystery","Don't Look Up","The Adam Project","6 Underground","Army of the Dead",
"Enola Holmes","Enola Holmes 2","The Irishman","The Old Guard","Project Power","Triple Frontier","Bright","Polar","The Platform","Marriage Story","Roma","Okja",
"The Kissing Booth","To All the Boys I've Loved Before","Tall Girl","Purple Hearts","The Mother","Lift","Heart of Stone","Rebel Moon","Leave the World Behind"};

static String hindiMovies[]={
"RRR (Hindi)","Jawan","Darlings","Chor Nikal Ke Bhaga","Ludo","Animal","Pathaan","Fighter","Gadar 2","Shershaah","Brahmastra","Talaash","Badla","Pink","Andhadhun",
"Raazi","Article 15","Piku","Tamasha","Barfi","Zindagi Na Milegi Dobara","Dil Dhadakne Do","Queen","Highway","Rockstar","Bhool Bhulaiyaa 2","Stree","Bhediya",
"Drishyam","Drishyam 2"};

static String teluguMovies[]={
"RRR (Telugu)","HIT: The First Case","Major","Dasara","Eega","Baahubali","Baahubali 2","Magadheera","Pushpa","Ala Vaikunthapurramuloo","Sarileru Neekevvaru",
"Bheemla Nayak","Sye Raa Narasimha Reddy","Rangasthalam","Arjun Reddy","Jersey","Geetha Govindam","Fidaa","Athadu","Pokiri","Businessman","Temper",
"Gabbar Singh","Khaleja","Okkadu","Leader","Godfather","Bimbisara","Waltair Veerayya","Veera Simha Reddy"};

static String tamilMovies[]={
"Leo","Jailer","Vikram","Doctor","Jagame Thandhiram","Master","Kaithi","Beast","Thunivu","Valimai","Ponniyin Selvan 1","Ponniyin Selvan 2","Darbar","Kabali","Petta",
"2.0","Enthiran","Sivaji","Anniyan","I","Indian","Dasavatharam","Ayan","Ghajini","Singam","Singam 2","Theri","Mersal","Bigil","Varisu"};

static String malayalamMovies[]={
"Minnal Murali","Kurup","Jana Gana Mana","Rorschach","Irul","Drishyam","Drishyam 2","Premam","Bangalore Days","Kumbalangi Nights","Joji","Malik","Virus","Take Off",
"Uyare","Ayyappanum Koshiyum","Android Kunjappan","Anjaam Pathiraa","Lucifer","Bro Daddy","Pulimurugan","Oppam","Memories","Charlie","Maheshinte Prathikaaram",
"Thondimuthalum Driksakshiyum","Varathan","Trance","Kala","2018"};

public static void main(String args[])
{
getKannadaMovies();
getEnglishMovies();
getHindiMovies();
getTeluguMovies();
getTamilMovies();
getMalayalamMovies();
}

static void getKannadaMovies()
{
System.out.println("Netflix Kannada Movies:");
for(String movie : kannadaMovies)
{
System.out.println(movie);
}
}

static void getEnglishMovies()
{
System.out.println("Netflix English Movies:");
for(String movie : englishMovies)
{
System.out.println(movie);
}
}

static void getHindiMovies()
{
System.out.println("Netflix Hindi Movies:");
for(String movie : hindiMovies)
{
System.out.println(movie);
}
}

static void getTeluguMovies()
{
System.out.println("Netflix Telugu Movies:");
for(String movie : teluguMovies)
{
System.out.println(movie);
}
}

static void getTamilMovies()
{
System.out.println("Netflix Tamil Movies:");
for(String movie : tamilMovies)
{
System.out.println(movie);
}
}

static void getMalayalamMovies()
{
System.out.println("Netflix Malayalam Movies:");
for(String movie : malayalamMovies)
{
System.out.println(movie);
}
}

}