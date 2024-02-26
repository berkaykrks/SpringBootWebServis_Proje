# Karakuslar Market Projesi

Bu proje, "Karakuslar Market" müşterisinin ürün yönetimini sağlamak amacıyla geliştirilmiştir. Müşteri, bu sistem aracılığıyla ürün ekleyebilir, listelerini görüntüleyebilir, istenmeyen ürünleri silebilir ve belirli ürünleri arayabilir.

## Proje Tanımı

Projede kullanılan REST servisleri:

1. Urun Ekle
2. Urun Listele
3. Urun Sil
4. Urun Bul

## Kullanılan Teknolojiler

- Java
- Spring Boot
- Maven
- JUnit
- GitHub Actions
- Postman
- Apache JMeter


## Web Servis Geliştirme

Proje, Maven kullanılarak Spring Boot framework'ü üzerinde geliştirilmiştir. Spring Initializr kullanılarak temel proje yapısı oluşturulmuştur. Projede "Spring Web" dependency'si kullanılmıştır.

## UML Diyagramı & Kullanım (Use Case) Diyagramı

### UML Diyagramı

Urun Sınıfı:

- numara: Ürünün numarasını temsil eden özel bir String alan.
- ad: Ürünün adını temsil eden özel bir String alan.

UrunlerWebServisim Sınıfı:

- URUN_LISTESI: Ürün nesnelerini içeren bir Liste (List<Urun>) özelliği.
- ekle(urun: Urun): Belirtilen Urun nesnesini URUN_LISTESI'ne ekler ve eklenen ürünü döndürür.
- listele(): URUN_LISTESI'nde bulunan tüm ürünleri içeren bir Liste döndürür.
- sil(no: String): Belirtilen numaraya sahip ürünü URUN_LISTESI'nden kaldırır ve kaldırılan ürünü döndürür.
- bul(no: String): Belirtilen numaraya sahip ürünü URUN_LISTESI'nde bulur ve bulunan ürünü döndürür.
- getUrunListesi(): URUN_LISTESI'ni döndürür.

### Kullanım (Use Case) Diyagramı

Aktör: Kullanici

- Kullanıcı sistemde urun ekleyebilir, urunleri listeleyebilir, urunleri silebilir veya bulmak istediği ürünleri arayabilir.

## Birim Testler

Tüm metotlar JUnit kullanılarak test edilmiştir. Birim testlerin sonuçları Maven ile başarıyla çalıştırılmış ve raporlanmıştır.

## Sürekli Entegrasyon (Github Actions)

Projem GitHub Actions ile sürekli entegrasyon işlemine tabi tutulmaktadır. Her bir commit ve pull request için otomatik olarak testler çalıştırılır ve kapsama raporu oluşturulur.

## Postman & JMeter Testleri

Proje, Postman ve JMeter gibi araçlarla test edilmiştir. RESTful servislerin doğru çalıştığını ve beklenen davranışları sergilediğini doğrulamak için kullanılmıştır.

## Kurulum

1. Projeyi klonlayın: `git clone https://github.com/KullaniciAdi/proje.git`
2. Proje dizinine gidin: `cd proje`
3. Projeyi çalıştırın: `mvn spring-boot:run`

## Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Daha fazla bilgi için [LICENSE](LICENSE) dosyasına bakınız.
