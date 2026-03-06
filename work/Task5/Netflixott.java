class Netflixott
{
public static void main(String [] args)
{
String ottName="Netflix";

String categories []={"Action","Anime","Comedies","Documentaries","Dramas","Horror"};

String actionMovies []={"1.Extraction","2.The Gray Man","3.6 Underground","4.Triple Frontier","5.The Old Guard",
						"6.Red Notice","7.Project Power","8.Army of the Dead","9.The Mother","10.Day Shift",
						"11.Polar","12.Spenser Confidential","13.The Night Comes for Us","14.Black Crab","15.Kate",
						"16.Outlaw King","17.The Harder They Fall","18.Shaft","19.Mission Majnu","20.Beckett",
						"21.The Man from Toronto","22.Sweet Girl","23.Close","24.SAS Rise of the Black Swan","25.Mile 22",
						"26.War Machine","27.Spectral","28.How It Ends","29.The Last Days of American Crime","30.Outside the Wire"+"\n"};

String animeMovies []={"1.Naruto","2.One Piece","3.Attack on Titan","4.Demon Slayer","5.Death Note",
					   "6.Dragon Ball Super","7.Jujutsu Kaisen","8.Bleach","9.My Hero Academia","10.Spy x Family",
					   "11.Chainsaw Man","12.Black Clover","13.Tokyo Ghoul","14.One Punch Man","15.Vinland Saga",
					   "16.Cowboy Bebop","17.Blue Lock","18.Haikyuu","19.Fullmetal Alchemist","20.Code Geass",
					   "21.Sword Art Online","22.Castlevania","23.Baki","24.The Seven Deadly Sins","25.Kuroko no Basket",
					   "26.Gintama","27.Hunter x Hunter","28.Fairy Tail","29.Dororo","30.Your Name"+"\n"};
					   
String comedyMovies [] = {"1.Murder Mystery","2.You People","3.Me Time","4.Red Notice","5.The Wrong Missy",
							"6.The Do-Over","7.Senior Year","8.Don't Look Up","9.The Lovebirds","10.Yes Day",
							"11.The Kissing Booth","12.Holidate","13.Love Hard","14.We Can Be Heroes","15.Happy Gilmore",
							"16.Hubie Halloween","17.The House","18.Coffee & Kareem","19.Game Over Man","20.Bad Trip",
							"21.The After Party","22.Family Switch","23.Moxie","24.Spy Kids","25.The Sleepover",
							"26.Austin Powers","27.Naked","28.Tall Girl","29.The Bubble","30.Paul Blart Mall Cop"+"\n"};

String documentaryMovies [] = {"1.Our Planet","2.The Social Dilemma","3.American Factory","4.Seaspiracy","5.The Tinder Swindler",
								"6.My Octopus Teacher","7.The Great Hack","8.Inside Bill's Brain","9.Breaking Boundaries","10.Cowspiracy",
								"11.Night on Earth","12.Formula 1 Drive to Survive","13.The Last Dance","14.Wild Wild Country","15.Tiger King",
								"16.David Attenborough A Life on Our Planet","17.13th","18.The Ivory Game","19.Miss Americana","20.The Game Changers",
								"21.Rotten","22.Dirty Money","23.Chef's Table","24.Explained","25.Making a Murderer",
								"26.The Keepers","27.Sunderland Til I Die","28.The Minimalists","29.Icarus","30.Fyre"+"\n"};

String dramaMovies [] = {"1.The Irishman","2.Marriage Story","3.Roma","4.The Trial of the Chicago 7","5.Mudbound",
							"6.The Good Nurse","7.Bird Box","8.White Noise","9.The Pale Blue Eye","10.The Power of the Dog",
							"11.Luckiest Girl Alive","12.The Unforgivable","13.Enola Holmes","14.All Quiet on the Western Front","15.Extraction 2",
							"16.Don't Look Up","17.The Dig","18.The Highwaymen","19.Fatherhood","20.Blue Miracle",
							"21.The Swimmers","22.Pieces of a Woman","23.Beasts of No Nation","24.The King","25.Worth",
							"26.News of the World","27.The Two Popes","28.Dangal","29.Jawan","30.Pathaan"+"\n"};

String horrorMovies [] = {"1.Bird Box","2.The Platform","3.Army of the Dead","4.Cargo","5.Gerald's Game",
							"6.Apostle","7.The Babysitter","8.Cam","9.Eli","10.Fear Street Part 1",
							"11.Fear Street Part 2","12.Fear Street Part 3","13.His House","14.The Ritual","15.The Silence",
							"16.In the Tall Grass","17.Veronica","18.The Perfection","19.Things Heard & Seen","20.The Open House",
							"21.The Wasteland","22.Creep","23.Creep 2","24.Under the Shadow","25.The Haunting of Hill House",
							"26.The Midnight Club","27.The Nun","28.A Quiet Place","29.It Follows","30.World War Z"+"\n"};

System.out.println("The Ott platform Name is : "+ottName);
System.out.println("List the Different Category of movies :");

System.out.println(categories[0]+"\n"+
				    actionMovies[0]+"\n"+
				    actionMovies[1]+"\n"+
					actionMovies[2]+"\n"+
					actionMovies[3]+"\n"+
					actionMovies[4]+"\n"+
					actionMovies[5]+"\n"+
					actionMovies[6]+"\n"+
					actionMovies[7]+"\n"+
					actionMovies[8]+"\n"+
					actionMovies[9]+"\n"+
					actionMovies[10]+"\n"+
					actionMovies[11]+"\n"+
					actionMovies[12]+"\n"+
					actionMovies[13]+"\n"+
					actionMovies[14]+"\n"+
					actionMovies[15]+"\n"+
					actionMovies[16]+"\n"+
					actionMovies[17]+"\n"+
					actionMovies[18]+"\n"+
					actionMovies[19]+"\n"+
					actionMovies[20]+"\n"+
					actionMovies[21]+"\n"+
					actionMovies[22]+"\n"+
					actionMovies[23]+"\n"+
					actionMovies[24]+"\n"+
					actionMovies[25]+"\n"+
					actionMovies[26]+"\n"+
					actionMovies[27]+"\n"+
					actionMovies[28]+"\n"+
					actionMovies[29]);

System.out.println(categories[1]+"\n"+
					animeMovies[0]+"\n"+
					animeMovies[1]+"\n"+
					animeMovies[2]+"\n"+
					animeMovies[3]+"\n"+
					animeMovies[4]+"\n"+
					animeMovies[5]+"\n"+
					animeMovies[6]+"\n"+
					animeMovies[7]+"\n"+
					animeMovies[8]+"\n"+
					animeMovies[9]+"\n"+
					animeMovies[10]+"\n"+
					animeMovies[11]+"\n"+
					animeMovies[12]+"\n"+
					animeMovies[13]+"\n"+
					animeMovies[14]+"\n"+
					animeMovies[15]+"\n"+
					animeMovies[16]+"\n"+
					animeMovies[17]+"\n"+
					animeMovies[18]+"\n"+
					animeMovies[19]+"\n"+
					animeMovies[20]+"\n"+
					animeMovies[21]+"\n"+
					animeMovies[22]+"\n"+
					animeMovies[23]+"\n"+
					animeMovies[24]+"\n"+
					animeMovies[25]+"\n"+
					animeMovies[26]+"\n"+
					animeMovies[27]+"\n"+
					animeMovies[28]+"\n"+
					animeMovies[29]);

System.out.println(categories[2]+"\n"+
					comedyMovies[0]+"\n"+
					comedyMovies[1]+"\n"+
					comedyMovies[2]+"\n"+
					comedyMovies[3]+"\n"+
					comedyMovies[4]+"\n"+
					comedyMovies[5]+"\n"+
					comedyMovies[6]+"\n"+
					comedyMovies[7]+"\n"+
					comedyMovies[8]+"\n"+
					comedyMovies[9]+"\n"+
					comedyMovies[10]+"\n"+
					comedyMovies[11]+"\n"+
					comedyMovies[12]+"\n"+
					comedyMovies[13]+"\n"+
					comedyMovies[14]+"\n"+
					comedyMovies[15]+"\n"+
					comedyMovies[16]+"\n"+
					comedyMovies[17]+"\n"+
					comedyMovies[18]+"\n"+
					comedyMovies[19]+"\n"+
					comedyMovies[20]+"\n"+
					comedyMovies[21]+"\n"+
					comedyMovies[22]+"\n"+
					comedyMovies[23]+"\n"+
					comedyMovies[24]+"\n"+
					comedyMovies[25]+"\n"+
					comedyMovies[26]+"\n"+
					comedyMovies[27]+"\n"+
					comedyMovies[28]+"\n"+
					comedyMovies[29]);

System.out.println(categories[3]+"\n"+
					documentaryMovies[0]+"\n"+
					documentaryMovies[1]+"\n"+
					documentaryMovies[2]+"\n"+
					documentaryMovies[3]+"\n"+
					documentaryMovies[4]+"\n"+
					documentaryMovies[5]+"\n"+
					documentaryMovies[6]+"\n"+
					documentaryMovies[7]+"\n"+
					documentaryMovies[8]+"\n"+
					documentaryMovies[9]+"\n"+
					documentaryMovies[10]+"\n"+
					documentaryMovies[11]+"\n"+
					documentaryMovies[12]+"\n"+
					documentaryMovies[13]+"\n"+
					documentaryMovies[14]+"\n"+
					documentaryMovies[15]+"\n"+
					documentaryMovies[16]+"\n"+
					documentaryMovies[17]+"\n"+
					documentaryMovies[18]+"\n"+
					documentaryMovies[19]+"\n"+
					documentaryMovies[20]+"\n"+
					documentaryMovies[21]+"\n"+
					documentaryMovies[22]+"\n"+
					documentaryMovies[23]+"\n"+
					documentaryMovies[24]+"\n"+
					documentaryMovies[25]+"\n"+
					documentaryMovies[26]+"\n"+
					documentaryMovies[27]+"\n"+
					documentaryMovies[28]+"\n"+
					documentaryMovies[29]);

System.out.println(categories[4]+"\n"+
					dramaMovies[0]+"\n"+
					dramaMovies[1]+"\n"+
					dramaMovies[2]+"\n"+
					dramaMovies[3]+"\n"+
					dramaMovies[4]+"\n"+
					dramaMovies[5]+"\n"+
					dramaMovies[6]+"\n"+
					dramaMovies[7]+"\n"+
					dramaMovies[8]+"\n"+
					dramaMovies[9]+"\n"+
					dramaMovies[10]+"\n"+
					dramaMovies[11]+"\n"+
					dramaMovies[12]+"\n"+
					dramaMovies[13]+"\n"+
					dramaMovies[14]+"\n"+
					dramaMovies[15]+"\n"+
					dramaMovies[16]+"\n"+
					dramaMovies[17]+"\n"+
					dramaMovies[18]+"\n"+
					dramaMovies[20]+"\n"+
					dramaMovies[21]+"\n"+
					dramaMovies[22]+"\n"+
					dramaMovies[23]+"\n"+
					dramaMovies[24]+"\n"+
					dramaMovies[25]+"\n"+
					dramaMovies[26]+"\n"+
					dramaMovies[27]+"\n"+
					dramaMovies[28]+"\n"+
					dramaMovies[29]);

System.out.println(categories[5]+"\n"+
					horrorMovies[0]+"\n"+
					horrorMovies[1]+"\n"+
					horrorMovies[2]+"\n"+
					horrorMovies[3]+"\n"+
					horrorMovies[4]+"\n"+
					horrorMovies[5]+"\n"+
					horrorMovies[6]+"\n"+
					horrorMovies[7]+"\n"+
					horrorMovies[8]+"\n"+
					horrorMovies[9]+"\n"+
					horrorMovies[10]+"\n"+
					horrorMovies[11]+"\n"+
					horrorMovies[12]+"\n"+
					horrorMovies[13]+"\n"+
					horrorMovies[14]+"\n"+
					horrorMovies[15]+"\n"+
					horrorMovies[16]+"\n"+
					horrorMovies[17]+"\n"+
					horrorMovies[18]+"\n"+
					horrorMovies[19]+"\n"+
					horrorMovies[20]+"\n"+
					horrorMovies[21]+"\n"+
					horrorMovies[22]+"\n"+
					horrorMovies[23]+"\n"+
					horrorMovies[24]+"\n"+
					horrorMovies[25]+"\n"+
					horrorMovies[26]+"\n"+
					horrorMovies[27]+"\n"+
					horrorMovies[28]+"\n"+
					horrorMovies[29]);


}
}