package edu.caeus.treadmill

import akka.http.scaladsl.server.Directives._
import edu.caeus.treadmill.backend.Talehub

object Routes {

  def apply(talehub: Talehub): Unit = {
    pathPrefix("v1") {
      (path("users" / "$register") & post) {
        ???
      } ~
        (path("users" / "$login") & post) {
          ???
        } ~
        (path("sheets.ref") & get) {
          ???
        } ~
        pathPrefix("sheets") {
          (path("$set") & post) {
            ???
          } ~
            pathPrefix(Segment) {
              sheetId =>
                (pathEnd & get) {
                  ???
                } ~
                  (path("ops.ref") & get) {
                    sheetId =>
                      ???
                  } ~
                  (path("ops" / "$submit") & post) {
                    sheetId =>
                      ???
                  } ~
                  (path("ops" / Segment) & get) {
                    (sheetId, opId) =>
                      ???
                  }
                ???
            }

        }

    }
  }

}
