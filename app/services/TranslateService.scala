package services

import model.RawWord
import model.ywordmodel._

trait TranslateService {

  def translate(word: RawWord): YTranslateWord

}

class TranslateServiceEnglish extends TranslateService {

  override def translate(rawWord: RawWord): YTranslateWord = ???
//    YTranslateWord(
//      rawWord.word,
//      Seq(Definition(Some(rawWord.word), Some("DefinitionTs"), Some("DefinitionPos"),
//        Some(Seq(Transfer(rawWord.word, Some("TransferPos"), Some("TransferGet"),
//          Seq(Synonyms(rawWord.word, "SynonymsPost", "SynonymsGen")),
//          Seq(Meaning(rawWord.word)), Seq(Example(rawWord.word, Seq.empty))))))))

}
