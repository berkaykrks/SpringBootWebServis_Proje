package tr.edu.medipol.webservis.proje.RestWebServisProjem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class UrunlerWebServisimTest {

    // UrunlerWebServisim sınıfının listele() metodunu test eden test fonksiyonu
    @Test
    void testListele() {
        // UrunlerWebServisim nesnesi oluşturulur.
        UrunlerWebServisim urunWebServisi = new UrunlerWebServisim();

        // UrunlerWebServisim sınıfının listele() metodunun beklenen davranışlarını kontrol eder.
        assertEquals(4, urunWebServisi.listele().size());
        assertFalse(urunWebServisi.listele().isEmpty());
    }
    // UrunlerWebServisim sınıfının sil() metodunu test eden test fonksiyonu
    @Test
    void testSil() {
        // UrunlerWebServisim nesnesi ve bir test ürünü oluşturulur.
        UrunlerWebServisim urunWebServis = new UrunlerWebServisim();
        UrunlerWebServisim.Urun urun = new UrunlerWebServisim.Urun("4", "Akıllı Saat");
        urunWebServis.ekle(urun);

        // Silinecek ürünün numarası alınır.
        String silinecekNo = urun.numara();
        
        // UrunlerWebServisim sınıfının sil() metodunun beklenen davranışlarını kontrol eder.
        UrunlerWebServisim.Urun silinenUrun = urunWebServis.sil(silinecekNo);
        assertEquals(urun, silinenUrun);
        assertFalse(UrunlerWebServisim.getUrunListesi().contains(urun));
    }

    // UrunlerWebServisim sınıfının ekle() metodunu test eden test fonksiyonu
    @Test
    void testEkle() {
        // UrunlerWebServisim nesnesi ve bir test ürünü oluşturulur.
        UrunlerWebServisim urunWebServisi = new UrunlerWebServisim();
        UrunlerWebServisim.Urun urun = new UrunlerWebServisim.Urun("5", "Laptop");

        // UrunlerWebServisim sınıfının ekle() metodunun beklenen davranışlarını kontrol eder.
        UrunlerWebServisim.Urun eklenenUrun = urunWebServisi.ekle(urun);
        assertNotNull(eklenenUrun);
        assertEquals(urun, eklenenUrun);
        assertTrue(UrunlerWebServisim.getUrunListesi().contains(urun));
    }
}
