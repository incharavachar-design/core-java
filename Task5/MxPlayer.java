class MxPlayer
{
public static void main(String [] args)
{

String ottName="MxPlayer";
String movieslanguage[]={"Kannada","English","Hindi","Tamil","Telugu","Malayalam"};

String kannadaMovies []={
"1.Tarka","2.Shhh!","3.Jatta","4.Bettada Hoovu","5.Mungaru Male",
"6.Ulidavaru Kandanthe","7.Kirik Party","8.Lucia","9.Krishna Talkies","10.Babu Marley",
"11.Love Feeling","12.Inspector Vikram","13.Parasurama","14.Cinemadhavanu","15.Clue",
"16.Dhruva IPS","17.Ugramm","18.March 22","19.Magale","20.Girgitle",
"21.Teddy Bear","22.Identity","23.Ronth","24.Subham","25.Thudarum",
"26.Mr. Rani","27.Ponman","28.Sarzameen","29.DNA","30.kantara"
};

String englishMovies []={
"1.The Dark Knight","2.Avengers: Endgame","3.Avengers: Infinity War","4.Jurassic World","5.Fast & Furious 7",
"6.Mission: Impossible – Fallout","7.The Lion King","8.Frozen","9.Frozen II","10.The Jungle Book",
"11.Beauty and the Beast","12.Aladdin","13.Pirates of the Caribbean","14.Transformers","15.The Conjuring",
"16.Annabelle","17.The Nun","18.Jumanji: Welcome to the Jungle","19.Jumanji: The Next Level","20.Interstellar",
"21.Inception","22.Doctor Strange","23.Black Panther","24.Captain America: Civil War","25.Thor: Ragnarok",
"26.Wonder Woman","27.Aquaman","28.Harry Potter and the Sorcerer's Stone","29.The Matrix","30.madmax"
};

String hindiMovies []={
"1.3 Idiots","2.Dangal","3.PK","4.Bajrangi Bhaijaan","5.Sultan",
"6.Chennai Express","7.War","8.Pathaan","9.Jawan","10.Animal",
"11.Shershaah","12.Andhadhun","13.Drishyam","14.Drishyam 2","15.Bhool Bhulaiyaa",
"16.Bhool Bhulaiyaa 2","17.Golmaal","18.Golmaal Returns","19.Housefull","20.Housefull 2",
"21.Kick","22.Dabangg","23.Dabangg 2","24.Raees","25.Don",
"26.Don 2","27.Zindagi Na Milegi Dobara","28.Yeh Jawaani Hai Deewani","29.Kal Ho Naa Ho","30.Kabir Singh"
};

String tamilMovies []={
"1.Anbe Sivam","2.96","3.Aaranya Kaandam","4.Pudhupettai","5.Chithiram Pesuthadi",
"6.Aruvi","7.Thani Oruvan","8.Papanasam","9.Baasha","10.Thulladha Manamum Thullum",
"11.Ratsasan","12.Vikram Vedha","13.Deiva Thirumagal","14.Jigarthanda","15.Kaithi",
"16.Vada Chennai","17.Irumbu Thirai","18.Soodhu Kavvum","19.Kanchana 3","20.Namma Vettu Pillai",
"21.Mr Local","22.Sivappu Manjal Pachai","23.Dharmaprabhu","24.Natpe Thunai","25.Sangathamizhan",
"26.Zombie","27.Dev","28.Devarattam","29.Vellai Yaanai","30.Rajavamsam"
};

String teluguMovies []={
"1.RRR","2.Pushpa: The Rise","3.Pushpa 2","4.Baahubali: The Beginning","5.Baahubali 2: The Conclusion",
"6.Magadheera","7.Arjun Reddy","8.Dear Comrade","9.Jersey","10.Ala Vaikunthapurramuloo",
"11.Sarileru Neekevvaru","12.Rangasthalam","13.Pokiri","14.Attarintiki Daredi","15.Julayi",
"16.Race Gurram","17.Temper","18.Dhruva","19.Geetha Govindam","20.Fidaa",
"21.Majili","22.Tholi Prema","23.Seethamma Vakitlo Sirimalle Chettu","24.Gabbar Singh","25.Mirchi",
"26.Leader","27.Happy Days","28.Dhruva IPS","29.Ugramm","30.March 22"
};

String malayalamMovies[] = {
"1.Anjaam Pathiraa","2.Vellam","3.Kodathi Samaksham Balan Vakkeel","4.O.P.160/18 Kakshi: Amminippilla","5.Aakashaganga 2",
"6.28","7.Vrithakrithyilulla Chathuram","8.Marconi Mathai","9.Uriyadi","10.Adhyarathri",
"11.Pattabhiraman","12.Pranchiyettan and the Saint","13.Thinkalazhcha Nishchayam","14.Ennu Ninte Moideen","15.Charlie",
"16.Bangalore Days","17.Kumbalangi Nights","18.Neelakasham Pachakadal Chuvanna Bhoomi","19.Joseph","20.Mumbai Police",
"21.Lucifer","22.Koode","23.Njan Steve Lopez","24.Salt N’ Pepper","25.Maheshinte Prathikaaram",
"26.Premam","27.Annayum Rasoolum","28.Thattathin Marayathu","29.Aavesham","30.Fidaa"
};


System.out.println("The Ott Platform Name is :" +ottName);
System.out.println("List the Different Language Category of movies :");
System.out.println(kannadaMovies[0]+"\n"+
				   kannadaMovies[1]+"\n"+
				   kannadaMovies[2]+"\n"+
				   kannadaMovies[3]+"\n"+
				   kannadaMovies[4]+"\n"+
				   kannadaMovies[5]+"\n"+
				   kannadaMovies[6]+"\n"+
				   kannadaMovies[7]+"\n"+
				   kannadaMovies[8]+"\n"+
				   kannadaMovies[9]+"\n"+
				   kannadaMovies[10]+"\n"+
				   kannadaMovies[11]+"\n"+
				   kannadaMovies[12]+"\n"+
				   kannadaMovies[13]+"\n"+
				   kannadaMovies[14]+"\n"+
				   kannadaMovies[15]+"\n"+
				   kannadaMovies[16]+"\n"+
				   kannadaMovies[17]+"\n"+
				   kannadaMovies[18]+"\n"+
				   kannadaMovies[19]+"\n"+
				   kannadaMovies[20]+"\n"+
				   kannadaMovies[21]+"\n"+
				   kannadaMovies[22]+"\n"+
				   kannadaMovies[23]+"\n"+
				   kannadaMovies[24]+"\n"+
				   kannadaMovies[25]+"\n"+
				   kannadaMovies[26]+"\n"+
				   kannadaMovies[27]+"\n"+
				   kannadaMovies[28]+"\n"+
				   kannadaMovies[29]+"\n");
				   
				   
System.out.println(englishMovies[0]+"\n"+
				   englishMovies[1]+"\n"+
				   englishMovies[2]+"\n"+
				   englishMovies[3]+"\n"+
				   englishMovies[4]+"\n"+
				   englishMovies[5]+"\n"+
				   englishMovies[6]+"\n"+
				   englishMovies[7]+"\n"+
				   englishMovies[8]+"\n"+
				   englishMovies[9]+"\n"+
				   englishMovies[10]+"\n"+
				   englishMovies[11]+"\n"+
				   englishMovies[12]+"\n"+
				   englishMovies[13]+"\n"+
				   englishMovies[14]+"\n"+
				   englishMovies[15]+"\n"+
				   englishMovies[16]+"\n"+
				   englishMovies[17]+"\n"+
				   englishMovies[18]+"\n"+
				   englishMovies[19]+"\n"+
				   englishMovies[20]+"\n"+
				   englishMovies[21]+"\n"+
				   englishMovies[22]+"\n"+
				   englishMovies[23]+"\n"+
				   englishMovies[24]+"\n"+
				   englishMovies[25]+"\n"+
				   englishMovies[26]+"\n"+
				   englishMovies[27]+"\n"+
				   englishMovies[28]+"\n"+
				   englishMovies[29]+"\n");
				  
				   
System.out.println(hindiMovies[0]+"\n"+
				   hindiMovies[1]+"\n"+
				   hindiMovies[2]+"\n"+
				   hindiMovies[3]+"\n"+
				   hindiMovies[4]+"\n"+
				   hindiMovies[5]+"\n"+
				   hindiMovies[6]+"\n"+
				   hindiMovies[7]+"\n"+
				   hindiMovies[8]+"\n"+
				   hindiMovies[9]+"\n"+
				   hindiMovies[10]+"\n"+
				   hindiMovies[11]+"\n"+
				   hindiMovies[12]+"\n"+
				   hindiMovies[13]+"\n"+
				   hindiMovies[14]+"\n"+
				   hindiMovies[15]+"\n"+
				   hindiMovies[16]+"\n"+
				   hindiMovies[17]+"\n"+
				   hindiMovies[18]+"\n"+
				   hindiMovies[19]+"\n"+
				   hindiMovies[20]+"\n"+
				   hindiMovies[21]+"\n"+
				   hindiMovies[22]+"\n"+
				   hindiMovies[23]+"\n"+
				   hindiMovies[24]+"\n"+
				   hindiMovies[25]+"\n"+
				   hindiMovies[26]+"\n"+
				   hindiMovies[27]+"\n"+
				   hindiMovies[28]+"\n"+
				   hindiMovies[29]+"\n");
				   
				   

System.out.println(tamilMovies[0]+"\n"+
                   tamilMovies[1]+"\n"+
                   tamilMovies[2]+"\n"+
                   tamilMovies[3]+"\n"+
                   tamilMovies[4]+"\n"+
                   tamilMovies[5]+"\n"+
                   tamilMovies[6]+"\n"+
                   tamilMovies[7]+"\n"+
                   tamilMovies[8]+"\n"+
                   tamilMovies[9]+"\n"+
                   tamilMovies[10]+"\n"+
                   tamilMovies[11]+"\n"+
                   tamilMovies[12]+"\n"+
                   tamilMovies[13]+"\n"+
                   tamilMovies[15]+"\n"+
                   tamilMovies[16]+"\n"+
                   tamilMovies[17]+"\n"+
                   tamilMovies[18]+"\n"+
                   tamilMovies[19]+"\n"+
                   tamilMovies[20]+"\n"+
                   tamilMovies[21]+"\n"+
                   tamilMovies[22]+"\n"+
                   tamilMovies[23]+"\n"+
                   tamilMovies[24]+"\n"+
                   tamilMovies[25]+"\n"+
                   tamilMovies[26]+"\n"+
                   tamilMovies[27]+"\n"+
                   tamilMovies[28]+"\n"+
                   tamilMovies[29]+"\n");
                  

System.out.println(teluguMovies[0]+"\n"+
                   teluguMovies[1]+"\n"+
                   teluguMovies[2]+"\n"+
                   teluguMovies[3]+"\n"+
                   teluguMovies[4]+"\n"+
                   teluguMovies[5]+"\n"+
                   teluguMovies[6]+"\n"+
                   teluguMovies[7]+"\n"+
                   teluguMovies[8]+"\n"+
                   teluguMovies[9]+"\n"+
                   teluguMovies[10]+"\n"+
                   teluguMovies[11]+"\n"+
                   teluguMovies[12]+"\n"+
                   teluguMovies[13]+"\n"+
                   teluguMovies[14]+"\n"+
                   teluguMovies[15]+"\n"+
                   teluguMovies[16]+"\n"+
                   teluguMovies[17]+"\n"+
                   teluguMovies[18]+"\n"+
                   teluguMovies[19]+"\n"+
                   teluguMovies[20]+"\n"+
                   teluguMovies[21]+"\n"+
                   teluguMovies[22]+"\n"+
                   teluguMovies[23]+"\n"+
                   teluguMovies[24]+"\n"+
                   teluguMovies[25]+"\n"+
                   teluguMovies[26]+"\n"+
                   teluguMovies[27]+"\n"+
                   teluguMovies[28]+"\n"+
                   teluguMovies[29]+"\n");
                   
				   				   

System.out.println(malayalamMovies[0]+"\n"+
                   malayalamMovies[1]+"\n"+
                   malayalamMovies[2]+"\n"+
                   malayalamMovies[3]+"\n"+
                   malayalamMovies[4]+"\n"+
                   malayalamMovies[5]+"\n"+
                   malayalamMovies[6]+"\n"+
                   malayalamMovies[7]+"\n"+
                   malayalamMovies[8]+"\n"+
                   malayalamMovies[9]+"\n"+
                   malayalamMovies[10]+"\n"+
                   malayalamMovies[11]+"\n"+
                   malayalamMovies[12]+"\n"+
                   malayalamMovies[13]+"\n"+
                   malayalamMovies[14]+"\n"+
                   malayalamMovies[15]+"\n"+
                   malayalamMovies[16]+"\n"+
                   malayalamMovies[17]+"\n"+
                   malayalamMovies[18]+"\n"+
                   malayalamMovies[19]+"\n"+
                   malayalamMovies[20]+"\n"+
                   malayalamMovies[21]+"\n"+
                   malayalamMovies[22]+"\n"+
                   malayalamMovies[23]+"\n"+
                   malayalamMovies[24]+"\n"+
                   malayalamMovies[25]+"\n"+
                   malayalamMovies[26]+"\n"+
                   malayalamMovies[27]+"\n"+
                   malayalamMovies[28]+"\n"+
                   malayalamMovies[29]+"\n");	
                  
}
}