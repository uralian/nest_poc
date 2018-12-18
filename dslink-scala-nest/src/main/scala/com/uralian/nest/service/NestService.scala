package com.uralian.nest.service

import com.uralian.nest.model.Thermostat

import scala.concurrent.{ExecutionContext, Future}

/**
  * Nest Service.
  */
trait NestService {

  /**
    * Returns all thermostats for the specified access token.
    *
    * @param token
    * @param ec
    * @return
    */
  def getAllThermostats(implicit token: AccessToken, ec: ExecutionContext): Future[Map[String, Thermostat]]
}