class JioHotStar
{

static String kannadaMovies[]={
"Bhakta Prahlada","Sri Manjunatha","Bhakta Kumbara","Shiva Mecchida Kannappa","Bhakta Kanakadasa","Subramanya","Renukadevi Mahatme","Kateel Durgaparameshwari",
"Mookambika Mahatme","Chamundeshwari Mahatme","Anjaneya","Sri Krishna Leela","Shirdi Sai Baba","Sri Raghavendra","Guru Raghavendra","Bhakta Markandeya",
"Bhakta Ramadasu","Harishchandra","Satya Harishchandra","Daksha Yagna","Ganga Gowri","Shani Mahatma","Sri Kalabhairava","Navagraha Mahima","Sri Venkateshwara Mahime",
"Om Namah Shivaya","Ayappa Swamy Mahime","Devi Mahatme","Durga Shakti","Mahishasura Mardini"};

static String hindiMovies[]={
"Jai Santoshi Maa","Shirdi Sai Baba","Bhakta Prahlad","Har Har Mahadev","Jai Maa Durga","Sai Baba","Jai Hanuman","Shiv Mahima","Krishna Leela","Ramayan","Mahabharat",
"Meera","Jai Maa Vaishno Devi","Bhole Nath","Om Namah Shivaya","Shani Dev","Bal Ganesh","Bal Krishna","Jai Maa Kali","Shiv Parvati","Hanuman Chalisa",
"Jai Maa Sherawali","Sai Leela","Bhagavad Gita","Shiv Tandav","Jai Jagannath","Radha Krishna","Bhakti Sagar","Jai Mahalakshmi","Jai Ganga Maiya"};

static String teluguMovies[]={
"Annamayya","Sri Ramadasu","Shirdi Sai","Sri Manjunatha","Bhakta Prahlada","Pandurangadu","Sri Venkateswara Mahatyam","Sri Krishna Leelalu","Bhakta Tukaram",
"Sri Shirdi Sai Baba","Sri Rama Rajyam","Jagadguru Adi Shankara","Sri Datta Darshanam","Sai Leela","Om Namah Shivaya","Subrahmanyam","Ayyappa Swamy",
"Sri Durga","Sri Lakshmi Narasimha","Sri Seeta Ramula Kalyanam","Bhakta Kannappa","Shiva Leela","Sri Venkateswara","Sri Balaji","Sri Anjaneya",
"Sri Mahalakshmi","Bhakti Tarangalu","Sri Ganesha","Sri Saraswati","Navagraha Devatha"};

static String tamilMovies[]={
"Thiruvilayadal","Kandan Karunai","Sri Raghavendra","Bhakta Prahlada","Annai Velankanni","Sri Venkatesa Perumal","Om Sakthi","Sri Meenakshi","Thirupati",
"Ayyappa Swamy","Sri Krishna","Sri Rama","Bhakti","Vel","Murugan","Sri Durga","Sri Lakshmi","Sri Saraswati","Navagraham","Sri Anjaneya","Sri Shiva",
"Sri Vishnu","Sri Ganesha","Devi Mahatme","Sri Kali","Sri Andal","Sri Narasimha","Bhakti Songs","Temple Stories","Devotional Tamil"};

static String malayalamMovies[]={
"Nirmalyam","Swami Ayyappan","Guruvayoor Kesavan","Devi Mahatmyam","Ayyappa Swamy","Sabarimala","Bhagavathi","Narayaneeyam","Krishna Leela","Shiva Leela",
"Sri Guruvayurappan","Ayyappa Darshanam","Bhakta Prahlada","Om Namah Shivaya","Temple Stories","Bhakti Malayalam","Navagraha","Sri Lakshmi","Sri Durga",
"Sri Saraswati","Sri Vishnu","Sri Shiva","Sri Ganesha","Devotional Songs","Temple History","Kerala Devotion","Bhakti Tarangam","Spiritual Kerala","Bhakti Ganga",
"Devotional Tales"};

static String englishMovies[]={
"The Passion of the Christ","Ben-Hur","The Ten Commandments","King of Kings","The Bible","Noah","Exodus","Paul Apostle","Risen","Mary Magdalene","Son of God","Jesus",
"God's Not Dead","Heaven is for Real","War Room","Facing the Giants","Fireproof","Left Behind","The Nativity Story","One Night with the King","The Gospel",
"The Shack","Breakthrough","Miracles from Heaven","The Prince of Egypt","Joseph King of Dreams","David and Goliath","Apostle Peter","The Story of Ruth","Samson"};

public static void main(String args[])
{
getKannadaMovies();
getHindiMovies();
getTeluguMovies();
getTamilMovies();
getMalayalamMovies();
getEnglishMovies();
}

static void getKannadaMovies()
{
System.out.println("JioHotstar Kannada Devotional Movies:");
for(String movie : kannadaMovies)
{
System.out.println(movie);
}
}

static void getHindiMovies()
{
System.out.println("JioHotstar Hindi Devotional Movies:");
for(String movie : hindiMovies)
{
System.out.println(movie);
}
}

static void getTeluguMovies()
{
System.out.println("JioHotstar Telugu Devotional Movies:");
for(String movie : teluguMovies)
{
System.out.println(movie);
}
}

static void getTamilMovies()
{
System.out.println("JioHotstar Tamil Devotional Movies:");
for(String movie : tamilMovies)
{
System.out.println(movie);
}
}

static void getMalayalamMovies()
{
System.out.println("JioHotstar Malayalam Devotional Movies:");
for(String movie : malayalamMovies)
{
System.out.println(movie);
}
}

static void getEnglishMovies()
{
System.out.println("JioHotstar English Devotional Movies:");
for(String movie : englishMovies)
{
System.out.println(movie);
}
}

}