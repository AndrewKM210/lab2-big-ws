package translator.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import translator.Application;
import translator.domain.TranslatedText;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TranslatorServiceTest {

  @Autowired
  TranslatorService translatorService;

  @Test
  public void translateTestEnEs() {
    TranslatedText translatedText = translatorService.translate("en", "es", "This is a test of translation service");
    assertEquals("Esto es una prueba de servicio de traducción", translatedText.getTranslation());
  }

  @Test
  public void translateTestEnAf() {
    TranslatedText translatedText = translatorService.translate("en", "af", "This tests the translation from English to Afrikaans");
    assertEquals("Hierdie toetse is die vertaling van engels na Afrikaans", translatedText.getTranslation());
  }

  @Test
  public void translateTestEnNo() {
    TranslatedText translatedText = translatorService.translate("en", "no", "This tests the translation from English to Norwegian");
    assertEquals("Dette tester oversettelse fra engelsk til norsk", translatedText.getTranslation());
  }


}
