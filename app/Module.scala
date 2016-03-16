import com.google.inject.AbstractModule
import services.{TranslateServiceEnglish, TranslateService}

class Module extends AbstractModule {

  override def configure() = {
    bind(classOf[TranslateService]).to(classOf[TranslateServiceEnglish]).asEagerSingleton()
  }

}
