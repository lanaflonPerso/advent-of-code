package traitement2017;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import utils.MonReader;

public class Exercice04Test {

	private Charset charset = StandardCharsets.UTF_8;

	@Test
	public void traitementTest() throws IOException {

		MonReader monReader = new MonReader();

		Traitement04A traitement4A = new Traitement04A();
		monReader.addLigneListener(traitement4A);
		monReader.lireFichier("src/test/resources/traitement2017/inputTestExercice04a.txt", charset);
		assertEquals(2, traitement4A.getTotal());

		traitement4A = new Traitement04A();
		monReader.addLigneListener(traitement4A);
		monReader.lireFichier("src/test/resources/traitement2017/inputExercice04.txt", charset);
		assertEquals(455, traitement4A.getTotal());

		Traitement04B traitement4B = new Traitement04B();
		monReader.addLigneListener(traitement4B);
		monReader.lireFichier("src/test/resources/traitement2017/inputTestExercice04b.txt", charset);
		assertEquals(3, traitement4B.getTotal());

		traitement4B = new Traitement04B();
		monReader.addLigneListener(traitement4B);
		monReader.lireFichier("src/test/resources/traitement2017/inputExercice04.txt", charset);
		assertEquals(186, traitement4B.getTotal());
	}
}