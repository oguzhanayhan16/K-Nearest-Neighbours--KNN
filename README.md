# K-Nearest-Neighbours--KNN
Algoritma Analizi Kısa Sınav 1


Bu algoritmanın amacı algoritmayı yazan kişinin belirlediği x,y ve character değerleini Data classına ekliyoruz.
    Bu ekleme sonrasında kullanıcıdan aldığımız  x,y değerleri bu data classına tekrar eklenmektedir.
    Daha sonra data classındaki verileri  KNearestNeighbor classında getKNearestNeighbors fonksiyonuna götürmekteyiz.
    Bu fonksiyonun amacı kullanıcıdan aldığımız x ve y değerlerinden algoritmayı oluşturan kişinin girdiği x ve y değerlerininin
    önce farkını alıp daha sonra x ve y değerlerinin karesini almaktadır. En sonunda alınan x ve y nin karesi toplanılmaktadır.
    Bu işlemler tamamlandıktan sonra bu değerler  Collections.sort() methodu ile sıralanmaktadır ve for kullanılarak bu değerler
    neighbors adlı ifadeye iletilmektedir. Bu neighbors adlı ifadedeki veriler DisplayHelper adlı classdaki result fonksiyonuna
    gönderilmektedir. Bu fonksiyonun amacı neighbors'un içindeki verilerin character değerlerinin hangi değere eşit olduğunu bulur.
    Eğer ki A değeri fazlaysa kullanıcının girdiği değer A değerine yakındır,bu yüzden cevap A'dır. Eğer ki B değeri fazla ise
    kullanıcının girdiği değer B değerine yakındır ve cevap B'dir.

    Öncelikle, veri kümesindeki her bir örnek test örneği ile uzaklığı hesaplanır. Bu hesaplama, veri kümesindeki tüm
    örnekler için yapılır. Daha sonra uzaklıklar sıralanır ve en yakın K örnek seçilir. Seçilen K örneğin sınıfları sayılır
    ve test örneğinin sınıfı bu sayıma göre belirlenir.

    En iyi durum: Veri kümesindeki her veri, her sorgulama için işlenmiş olarak saklanır ve sorgu zamanında hemen erişilebilir.
    Bu durumda, sorgulama için gereken süre sabittir ve O(1) olarak ifade edilebilir.

    Ortalama durum: Veri kümesi büyüdükçe, verilerin aranması ve sıralanması için gereken süre artar.
    Ayrıca, K sayısı da artarsa, işlem süresi artacaktır. Ortalama olarak, K-En Yakın Komşu algoritması için çalışma zamanı
    O(n log n + k), n veri kümesindeki veri sayısı ve k sorgulama için seçilen K sayısıdır. Bu, sıralama işleminin O(n log n)
    zaman aldığı ve ardından en yakın K veriyi seçmek için O(k) zaman aldığı anlamına gelir.

    En kötü durum: Veri kümesindeki her veri, her sorgulama için tamamen yeniden işlenir ve sıralanır. Bu durumda,
    K-En Yakın Komşu algoritması için çalışma zamanı O(n^2 + k) olarak ifade edilebilir. Bu, veri kümesindeki tüm
    verilerin sıralanması için O(n^2) zaman alacağı ve ardından en yakın K veriyi seçmek için O(k) zaman alacağı anlamına gelir.

