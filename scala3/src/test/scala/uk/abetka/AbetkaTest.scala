package uk.abetka
import org.junit.Test
import org.junit.Assert.*

class AbetkaTest:
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


  @Test def test1(): Unit =
    assertEquals(testLatin1, Abetka.toLatin(testCyrillic1))
    assertEquals(testLatin2, Abetka.toLatin(testCyrillic2))
    assertEquals(testLatin3, Abetka.toLatin(testCyrillic3))
    assertEquals(testLatin4, Abetka.toLatin(testCyrillic4))
    assertEquals(testLatin5, Abetka.toLatin(testCyrillic5))

  @Test def test2(): Unit =
    assertEquals(testCyrillic1, Abetka.toCyrillic(testLatin1))
    assertEquals(testCyrillic2, Abetka.toCyrillic(testLatin2))
    assertEquals(testCyrillic3, Abetka.toCyrillic(testLatin3))
    assertEquals(testCyrillic4, Abetka.toCyrillic(testLatin4))
    assertEquals(testCyrillic5, Abetka.toCyrillic(testLatin5))