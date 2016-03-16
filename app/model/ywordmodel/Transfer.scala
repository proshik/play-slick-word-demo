package model.ywordmodel

import play.api.libs.json._

case class Transfer(val text: Option[String],
                    val pos: Option[String],
                    val gen: Option[String],
                    val syn: Option[Seq[Synonyms]],
                    val mean: Option[Seq[Meaning]],
                    val ex: Option[Seq[Example]]
                   )

object Transfer {

    implicit val formatTransfer = Json.format[Transfer]

//  implicit val formatTransfer: Format[Transfer] = (
//    (__ \ 'text).formatNullable[String] and
//      (__ \ 'pos).formatNullable[String] and
//      (__ \ 'gen).formatNullable[String] and
//      (__ \ 'syn).formatNullable(implicitly[Format[Seq[Synonyms]]]) and
//      (__ \ 'mean).formatNullable(implicitly[Format[Seq[Meaning]]]) and
//      (__ \ 'ex).formatNullable(implicitly[Format[Seq[Example]]])
//    ) (Transfer.apply, unlift(Transfer.unapply))

}

