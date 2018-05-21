/*
 * Copyright 2018 phData Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.phdata.pulse.common

/**
 * Created by sunandinidogra on 4/13/18.
 */
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import io.phdata.pulse.common.domain.LogEvent
import spray.json.{ DefaultJsonProtocol, RootJsonFormat }

/**
 * Provides JsonSupport for the LogEvent case class
 */
trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit def logEventJsonFormat: RootJsonFormat[LogEvent] = jsonFormat8(LogEvent)
}