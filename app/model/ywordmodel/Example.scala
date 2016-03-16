package model.ywordmodel

import play.api.libs.json._

case class Example(val text: Option[String],
                   val tr: Option[Seq[ExampleTransfer]])

object Example {

    implicit val formatExample = Json.format[Example]

//  implicit val formatExample: Format[Example] = (
//    (__ \ 'text).formatNullable[String] and
//      (__ \ 'tr).formatNullable(implicitly[Format[Seq[ExampleTransfer]]])
//    ) (Example.apply, unlift(Example.unapply))

}