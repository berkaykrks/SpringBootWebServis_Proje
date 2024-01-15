package tr.edu.medipol.webservis.proje.RestWebServisProjem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController //Gelen isteklere JSON gibi formatlarda yanıtlar dönmek için kullandım.
@RequestMapping("/urun") //Bu annotation, sınıfın ve sınıfta bulunan metodların hangi URL path'lerine karşılık geldiğini belirler. Bu durumda, "/urun" path'ine sahip tüm HTTP istekleri bu sınıf ve metodlar tarafından işlenilmesi için kullanıldı.
public class UrunlerWebServisim {
	
	public record Urun(String numara,String ad) {};
		
		
		private static final List<Urun> URUN_LISTESI =new ArrayList<>();	
		static {
			URUN_LISTESI.add(new Urun("1","Bilgisayar"));
			URUN_LISTESI.add(new Urun("2","Pc"));
			URUN_LISTESI.add(new Urun("3","Monitor"));
		}
		public static List<Urun> getUrunListesi() {
			return URUN_LISTESI;
		}
		
		//URUN EKLEMEK ICIN
		@PostMapping("/")
		public Urun ekle (@RequestBody Urun urun) {
			URUN_LISTESI.add(urun);
			return urun;
		}
		
		//URUNLER LISTELEMEK ICIN
		@GetMapping("/")
		public List<Urun> listele(){
			return URUN_LISTESI;
		}
		
		
		//kullanıcının istedigi ürünü bulmak ve kullanmak için 
		@GetMapping("/{no}")
		public Urun bul(@PathVariable String no){
			for(Urun urun: URUN_LISTESI) {
				if(urun.numara().equals(no)) {
					return urun;
				}
			}
			return null;
		}
		
		//kullanıcının istediği ürünleri silmek için
		@DeleteMapping("/{no}")
		public Urun sil(@PathVariable String no) {
			Urun urun = bul(no);
			if(urun!=null) {
				URUN_LISTESI.remove(urun);
			}
			return urun;
		}

	
}
