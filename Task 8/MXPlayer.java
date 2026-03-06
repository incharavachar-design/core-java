class MXPlayer
{

static String kannadaShows[]={
"Comedy Khiladigalu Clips","Kannada Bhakti Shows","Cooking Show Kannada","Public TV Talk","Kannada Reality Highlights","Kannada Talent Hunt","Village Food Kannada",
"Devotional Stories Kannada","Cinema Talk Kannada","Health Tips Kannada","Travel Karnataka","Kannada Kids Show","Folk Culture Kannada","Kannada Motivational Talk",
"Farmers Show Kannada","Startup Talk Kannada","Education Kannada","History Karnataka","Kannada Interview Show","Women Talk Kannada","Dance Show Kannada",
"Music Beats Kannada","Local News Kannada","Street Food Kannada","Temple Tour Kannada","Art Show Kannada","Comedy Nights Kannada","Game Show Kannada",
"Reality Talk Kannada","Youth Talk Kannada"};

static String hindiShows[]={
"India Crime Stories","Comedy Factory","Food Buzz Hindi","Bhakti Sagar","News Debate Hindi","Hindi Talent Hunt","Travel India Hindi","Fitness Hindi",
"Health Talk Hindi","Startup India Show","Education Talk Hindi","History India Hindi","Village Life Hindi","Dance India Show","Music Hindi Beats","Motivation Hindi",
"Kids Learning Hindi","Cooking Master Hindi","Women Talk Hindi","Cinema Gossip Hindi","Celebrity Talk Hindi","Game Show Hindi","Street Food India","Tech Talks Hindi",
"Spiritual Talk Hindi","Public Opinion Hindi","Interview Series Hindi","Reality Buzz Hindi","Youth Show Hindi","Daily News Hindi"};

static String teluguShows[]={
"Telugu Comedy Show","Cooking Master Telugu","Bhakti TV Clips","Telugu Talent Show","Public Talk Telugu","Telugu Travel Show","Health Talk Telugu","Motivation Telugu",
"Dance Beats Telugu","Music Show Telugu","Village Life Telugu","Temple Tour Telugu","Cinema Talk Telugu","Kids Fun Telugu","Education Telugu","Startup Telugu",
"Women Talk Telugu","Farmers Telugu","Street Food Telugu","Interview Telugu","Tech Talks Telugu","Spiritual Telugu","Reality Buzz Telugu","Youth Show Telugu",
"Game Show Telugu","Cultural Show Telugu","History Telugu","Fitness Telugu","News Debate Telugu","Public Opinion Telugu"};

static String tamilShows[]={
"Tamil Comedy Express","Cook With Tamil","Tamil Devotional Show","Kollywood Talk","Tamil Reality Highlights","Tamil Travel Show","Health Talk Tamil",
"Motivation Tamil","Dance Tamil","Music Tamil Beats","Village Life Tamil","Temple Tour Tamil","Cinema News Tamil","Kids Show Tamil","Education Tamil","Startup Tamil",
"Women Talk Tamil","Farmers Tamil","Street Food Tamil","Interview Tamil","Tech Talks Tamil","Spiritual Tamil","Reality Buzz Tamil","Youth Talk Tamil",
"Game Show Tamil","Cultural Tamil","History Tamil","Fitness Tamil","News Debate Tamil","Public Opinion Tamil"};

static String malayalamShows[]={
"Malayalam Comedy Clips","Cookery Time Malayalam","Bhakti Malayalam","Kerala Talk Show","Malayalam Talent Show","Travel Kerala","Health Talk Malayalam",
"Motivation Malayalam","Dance Kerala","Music Malayalam","Village Life Kerala","Temple Tour Kerala","Cinema Talk Malayalam","Kids Malayalam","Education Malayalam",
"Startup Kerala","Women Talk Kerala","Farmers Kerala","Street Food Kerala","Interview Malayalam","Tech Talks Malayalam","Spiritual Kerala","Reality Buzz Malayalam",
"Youth Talk Malayalam","Game Show Malayalam","Cultural Kerala","History Kerala","Fitness Malayalam","News Debate Malayalam","Public Opinion Malayalam"};

static String englishShows[]={
"MX Viral Clips","Food & Travel Show","Motivation Talks","Fitness Show","Tech Talks","World Travel Show","Health & Wellness","Startup Stories","Education Talks",
"History Documentary","Dance Show","Music Beats","Kids Learning","Cooking Master","Women Talk Show","Farmers Documentary","Street Food World","Celebrity Interview",
"Game Show","Reality Buzz","Youth Talk","Spiritual Talks","Public Opinion","Daily News","Tech Review","Science Show","Nature Documentary","Business Talk",
"Sports Highlights","Global Culture Show"};

public static void main(String args[])
{
getKannadaShows();
getHindiShows();
getTeluguShows();
getTamilShows();
getMalayalamShows();
getEnglishShows();
}

static void getKannadaShows()
{
System.out.println("To watch MX Player Kannada shows:");
for(String show : kannadaShows)
{
System.out.println(show);
}
}

static void getHindiShows()
{
System.out.println("To watch MX Player Hindi shows:");
for(String show : hindiShows)
{
System.out.println(show);
}
}

static void getTeluguShows()
{
System.out.println("To watch MX Player Telugu shows:");
for(String show : teluguShows)
{
System.out.println(show);
}
}

static void getTamilShows()
{
System.out.println("To watch MX Player Tamil shows:");
for(String show : tamilShows)
{
System.out.println(show);
}
}

static void getMalayalamShows()
{
System.out.println("To watch MX Player Malayalam shows:");
for(String show : malayalamShows)
{
System.out.println(show);
}
}

static void getEnglishShows()
{
System.out.println("To watch MX Player English shows:");
for(String show : englishShows)
{
System.out.println(show);
}
}

}