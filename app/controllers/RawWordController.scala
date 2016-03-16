package controllers

import javax.inject.Inject

import model.RawWord
import model.ywordmodel.YTranslateWord
import play.api.libs.json.{JsError, Json}
import play.api.mvc._
import services.TranslateService

import scala.concurrent.Future

class RawWordController @Inject()(translateService: TranslateService) extends Controller {

  def add = Action.async(BodyParsers.parse.json) { implicit request =>
    request.body.validate[RawWord].fold(
      errors =>
        Future.successful(BadRequest(JsError.toJson(errors))),
      word =>
        Future.successful(Ok(Json.toJson(translateService.translate(word))))
    )
  }

  def addTranslate() = Action.async(BodyParsers.parse.json) { implicit request =>
    request.body.validate[YTranslateWord].fold(
      errors =>
        Future.successful(BadRequest(JsError.toJson(errors))),
      word =>
        Future.successful(Ok(Json.toJson(word)))
    )
  }

}
