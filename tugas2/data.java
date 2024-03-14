package tugas2;

public class data {
        private String[] options = new String[7];
        public data(){
            setOptions();
        }
            public String[][] forAgama() {
            return agama;
            }
            private String[][] agama = {
            {"The Book of Mormon", "Joseph Smith Jr.", "500 halaman", "1830", "The Church of Jesus Christ of Latter-day Saints", "Sebuah kitab yang diyakini oleh para penganut gereja sebagai tambahan dari Alkitab Kristen."},
            {"The Talmud", "Various Authors", "600 halaman", "1960", "Mesorah Publications, ArtScroll", "Sebuah kumpulan tulisan agama Yahudi yang berisi hukum dan ajaran agama."},
            {"The Vedas", "Various Authors", "700 halaman ", "1340", "Penguin Classics, Oxford University Press", "Sebuah kumpulan teks suci Hindu yang merupakan salah satu dasar ajaran agama Hindu."},
            {"The Kitab-i-Aqdas", "Bahá'u'lláh", "400 halaman", "878 SM", "Bahá'í Publishing Trust", "Sebuah teks suci dalam agama Bahá'í yang berisi hukum dan ajaran."},
            {"The Guru Granth Sahib", "Guru-Guru Sikh", "800 halaman", "2010", "Punjabi University, Hemkunt Press", "Sebuah lkasm ksdmalfk kasmfl kumpulan puisi dan ajaran agama Sikh."},
            {"The Tripitaka", "Various Authors", "900 halaman", "1880", "Pali Text Society, Oxford University Press", "Sebuah kumpulan teks suci dalam agama Buddha yang berisi ajaran dan kisah-kisah kehidupan Buddha."}
            };
            
            
            public String[][] forSejarah() {
            return sejarah;
            }
            private String[][] sejarah = { 
            {"Sejarah Dunia Modern: 1500-2000", "Richard J. Evans", "896 halaman", "2013", "Gramedia Pustaka Utama", "Sebuah kajian tentang perkembangan dunia modern dari tahun 1500 hingga 2000."},
            {"Sejarah Kebudayaan Islam", "Syafiq al-Hasyimi", "456 halaman", "2008", "Gema Insani Press", "Sebuah perjalanan seseorang yang telah analisis tentang perkembangan kebudayaan Islam dari masa lalu hingga masa kini."},
            {"Sejarah Peradaban Manusia: Dari Zaman Batu Hingga Zaman Modern", "Martin L. Van Creveld", "400 halaman", "2016", "Kepustakaan yang sangatPopuler Gramedia", "Sebuah tinjauan tentang evolusi peradaban manusia dari zaman prasejarah hingga zaman modern."},
            {"Sejarah Modern Indonesia: 1200-2008", "M.C. Ricklefs", "440 halaman", "2008", "Serambi", "Sebuah narasi tentang sejarah modern Indonesia dari abad ke-13 hingga awal abad ke-21."},
            {"Sejarah Peradaban Islam", "Abdul Qadir Syaibah", "352 halaman", "2010", "Gema Insani Press", "Sebuah studi tentang perkembangan peradaban Islam dari awal hingga saat ini."},
            {"Sejarah Pemikiran Ekonomi", "N. Gregory Mankiw", "560 halaman", "2011", "Salemba Empat", "Sebuah penyelidikan tentang perkembangan pemikiran ekonomi dari masa klasik hingga modern."}
            };
        
        
            public String[][] forFilsafat() {
            return filsafat;
            }
            private String[][] filsafat = { 
            { "Meditasi", "Marcus Aurelius", "208 halaman", "1860", "Modern Library", "Sebuah karya tentang filsafat stoikisme yang ditulis oleh kaisar Romawi, Marcus Aurelius."},
            { "Republik", "Plato", "384 halaman", "380 SM", "Hackett Publishing Company", "Sebuah dialog filsafat klasik yang digunakan Plato untuk mengeksplorasi gagasan tentang keadilan dan pemerintahan."},
            { "Kritik atas Nalar Murni", "Immanuel Kant", "664 halaman", "1781", "Cambridge University Press", "Sebuah kritik atas kemampuan nalar manusia untuk mengetahui dan memahami dunia."},
            { "Leviathan", "Thomas Hobbes", "448 halaman", "1651", "Oxford University Press", "Sebuah karya tentang filsafat politik yang menggambarkan negara sebagai entitas yang kuat dan berdaulat."},
            { "Dua Risalah tentang Pemerintahan", "John Locke", "256 halaman", "1689", "Hackett Publishing Company", "Sebuah karya yang mempertimbangkan hak asasi manusia dan konsep pemerintahan berdasarkan kontrak sosial."},
            { "rocky berfikir", "tri sutami", "256 halaman", "600 SM", "montana picture", "Sebuah ilmu yang menjelaskan 4kumpulan pemikiran filosofis tentang kehidupan dan makna."}
            };
        
        
            public String[][] forTeknologi() {
            return teknologi;
            }
            private String[][] teknologi = {
            { "head first java", "Francois Chollet", "528 halaman", "2021", "Manning Publications", "Sebuah panduan komprehensif untuk mempelajari bahasa pemrograman Java dengan pendekatan yang praktis dan interaktif."},
            { "The amazing Programmer: From Journeyman to Master", "Andrew Hunt", "392 halaman", "2000", "Addison-Wesley Professional", "Sebuah buku yang membahas strategi dan teknik untuk menjadi seorang programmer yang luar biasa."},
            { "spectacular Algorithms", "Thomas J, Clifford Stein", "1392 halaman", "2022", "MIT Press", "Sebuah panduan lengkap tentang algoritma dan struktur data yang digunakan dalam pengembangan perangkat lunak."},
            { "Artificial Intelligence: A Modern Approach", "Stuart Russell, Peter Norvig", "1118 halaman", "2021", "Pearson Education Limited", "Sebuah buku teks yang menyelidiki konsep, teknik, dan aplikasi kecerdasan buatan secara komprehensif."},
            { "perfect Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "431 halaman", "2008", "Pearson Education", "Sebuah panduan praktis untuk menulis kode yang bersih, mudah dimengerti, dan mudah dipelihara."},
            { "life as perfect code", "Robert C. Martin", "431 halaman", "2008", "Pearson Education", "Sebuah panduan tentang bagaimana menulis kode yang elegan, efisien, dan mudah dipelihara dalam pengembangan perangkat lunak."}
            };
        
        
            public String[][] forFiksi() {
            return fiksi;
            }
            private String[][] fiksi = { 
            { "head first java", "Francois Chollet", "528 halaman", "2021", "Manning Publications", "Sebuah panduan komprehensif untuk mempelajari bahasa pemrograman Java dengan pendekatan yang praktis dan interaktif."},
            { "The amazing Programmer: From Journeyman to Master", "Andrew Hunt", "392 halaman", "2000", "Addison-Wesley Professional", "Sebuah buku yang membahas strategi dan teknik untuk menjadi seorang programmer yang luar biasa."},
            { "spectacular Algorithms", "Thomas J, Clifford Stein", "1392 halaman", "2022", "MIT Press", "Sebuah panduan lengkap tentang algoritma dan struktur data yang digunakan dalam pengembangan perangkat lunak."},
            { "Artificial Intelligence: A Modern Approach", "Stuart Russell, Peter Norvig", "1118 halaman", "2021", "Pearson Education Limited", "Sebuah buku teks yang menyelidiki konsep, teknik, dan aplikasi kecerdasan buatan secara komprehensif."},
            { "perfect Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "431 halaman", "2008", "Pearson Education", "Sebuah panduan praktis untuk menulis kode yang bersih, mudah dimengerti, dan mudah dipelihara."},
            { "life as perfect code", "Robert C. Martin", "431 halaman", "2008", "Pearson Education", "Sebuah panduan tentang bagaimana menulis kode yang elegan, efisien, dan mudah dipelihara dalam pengembangan perangkat lunak."}
            };
        
        
            public String[][] forPsikologi() {
            return psikologi;
            }
            private String[][] psikologi = { 
            {"Man's Search for Meaning", "Viktor E. Frankl", "168 halaman", "1946", "Beacon Press", "Sebuah memoir psikologis tentang pengalaman penulis di kamp konsentrasi Nazi dan pencarian makna dalam penderitaan."},
            {"Thinking, Fast and Slow", "Daniel Kahneman", "512 halaman", "2011", "Farrar, Straus and Giroux", "Sebuah analisis tentang dua sistem pemikiran manusia: sistem pikiran cepat dan sistem pikiran lambat."},
            {"The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "400 halaman", "2012", "Random House", "Sebuah penelitian tentang kebiasaan dan bagaimana kita bisa mengubahnya untuk meningkatkan kehidupan kita."},
            {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "352 halaman", "2012", "Crown Publishers", "Sebuah studi tentang kekuatan introvert dalam masyarakat yang menghargai ekstroversi."},
            {"Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman", "384 halaman", "1995", "Bantam Books", "Sebuah penyelidikan tentang kecerdasan emosional dan dampaknya terhadap kehidupan seseorang."},
            {"The Psychology Book", "DK", "352 halaman", "2012", "DK Publishing", "Sebuah ringkasan visual tentang perkembangan dan konsep utama dalam ilmu psikologi."}
            };
        
        
            public String[][] forPolitik() {
            return politik;
            }
            public String[][] politik = { 
            {"The Prince", "Niccolò Machiavelli", "140 halaman", "1532", "Various Publishers", "Sebuah panduan hidup mengenai kisah seseorang yang suka dengan tentang bagaimana mempertahankan dan memperoleh kekuasaan politik."},
            {"Democracy in America", "Alexis de Tocqueville", "150 halaman (Tergantung pada edisi)", "1835-1840", "Various Publishers", "Sebuah analisis tentang sistem demokrasi di Amerika Serikat pada abad ke-19."},
            {"The Communist Manifesto", "Karl Marx dan Friedrich Engels", "235 halaman", "1848", "Various Publishers", "Sebuah deklarasi politik yang menyerukan revolusi proletar dan pembentukan masyarakat sosialis."},
            {"The Republic", "Plato", "405 halaman", "Sekitar 380 SM", "Various Publishers", "Sebuah dialog filsafat yang mempertimbangkan gagasan tentang keadilan, pemerintahan, dan masyarakat ideal."},
            {"The Federalist Papers", "James Madison, dan John Jay", "345 halaman", "1787-1788", "Various Publishers", "Sebuah kumpulan esai yang membahas dan mempromosikan konstitusi Amerika Serikat."},
            {"Das Kapital", "Karl Marx", "320 halaman", "1867", "Various Publishers", "Sebuah kisah inspiratif yang mengenai analisis tentang kapitalisme dan kritik terhadap ekonomi politik."}
            };
    
            public void setOptions() {
                options[0] = "Agama";
                options[1] = "Sejarah";
                options[2] = "Filsafat";
                options[3] = "Teknologi";
                options[4] = "Fiksi";
                options[5] = "Psikologi";
                options[6] = "Politik";
            }
    
            public String getOptions(int options) {
                return this.options[options];
            }
    
            public int getOptionsLength() {
                int optionsLength = options.length;
                return optionsLength;
            }
    
            public static void tampilan(String[][] list) {
                for (int i = 0; i < list.length; i++) {
                    System.out.println("Judul buku\t\t\t: " + list[i][0]);
                    System.out.println("Nama Penulis\t\t\t: " + list[i][1]);
                    System.out.println("Jumlah Halaman\t\t\t: " + list[i][2]);
                    System.out.println("Tahun Terbit\t\t\t: " + list[i][3]);
                    System.out.println("Penerbit\t\t\t: " + list[i][4]);
                    System.out.println("sinopsis\t\t\t: " + list[i][5]);
                    System.out.println("Jumlah kata pada Sinopsis\t: " + list[i][5].split(" ").length + " kata");
                    System.out.println();
                }
            }
    
            public int hitungKataSinopsis(String[][] list) {
                int jumlahKata = 0;
                for (int i = 0; i < list.length; i++) {
                    jumlahKata += list[i][5].split(" ").length;
                }
                return jumlahKata;
            }
}
