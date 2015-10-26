import models.Anuncio;
import models.Estilo;
import models.Instrumento;
import models.Noestilo;
import models.dao.GenericDAO;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.db.jpa.JPA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Global extends GlobalSettings {
	
	
	private static GenericDAO dao = new GenericDAO();

	@Override
	public void onStart(Application app) {
		Logger.info("Aplicação inicializada...");

		JPA.withTransaction(new play.libs.F.Callback0(){
			@Override
			public void invoke() throws Throwable {
				
				Instrumento novoInstrumento = new Instrumento("Violão");
				Instrumento novoInstrumento1 = new Instrumento("Baixo");
				Instrumento novoInstrumento2 = new Instrumento("Guitarra");
				Instrumento novoInstrumento3 = new Instrumento("Flauta");
				Instrumento novoInstrumento4 = new Instrumento("Saxofone");
				Instrumento novoInstrumento5 = new Instrumento("Teclado");
				Instrumento novoInstrumento6 = new Instrumento("Piano");
				Instrumento novoInstrumento7 = new Instrumento("Berimbau");
				Instrumento novoInstrumento8 = new Instrumento("Contrabaixo");
				Instrumento novoInstrumento9 = new Instrumento("Rabeca");
				Instrumento novoInstrumento10 = new Instrumento("Harpa");
				Instrumento novoInstrumento11 = new Instrumento("Sanfona");
				Instrumento novoInstrumento12 = new Instrumento("Triângulo");
				Instrumento novoInstrumento13 = new Instrumento("Zabumba");
				Instrumento novoInstrumento14 = new Instrumento("Violino");
				Instrumento novoInstrumento15 = new Instrumento("Bateria");
				
				
				dao.persist(novoInstrumento);
				dao.persist(novoInstrumento1);
				dao.persist(novoInstrumento2);
				dao.persist(novoInstrumento3);
				dao.persist(novoInstrumento4);
				dao.persist(novoInstrumento5);
				dao.persist(novoInstrumento6);
				dao.persist(novoInstrumento7);
				dao.persist(novoInstrumento8);
				dao.persist(novoInstrumento9);
				dao.persist(novoInstrumento10);
				dao.persist(novoInstrumento11);
				dao.persist(novoInstrumento12);
				dao.persist(novoInstrumento13);
				dao.persist(novoInstrumento14);
				dao.persist(novoInstrumento15);
				dao.flush();


				Estilo estilo1 = new Estilo("Axé");
				Estilo estilo2 = new Estilo("Black Music");
				Estilo estilo3 = new Estilo("Blues");
				Estilo estilo4 = new Estilo("Bossa Nova");
				Estilo estilo5 = new Estilo("Chillout");
				Estilo estilo6 = new Estilo("Classico");
				Estilo estilo7 = new Estilo("Country");
				Estilo estilo8 = new Estilo("Dance");
				Estilo estilo9 = new Estilo("Disco");
				Estilo estilo10 = new Estilo("Eletronica");
				Estilo estilo11 = new Estilo("Emocore");
				Estilo estilo12 = new Estilo("Fado");
				Estilo estilo13 = new Estilo("Folk");
				Estilo estilo14 = new Estilo("Forro");
				Estilo estilo15 = new Estilo("Funk");
				Estilo estilo16 = new Estilo("Funk Carioca");
				Estilo estilo17 = new Estilo("Gospel/Religios");
				Estilo estilo18 = new Estilo("Gótico");
				Estilo estilo19 = new Estilo("Grunge");
				Estilo estilo20 = new Estilo("Hard Rock");
				Estilo estilo21 = new Estilo("Hardcore");
				Estilo estilo22 = new Estilo("Heavy Metal");
				Estilo estilo23 = new Estilo("Hip Hop");
				Estilo estilo24 = new Estilo("House");
				Estilo estilo25 = new Estilo("Indie");
				Estilo estilo26 = new Estilo("Industrial");
				Estilo estilo27 = new Estilo("Infantil");
				Estilo estilo28 = new Estilo("Instrumental");
				Estilo estilo30 = new Estilo("Jazz");
				Estilo estilo31 = new Estilo("Jovem Guarda");
				Estilo estilo32 = new Estilo("MPB");
				Estilo estilo33 = new Estilo("New Age");
				Estilo estilo34 = new Estilo("New Wave");
				Estilo estilo35 = new Estilo("Pagode");
				Estilo estilo36 = new Estilo("Pop");
				Estilo estilo37 = new Estilo("Pop/Punk");
				Estilo estilo38 = new Estilo("Pop/Rock");
				Estilo estilo39 = new Estilo("Progressivo");
				Estilo estilo40 = new Estilo("Psicodelia");
				Estilo estilo41 = new Estilo("Punk Rock");
				Estilo estilo42 = new Estilo("R&B");
				Estilo estilo43 = new Estilo("Rap");
				Estilo estilo44 = new Estilo("Reggae");
				Estilo estilo45 = new Estilo("Reggaeton");
				Estilo estilo46 = new Estilo("Regional");
				Estilo estilo47 = new Estilo("Rock");
				Estilo estilo48 = new Estilo("Rock Alternativo");
				Estilo estilo49 = new Estilo("Rockabilly");
				Estilo estilo50 = new Estilo("Romantico");
				Estilo estilo51 = new Estilo("Samba");
				Estilo estilo52 = new Estilo("Sertanejo");
				Estilo estilo53 = new Estilo("Soul Music");
				Estilo estilo54 = new Estilo("Trance");
				Estilo estilo55 = new Estilo("Trip-Hop");
				Estilo estilo56 = new Estilo("Velha Guarda");

				dao.persist(estilo1);
				dao.persist(estilo2);
				dao.persist(estilo3);
				dao.persist(estilo4);
				dao.persist(estilo5);
				dao.persist(estilo6);
				dao.persist(estilo7);
				dao.persist(estilo8);
				dao.persist(estilo9);
				dao.persist(estilo10);
				dao.persist(estilo11);
				dao.persist(estilo12);
				dao.persist(estilo13);
				dao.persist(estilo14);
				dao.persist(estilo15);
				dao.persist(estilo16);
				dao.persist(estilo17);
				dao.persist(estilo18);
				dao.persist(estilo19);
				dao.persist(estilo20);
				dao.persist(estilo21);
				dao.persist(estilo22);
				dao.persist(estilo23);
				dao.persist(estilo24);
				dao.persist(estilo25);
				dao.persist(estilo26);
				dao.persist(estilo27);
				dao.persist(estilo28);
				dao.persist(estilo30);
				dao.persist(estilo31);
				dao.persist(estilo31);
				dao.persist(estilo32);
				dao.persist(estilo33);
				dao.persist(estilo34);
				dao.persist(estilo35);
				dao.persist(estilo36);
				dao.persist(estilo37);
				dao.persist(estilo38);
				dao.persist(estilo39);
				dao.persist(estilo40);
				dao.persist(estilo41);
				dao.persist(estilo42);
				dao.persist(estilo43);
				dao.persist(estilo44);
				dao.persist(estilo45);
				dao.persist(estilo46);
				dao.persist(estilo47);
				dao.persist(estilo48);
				dao.persist(estilo49);
				dao.persist(estilo50);
				dao.persist(estilo51);
				dao.persist(estilo52);
				dao.persist(estilo53);
				dao.persist(estilo54);
				dao.persist(estilo55);
				dao.persist(estilo56);
				dao.flush();

				Noestilo noestilo1 = new Noestilo("Axé");
				Noestilo noestilo2 = new Noestilo("Black Music");
				Noestilo noestilo3 = new Noestilo("Blues");
				Noestilo noestilo4 = new Noestilo("Bossa Nova");
				Noestilo noestilo5 = new Noestilo("Chillout");
				Noestilo noestilo6 = new Noestilo("Classico");
				Noestilo noestilo7 = new Noestilo("Country");
				Noestilo noestilo8 = new Noestilo("Dance");
				Noestilo noestilo9 = new Noestilo("Disco");
				Noestilo noestilo10 = new Noestilo("Eletronica");
				Noestilo noestilo11 = new Noestilo("Emocore");
				Noestilo noestilo12 = new Noestilo("Fado");
				Noestilo noestilo13 = new Noestilo("Folk");
				Noestilo noestilo14 = new Noestilo("Forro");
				Noestilo noestilo15 = new Noestilo("Funk");
				Noestilo noestilo16 = new Noestilo("Funk Carioca");
				Noestilo noestilo17 = new Noestilo("Gospel/Religios");
				Noestilo noestilo18 = new Noestilo("Gótico");
				Noestilo noestilo19 = new Noestilo("Grunge");
				Noestilo noestilo20 = new Noestilo("Hard Rock");
				Noestilo noestilo21 = new Noestilo("Hardcore");
				Noestilo noestilo22 = new Noestilo("Heavy Metal");
				Noestilo noestilo23 = new Noestilo("Hip Hop");
				Noestilo noestilo24 = new Noestilo("House");
				Noestilo noestilo25 = new Noestilo("Indie");
				Noestilo noestilo26 = new Noestilo("Industrial");
				Noestilo noestilo27 = new Noestilo("Infantil");
				Noestilo noestilo28 = new Noestilo("Instrumental");
				Noestilo noestilo30 = new Noestilo("Jazz");
				Noestilo noestilo31 = new Noestilo("Jovem Guarda");
				Noestilo noestilo32 = new Noestilo("MPB");
				Noestilo noestilo33 = new Noestilo("New Age");
				Noestilo noestilo34 = new Noestilo("New Wave");
				Noestilo noestilo35 = new Noestilo("Pagode");
				Noestilo noestilo36 = new Noestilo("Pop");
				Noestilo noestilo37 = new Noestilo("Pop/Punk");
				Noestilo noestilo38 = new Noestilo("Pop/Rock");
				Noestilo noestilo39 = new Noestilo("Progressivo");
				Noestilo noestilo40 = new Noestilo("Psicodelia");
				Noestilo noestilo41 = new Noestilo("Punk Rock");
				Noestilo noestilo42 = new Noestilo("R&B");
				Noestilo noestilo43 = new Noestilo("Rap");
				Noestilo noestilo44 = new Noestilo("Reggae");
				Noestilo noestilo45 = new Noestilo("Reggaeton");
				Noestilo noestilo46 = new Noestilo("Regional");
				Noestilo noestilo47 = new Noestilo("Rock");
				Noestilo noestilo48 = new Noestilo("Rock Alternativo");
				Noestilo noestilo49 = new Noestilo("Rockabilly");
				Noestilo noestilo50 = new Noestilo("Romantico");
				Noestilo noestilo51 = new Noestilo("Samba");
				Noestilo noestilo52 = new Noestilo("Sertanejo");
				Noestilo noestilo53 = new Noestilo("Soul Music");
				Noestilo noestilo54 = new Noestilo("Trance");
				Noestilo noestilo55 = new Noestilo("Trip-Hop");
				Noestilo noestilo56 = new Noestilo("Velha Guarda");

				dao.persist(noestilo1);
				dao.persist(noestilo2);
				dao.persist(noestilo3);
				dao.persist(noestilo4);
				dao.persist(noestilo5);
				dao.persist(noestilo6);
				dao.persist(noestilo7);
				dao.persist(noestilo8);
				dao.persist(noestilo9);
				dao.persist(noestilo10);
				dao.persist(noestilo11);
				dao.persist(noestilo12);
				dao.persist(noestilo13);
				dao.persist(noestilo14);
				dao.persist(noestilo15);
				dao.persist(noestilo16);
				dao.persist(noestilo17);
				dao.persist(noestilo18);
				dao.persist(noestilo19);
				dao.persist(noestilo20);
				dao.persist(noestilo21);
				dao.persist(noestilo22);
				dao.persist(noestilo23);
				dao.persist(noestilo24);
				dao.persist(noestilo25);
				dao.persist(noestilo26);
				dao.persist(noestilo27);
				dao.persist(noestilo28);
				dao.persist(noestilo30);
				dao.persist(noestilo31);
				dao.persist(noestilo31);
				dao.persist(noestilo32);
				dao.persist(noestilo33);
				dao.persist(noestilo34);
				dao.persist(noestilo35);
				dao.persist(noestilo36);
				dao.persist(noestilo37);
				dao.persist(noestilo38);
				dao.persist(noestilo39);
				dao.persist(noestilo40);
				dao.persist(noestilo41);
				dao.persist(noestilo42);
				dao.persist(noestilo43);
				dao.persist(noestilo44);
				dao.persist(noestilo45);
				dao.persist(noestilo46);
				dao.persist(noestilo47);
				dao.persist(noestilo48);
				dao.persist(noestilo49);
				dao.persist(noestilo50);
				dao.persist(noestilo51);
				dao.persist(noestilo52);
				dao.persist(noestilo53);
				dao.persist(noestilo54);
				dao.persist(noestilo55);
				dao.persist(noestilo56);
				dao.flush();
                List<Instrumento> lista = new ArrayList<Instrumento>();
				lista.add(novoInstrumento);
				lista.add(novoInstrumento1);
				lista.add(novoInstrumento3);
				lista.add(novoInstrumento4);
				Anuncio anuncio3 = new Anuncio("Banda1", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio3.setHoje(LocalDate.of(2015, 6, 4));
				anuncio3.setInstrumento(lista);
				dao.persist(anuncio3);

                Anuncio anuncio1 = new Anuncio("Banda2", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio1.setHoje(LocalDate.of(2015, 6, 3));
				anuncio3.setInstrumento(lista);
				dao.persist(anuncio1);

				Anuncio anuncio2 = new Anuncio("Banda3", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio2.setInstrumento(lista);
				anuncio2.setHoje(LocalDate.of(2015, 6, 2));
				dao.persist(anuncio2);

    			Anuncio anuncio4 = new Anuncio("Banda4", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio4.setHoje(LocalDate.of(2015, 6, 1));
				anuncio4.setInstrumento(lista);
				dao.persist(anuncio4);

				Anuncio anuncio5 = new Anuncio("Banda5", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio5.setInstrumento(lista);
				anuncio1.setHoje(LocalDate.of(2015, 6, 1));
				dao.persist(anuncio5);

				Anuncio anuncio6 = new Anuncio("Banda6", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio6.setHoje(LocalDate.of(2015, 5, 31));
				anuncio6.setInstrumento(lista);
				dao.persist(anuncio6);


				Anuncio anuncio7 = new Anuncio("Banda7", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio7.setInstrumento(lista);
				anuncio7.setHoje(LocalDate.of(2015, 5, 30));
				dao.persist(anuncio7);

				Anuncio anuncio8 = new Anuncio("Banda8", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio8.setInstrumento(lista);
				anuncio8.setHoje(LocalDate.of(2015, 5, 29));
				dao.persist(anuncio8);

				Anuncio anuncio9 = new Anuncio("Banda9", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
                anuncio9.setInstrumento(lista);
				anuncio9.setHoje(LocalDate.of(2015, 5, 30));
				dao.persist(anuncio9);

				Anuncio anuncio10 = new Anuncio("Banda10", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio10.setInstrumento(lista);
				anuncio10.setHoje(LocalDate.of(2015, 5, 28));
				dao.persist(anuncio10);

				Anuncio anuncio11 = new Anuncio("Banda11", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio11.setInstrumento(lista);
				anuncio11.setHoje(LocalDate.of(2015, 5, 27));
				dao.persist(anuncio11);

				Anuncio anuncio12 = new Anuncio("Banda12", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio12.setInstrumento(lista);
				anuncio12.setHoje(LocalDate.of(2015, 5, 28));
				dao.persist(anuncio12);

				Anuncio anuncio13 = new Anuncio("Banda13", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio13.setInstrumento(lista);
				anuncio13.setHoje(LocalDate.of(2015, 5, 26));
				dao.persist(anuncio13);

				Anuncio anuncio14 = new Anuncio("Banda14", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio14.setInstrumento(lista);
				anuncio14.setHoje(LocalDate.of(2015, 5, 25));
				dao.persist(anuncio14);

				Anuncio anuncio15 = new Anuncio("Banda15", "Procura-se Artistas", "Campina Grande/Centro","Formar Banda","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio15.setInstrumento(lista);
				anuncio1.setHoje(LocalDate.of(2015, 5, 24));
				dao.persist(anuncio15);

				Anuncio anuncio16 = new Anuncio("Banda16", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio16.setInstrumento(lista);
				anuncio16.setHoje(LocalDate.of(2015, 5, 23));
				dao.persist(anuncio16);

				Anuncio anuncio17 = new Anuncio("Banda17", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio17.setInstrumento(lista);
				anuncio17.setHoje(LocalDate.of(2015, 5, 22));
				dao.persist(anuncio17);

				Anuncio anuncio18 = new Anuncio("Banda18", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio18.setInstrumento(lista);
				anuncio18.setHoje(LocalDate.of(2015, 5,24 ));
				dao.persist(anuncio18);

				Anuncio anuncio19 = new Anuncio("Banda19", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio19.setInstrumento(lista);
				anuncio19.setHoje(LocalDate.of(2015, 5, 21));
				dao.persist(anuncio19);

				Anuncio anuncio20 = new Anuncio("Banda20", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio20.setInstrumento(lista);
				anuncio20.setHoje(LocalDate.of(2015, 5, 20));
				dao.persist(anuncio20);

				Anuncio anuncio21 = new Anuncio("Banda21", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio21.setInstrumento(lista);
				anuncio21.setHoje(LocalDate.of(2015, 5, 19));
				dao.persist(anuncio21);

				Anuncio anuncio22 = new Anuncio("Banda22", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio22.setInstrumento(lista);
				anuncio22.setHoje(LocalDate.of(2015, 5, 18));
				dao.persist(anuncio22);

				Anuncio anuncio23 = new Anuncio("Banda23", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio23.setInstrumento(lista);
				anuncio23.setHoje(LocalDate.of(2015, 5, 20));
				dao.persist(anuncio23);

				Anuncio anuncio24 = new Anuncio("Banda24", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio24.setInstrumento(lista);
				anuncio24.setHoje(LocalDate.of(2015, 5, 19));
				dao.persist(anuncio24);

				Anuncio anuncio25 = new Anuncio("Banda25", "Procura-se Artistas", "Campina Grande/Centro","Tocar Ocasionalmente","Junin@gmail.com, facebook.com/Junin" ,"1234");
				anuncio25.setInstrumento(lista);
				anuncio25.setHoje(LocalDate.of(2015, 5, 28));
				dao.persist(anuncio25);

				dao.flush();


			}});		
	}
		
		public void onStop(Application app) {
    		Logger.info("Aplicação desligada...");
	}
	
}
