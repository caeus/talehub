package edu.caeus.treadmill.backend

import edu.caeus.treadmill.backend.data.SheetOp.Seed
import edu.caeus.treadmill.backend.data._

import scala.concurrent.Future


class SheetsRegistry {


  def query(userID: UserID): Future[Seq[Sheet.Ref]] = ???

  def set(sheet: Sheet)(userID: UserID): Future[Sheet.Ref] = ???

  def get(id: ValidID, op: Option[SheetOpID] = None)(userID: UserID): Future[Option[Sheet]] = ???

  def ops(id: ValidID): SheetOps = new SheetOps(id)


}

class SheetOps(sheetID: ValidID) {
  def submit(op: SheetOp.Seed)(userID: UserID): Future[SheetOp.Ref] = ???

  def query(userID: UserID): Future[Seq[SheetOp.Ref]] = ???

  def get(id: SheetOpID)(userID: UserID): Future[Option[Seed]] = ???
}

