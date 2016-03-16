package model

import play.api.libs.json.Json

case class RawWord(val word: String)

object RawWord {

  implicit val rawWordFormat = Json.format[RawWord]

}
