package uk.abetka

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class AbetkaSpec extends AnyFlatSpec with Matchers {
  val testCyrillic1 = "Привіт світ"
  val testLatin1 = "Pryvit svit"

  val testCyrillic2: String = """Стоїть гора високая,
                                |А під горою гай, гай, гай
                                |Зелений гай, густесенький,
                                |Неначе справді рай.""".stripMargin

  val testLatin2: String = """Sto'it` gora vysoka'a,
                             |A pid goro'u ga', ga', ga'
                             |Zeleny' ga', gustesen`ky',
                             |Nenaqe spravdi ra'.""".stripMargin

  val testCyrillic3: String = """Під гаєм в'ється річенька,
                                |Як скло, вода блищить, блищить,
                                |Долиною зеленою,
                                |Куди вона біжить.""".stripMargin

  val testLatin3: String = """Pid ga'em v''et`s'a riqen`ka,
                             |'Ak sklo, voda blywyt`, blywyt`,
                             |Dolyno'u zeleno'u,
                             |Kudy vona bijyt`.""".stripMargin

  val testCyrillic4: String = """Край берега, у затишку,
                                |Прив'язані човни, човни,
                                |Там три верби схилилися,
                                |Мов журяться вони.""".stripMargin

  val testLatin4: String = """Kra' berega, u zatyxku,
                             |Pryv''azani qovny, qovny,
                             |Tam try verby shylylys'a,
                             |Mov jur'at`s'a vony.""".stripMargin

  val testCyrillic5: String = """Край берега, у затишку,
                                |Прив'язані човни, човни,
                                |Там три верби схилилися,
                                |Мов журяться вони.""".stripMargin

  val testLatin5: String = """Kra' berega, u zatyxku,
                             |Pryv''azani qovny, qovny,
                             |Tam try verby shylylys'a,
                             |Mov jur'at`s'a vony.""".stripMargin

  it should "success to latin" in {
    Abetka.toLatin(testCyrillic1) mustBe testLatin1
    Abetka.toLatin(testCyrillic2) mustBe testLatin2
    Abetka.toLatin(testCyrillic3) mustBe testLatin3
    Abetka.toLatin(testCyrillic4) mustBe testLatin4
    Abetka.toLatin(testCyrillic5) mustBe testLatin5
  }

  it should "success to cyrillic" in {
    Abetka.toCyrillic(testLatin1) mustBe testCyrillic1
    Abetka.toCyrillic(testLatin2) mustBe testCyrillic2
  }

}
