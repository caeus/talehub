package edu.caeus.treadmill

import edu.caeus.treadmill.backend.data.SignedUser


trait JsonHandler{
  def asd[A](implicit signedUser: SignedUser)
}

object JsonHandler extends JsonHandler{


  def asd[A](implicit signedUser: SignedUser) = ???
}


class Asd

object Asd {
  implicit class AASdasd(asd:JsonHandler){
    def qweqweqwe = "asdasd"
  }
  implicit def sign: SignedUser = ???
}